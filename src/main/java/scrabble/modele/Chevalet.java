package scrabble.modele;

import java.util.ArrayList;
import java.util.List;

import scrabble.gui.Console;

public class Chevalet {
	List<Jeton> jetonsJouables; 
	
	public Chevalet(){
		this.jetonsJouables = new ArrayList<Jeton>();
	}
	
	public void ajouter(Jeton jeton) {
		this.jetonsJouables.add(jeton);
	}
	
	void jouer(Jeton jeton){
		// TODO Ajouter l'envoi d'un jeton vers une case du plateau
	}
	
	public void afficher() {
	    if (jetonsJouables.isEmpty()) {
	        Console.message("Le chevalet est vide."); // Affiche un message si le chevalet est vide
	    } else {
	        Console.message("Jetons sur le chevalet :");
	        for (Jeton jeton : jetonsJouables) {
	            Console.message("Lettre : " + jeton.getLettre() + ", Points : " + jeton.getPoints().getValeur());
	        }
	    }
	}

	
}
