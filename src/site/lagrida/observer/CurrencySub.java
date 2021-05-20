package site.lagrida.observer;

import java.util.ArrayList;
import java.util.List;

public class CurrencySub implements Subject{
	private Currency currency;
	private List<Observer> observers;
	public CurrencySub(Currency currency) {
		this.currency = currency;
		this.observers = new ArrayList<>();
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
		notifyAllObservers();
	}
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
	}
	@Override
	public void remove(Observer observer) {
		this.observers.remove(observer);
	}
	@Override
	public void notifyAllObservers() {
		for(Observer observer: observers) {
			observer.update(this.currency);
		}
	}
}
