package fr.mds.axel.tp6.observer;

public class OctalObserver implements Observer {

	@Override
	public void update(int value) {
		System.out.println("Octal String: " + Integer.toOctalString(value));
		
	}

}
