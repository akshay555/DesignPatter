package com.builder;

public class Shop {

	public static void main(String[] args) {
	PhoneBuilder builder = new PhoneBuilder().setBattery(8000);
	System.out.println(builder.getPhone());
	}

}
