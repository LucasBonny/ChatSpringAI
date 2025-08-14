package br.com.gunthercloud.ChatSpringAI.entities.dto;

public class UserDTO {
	
	private Long id;
	private String name;
	private String email;
	private int age;
	
	public UserDTO() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}

}
