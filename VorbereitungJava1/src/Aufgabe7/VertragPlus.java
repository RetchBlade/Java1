package Aufgabe7;

public class VertragPlus extends NormSparvertrag implements Zinsen{
	public VertragPlus(String sparer, double guthaben) {
		super(sparer, guthaben);
		// TODO Auto-generated constructor stub
		this.setVertragTyp("VertragPlus");
	}

	@Override
	public void addZins(int dauer) {
		// TODO Auto-generated method stub
		super.addZins(dauer);
		if(dauer < 1){
			dauer = 1;
			System.out.println("(Debug) Dauer war kleiner 1, dauer wurde auf "+dauer+" gesetzt");
		} else if(dauer > 9){
			dauer = 9;
			System.out.println("(Debug) Dauer war Groesser 9, dauer wurde auf "+dauer+" gesetzt");
		}
	}
}
