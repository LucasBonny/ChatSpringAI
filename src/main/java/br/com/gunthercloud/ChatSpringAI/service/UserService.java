package br.com.gunthercloud.ChatSpringAI.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public String lookUser() {
		return "{\n\"user\": \"Lucas\"}";
	}
}
