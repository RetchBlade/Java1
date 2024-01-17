package Aufgabe6;

import java.util.Random;

public class Aufgabe6 {
	// Schreiben Sie eine Methode zeichen, die ein Character-Array als 
	// Eingabeparameter hat. 
	static int zeichen(char[] a){
		/*
		 * Die ersten beiden Elemente des Arrays stellen die
			beiden exklusiven Grenzen eines Bereichs von Zeichen dar. Die Methode muss 
			eigenständig feststellen, was die obere Grenze und was die untere Grenze is
		 */
		int start = 0, end = 0;
		if(a[0]<a[1]){
			start = (int) a[0];
			end = (int) a[1];
		} else if( a[0]>a[1]) {
			start = (int)a[1];
			end = (int) a[0];
		} else {
			// Zusatz fuer uns
			System.err.println("(Debug) Irgendwas ist Falsch");
		}
		
		/**
		 * Falls das dritte Element des Arrays nicht innerhalb des Bereichs der ersten beiden 
			Parameter liegt, geben Sie -1 zurück
		 */
		char zielChar;
		
			zielChar = a[2];
			if(zielChar<start || zielChar>end){
				return -1;
			}
		
		/**
		 * Lassen Sie in der Methode solange zufällige Zeichen aus dem Bereich erzeugen, bis 
			das erzeugte Zeichen gleich dem dritten Element des Arrays ist. Die Methode soll die 
			Anzahl der Zeichen, die erzeugt wurden, bis das erzeugte Zeichen gleich dem dritten 
			Element des Arrays ist, zurückgeben.
		 */
		Random rand = new Random();
		char randomChar = 0;
		int count = 0;
			while(zielChar != randomChar){
				// Aendern spanne
				randomChar = (char)(rand.nextInt(end - start +1)+start);
				count++;
				System.out.println("(Debug) Zaehler ++"+count);
				System.out.println("(Debug) Zeichen "+randomChar);
			}
			return count;
	}
	
	 static String eingabe(){
		/*
		 * Schreiben Sie eine Methode, in der eine Zeichenkette aus drei sichtbaren Zeichen 
			(nicht sichtbar ist z.B. ASCII 127) aus dem ASCII-Zeichensatz (ohne Erweiterung) 
			eingelesen wird. Diese Zeichenkette wird zurückgegeben.
		 */
		char a = 65;
		char b = 90;
		char c = 72;
	
		return ""+ a + b + c;
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		/**
		 * Schreiben Sie eine main-Methode, die die Eingabe-Methode aufruft und dann die
			Rückgabe dieser Methode in ein Character-Array umwandelt. Die Methode zeichen
			wird danach mit diesem Array als Parameter aufgerufen und der Rückgabewert 
			dieser Methode wird ausgegeben.
		 */
		
			String eingabe1;
			try {
				eingabe1 = eingabe();
				char[] arrayChar = eingabe1.toCharArray();
				System.out.println("Anzahl der Versuche "+zeichen(arrayChar) +" fuer Zeichen " + arrayChar[2]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println(e);
				System.exit(0);
			}
	}
}
