package com.capgemini.poecplm.programming.poo;

public class Person {
	
	private String firstname;
	private String lastname;
	
	public Person(String firstn, String lastn) {
		this.firstname = firstn;
		this.lastname = lastn;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	// void => aucun return
	public void hello() {
		System.out.println("Hello "+this.firstname + " "+ this.lastname);
	}
	
	// void => aucun return
	public void displayHello() {
		// this => l'objet ou l'instance en cours
		System.out.println("Hello "+this.firstname + " "+ this.lastname);
	}
	
	public String buildHelloMsg() {
		return "Hello "+this.firstname;
	}

}
