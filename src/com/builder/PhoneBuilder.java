package com.builder;

public class PhoneBuilder {
private String os;
private int ram;
private String processor;
private int battery;
private double screenSize;
public PhoneBuilder setOs(String os) {
	this.os = os;
	return this;
}
public PhoneBuilder setRam(int ram) {
	this.ram = ram;
	return this;
}
public PhoneBuilder setProcessor(String processor) {
	this.processor = processor;
	return this;
}
public PhoneBuilder setBattery(int battery) {
	this.battery = battery;
	return this;
}
public PhoneBuilder setScreenSize(double screenSize) {
	this.screenSize = screenSize;
	return this;
}

public Phone getPhone()
{
	Phone phone = new Phone(os, ram, os, battery, screenSize);
	return phone;
}

}
