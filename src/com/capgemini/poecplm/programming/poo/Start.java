package com.capgemini.poecplm.programming.poo;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// creer un objet Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenue");
		System.out.println("Entrez votre nom");
		String lastname = scan.nextLine();  // recupérer le nom
		System.out.println("Entrez votre prénom");
		String firstname = scan.nextLine(); // récupréer le prénom
		
		// creation objet Person
		// creation d'une variable p de type Person
		// utilise le new pour instancier un nouvel objet avec le constructeur
		// p va etre créé avec le nom et prénom rentrés
		Person p = new Person(firstname, lastname);
		
		p.hello(); // on appelle la méthode hello() => le sysout est fait dans hello()
		p.displayHello(); // c'est displayHello() qui fera le sysout
		System.out.println(p.buildHelloMsg()); // buildHelloMsg renvoi juste un msg
	}
}
