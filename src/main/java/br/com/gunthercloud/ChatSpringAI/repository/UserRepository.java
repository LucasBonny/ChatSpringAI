package br.com.gunthercloud.ChatSpringAI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gunthercloud.ChatSpringAI.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
