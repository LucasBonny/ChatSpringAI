package br.com.gunthercloud.ChatSpringAI.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.gunthercloud.ChatSpringAI.entities.ResponseAI;

@RestController
@RequestMapping(value = "/api/res")
public class RequestController {
	
	private WebClient webClient;
	
	public RequestController(WebClient.Builder builder) {
		this.webClient = builder.baseUrl("http://localhost:11434").build();
	}
	
	@PostMapping
	public String apiRequest(@RequestBody Map<String, String> body) {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("model", "gemma3:1b");
		mapa.put("prompt", body.get("prompt") + "(Não deixe comentário, apenas considere o que foi pedido na mensagem)");
		mapa.put("stream", false);
		ResponseAI res = webClient.post().uri("/api/generate").header("Content-Type", "application/json").bodyValue(mapa).retrieve().bodyToMono(ResponseAI.class).block();
		System.out.println("prompt: " + body.get("prompt") + "\nres: " + res);
		
		return res.toString();
	}
	

}
