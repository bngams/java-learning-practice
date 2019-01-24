package com.capgemini.poecplm.programming.practice;

import java.util.Scanner;

public class Exercice8 {
	
	public static void main(String[] args) {
		// tableau de taille 5
		String[] meals = new String[5];
		
		// boucle entrer 5 plats
		for(int i= 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Entrer un plat:");
			meals[i] = scan.nextLine();			
		}
		
		System.out.println("Dernier plat "+ meals[4]);
		
		
		/*********************************************
		 *  AUTRE SOLUTION
		 *********************************************/
		// tableau de taille 5
		String[] dishes = new String[5];
		
		String lastEntry = "" ;
		// boucle entrer 5 plats
		for(int i= 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Entrer un plat:");
			dishes[i] = scan.nextLine();
			// stocke le dernier element entré par le user
			lastEntry = dishes[i];
		}
		System.out.println("Dernier plat "+ lastEntry);
	}
	
}
