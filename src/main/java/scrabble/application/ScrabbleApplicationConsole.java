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
		
		Case[][] plateau = Plateau.mettreDesCaseDansMonPlateau();
		plateau[8][8]= new Case(Specialite.ETOILE);
		List<Case> plateau = Plateau.mettreDesCaseDansMonPlateau();
		Plateau.faireAfficherMesCases(plateau);
		
		Jeton jetonPioche = SacJeton.piocherJeton();
        if (jetonPioche != null) {
            Console.message("Jeton pioché : Lettre " + jetonPioche.getLettre() + ", Points " + jetonPioche.getPoints().getValeur());
        } else {
            Console.message("Le sac de jetons est vide.");
        }
		
		Chevalet chevalet = new Chevalet();
		Jeton jeton1 = new Jeton(Lettre.A, Points.DEUX);
		Jeton jeton2 = new Jeton(Lettre.B, Points.TROIS);
		chevalet.ajouter(jeton1);
		chevalet.ajouter(jeton2);
		chevalet.afficher();
		
	}
}
