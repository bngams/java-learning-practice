package com.capgemini.poecplm.programming.practice;

public class Exercice5 {

	public static void main(String[] args) {
		// int[] numbers = {1,2,3,4,5};
		// creation tableau de taille 5
		int[] numbers = new int[5];
		// resultat initialisé à 0
		int resultat = 0;
		
		// remplir le tableau dynamiquement
		for(int i=0; i < 5; i++) {
			// traduire (Math.random() * 100) en int
			// (type_souhaite) <element_a_traduire>			
			numbers[i] = (int) (Math.random() * 100);
		}
		
		// calcul de la somme
		for(int n: numbers) {
			resultat += n;
		}
		
		System.out.println("Resultat: " + resultat);
	}

}
