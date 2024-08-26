package com.controllers.admine;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DTO.Movie;
import com.service.admine.admineService;

@Controller
@RequestMapping("/adminepage")
public class AdmineController {

	@Autowired
	admineService service;
	
	@GetMapping("/admine")
	public String adminePage() {
		return "admine/admine";
	}
	
	
	@GetMapping("/movieform")
	public String Movieform(@ModelAttribute("movieobj") Movie movie ) {
		 
		 
		System.out.println(movie);
		return "/admine/MoviesForm";
	}
	@PostMapping("/addmovies")
	public String addMovie(@ModelAttribute("movieobj") Movie movie,HttpServletRequest req) {
		 
		 service.addMovies(movie, req);
		System.out.println(movie);
		return "/admine/admine";
	}
	
}

