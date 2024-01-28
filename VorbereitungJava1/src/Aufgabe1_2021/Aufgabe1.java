package Aufgabe1_2021;

public class Aufgabe1 {
	//teil a
	double s;
	// sei es bereits deklariert
	static char y;
	static String str = "";
	static float g = 4.f;
	@SuppressWarnings("unused")
	private long groesseZahl;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//teil b
		y = 3;
		// teil c Ausgabe kontrollieren
		System.out.println("W"+ 'W' + 3 + (5 + 6));
		
		// teil d
		if(g >= 5 ){
			str = "x";
			System.out.println("Wurde gesetzt auf: " + str + " Typ: " + str.getClass() );
		}else {
			g = 3.4f;
			System.out.println("Wurde gesetzt auf: " + g );
		}
		
		//teil e
			// Werte ignoriert 
		for(int i = 0; i<=30 ; i++) {
			System.out.print(i + ",");
		}
		
		//teil f
		String f = "Q-ac3vAB";
		System.out.println("\nDer index von Zeichen A lautet: " +f.indexOf("A"));
	}
	// teil g
	void setGrosseZahl(long groesseZahl) {
		this.groesseZahl = groesseZahl;
	}
}
