package Aufgabe5_2021;

import javax.swing.JOptionPane;

public class Aufgabe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int summe = 0;
	     int anzahl = 0;
	        while (true) {
	            String eingabe = JOptionPane.showInputDialog(null, "Eingabe der Note (0 zum zusammenfassen):");
	            try {
	                int note = Integer.parseInt(eingabe);
	                if (note == 0){
	                    if (anzahl >= 2){
	                    	 double schnitt = (double) summe / anzahl;
		                     JOptionPane.showMessageDialog(null, "Der schnitt ist: " + schnitt);
		                     //System.out.println("Der schnitt ist: " + schnitt);
		                     break;
	                    } else {
	                        JOptionPane.showMessageDialog(null, " Zu wenig Noteneingaben! ");
	                        //System.out.println(" Zu wenig Noteneingaben! ");
	                    }
	                } else if (note < 0 || note > 6) {
	                    JOptionPane.showMessageDialog(null, " Nur Ziffern von 1 - 6! ");
	                    //System.out.println(" Nur Ziffern von 1 - 6! ");
	                    break;
	                } else {
	                	summe += note;
	                    anzahl++;
	                }
	            } catch (Exception e) {
	                JOptionPane.showMessageDialog(null, "Falsche eingabe. Es muss eine Zahl eingegeben werden.");
	                System.err.println("Fehlermelddung: " + e);
	            }
	        }
	    }
	}