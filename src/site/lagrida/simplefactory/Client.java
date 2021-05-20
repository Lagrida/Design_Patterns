package site.lagrida.simplefactory;

public class Client {
	public static void main(String[] args) {
		Enemy e;
		e = SimpleEnemyFactory.createEnemy(SimpleEnemyFactory.PLANE);
		e.description();
	}
}
