package com.capgemini.poecplm.programming.practice;

public class Exercice6 {

	public static void main(String[] args) {
		int somme = 0;
		
		// parcourir les 100 premiers nombres
		// et calcul de la somme
		for(int i=0; i <= 100; i++) {
			somme += i;
		}
		
		System.out.println("Resultat: " + somme);
		
		
		
		// Sceonde partie
		int sommePairs = 0;
		int sommeImpairs = 0;
		
		// parcourir les 100 premiers nombres
		// et calcul de la somme
		for(int i=0; i <= 100; i++) {
			if(i%2 == 0)
				sommePairs += i;
			else
				sommeImpairs += i;
		}
		
		System.out.println("Resultat pairs: " + sommePairs);
		System.out.println("Resultat imppairs: " + sommeImpairs);
		
		
		// En une seule boucle
		// remettre les varibales à 0
		somme = 0;
		sommePairs = 0;
		sommeImpairs = 0;
		
		// calcul de tout les résultats
		for(int i=0; i <= 100; i++) {
			somme += i;
			if(i%2 == 0)
				sommePairs += i;
			else
				sommeImpairs += i;
		}
		
		System.out.println("Resultat: " + somme);
		System.out.println("Resultat pairs: " + sommePairs);
		System.out.println("Resultat imppairs: " + sommeImpairs);

	}

}
