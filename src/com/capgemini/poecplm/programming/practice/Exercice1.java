package com.capgemini.poecplm.programming.practice;

public class Exercice1 {

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		System.out.println("Les nombres: a=" + a + " b=" + b);
		
		// plusieurs facons d'ecrire le r�sultat attendu
		// exemple 1: if/else
		if(a > b)
			System.out.println("a est sup�rieur � b ");
		else
			System.out.println("a est inf�rieur ou �gal � b");
		
		
		// exemple 2: via une varibale msg affichee dans un println
		String msg = (a > b) ? "a est sup�rieur � b " : "a est inf�rieur ou �gal � b";
		System.out.println(msg);
		// exemple 3 : directement dans le println 
		System.out.println(
			(a > b) ? "a est sup�rieur � b " : "a est inf�rieur ou �gal � b"
		);
	}

}
