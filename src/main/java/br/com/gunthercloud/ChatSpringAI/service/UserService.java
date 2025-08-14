package br.com.gunthercloud.ChatSpringAI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gunthercloud.ChatSpringAI.entities.User;
import br.com.gunthercloud.ChatSpringAI.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		return repository.findById(id).get();
	}
	
	public User createUser(User user) {
		user.setId(null);
		return repository.save(user);
	}
}
