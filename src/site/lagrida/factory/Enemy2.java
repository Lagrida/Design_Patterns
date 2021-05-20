package site.lagrida.factory;

public abstract class Enemy2 {
	
	private String name;
	private int level;
	
	public String TheEnemy() {
		return "name : "+this.name+", level: "+this.level;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}
