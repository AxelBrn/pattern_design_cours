package fr.mds.axel.tp5.java;

public class ConcreteCommand extends Command {
	
	private String state;
	
	public ConcreteCommand(final Stock stock) {
		super(stock);
	}

	@Override
	public boolean bought() throws CloneNotSupportedException {
		this.state = "bought";
		
		return true;
	}

	@Override
	public boolean sold() throws CloneNotSupportedException {
		this.state = "sold";
		return true;
	}
	
	@Override
	public String toString() {
		return "Stock [ " + super.getStock() + "] " + this.state;
	}

}
