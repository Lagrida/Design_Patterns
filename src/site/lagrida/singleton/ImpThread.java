package site.lagrida.singleton;

public class ImpThread extends Thread{
	@Override
	public void run() {
		ThreadConnection.getInstance().description();
	}
}
