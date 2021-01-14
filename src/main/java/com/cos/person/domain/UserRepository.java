package com.cos.person.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ch.qos.logback.core.encoder.ByteArrayUtil;

@Repository //지금은 그냥 서비스 없이
public class UserRepository {
	
	public List<User> findAll(){ //원래는 DB 연결해서 가져와야 되지만 지금은 그냥 주입
		List<User> users = new ArrayList<>();
		users.add(new User(1,"ssar","1234","010-455-111"));
		users.add(new User(2,"cos","1234","010-455-111"));
		users.add(new User(3,"love","1234","010-455-111"));
		
		return users;
	}
	
	public User findById(int id){ 
		return new User(1,"ssar","1234","010-455-111");
	}
	
	public void save(JoinReqDto dto) {
		System.out.println("DB에 insert 하기");
	}
	
	public void delete(int id) {
		System.out.println("DB에 삭제하기");
	}
	
	public void update(int id, UpdateReqDto dto) {
		//DAO연결해서 실행하다가 익센션 터짐.
		throw new IllegalArgumentException("아큐먼트를 잘못 넣음");
		//System.out.println("DB에서 수정하기");
		
	}
	
}
