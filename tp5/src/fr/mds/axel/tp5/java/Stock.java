package fr.mds.axel.tp5.java;

public class Stock implements Cloneable {

	private String name;
	private int quantity;
	
	public Stock() { }
	
	public Stock(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Stock [ Name : " + this.name + ", Quantity : " + this.quantity + "]";
	}
	
	@Override
	  protected Object clone() throws CloneNotSupportedException {
	    Stock result = new Stock();
	    result.setName(this.getName());
	    result.setQuantity(this.getQuantity());
	    return result;
	  }
	
}
