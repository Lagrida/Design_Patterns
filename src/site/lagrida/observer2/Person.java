package site.lagrida.observer2;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void update(Observable o, Object c) {
		Currency Currency = (Currency) c;
		System.out.println("Notification to "+this.name+": currency "+Currency.getName()+" points is changed to "+Currency.getPoints());
	}
}
