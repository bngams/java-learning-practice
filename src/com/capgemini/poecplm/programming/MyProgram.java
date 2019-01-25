package com.capgemini.poecplm.programming;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
// charge la classe Scanner grâce à son nom complet
// dès qu'on utilise une classe qui n'est pas dans le meme package on l'importe
import java.util.Scanner;

public class MyProgram {

	public static void main(String[] args) {		
		
		// déclarer une variable
		// <type> <nom de variable>
		Integer a;
		// assigner une valeur à a
		a = 1;
		
		// déclaration + assignation
		Integer b = 2;
		
		// assigner une nouvelle valeur à a
		a = 3;
		
		// utilisation des operateurs de calcul
		// + , - , * , / , %
		System.out.println("== OPERATEURS DE CALCUL ==");
		
		// variable qui contient le resultat de a + b
		Integer result = a + b;
		
		// afficher la variable result
		// println() va toujours essayer de convertir ou transformer 
		// en chaine de caractères 
		// appelle result.toString() (Object.toString())
		System.out.println("Afficher la variable result");
		System.out.println(result);
		
		// afficher directement le resultat a - b
		System.out.println("Afficher a - b");
		System.out.println(a - b);
		
		// utilisation du modulo
		System.out.println("Afficher a%2");
		System.out.println(a%2);
		
		
		System.out.println("== OPERATIONS PARTICULIERES ==");
		
		// incrémentation de 1
		a++; 
		System.out.println("Afficher a apres incrementation");
		System.out.println(a);
		// décrémentation de 1
		a--;
		System.out.println("Afficher a apres décrementation");
		System.out.println(a);
		
		// additionner qlq chose à a
		// a = a + 2;
		a += 2;
		System.out.println("Afficher a apres +=");
		System.out.println(a);
		
		// meme chose pour  avec -=
		a -= 2;
		System.out.println("Afficher a apres -=");
		System.out.println(a);
		
		
		// concaténation => "addition" de chaines de caractère
		String chaine1 = "Hello";
		String chaine2 = "World";
		String phrase = chaine1 + " " + chaine2;
		System.out.println("Afficher phrase");
		System.out.println(phrase);
		
		System.out.println("== CONDITIONS ==");
		// comparaison et opérateurs
		// ==, .equals() égalité
		// >=, <= supérieur/inférieur
		// != différent de 
		Boolean compare = a < b;
		System.out.println("a est inférieur à b ? reponse:" + compare);
		
		// condition if
		// if(condition) { code si condition = true }
		if(true) {
			// execute code if => true
			System.out.println("condition if avec true");
		}
		// on ne peut pas ecrire if(false) { }
		
		// !false => l'inverse/l'opposé, la négation  !false => true
		if(!false) {
			// execute code if => true
			System.out.println("condition if avec !false");
		}
		
		// condition qui verifie que a  n'est pas inférieur a b
		// directment la comparaison dans la condition
		if(a >= b) {
			System.out.println("a n'est pas inférieur a b");
		}
		
		// if (!compare) (a < b)
		// dans la condition on peut mettre toute valeur 
		// qui renvoie ou constitue un boolean / Boolean 
		if(!compare) {
			System.out.println("a n'est pas inférieur a b");
		}
		
		// sur certains langages de programmation
		// 0 = false
		// 1 = true
		
		// operateurs logiques
		// OU => ||
		// ET => &&
		// Negation/opposé/inverse => !
		Boolean condition1 = true;
		Boolean condition2 = false;
		Boolean condition3 = false;
		
		// si condition1 = true OU condition2 = true
		if( condition1 || condition2 ) {
			System.out.println("condition OU ||");
		}
		
		// attention au priorités avec le && (comme multiplication en maths)
		// condition1 && conidtion2 => false
		// !condition3 => true
		// false || true => true
		if( condition1 && condition2 || !condition3 ) {
			System.out.println("condition multiples opérateurs logiques");
		}
		
		// attention aux priorités
		// condition1 => true
		// ( condition2 || !condition3 )  => true
		// true && true => true
		if( condition1 && (condition2 || !condition3) ) {
			System.out.println("condition multiples opérateurs logiques 2");
		}
		
		// IF ... ELSE
		// si a est pair 3%2 = 1 ; 4%2 = 0
		// le reste de la division de a par 2 est egal à 0
		// donc a est pair
		/*if( a%2 == 0 ) {
			System.out.println("a est pair");
		}
		if( a%2 != 0 ) {
			System.out.println("a est impair");
		}*/
		if( a%2 == 0 ) {
			System.out.println("a est pair");
		} else {
			System.out.println("a est impair");
		}
		
		// IF ... ELSE IF ... ELSE
		if(a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a == b");
		}
		// vous pouvez avoir autant de else if que vous souhaitez
		// else if (a == 0) {
		//	System.out.println("a == 0");
		//}
		
		// "est ce que a inférieur à b ?"
		// "a < b ?"
		// CONDITION OU OPERATEUR TERNAIRE 
		Boolean booleanResult;
		String stringResult;
		
		// stocker directement le resultat de la comparaison
		booleanResult = a < b;
		
		if(a < b) {
			stringResult = "a inférieur à b";
		} else {
			stringResult = "a superieur ou egal à b";
		}
		
		// (condition) ? si vrai : si faux; 
		stringResult = (a < b) ? "a inférieur à b" : "a superieur ou egal à b";
		
		// INSTRUCTION SWITCH
		// variable fruit
		String fruit = "apple"; 
		// prix 
		Double price = 0.00; // Float
		
		// déterminer le prix en fonction du fruit
		// case value <=> fruit == value
		// premier case if(fruit == "apple")
		// second case if(fruit == "kiwi")
		switch (fruit) {
			case "apple":
				// code
				price = 5.50;
				// instruction qui détermine la fin du case
				break;
			case "kiwi":
				price = 5.70;
				break;
			default:
				price = 4.00;
				break;
		}
		
		System.out.println("Fruit: " + fruit + " | " + price);
		
		
		// Un nombre aléatoire
		// 1) Math.random() => renvoi un double entre 0.0 et 1.0
		// 2) multiplier par 10 pour enlever la décimale
		Double random = Math.random() * 100;
		random = Math.floor(random);
		System.out.println("Nombre aléatoire: " + random);
		
		// Input utilisateur
		// System.in => flux d'entrée
		// Le constructeur de Scanner demande un argument de type Flux Entrant (InputStream)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Entrer une valeur:");
//		Integer input = scan.nextInt();
//		System.out.println("Valeur entrée: " + input);
		
		System.out.println("== BOUCLES ==");
		System.out.println("Une boucle for:");
		String msg = "Un msg pour le for";
		String msgFor = "";
		// Boucle for
		for(int i = 0; i < 3; i++) {
			System.out.println("Valeur de i "+i);
			System.out.println("Afficher le msg 3 fois");
			if(i == 2) {
				System.out.println(msg);
				msgFor = "Un msg dans le for";
			}
		}
		System.out.println(msgFor);
		
		// Boucle while
		System.out.println("Une boucle while:");
		int j = 0;
		while (j < 3) {			
			j++;
			System.out.println("Valeur de j "+j);
			System.out.println("Afficher le msg 3 fois");			
		}
		
		// Boucle do ... while
		System.out.println("Une boucle do...while:");
		// quoi qu'il se passe, peu importe la condition
		// la boucle va etre exécutée au moin une fois
		do {
			System.out.println("Un msg dans ma boucle while");
		} while (false);
		// second exemple
		System.out.println("Une autre boucle do...while:");
		int k = 0;
		do {
			k++;
			System.out.println("Valeur de k "+k);
			System.out.println("Afficher le msg 3 fois");
		} while (k < 3);
		
		
		// Tableaux
		System.out.println("== TABELAUX ==");
		
		// type[] <nom_variable> => tableau
		// Déclarer un tableau
		// Le tableau contient 3 éléments
		// Le tableau est de taille 3
		String[] fruits = {"apple", "orange", "kiwi"};
		// Autre syntaxe
		// String[] fruits = new String[2];
		// fruist[0] = "apple";
		// ...
		
		// Déclare un tableau de taille 3
		// il ne contient pas d'élément
		Integer[] numbers = new Integer[3];
		// remplir manuellement
		// numbers[0] = 1;
		// numbers[1] = 2;
		
		// remplir de façon dynamique avec une boucle
		for(int i = 0; i < 3; i++) {
			numbers[i] = i;
		}
		
		// Afficher l'élément du tableau a l'index 0
		System.out.println("fruits[0]");
		System.out.println(fruits[0]);
		
		// remplacer kiwi par lemon		
		fruits[2] = "lemon";
		// kiwi n'existe plus
		System.out.println("fruits[2]");
		System.out.println(fruits[2]);
		
		// Afficher chaque élément de fruits
		// taille en manuel i <3
		System.out.println("Affichage fruits for i < 3");
		for(int i = 0; i < 3; i++) {
			System.out.println(fruits[i]);
		}
		// taille en dynamique
		System.out.println("Affichage fruit for i < fruits.length");
		for(int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		// syntaxe for each
		// Pour chaque element nommé f (de type String) cotenu dans fruits
		System.out.println("Affichage fruit via for/foreach");
		for(String f : fruits) {
			System.out.println(f);
		}
		
		
		// LES COLLECTIONS
		System.out.println("== COLLECTIONS ==");
		// Manipuler plusieurs éléments
		// On a plusieurs formes de collections
		
		// rappel pour les tableaux:
		// <type>[] <nom_variable> = new <type>[];
		
		
		// pour les collections
		// <type_de_collection><classe_utilise> <nom_variable>
		ArrayList<String> saveurs = new ArrayList<String>();
		saveurs.add("Chocolat");
		saveurs.add("Fraise");
		saveurs.add("Bonbon");
		saveurs.add("Cafe");
		
		// taille de la liste
		System.out.println("La liste est de taille " + saveurs.size());
		
		// indexOf()
		System.out.println("Index de Cafe " + saveurs.indexOf("Cafe"));
		
		// get()
		System.out.println("Afficher l'élement a la case 2 " + saveurs.get(2) );
		
		// contains()
		System.out.println("Contient Bonbon? " + saveurs.contains("Bonbon") );
		/*
		 *  mécanisme du contains qui utilise equals
		 *  for(String s : saveurs) {
		 *    if(s.equals("Bonbon") return true;
		 *  }
		 */
		
		/*
		 * Hashcode
		 * hashcode()
		 * pour chaque objet donner un numéro unique
		 */
		
		// parcourir la liste
		for(String s : saveurs) {
			System.out.println(s);
		}
		
		// un autre type de collections
		HashSet<String> playlist = new HashSet<String>();
		
		// Artithmetic exception
		// Integer myNumber = 10;
		// System.out.println(myNumber / 0);

		// LES EXCEPTIONS
		System.out.println("== EXCEPTIONS ==");
		Integer inputNumber = null;
		do {		
			Scanner scan = new Scanner(System.in);
			System.out.println("Saisir un nombre supérieur a 10:");
			// pour capturer et gérer une erreur on utilise un mecanisme try...catch
			try {
				inputNumber = scan.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Vous n'avez saisi un nombre correct");
			}
			System.out.println("Apres la saisie");
		}while(inputNumber == null);
		
		// Travailler sur les fichiers
		System.out.println("== Les fichiers ==");
		
		// Chemin absolu => C:/... (depuis la racine)
		// Chemin relatif => par rapport au dossier actuel /subfolder ; ../parentfolder
		File f = new File("myfile.txt");
		
		System.out.println("Ecriture du fichier");
		// ecrire
		try {
			FileWriter fw = new FileWriter(f); // flux sortant
			PrintWriter printer = new PrintWriter(fw); // ecrire dans le flux sortant
			printer.println("Hello");
			printer.println("Bye");
			printer.close(); // fermer le flux
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Lecture du fichier");
		try {
			Scanner fileScan = new Scanner(f);
			while(fileScan.hasNextLine()) {
				System.out.println(fileScan.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
