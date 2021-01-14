package com.cos.person.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.person.domain.CommonDto;
import com.cos.person.domain.JoinReqDto;
import com.cos.person.domain.UpdateReqDto;
import com.cos.person.domain.User;
import com.cos.person.domain.UserRepository;

import lombok.RequiredArgsConstructor;

@RestController
public class UserController2 {
	
//	@Autowired    //옛날 방식
//	private UserRepository userRepository;
//	
//	//http://localhost:8080/user
//	@GetMapping("/user")
//	public void findAll() {
//		System.out.println("findAll()");
//		userRepository.delete(1);
//	}
//	//http://localhost:8080/user/1	
//	@GetMapping("/user/{id}")
//	public void findById() {
//		System.out.println("findById()");
//	}
//	@PostMapping("/user")
//	public void save() { 		
//		System.out.println("save()");
//	}
//	//http://localhost:8080/user/2		
//	@DeleteMapping("/user/{id}")
//	public void delete(){
//		System.out.println("delete()");
//	}
//	//http://localhost:8080/user/2	
//	@PutMapping("/user/{id}")
//	public void update() {
//		System.out.println("update()");
//	}
}
