package calculatricerpm;

import calculatricerpm.SaisieRPN;
import exeption.SAISIEException;

public enum CalculatriceRPN {
	val1;
	CalculatriceRPN() 
	{
	
		SaisieRPN b=new SaisieRPN();
		  try {
			b.saisie();
		} catch (SAISIEException e) {
			System.out.println(e.getMessage());
		}		
		
	}
	
	public static void main(String[] args) {
		CalculatriceRPN e;	
	}

}
