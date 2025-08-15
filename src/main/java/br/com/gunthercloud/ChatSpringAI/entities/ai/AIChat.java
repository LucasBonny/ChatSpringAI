package br.com.gunthercloud.ChatSpringAI.entities.ai;

import java.util.Map;

public class AIChat extends AIModel {
	
	private Map<String, Object> message;
	
	public AIChat(String model, String created_at, String done_reason, boolean done, long total_duration,
			long load_duration, long prompt_eval_count, long prompt_eval_duration, long eval_count, long eval_duration,
			Map<String, Object> message) {
		super(model, created_at, done_reason, done, total_duration, load_duration, prompt_eval_count,
				prompt_eval_duration, eval_count, eval_duration);
		this.message = message;
	}

	@Override
	public String toString() {
		return "{\n\"response\": \"" + message.get("content").toString().trim() + "\"\n}";
	}
	

}
