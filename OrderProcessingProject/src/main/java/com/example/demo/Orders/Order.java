package com.example.demo.Orders;

public class Order {
	int Id;
	String status;
	
	
	public Order(int id, String status) {
		super();
		Id = id;
		this.status = status;
	}
	
	
	public Order() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	
	
}
