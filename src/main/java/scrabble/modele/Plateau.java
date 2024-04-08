package scrabble.modele;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
	
	public static void main(String[] args) {

		List<Case> plateau = mettreDesCaseDansMonPlateau();

	}

	private static List<Case> mettreDesCaseDansMonPlateau() {
		List<Case> Plateau = new ArrayList<>();
		Plateau.add(new Case("neutre"));
		return Plateau;
	}
	
}
