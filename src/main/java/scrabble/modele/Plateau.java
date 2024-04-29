package scrabble.modele;

import java.util.ArrayList;
import java.util.List;

import scrabble.gui.*;

public class Plateau {

	public static Case[][] mettreDesCaseDansMonPlateau() {
		Case[][] plateau = new Case[15][15];
		for (int i = 0;i==15;i++) {
			for (int j = 0; j==15;j++) {
				plateau[i][j] = new Case(Specialite.NEUTRE);
			}
		}
		return plateau;
	}
	
	public static void faireAfficherMesCases(Case[][] plateau) {
		for (Case[] cases : plateau) {
			for (Case[] casess : plateau) {
				Console.message(casess.toString());
			}
		}
	}
}
