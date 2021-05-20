package site.lagrida.decorator;

public class ChickenDecorator extends SandwichDecorator{
	public ChickenDecorator(Sandwich sandwich) {
		super(sandwich);
	}
	@Override
	public int cost() {
		return super.getSandwich().cost()+15;
	}
	@Override
	public String description() {
		return super.getSandwich().description()+", Chiken";
	}
}
