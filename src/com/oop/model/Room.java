package com.oop.model;

public class Room {
	
	private String roomNo;
	private String roomType;
	private Double price;
	private double discount;
	
	public String getRoomNo() {
		return roomNo;
	}
	
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {

		return "Room No = " + roomNo + "\n" + "Room Type = " + roomType;
	}

}
