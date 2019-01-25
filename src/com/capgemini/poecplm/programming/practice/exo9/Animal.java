package com.capgemini.poecplm.programming.practice.exo9;

public class Animal {

	private String name;

	public Animal() {
		this.name = "Medor";
	}

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// si le nom de l'bjet en cours = nom de l'objet passé o
		// alors return true;
	// sinon je renvoi faux
	public boolean equals(Object o) {
		// est ce que c'est possible o en Animal ? 
		// verifier que o est bien du meme type que Animal
		// verifer que o est une instance de Animal
		if(o instanceof Animal) {
			// pour utiliser le nom de o qui est recu
			// je dois convertir o en Animal
			// (type_souhaite) variable_a_traduire
			// ( (Animal) o )
			// on obtient une copie de o dans un objet Animal
			Animal a = ( (Animal) o ); // Animal a = (Animal) o;
			return this.name.equals(a.name);
		} else {
			return false;
		}
		
		
		
		
	}
	
	
	
	
}
