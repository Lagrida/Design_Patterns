package site.lagrida.observer2;

import java.util.Observable;

public class CurrencySub extends Observable{
	private Currency currency;
	public CurrencySub(Currency currency) {
		this.currency = currency;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
		setChanged();
		notifyObservers(currency);
	}
}
