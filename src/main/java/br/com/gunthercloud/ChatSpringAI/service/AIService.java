package br.com.gunthercloud.ChatSpringAI.service;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.gunthercloud.ChatSpringAI.entities.ai.AIChat;
import br.com.gunthercloud.ChatSpringAI.entities.ai.AIGenerate;

@Service
public class AIService {
	
	private final WebClient aiWebClient;
	
	public AIService(WebClient aiWebClient) {
		this.aiWebClient = aiWebClient;
	}
	
	public AIChat continuarChat(Map<String, Object> body) {
		return aiWebClient.post().uri("/api/chat").bodyValue(body)
				.retrieve().bodyToMono(AIChat.class).block();
	}
	
	public AIGenerate gerarMensagem(Map<String, Object> body) {
		return aiWebClient.post().uri("/api/generate").bodyValue(body)
				.retrieve().bodyToMono(AIGenerate.class).block();
	}
}
