package Aufgabe22_3;

public class Stuhl extends Moebel {
	/**
	 * Vererben Sie die Klasse Moebel an die nicht abstrakte Klassen Tisch und Stuhl. Setzen 
		Sie im Konstruktor der Klassen den Typ auf den Klassennamen
	 */
	public Stuhl() {
		super();
		super.typ = "Stuhl";
	}
	
}
