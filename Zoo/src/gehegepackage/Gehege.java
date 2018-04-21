package gehegepackage;
import tierpackage.Tier;
import Zoo;

public abstract class Gehege {
	
	private String name;
	private Tier[] tier;	
	private Zoo owner;
	
	
	public Gehege(String name,Tier[] tier, Zoo owner ) {
		
		this.name= name;
		this.tier = tier;
		this.owner = owner;
		
	}
	}
