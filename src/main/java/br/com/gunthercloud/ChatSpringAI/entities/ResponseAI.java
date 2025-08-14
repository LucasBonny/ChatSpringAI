package br.com.gunthercloud.ChatSpringAI.entities;

import java.util.List;

public class ResponseAI {
	private String model;
	private String response;
	private String done;
	private String done_reason;
	private List<Object> context;
	
	public ResponseAI() {
		
	}

	public ResponseAI(String model, String response, String done, String done_reason, List<Object> context) {
		super();
		this.model = model;
		this.response = response;
		this.done = done;
		this.done_reason = done_reason;
		this.context = context;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getDone() {
		return done;
	}

	public void setDone(String done) {
		this.done = done;
	}

	public String getDone_reason() {
		return done_reason;
	}

	public void setDone_reason(String done_reason) {
		this.done_reason = done_reason;
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
