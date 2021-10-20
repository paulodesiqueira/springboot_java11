package com.siqueyros.cursospring.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siqueyros.cursospring.entities.User;

@RestController
@RequestMapping (value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User (1L,"Paulo","paulo@gmail.com","9991365020","123456");
		return ResponseEntity.ok().body(u);
	}
	
	
}
