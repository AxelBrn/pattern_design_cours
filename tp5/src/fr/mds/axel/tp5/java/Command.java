package fr.mds.axel.tp5.java;

public abstract class Command {
	
	private Stock stock;
	
	public Command(Stock stock) {
		this.stock = stock;
	}
	
	public Stock getStock() {
		return this.stock;
	}
	
	public abstract boolean bought() throws CloneNotSupportedException;
	
	public abstract boolean sold() throws CloneNotSupportedException;
	
}
