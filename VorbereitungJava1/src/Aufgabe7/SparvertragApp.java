package Aufgabe7;

public class SparvertragApp {
	
	public static void main(String[] args){
		// Erstelle ein Objekt der Klasse BankSparvertraege
        BankSparvertraege meineBank = new BankSparvertraege("LorenzGmbH");

        // Füge einen Sparvertrag hinzu (hier: NormSparvertrag)
        String sparer = "Lorenz";
        double guthaben = 1000.0;
        String vertragArt = "VertragPlus";
        
        meineBank.vertragHinzufuegen(sparer, guthaben, vertragArt);
        
        var vertragArray = meineBank.getVertragArray();
        
        // Debug
        System.out.println("(Debug)Klasse: "+vertragArray[0].getClass()+"\n");
        System.out.println("Vetragstyp: "+vertragArray[0].getVertragTyp());
        System.out.println("Sparer: "+vertragArray[0].getSparer()+"\n");
        
        // Zinsen
        VertragPlus zinsVertrag = (VertragPlus) vertragArray[0];
        System.out.println(zinsVertrag.getGuthaben());
        
        int dauer = 12;
        zinsVertrag.addZins(dauer);
   
        System.out.println("Aktualisiertes Guthaben fuer " + sparer + ": " + zinsVertrag.getGuthaben());
    
	}
}
