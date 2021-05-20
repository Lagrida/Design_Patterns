package site.lagrida.singleton;

public class ThreadConnection {
	private static ThreadConnection instance;
	private static int counter = 0;
	// La visibilité du constructeur est privé pour intérdire
	// une instanciation directe en dehors la classe Connection
	private ThreadConnection() {
		counter++;
	}
	public static ThreadConnection getInstance() {
		if(instance == null) {
			synchronized(ThreadConnection.class) {
				if(instance == null) {
					//Thread.currentThread();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					instance = new ThreadConnection();
				}
			}
		}
		return instance;
	}
	public void description() {
		System.out.println("Connection........");
		System.out.println("Nombre d'objets de type Connection instanciés : "+counter);
	}
}
