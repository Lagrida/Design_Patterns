package site.lagrida.adapter;

public class Car implements Vehicule{
	@Override
	public void accelerate() {
		System.out.println("Speeeeeeeeeed");
	}
	@Override
	public void sound() {
		System.out.println("TooooTototo");
	}
}
