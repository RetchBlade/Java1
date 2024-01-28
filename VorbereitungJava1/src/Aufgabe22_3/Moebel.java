package Aufgabe22_3;

public abstract class Moebel implements Lackierbar {
	/**
	 * Schreiben Sie eine abstrakte Klasse Moebel mit den Attributen farbe (int=0) und typ
			(String). Implementieren Sie in der Klasse Moebel das Interface Lackierbar und 
			implementieren Sie die Methode des Interface
	 */

	int farbe = 0;
	String typ;

	@Override
	public void lackieren(int farbe) {
		// TODO Auto-generated method stub
		this.farbe = farbe;
	}
}
