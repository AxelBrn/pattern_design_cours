package fr.mds.axel.tp6.subject;

import java.util.ArrayList;
import java.util.List;

import fr.mds.axel.tp6.observer.Observer;

public class Subject {

	private final List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public Subject(int state) {
		this.state = state;
	}

	  public void attach(Observer observer) {
	    if (!observers.contains(observer)) {
	      this.observers.add(observer);
	    }
	  }

	  public void detach(Observer observer) {
	    if (observers.contains(observer)) {
	      this.observers.remove(observer);
	    }
	  }

	  protected void notifyObservers() {
	    for (Observer observer : observers) {
	      observer.update(this.state);
	    }
	  }

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		System.out.println("State change :" + state);
		this.notifyObservers();
	}
	  
	  
	
	
}
