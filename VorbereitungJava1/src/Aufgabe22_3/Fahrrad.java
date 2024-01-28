package Aufgabe22_3;

public class Fahrrad implements Lackierbar {
	/**
	 * ) Erzeugen Sie eine Klasse Fahrrad mit den Eigenschaften rahmenFarbe und 
		reifenFarbe (jeweils int). Implementieren Sie das Interface Lackierbar für die 
			rahmenFarbe.
	 */
	
	int rahmenFarbe, reifenFarbe;
	@Override
	public void lackieren(int farbe) {
		// TODO Auto-generated method stub
		this.rahmenFarbe = farbe;
	}
	
	
}
