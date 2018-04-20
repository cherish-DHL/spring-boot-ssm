package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;

@Controller
public class UserController {
	
	@Autowired
	UserMapper userMapper;
	
	//@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
//	@PostMapping
//	@PutMapping
//	@DeleteMapping
	//  user/1
	@ResponseBody
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id")Integer id) {
		User user = userMapper.getUser(id);
		return user;
	}

}
