package site.lagrida.decorator;

public class Client {
	public static void main(String[] args) {
		Sandwich sandwich1 = new ChickenDecorator(new CheeseDecorator(new BasicSandwich()));
		Sandwich sandwich2 = new ChickenDecorator(new BasicSandwich());
		
		System.out.println("------------- Sandwich1 :");
		System.out.println("Ingredients : " + sandwich1.description());
		System.out.println("Cost : " + sandwich1.cost());
		
		System.out.println("\n------------- Sandwich2 :");
		System.out.println("Ingredients : " + sandwich2.description());
		System.out.println("Cost : " + sandwich2.cost());
	}
}
