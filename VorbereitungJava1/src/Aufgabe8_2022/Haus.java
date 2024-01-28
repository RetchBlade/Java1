package Aufgabe8_2022;

public class Haus {
	@SuppressWarnings("unused")
	private String strasse;
	private Familie[] bewohner;
	@SuppressWarnings("unused")
	private int hausnummer;
	
	public Haus(int hausnummer) {
		this.hausnummer = hausnummer;
		strasse = "Hauptstrasse";
		bewohner = new Familie[6];
	}
	
	public Familie[] getBewohner() {
		return bewohner;
	}
	
	void einzug(String familienName, String[] vornamen, int etage) {
		bewohner[etage] = new Familie(familienName, vornamen.length);
		bewohner[etage].setVornamen(vornamen);
	}
}
