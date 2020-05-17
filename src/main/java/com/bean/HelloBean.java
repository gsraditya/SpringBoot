package com.bean;

public class HelloBean {
	
	
	private int dno;
	private String city;
	private String state;
	
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "HelloBean [dno=" + dno + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	

}
