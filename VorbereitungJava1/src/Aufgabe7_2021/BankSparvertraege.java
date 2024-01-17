package Aufgabe7_2021;

public class BankSparvertraege {
	@SuppressWarnings("unused")
	private String name;
	private Sparvertrag[] vertragArray;
	
	public BankSparvertraege(String name) {
		this.name = name;
		int xyz = 557;
		this.vertragArray = new Sparvertrag[xyz];
		
	}
	
	public Sparvertrag[] getVertragArray() {
		return vertragArray;
	}

	public void vertragHinzufuegen(String sparer, double guthaben, String art){
		
        for (int i = 0; i < vertragArray.length; i++) {
            if (vertragArray[i] == null) {
            	if (art.equals("NormSparvertrag")) {
                    vertragArray[i] = new NormSparvertrag(sparer, guthaben);
                }else if (art.equals("VertragPlus")) {
                    vertragArray[i] = new VertragPlus(sparer, guthaben);
                } else {
                    // Fehlermeldung fuer unbekannten Strings
                    System.out.println("Fehler: Unbekannter Vertragstyp"); 
                }
            	 break;
            }else {
            	 // Fehlermeldung
                System.out.println("Fehler: Das Array ist voll. Kein weiterer Vertrag kann hinzugefügt werden.");
            }
        }
	}
}
