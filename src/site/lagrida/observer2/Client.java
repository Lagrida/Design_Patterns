package site.lagrida.observer2;

public class Client {
	public static void main(String[] args) {
		Currency dollards = new Currency("dollards", 1254);
		CurrencySub currency = new CurrencySub(dollards);
		
		Person yassine = new Person("yassine");
		Person sami = new Person("sami");
		
		currency.addObserver(yassine);
		currency.addObserver(sami);
		
		dollards.setPoints(1253);
		currency.setCurrency(dollards);
	}
}
