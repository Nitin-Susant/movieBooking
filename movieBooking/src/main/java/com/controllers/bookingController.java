package com.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.DTO.Booking;
import com.service.Bookingservice;

 @Controller
 @RequestMapping("/booking")
public class bookingController {
 
	 @Autowired
	 Bookingservice  service; 
	 
	@GetMapping("/{name}/{id}")
	public String bookMovie(@PathVariable("name") String name,
							@PathVariable("id") Integer id,
							@ModelAttribute("bookobj") Booking booking
			) 
	{
		 booking.setMoviefkey(id);
		return "booking";
	}
	 
	@PostMapping("/{name}/processBooking")
	public String name(@ModelAttribute("bookobj") Booking booking,HttpServletRequest req) {
		
		req.getSession().setAttribute("bookingatt", booking);
		System.out.println(booking);
		
		return "redirect:/booking/payment";
	}
	@GetMapping("/payment")
	public String payment(@ModelAttribute("paymentobj") Booking booking) {
		 
		return "payment";
	}
	 
	@PostMapping("/sucesspayment")
	public String paymentsucess(@ModelAttribute("paymentobj") Booking booking,HttpServletRequest req) {
		Booking attribute = (Booking)req.getSession().getAttribute("bookingatt");
		attribute.setPrice(booking.getPrice());
		HttpSession session = req.getSession();
		Integer attribute2 = (Integer)session.getAttribute("userid");
		System.out.println(" -======"+attribute2);
		service.bookticket(attribute, req);
		return "sucess";
	}
	
}
