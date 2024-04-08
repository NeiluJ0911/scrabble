package scrabble.modele;

public class Case {
	
	private static String spécialité;
	
	private Boolean présenceJeton = false;

	public String getSpécialité() {
		return spécialité;
	}

	public Boolean getPrésenceJeton() {
		return présenceJeton;
	}

	public void setPrésenceJeton(Boolean présenceJeton) {
		this.présenceJeton = présenceJeton;
	}

	public Case(String spécialité) {
		Case.spécialité = spécialité;
	}
	
	
}
