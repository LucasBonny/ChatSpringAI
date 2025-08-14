package br.com.gunthercloud.ChatSpringAI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gunthercloud.ChatSpringAI.service.UserService;

@RestController
@RequestMapping(name = "/api/user")
public class UserController {
	
	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<String> lookUser() {
		return ResponseEntity.ok().body(service.lookUser());
	}
}
