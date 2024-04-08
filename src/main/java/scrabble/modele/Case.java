package scrabble.modele;

public class Case {
	
	private static Spécialité spécialité;
	
	private Boolean présenceJeton = false;

	public Spécialité getSpécialité() {
		return spécialité;
	}

	public Boolean getPrésenceJeton() {
		return présenceJeton;
	}

	public void setPrésenceJeton(Boolean présenceJeton) {
		this.présenceJeton = présenceJeton;
	}

	public Case(Spécialité spécialité) {
		Case.spécialité = spécialité;
	}

	@Override
	public String toString() {
		return "Case [présenceJeton=" + présenceJeton + "]";
	}
	
	
}
