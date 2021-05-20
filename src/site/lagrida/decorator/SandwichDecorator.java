package site.lagrida.decorator;

public abstract class SandwichDecorator extends Sandwich{
	private Sandwich sandwich;
	public SandwichDecorator(Sandwich sandwich) {
		this.sandwich = sandwich;
	}
	public Sandwich getSandwich() {
		return sandwich;
	}
	public void setSandwich(Sandwich sandwich) {
		this.sandwich = sandwich;
	}
	@Override
	public int cost() {
		return this.sandwich.cost();
	}
	@Override
	public String description() {
		return this.sandwich.description();
	}
}
