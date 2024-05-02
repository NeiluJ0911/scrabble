package scrabble.modele;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class SacJeton {
	
	public static List<Jeton> sacJeton;

	static {
        sacJeton = new ArrayList<>();
        mettreDesJetonDansMonSac();
        melangerSac();
    }
	
	private static void mettreDesJetonDansMonSac() {
		for (int i = 0; i < 15; i++) {
				sacJeton.add(new Jeton(Lettre.E, Points.UN));
		}
		for (int i = 0; i < 9; i++) {
			sacJeton.add(new Jeton(Lettre.A, Points.UN));
		}
		for (int i = 0; i < 8; i++) {
			sacJeton.add(new Jeton(Lettre.I, Points.UN));
		}
		for (int i = 0; i < 6; i++) {
			sacJeton.add(new Jeton(Lettre.N, Points.UN));
			sacJeton.add(new Jeton(Lettre.O, Points.UN));
			sacJeton.add(new Jeton(Lettre.R, Points.UN));
			sacJeton.add(new Jeton(Lettre.S, Points.UN));
			sacJeton.add(new Jeton(Lettre.T, Points.UN));
			sacJeton.add(new Jeton(Lettre.U, Points.UN));
		}
		for (int i = 0; i < 5; i++) {
			sacJeton.add(new Jeton(Lettre.L, Points.UN));
		}
		for (int i = 0; i < 3; i++) {
			sacJeton.add(new Jeton(Lettre.D, Points.DEUX));
			sacJeton.add(new Jeton(Lettre.M, Points.DEUX));
		}
		for (int i = 0; i < 2; i++) {
			sacJeton.add(new Jeton(Lettre.G, Points.DEUX));
			sacJeton.add(new Jeton(Lettre.C, Points.TROIS));
			sacJeton.add(new Jeton(Lettre.B, Points.TROIS));
			sacJeton.add(new Jeton(Lettre.P, Points.TROIS));
			sacJeton.add(new Jeton(Lettre.F, Points.QUATRE));
			sacJeton.add(new Jeton(Lettre.H, Points.QUATRE));
			sacJeton.add(new Jeton(Lettre.V, Points.QUATRE));
			sacJeton.add(new Jeton(Lettre.JOKER, Points.ZERO));
		}
		for (int i = 0; i < 1; i++) {
			sacJeton.add(new Jeton(Lettre.J, Points.HUIT));
			sacJeton.add(new Jeton(Lettre.Q, Points.HUIT));
			sacJeton.add(new Jeton(Lettre.K, Points.DIX));
			sacJeton.add(new Jeton(Lettre.W, Points.DIX));
			sacJeton.add(new Jeton(Lettre.X, Points.DIX));
			sacJeton.add(new Jeton(Lettre.Y, Points.DIX));
			sacJeton.add(new Jeton(Lettre.Z, Points.DIX));
		}
	}
	
	public static void melangerSac() {
		Collections.shuffle(sacJeton);
	}
	
	public static Jeton piocherJeton() {
        if (!sacJeton.isEmpty()) {
            Random rand = new Random();
            return sacJeton.remove(rand.nextInt(sacJeton.size()));
        } else {
            System.out.println("Le sac de jetons est vide.");
            return null;
        }
    }
	
}