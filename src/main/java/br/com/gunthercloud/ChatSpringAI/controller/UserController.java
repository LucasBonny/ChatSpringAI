package br.com.gunthercloud.ChatSpringAI.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gunthercloud.ChatSpringAI.entities.User;
import br.com.gunthercloud.ChatSpringAI.entities.dto.UserDTO;
import br.com.gunthercloud.ChatSpringAI.service.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
	
	private UserService service;
	
	public UserController (UserService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(service.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<UserDTO> createUser(@RequestBody User user) {
		return ResponseEntity.status(201).body(service.createUser(user));
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<UserDTO> modifyUser(@PathVariable Long id, @RequestBody User user) {
		return ResponseEntity.status(201).body(service.modifyUser(id, user));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> removeUser(@PathVariable Long id) {
		service.removeUser(id);
		return ResponseEntity.status(204).build();
	}
	
}
