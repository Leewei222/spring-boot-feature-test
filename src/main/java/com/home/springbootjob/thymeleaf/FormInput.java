package com.home.springbootjob.thymeleaf;

public class FormInput {

	public String a;
	public String b;
	public String c;
	
	public String getA() {
		return a;
	}
	
	public void setA(String a) {
		this.a = a;
	}
	
	public String getB() {
		return b;
	}
	
	public void setB(String b) {
		this.b = b;
	}
	
	public String getC() {
		return c;
	}
	
	public void setC(String c) {
		this.c = c;
	}
	
	@Override
	public String toString() {
		if (a == null && b == null && c == null) return "";
		return "FormInput [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}
