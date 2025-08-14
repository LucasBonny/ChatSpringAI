package br.com.gunthercloud.ChatSpringAI.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.gunthercloud.ChatSpringAI.entities.User;
import br.com.gunthercloud.ChatSpringAI.entities.dto.UserDTO;

@Component
public class UserMapper {

	public static UserDTO toDTO(User user) {
		UserDTO dto = new UserDTO();
		BeanUtils.copyProperties(user, dto);
		return dto;
	}
	
	public static User toEntity(UserDTO dto) {
		User user = new User();
		BeanUtils.copyProperties(dto, user);
		return user;
	}

}
