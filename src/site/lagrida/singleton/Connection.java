package site.lagrida.singleton;

public class Connection {
	private static Connection instance;
	private static int counter = 0;
	// La visibilité du constructeur est privé pour intérdire
	// une instanciation directe en dehors la classe Connection
	private Connection() {
		counter++;
	}
	public static Connection getInstance() {
		if(instance == null) {
			instance = new Connection();
		}
		return instance;
	}
	public void description() {
		System.out.println("Connection........");
		System.out.println("Nombre d'objets de type Connection instanciés : "+counter);
	}
}
