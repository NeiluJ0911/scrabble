package scrabble.application;

import java.util.List;

import scrabble.modele.Case;
import scrabble.modele.Plateau;
import scrabble.modele.Specialite;
import scrabble.gui.Console;

public class ScrabbleApplicationConsole {

	public static void main(String[] args) {
		
		Console.titre("Bienvenue dans notre magnifique scrabble");
		
		Case[][] plateau = Plateau.mettreDesCaseDansMonPlateau();
		plateau[8][8]= new Case(Specialite.ETOILE);
		Plateau.faireAfficherMesCases(plateau);
	}
}
