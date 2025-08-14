package br.com.gunthercloud.ChatSpringAI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gunthercloud.ChatSpringAI.entities.User;
import br.com.gunthercloud.ChatSpringAI.entities.dto.UserDTO;
import br.com.gunthercloud.ChatSpringAI.mapper.UserMapper;
import br.com.gunthercloud.ChatSpringAI.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<UserDTO> findAll() {
		List<UserDTO> users = repository.findAll().stream().map(UserMapper::toDTO).toList();		
		return users;
	}

	public UserDTO findById(Long id) {
		return UserMapper.toDTO(repository.findById(id).get());
	}
	
	public UserDTO createUser(User user) {
		user.setId(null);
		return UserMapper.toDTO(repository.save(user));
	}

	public UserDTO modifyUser(Long id, User user) {
		user.setId(id);
		return UserMapper.toDTO(repository.save(user));
	}

	public void removeUser(Long id) {
		repository.deleteById(id);
	}
}
