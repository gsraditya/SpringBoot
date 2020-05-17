package com.controller;
import com.bean.HelloBean;

public class HelloController {

	public static void main(String[] args) {
		
		HelloBean obj = new HelloBean();
		
		// set the parameters
		obj.setCity("Kakinada");
		obj.setDno(6242);
		obj.setState("Andhra Pradesh");
		
		
		System.out.println(obj.getCity());
		System.out.println(obj.getDno());
		System.out.println(obj.getState());
        System.out.println(obj);
	}

}
