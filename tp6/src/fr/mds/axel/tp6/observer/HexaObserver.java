package fr.mds.axel.tp6.observer;

public class HexaObserver implements Observer {

	@Override
	public void update(int value) {
		System.out.println("Hexa String: " + Integer.toHexString(value));
		
	}
	
}
