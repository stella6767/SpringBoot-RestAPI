package com.cos.person.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
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
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;

import lombok.RequiredArgsConstructor;

@RestController
public class UserController {
	
	
//	@Autowired    //옛날 방식
//	private UserRepository userRepository;
	
//	private final UserRepository userRepository; //@RequiredArgsConstructor
	
	private UserRepository userRepository;
	
	//DI = 의존성 주입
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	//http://localhost:8080/user
	@GetMapping("/user")
	public CommonDto<List<User>> findAll() {
		System.out.println("findAll()");		
		return new CommonDto<>(HttpStatus.OK.value(), userRepository.findAll());
		//return userRepository.findAll(); //MessageConverter (JavaObject ->JSON)
	}
	
	//http://localhost:8080/user/1	
	@GetMapping("/user/{id}")
	public CommonDto<User> findById(@PathVariable int id) {
		System.out.println("findById(): id:  " + id);
		return new CommonDto<>(HttpStatus.OK.value(), userRepository.findById(id));
		//return userRepository.findById(id);
	}
	
	@CrossOrigin //cors 정책 무시
	//http://localhost:8080/user (주소는 같지만 post로 때리면 얘가 호출)
	@PostMapping("/user")
	//x-www-form-urlencoded => request.getParamter()
	//text/plain => @RequestBody 어노테이션 - 버퍼로 바로 읽어줌
	//application/json =-> @ResponseBody 어노테이션 + 오브젝트로 받기
	public CommonDto<?> save(@Valid @RequestBody JoinReqDto dto, BindingResult bindingResult) { 
		
		System.out.println("save()");
		System.out.println("user : " + dto);
		userRepository.save(dto); //데이터베이스에서 잘못되면 전에 해두었던 엑세션 핸들러가..
		
		return new CommonDto<>(HttpStatus.CREATED.value(), "ok");
	}
	
	//http://localhost:8080/user/2		
	@DeleteMapping("/user/{id}")
	public CommonDto delete(@PathVariable int id){
		System.out.println("delete()");
		userRepository.delete(id);
		return new CommonDto<>(HttpStatus.OK.value());
	}
	
	//http://localhost:8080/user/2	
	@PutMapping("/user/{id}")
	public CommonDto update(@PathVariable int id,@Valid @RequestBody UpdateReqDto dto, BindingResult bindingResult ) {
		System.out.println("update()");
		
		userRepository.update(id, dto);
		return new CommonDto<>(HttpStatus.OK.value());
	}
	
	
	
	
}
