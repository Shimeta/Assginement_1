public class Zoo{
  private String name;
	private Personal[] angestellte;
	private Gehege gehege;
	private Tier[] tiere;


public Zoo(String name,Personal[] angestellte,Gehege gehege,Tier[] tiere) {
		this.name = name;
		this.angestellte = angestellte; 
		this.gehege = gehege;
		this.tiere = tiere;
	}

}
