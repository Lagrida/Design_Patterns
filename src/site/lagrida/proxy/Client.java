package site.lagrida.proxy;

public class Client {
	public static void main(String[] args) {
		Internet internet = new Internet();
		ISP internetProxy = new InternetProxy(internet);
		internetProxy.serviceSites("facebook.com"); //Forbidden
		internetProxy.serviceSites("google.com"); //Allowed
	}
}
