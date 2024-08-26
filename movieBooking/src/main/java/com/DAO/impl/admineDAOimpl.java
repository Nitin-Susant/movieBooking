package com.DAO.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.DAO.admineDAO;
import com.DTO.Movie;

@Repository
public class admineDAOimpl implements admineDAO {

	@Autowired
	JdbcTemplate template;

	public int addmovie(Movie movie) {
        //INSERT INTO `movie_ticket`.`movies`
		// (`mocieid`, `name`, `date`, `featured`, `description`, `duration`,
		// `admineid`)
		// VALUES ('1', 'sd', 'sdf', 'sdf', 'sdf', 'sdf', 'sdf');

		String sql = "INSERT INTO movies(name,date,featured,description,duration,admineid) "
				                     + "values (?,?,?,?,?,?)";
		Object[] arr = { movie.getName(), movie.getDate(), movie.getFeatured(), movie.getDescription(),
				movie.getDuration(), movie.getFkeyname() };

		int update = template.update(sql, arr);
		return update;
	}

}
