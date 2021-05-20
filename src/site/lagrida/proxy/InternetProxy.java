package site.lagrida.proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements ISP{
	private Internet internet;
	private List<String> forbidenSites = Arrays.asList("facebook.com", "twitter.com");
	public InternetProxy(Internet internet) {
		this.internet = internet;
	}
	@Override
	public void serviceSites(String url){
		if(forbidenSites.contains(url)) {
			System.out.println("Site "+url+" is forbidden!");
		}else {
			internet.serviceSites(url);
		}
	}
}
