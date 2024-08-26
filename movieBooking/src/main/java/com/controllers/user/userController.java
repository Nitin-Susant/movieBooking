package com.controllers.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.DAO.userDAO;
import com.DTO.userDto;

@Controller
 @RequestMapping("/user")
public class userController {


	@Autowired
	JdbcTemplate template;
	
	@Autowired
	userDAO dao;
	
	@GetMapping("/signup")
	public String signUp(@ModelAttribute("userobj") userDto user) {
		return "signup";
	}
	@ResponseBody
	@PostMapping("/signup_process")
	public String signupProcess(@ModelAttribute("userobj") userDto user) {
		System.out.println(user);
		boolean signup = dao.signup(user);
		 if (signup) {
			System.out.println("tuer is ture ");
		}
		return "sucessful ";
	}
 
	@ResponseBody
	@GetMapping("/deleteUser/{id}")
	public String loginProcess(@PathVariable("id") int id) {
		 
		   Boolean deleteUser = dao.deleteUser(id);
		  System.out.println(deleteUser);
		return " delete sucessful ";
	}
	
	@ResponseBody
	@GetMapping("/getusers")
	public String getusers() {
		System.out.println("contoler");
		  List<userDto> getuser = dao.getuser();
		  System.out.println(getuser);
		  return "sucess";
	}
	
	
	
	
}
