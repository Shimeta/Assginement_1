package personenpackage;

import gehegepackage.Gehege;

public abstract class Personal {
  
  public class Personal extends Personen {
	
	public int lohn;

	public Personal(String name, int alter, Gehege gehege, int lohn) {
		
		super(name, alter, gehege);
    
		this.lohn= lohn;
			
	}

	@Override
	public void laufen(Personen person, Gehege gehege) {
		
		System.out.println(person + "geht zum " + gehege);
		
		
	}
	

  }
  
}
