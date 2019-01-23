package com.capgemini.poecplm.programming.practice;

public class Exercice1 {

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		System.out.println("Les nombres: a=" + a + " b=" + b);
		
		// plusieurs facons d'ecrire le résultat attendu
		// exemple 1: if/else
		if(a > b)
			System.out.println("a est supérieur à b ");
		else
			System.out.println("a est inférieur ou égal à b");
		
		
		// exemple 2: via une varibale msg affichee dans un println
		String msg = (a > b) ? "a est supérieur à b " : "a est inférieur ou égal à b";
		System.out.println(msg);
		// exemple 3 : directement dans le println 
		System.out.println(
			(a > b) ? "a est supérieur à b " : "a est inférieur ou égal à b"
		);
	}

}
