package Aufgabe8_2022;

public abstract class KleineGruppe extends Gruppe {

	public KleineGruppe(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setGroesse(int groesse) {
		// TODO Auto-generated method stub
		String filt = super.getGroesse() + "";
		String neueGroesse = filt.substring(filt.length()-2, filt.length());
		groesse = Integer.parseInt(neueGroesse);
		super.setGroesse(groesse);
	}
	
}
