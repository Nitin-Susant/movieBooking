package com.service;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.userDAO;
import com.DTO.Booking;

@Service
public class Bookingservice {

	@Autowired
	userDAO dao;
	
	public void bookticket(Booking bk,HttpServletRequest req) {
		HttpSession session = req.getSession();
		Integer userid = (Integer)session.getAttribute("userid");
		bk.setBookingDate(LocalDate.now().toString());
		bk.setUserfkey(userid);
	 
		 
		dao.booked(bk);
	}
	
}
