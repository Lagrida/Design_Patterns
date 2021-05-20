package site.lagrida.singleton;

public class Client {
	public static void main(String[] args) {
		/*
		Connection cnx1 = Connection.getInstance();
		Connection cnx2 = Connection.getInstance();
		
		cnx1.description();
		cnx2.description();
		*/
		ImpThread t1 = new ImpThread();
		ImpThread t2 = new ImpThread();
		ImpThread t3 = new ImpThread();
		
		t1.start();
		t2.start();
		t3.start();
	}
}
