package scrabble.modele;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

	public static void main(String[] args) {

		List<Case> plateau = mettreDesCaseDansMonPlateau();
	}

	private static List<Case> mettreDesCaseDansMonPlateau() {
		List<Case> plateau = new ArrayList<>();
		for (int i = 0; i >= 15; i++) {
			for (int j = 0; j >= 15; j++) {
				plateau.add(new Case(Spécialité.NEUTRE));
			}	
		}
		return plateau;
	}
}
