package fr.mds.axel.tp6.observer;

public class BinaryObserver implements Observer {

	@Override
	public void update(int value) {
		System.out.println("Binary String: " + Integer.toBinaryString(value));
	}
	
}
