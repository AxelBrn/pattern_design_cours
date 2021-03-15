package fr.mds.axel.tp5.java;

import java.util.ArrayList;
import java.util.List;

public class GlobalStock {
	
	private List<Stock> stocks;
	private Invoker invoker = new Invoker();
	
	public GlobalStock() {
		this.stocks = new ArrayList<>();
		this.initialize();
	}
	
	private void initialize() {
		this.stocks.add(new Stock("myItem", 0));
		this.stocks.add(new Stock("apple", 0));
		this.stocks.add(new Stock("pineapple", 0));
	}
	
	public void bought(Command command) throws CloneNotSupportedException {
		if (command.bought()) {
			this.invoker.push(command);
			for(int i = 0; i < this.stocks.size(); i++) {
				if(command.getStock().getName() == this.stocks.get(i).getName()) {
					this.stocks.get(i).setQuantity(this.stocks.get(i).getQuantity() + command.getStock().getQuantity());
				}
			}
		}
	}
	
	public void sold(Command command) throws CloneNotSupportedException, Exception {
		if (command.sold()) {
			this.invoker.push(command);
			for(int i = 0; i < this.stocks.size(); i++) {
				if(command.getStock().getName() == this.stocks.get(i).getName()) {
					if(this.stocks.get(i).getQuantity() - command.getStock().getQuantity() <= 0) {
						throw new Exception();
					}
					this.stocks.get(i).setQuantity(this.stocks.get(i).getQuantity() - command.getStock().getQuantity());
				}
			}
		}
	}
	
	
	public void showStock() {
		for(Stock stock : this.stocks) {
			System.out.println(stock);
		}
	}
	
	public void showHistory() {
		this.invoker.showHistory();
	}

}
