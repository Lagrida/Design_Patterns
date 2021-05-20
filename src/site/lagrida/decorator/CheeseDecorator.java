package site.lagrida.decorator;

public class CheeseDecorator extends SandwichDecorator{
	public CheeseDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	@Override
	public int cost() {
		return super.getSandwich().cost()+5;
	}
	@Override
	public String description() {
		return super.getSandwich().description()+", Cheese";
	}
}
