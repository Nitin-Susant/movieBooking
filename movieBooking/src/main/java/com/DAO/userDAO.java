package com.DAO;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.DTO.Booking;
import com.DTO.Movie;
import com.DTO.userDto;

public interface userDAO {

	public boolean signup(userDto user);  
		
	 public List<userDto> getuser();
		
	 public userDto getUserByEmail(String email);  
		
	 public Boolean deleteUser(int id);
	 public List<Movie> getFeaturedMovie() ;
	 public Movie getMovieById(int Id);
	 public int booked(Booking bk);
	 
}
