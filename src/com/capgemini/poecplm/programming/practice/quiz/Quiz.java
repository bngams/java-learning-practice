package com.capgemini.poecplm.programming.practice.quiz;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		// creer un tableau de Question
		// tableau qui va contenir 5 objets Question
		// Syntaxe pour delcarer un tableau <type>[] <nom_variable>
		Question[] questions = new Question[5];
		// initialiser ou créer mes questions
		questions[0] = new Question("Question 1?", "R1", 2);
		questions[1] = new Question("Question 2?", "R2", 2);
		questions[2] = new Question("Question 3?", "R3", 2);
		questions[3] = new Question("Question 4", "R4", 2);
		questions[4] = new Question("Question 5?", "R5", 2);
		
		// parcourir les questions et jouer
		// pour chaque question:
		// afficher la question
		// demander une réponse
		// si reponse ok => additionner score
		
		// init score
		int score = 0;
		
		System.out.println("==========");
		System.out.println("Début Quiz: ");
		System.out.println("==========");
		
		// for classique
		// for(int i=0; i < 5; i++) {
		// 	  Question q = questions[i];
		// }
		// pour chaque objet Question q contenu dans questions 
		for(Question q : questions) {
			System.out.println(q.getEnonce());
			Scanner scan = new Scanner(System.in);
			// if ( reponse attendue == reponse saisie)
			// qd on compare 2 objets on utilise equals()
			if(q.getReponse().equals(scan.nextLine())) {
				score += q.getPoints();
			}
		}
		
		System.out.println("==========");
		System.out.println("Score: " + score);
		System.out.println("==========");
		

	}

}
