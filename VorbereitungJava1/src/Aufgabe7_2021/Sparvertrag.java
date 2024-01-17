package Aufgabe7_2021;

public class Sparvertrag {
	private String sparer, vertragTyp;

	public Sparvertrag(String sparer, String vertragTyp) {
		this.setSparer(sparer);
		this.setVertragTyp(vertragTyp);
	}

	public String getSparer() {
		return sparer;
	}

	void setSparer(String sparer) {
		this.sparer = sparer;
	}

	public String getVertragTyp() {
		return vertragTyp;
	}

	void setVertragTyp(String vertragTyp) {
		this.vertragTyp = vertragTyp;
	}
	
}
