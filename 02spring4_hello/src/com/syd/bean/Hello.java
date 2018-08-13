package com.syd.bean;

public class Hello {
	private String name;
	
	public Hello() {
		System.out.println("Hello±»´´½¨");
	}
	public void show(){
		System.out.println("hello:"+name);
	}
	public void setName(String name) {
		this.name = name;
	}
}
