package personenpackage;

import gehegepackage.Gehege;

public abstract class Personen {

	private static String name;
	private static int alter;
	private static Gehege gehege;
	
	public Personen(String name, int alter,Gehege gehege) {
		
		this.name = name;
		this.alter = alter;
		this.gehege = gehege;
		
		
	}
	
	public void reden() {
		
		System.out.println(name+"Sagt Hallo");
	}
	
  
	public abstract void laufen(Personen person,Gehege gehege);
	
}
