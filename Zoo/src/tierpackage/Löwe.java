package tierpackage;

public class Löwe extends Landsäugetier {
	
	boolean hunter; // Löwe ist ein Jäger
	
	//Konstruktor
	Löwe(String gehege, String name, String gattung){
		super(gehege, name, gattung);
		hunter = true;
	}

}
