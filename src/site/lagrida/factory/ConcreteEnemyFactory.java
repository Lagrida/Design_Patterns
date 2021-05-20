package site.lagrida.factory;

public class ConcreteEnemyFactory extends EnemyFactory{
	public static final int SOLDER = 1;
	public static final int PLANE = 2;
	@Override
	public Enemy2 createEnemy(int e) {
		switch(e) {
			case SOLDER:
				return new Solder2();
			case PLANE:
				return new Plane2();
		}
		return null;
	}
}
