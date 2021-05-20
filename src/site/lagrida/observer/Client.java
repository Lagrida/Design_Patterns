package site.lagrida.observer;

public class Client {
	public static void main(String[] args) {
		Currency dollards = new Currency("dollards", 1254);
		CurrencySub currency = new CurrencySub(dollards);
		
		Person yassine = new Person("yassine");
		Person sami = new Person("sami");
		
		currency.subscribe(yassine);
		currency.subscribe(sami);
		
		dollards.setPoints(1255);
		currency.setCurrency(dollards);
	}
}
