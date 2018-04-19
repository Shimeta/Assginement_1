package tierpackage;

public abstract class Landsäugetier extends Tier {
	String gattung; 
	
	//Konstruktor
	Landsäugetier(String dieGattung, String gehege, String name){
		super(gehege, name);
		gattung = dieGattung; // z.B. Löwe
	}
	
	

}
