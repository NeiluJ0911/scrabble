package scrabble.modele;

import java.util.ArrayList;
import java.util.List;

import scrabble.gui.*;

public class Plateau {

	public static List<Case> mettreDesCaseDansMonPlateau() {
		List<Case> plateau = new ArrayList<>();
		
		plateau.add(new Case(Specialite.NEUTRE));
		
			
		return plateau;
	}
	
	public static void faireAfficherMesCases(List<Case> plateau) {
		for (Case cases : plateau) {
			Console.message(cases.toString());
		}
	}
}
