package scrabble.application;

import java.util.List;

import scrabble.modele.Case;
import scrabble.modele.Plateau;
import scrabble.gui.Console;

public class ScrabbleApplicationConsole {

	public static void main(String[] args) {
		
		Console.titre("Bienvenue dans notre magnifique scrabble");
		
		List<Case> plateau = Plateau.mettreDesCaseDansMonPlateau();
		Plateau.faireAfficherMesCases(plateau);
	}
}
