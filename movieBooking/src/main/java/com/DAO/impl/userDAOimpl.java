package com.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.DAO.userDAO;
import com.DTO.Booking;
import com.DTO.Movie;
import com.DTO.userDto;

@Repository
public class userDAOimpl implements userDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean signup(userDto user) {
		// INSERT INTO `movie_ticket`.`user_table` (`email`, `password`) VALUES ('dfs',
		// 'sfsd');

		String sql = "insert into user_table VALUES(default,?,?,?,?)";
		Object arr[] = { user.getName(), user.getEmail(), user.getPassword(), user.getRole() };
		int update = jdbcTemplate.update(sql, arr);
		if (update == 1) {
			return true;
		}
		return false;
	}

	@Override
	public List<userDto> getuser() {
		String sql = "SELECT * FROM user_table";
		System.out.println("getuser");
		List<userDto> query = jdbcTemplate.query(sql, new RowMapper<userDto>() {
			@Override
			public userDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				userDto user = new userDto();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));

				return user;
			}
		});
		return query;
	}

	@Override
	public userDto getUserByEmail(String email) {

		String sql = "select * from user_table where email = ?";
		Object arr[] = { email };
		userDto queryForObject = jdbcTemplate.queryForObject(sql, new RowMapper<userDto>() {
			@Override
			public userDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				userDto user = new userDto();
				user.setId(Integer.parseInt(rs.getString("id")));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getString("role"));
				return user;
			}
		}, arr);

		return queryForObject;
	}

	public Boolean deleteUser(int id) {

		String sql = "delete  from user_table where id = ?";
		int update = jdbcTemplate.update(sql, id);
		if (update == 1) {
			return true;
		}
		return false;
	}

	public List<Movie> getFeaturedMovie() {
		String sql = "SELECT * FROM movies where featured = '1'";
		List<Movie> getmovie = jdbcTemplate.query(sql, new RowMapper<Movie>() {
			@Override
			public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
				Movie movie = new Movie();

				movie.setName(rs.getString("name"));
				movie.setId(rs.getString("mocieid"));
				movie.setDate(rs.getString("date"));
				movie.setDuration(rs.getString("duration"));
				movie.setDescription(rs.getString("description"));

				return movie;
			}
		});
		return getmovie;
	}

	public Movie getMovieById(int Id) {
		String sql = "SELECT * FROM movies where mocieid = ?";
		Object arr[] = { Id };
		Movie movieByid = jdbcTemplate.queryForObject(sql, new RowMapper<Movie>() {
			@Override
			public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
				Movie movie = new Movie();

				movie.setId(rs.getString("mocieid"));
				movie.setName(rs.getString("name"));
				movie.setDuration(rs.getString("duration"));
				movie.setDescription(rs.getString("description"));
				movie.setDate(rs.getString("date"));

				return movie;
			}
		}, arr);

		return movieByid;

	}
	
	public int booked(Booking bk) {
	  
		 
		String sql = "INSERT INTO booked(date,bookingDate,price,noSeets,userfkey,moviefkey)"
				+ "VALUES (?,?,?,?,?,?)";
		Object arr[] = {bk.getDate(),bk.getBookingDate(),bk.getPrice(),bk.getNoSeets(),bk.getUserfkey(),bk.getMoviefkey()};
		 int update = jdbcTemplate.update(sql, arr);
		return update;
	}

	 
	

}
