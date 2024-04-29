package scrabble.application;

import java.util.List;

import scrabble.modele.Case;
import scrabble.modele.Plateau;

import scrabble.modele.Jeton;
import scrabble.modele.Lettre;
import scrabble.modele.Points;

import scrabble.gui.Console;
import scrabble.modele.Chevalet;
public class ScrabbleApplicationConsole {

	public static void main(String[] args) {
		System.out.println("-------------------------------------------------------");
		System.out.println("-- Bienvenue dans notre magnifique jeu de scrabble ! --");
		System.out.println("-------------------------------------------------------");
		
		List<Case> plateau = Plateau.mettreDesCaseDansMonPlateau();
		Plateau.faireAfficherMesCases(plateau);
		
		Chevalet chevalet = new Chevalet();
		Jeton jeton1 = new Jeton(Lettre.A, Points.DEUX);
		Jeton jeton2 = new Jeton(Lettre.B, Points.TROIS);
		chevalet.ajouter(jeton1);
		chevalet.ajouter(jeton2);
		chevalet.afficher();
	}
}
