package site.lagrida.proxy;

public class Internet implements ISP{
	@Override
	public void serviceSites(String url) {
		System.out.println("http://"+url);
	}
}
