package com.capgemini.poecplm.programming.practice.exo9;

public class Client {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal("Felix");
		Animal a3 = new Animal("Felix");
		
		System.out.println("a1: " + a1.getName());
		System.out.println("a2: " + a2.getName());
		
		System.out.println("a2: " + a2);
		System.out.println("a3: " + a3);
		
		System.out.println(a2.equals(a3));
		
	}

}
