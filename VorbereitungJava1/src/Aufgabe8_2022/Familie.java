package Aufgabe8_2022;

public class Familie extends Gruppe {
	private String[] vornamen;
	
	public Familie(String name, int groesse) {
		// TODO Auto-generated constructor stub
		super(name);
		vornamen = new String[groesse];
	}

	public String[] getVornamen() {
		return vornamen;
	}

	void setVornamen(String[] vornamen) {
		this.vornamen = vornamen;
	}

}
