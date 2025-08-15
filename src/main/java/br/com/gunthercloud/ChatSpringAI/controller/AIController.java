package br.com.gunthercloud.ChatSpringAI.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gunthercloud.ChatSpringAI.entities.ai.AIGenerate;
import br.com.gunthercloud.ChatSpringAI.service.AIService;

@RestController
@RequestMapping(value = "/api/ai")
public class AIController {
	
	private AIService service;
	
	public AIController(AIService service) {
		this.service = service;
	}

	@PostMapping(value = "/chat")
	public AIGenerate continuarChat(@RequestBody Map<String, Object> body) {
		return service.gerarMensagem(body);
	}

	@PostMapping(value = "/message")
	public AIGenerate gerarMensagem(@RequestBody Map<String, Object> body) {
		return service.gerarMensagem(body);
	}

	
	

}
