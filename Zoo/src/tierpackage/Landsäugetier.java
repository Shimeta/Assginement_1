package tierpackage;

public abstract class Lands�ugetier extends Tier {
	String gattung; 
	
	//Konstruktor
	Lands�ugetier(String dieGattung, String gehege, String name){
		super(gehege, name);
		gattung = dieGattung; // z.B. L�we
	}
	
	

}
