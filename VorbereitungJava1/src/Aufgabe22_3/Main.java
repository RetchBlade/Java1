package Aufgabe22_3;

public class Main {
 /**
  * Schreiben Sie eine main-Methode und legen Sie ein Array von drei lackierbaren 
	Objekten an. Belegen Sie das Array mit einem Tisch, einem Stuhl und einem Fahrrad. 
		Lackieren Sie alle drei Objekte ROT
  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lackierbar[] array = new Lackierbar[3];
		array[0] = new Tisch();
		array[1] = new Stuhl();
		array[2] = new Fahrrad();
		
		for(int i = 0; i < array.length; i++ ) {
			array[i].lackieren(Lackierbar.ROT);
		}
	}	

}
