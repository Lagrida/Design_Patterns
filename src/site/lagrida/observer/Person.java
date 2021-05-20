package site.lagrida.observer;

public class Person implements Observer{
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
	public void update(Currency currency) {
		System.out.println("Notification to "+this.name+": currency "+currency.getName()+" points is changed to "+currency.getPoints());
	}
}
