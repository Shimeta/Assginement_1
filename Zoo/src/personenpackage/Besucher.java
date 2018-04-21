package personenpackage;

import gehegepackage.Gehege;

public class Besucher extends Personen {


	public Besucher(String name, int alter,Gehege gehege) {
		super(name, alter,gehege);
	}

	
	@Override
	public void laufen(Personen person, Gehege gehege) {
		
	}


}
