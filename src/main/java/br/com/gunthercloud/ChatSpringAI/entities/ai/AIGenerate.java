package br.com.gunthercloud.ChatSpringAI.entities.ai;

import java.util.List;

public class AIGenerate extends AIModel {
	
	private String response;
	private List<Object> context;
	
	public AIGenerate() {

	}
	
	public AIGenerate(String model, String created_at, String done_reason, boolean done, int total_duration,
			int load_duration, int prompt_eval_count, int prompt_eval_duration, int eval_count, int eval_duration,
			String response, List<Object> context) {
		super(model, created_at, done_reason, done, total_duration, load_duration, prompt_eval_count,
				prompt_eval_duration, eval_count, eval_duration);
		this.response = response;
		this.context = context;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<Object> getContext() {
		return context;
	}

	public void setContext(List<Object> context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "{\n\"response\": \"" + response.trim() + "\"\n}";
	}
	
}
