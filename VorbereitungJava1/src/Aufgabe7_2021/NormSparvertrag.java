package Aufgabe7_2021;

public class NormSparvertrag extends Sparvertrag implements Zinsen{
	private double guthaben;
	public NormSparvertrag(String sparer, double guthaben) {
		super(sparer, "Normaler Sparvertrag");
		// TODO Auto-generated constructor stub
		this.setGuthaben(guthaben);
		
	}
	
	public double getGuthaben() {
		return guthaben;
	}
	
	void setGuthaben(double guthaben) {
		this.guthaben = guthaben;
	}

	@Override
	public void addZins(int dauer) {
		// TODO Auto-generated method stub
		int w = 3;
		if(dauer <= w){
			this.guthaben = (guthaben*ZINS1/100) * dauer + guthaben; 
		} else {
			this.guthaben = (guthaben*ZINS2/100) * dauer + guthaben; 
		}
	}
	
	
}
