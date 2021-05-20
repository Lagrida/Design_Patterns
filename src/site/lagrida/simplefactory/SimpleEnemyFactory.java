package site.lagrida.simplefactory;

public class SimpleEnemyFactory {
	public static final int PLANE = 1;
	public static final int SOLDIER = 2;
	public static Enemy createEnemy(int e) {
		switch(e) {
			case SOLDIER:
				return new Solder();
			case PLANE:
				return new Plane();
		}
		return null;
	}
}