package Aufgabe8_2022;

public class HausApp  {
	static Haus h;
	public static void ausgabeGroesse(){
		Familie[] familie = h.getBewohner();
		for(int i = 0; i < familie.length-4;i++){
			if(familie[i].getVornamen().length<= Zahlen.ZAHL1){
				System.out.println("Die Familie ist klein auf der Etage: "+i );
			} else if(familie[i].getVornamen().length > Zahlen.ZAHL2) {
				System.out.println("Die Familie ist Gross auf der Etage: " +i);
			} else {
				System.out.println("Die Famile hat eine übliche Groesse auf der Etage: " +i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		h = new Haus(1);
		String[] vornamen = new String[5];
		vornamen[0] = "Marlon";
		vornamen[1] = "Seine Frau";
		vornamen[2] = "Seine Katze";
		vornamen[3] = "Seine zweite Katze";
		vornamen[4] = "Seine Dritte Katze";
		h.einzug("May", vornamen, 0);
		
		String[] vornamen2 = new String[1];
		vornamen2[0] = "Haneen";
		h.einzug("XYZ", vornamen2, 1);
		
		ausgabeGroesse();
	}
}
