package calculatricerpm;

import exeption.MAXMINException;
import java.util.Stack;

public class MoteurRPN{
	Stack<Double> p = new Stack<> ();
	private final static int MIN_VALUE=-999;
	private final static int MAX_VALUE=999;
	

	public MoteurRPN() 
	{
		p=new Stack<>();
	}
	
        
        //cette methode permet d'enregistrer une operande 
	public void enregistrer(Double value) {
		if (value> MAX_VALUE || value< MIN_VALUE)
			try {
				throw new MAXMINException ("La valeur de l'interval n'est pas respecté\n");
			} catch (MAXMINException e) {
			}
		else
		p.push(value);
                
	}
	//cette methode permet d'appliquer une operation sur les operandes
	public void calcul(Operation op){	
                        double resultat;
			Double v = depile();//depiler la première operande
			Double y = depile();//depiler la seconde operande
			resultat = op.eval(v, y);//applique une operation sur les operandes x et y
			p.push(resultat);//empiler le resultat de l'operation dans la pile
	}
	
	public boolean isEmpty() 
	{
		return p.empty();
		
	}
	
        //cette fonction permet de depiler l'element se trouvant à la tete de la pile
	public double depile() 
	{	
		if (p.isEmpty());
		return p.pop() ;		  
	}
	//cette fonction renvoie le nombre d'operande
	public int nbrOperande()
	{
		return p.size();
		
	}
	
	public Stack<Double> getP() {
		return p;
	}
	
}
		
	
