package fr.mds.axel.tp6;

import fr.mds.axel.tp6.observer.BinaryObserver;
import fr.mds.axel.tp6.observer.HexaObserver;
import fr.mds.axel.tp6.observer.Observer;
import fr.mds.axel.tp6.observer.OctalObserver;
import fr.mds.axel.tp6.subject.Subject;

public class Application {
	
	/**
	*
	* @author tactfactory
	*
	* - Le programme doit utiliser un design pattern "Observer" afin d'avoir les �l�ments suivant :
	*   - 1 : Un Subject sera observ� par 3 observer
	*   - 2 : Le Subject poss�dera un state de type int
	*   - 3 : Lors de la modification du state du Subject les observers attach�s seront appel� avec :
	*       - 1 : Un observer affichera l'entier en hexad�cimal
	*       - 2 : Un observer affichera l'entier en octal
	*       - 3 : Un observer affichera l'entier en binaire
	*   - 3 : Le lancement de l'application doit afficher les �l�ments suivant :
	*
	*       First state change: 15
	*       Hex String: F
	*       Octal String: 17
	*       Binary String: 1111
	*       Second state change: 10
	*       Hex String: A
	*       Octal String: 12
	*       Binary String: 1010
	*/

	public static void main(String[] args) {
		
		Observer ob1 = new BinaryObserver();
		Observer ob2 = new HexaObserver();
		Observer ob3 = new OctalObserver();
		
		Subject subject = new Subject(0);
		subject.attach(ob1);
		subject.attach(ob2);
		subject.attach(ob3);
		
		subject.setState(15);
		
		subject.setState(10);
		

	}


}
