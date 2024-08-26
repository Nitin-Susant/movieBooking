package com.service.admine;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.admineDAO;
import com.DTO.Movie;

@Service
public class admineService {
	@Autowired
	admineDAO dao;

	public Boolean addMovies(Movie movie, HttpServletRequest req) {
		String name = (String) req.getSession().getAttribute("name");
		movie.setFkeyname(name);
		movie.setFeatured(1);

		int addmovie = dao.addmovie(movie);
		Boolean isupdate = (addmovie != 0) ? true : false;

		return isupdate;
	}

}
