package tierpackage;

public abstract class Landsäugetier extends Tier {
	String gattung; 
	
	//Konstruktor
	Landsäugetier(String dieGattung, String gehege){
		super(gehege);
		gattung = dieGattung;
	}
	
	

}
