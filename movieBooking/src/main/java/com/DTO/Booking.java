package com.DTO;

public class Booking {

	private Integer bookingid;
	Integer userfkey;
	Integer moviefkey;
	String date;
	String bookingDate;
	Integer price;
	private String noSeets;
	@Override
	public String toString() {
		return "Booking [id=" + getBookingid() + ", userfkey=" + userfkey + ", moviefkey=" + moviefkey + ", date=" + date
				+ ", bookingDate=" + bookingDate + ", price=" + price + ", noSeets=" + noSeets + "]";
	}
	 
	public Integer getUserfkey() {
		return userfkey;
	}
	public void setUserfkey(Integer userfkey) {
		this.userfkey = userfkey;
	}
	public Integer getMoviefkey() {
		return moviefkey;
	}
	public void setMoviefkey(Integer moviefkey) {
		this.moviefkey = moviefkey;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	 
	public Booking() {
		super();
		 
	}
	public String getNoSeets() {
		return noSeets;
	}
	public void setNoSeets(String noSeets) {
		this.noSeets = noSeets;
	}

	public Integer getBookingid() {
		return bookingid;
	}

	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
	}
	
	

	
}
