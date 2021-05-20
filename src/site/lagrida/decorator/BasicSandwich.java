package site.lagrida.decorator;

public class BasicSandwich extends Sandwich{
	@Override
	public int cost() {
		return 20;
	}
	@Override
	public String description() {
		return "Sandwich";
	}
}