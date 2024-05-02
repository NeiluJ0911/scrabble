package scrabble.application;

import scrabble.modele.Case;
import scrabble.modele.Plateau;
import scrabble.modele.Jeton;
import scrabble.modele.Lettre;
import scrabble.modele.Points;
import scrabble.modele.SacJeton;
import scrabble.gui.Console;
import scrabble.modele.Chevalet;
public class ScrabbleApplicationConsole {

	public static void main(String[] args) {
		Console.titre("Bienvenue dans notre magnifique scrabble");
		
		Plateau plateau = new Plateau();
		
		plateau.mettreDesCaseDansMonPlateau();
		
		plateau.faireAfficherMesCases();
		
		Console.message("");
		
		Jeton jetonPioche = SacJeton.piocherJeton();
        if (jetonPioche != null) {
            Console.message("Jeton pioché : Lettre " + jetonPioche.getLettre() + ", Points " + jetonPioche.getPoints().getValeur());
        } else {
            Console.message("Le sac de jetons est vide.");
        }
		
		Chevalet chevalet = new Chevalet();
		chevalet.afficher();
		chevalet.ajouter(jetonPioche);
		chevalet.afficher();
		
	}
}
