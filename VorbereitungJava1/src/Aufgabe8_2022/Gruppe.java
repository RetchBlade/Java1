package Aufgabe8_2022;

public abstract class Gruppe implements Zahlen {
	private String name;
	private int groesse;
	
	
	public Gruppe(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}
	
	public int getGroesse() {
		return groesse;
	}

	@Override
	public void setGroesse(int groesse) {
		// TODO Auto-generated method stub
		this.groesse = groesse;
	}
}	
