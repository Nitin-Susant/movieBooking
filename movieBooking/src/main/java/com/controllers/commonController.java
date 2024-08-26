package com.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.DAO.userDAO;
import com.DTO.Booking;
import com.DTO.Movie;
import com.DTO.userDto;

@Controller
public class commonController {

	@Autowired
	public userDAO dao;

	
 
	
	@GetMapping("/")
	public String  getfeaturedMovie(Model movies) {
		List<Movie> featuredMovie = dao.getFeaturedMovie();
		movies.addAttribute("getmovie", featuredMovie);
		System.out.println(featuredMovie);
		return "movielist";
	}

	@GetMapping("/{name}/{id}")
	public String getMovieById(@PathVariable("name") String name,
			@PathVariable("id") int id, 
			 Model movie) {
		 Movie movieByid = dao.getMovieById(id);
		movie.addAttribute("movieById", movieByid);
		System.out.println(movieByid);
		return "moviePage";
	}
	 
	@GetMapping("/login")
	public String login(@ModelAttribute("userobj") userDto user,HttpServletRequest req) {
		HttpSession session = req.getSession();
		String role = (String) session.getAttribute("role");
		if (role != null) {
			if (role.equalsIgnoreCase("admine")) {
				return "redirect:adminepage/admine";
			} else {
				 
				return "redirect:/user";
			}

		}

		return "login";
	}
 
	@PostMapping("/login_process")
	public String loginProcess(@ModelAttribute("userobj") userDto user,HttpServletRequest req) {
		 
		userDto userByEmail = dao.getUserByEmail(user.getEmail());
		if (userByEmail != null && userByEmail.getPassword().equals(user.getPassword())) {
			HttpSession session = req.getSession();
			session.setAttribute("name", userByEmail.getName());
			session.setAttribute("role", userByEmail.getRole());
			if (userByEmail.getRole().equalsIgnoreCase("ADMINE")) {

				return "redirect:adminepage/admine";
			} else {
				session.setAttribute("userid", userByEmail.getId());
				return "redirect:/user";
			}

		}
		else {
			return "redirect:/login";
		}

	}
	@GetMapping("/logout")
	public String logout(HttpServletRequest req) {
		req.getSession().invalidate();
		
		return "redirect:/login";
	}
	
	@GetMapping("/admine")
	public String adminePage() {
		return "admine";
	}
	@GetMapping("/user")
	public String userPage() {
		return "user";
	}
}
