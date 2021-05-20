package site.lagrida.simplefactory;

public abstract class Enemy {
	private String name;
	private int level;
	public void description() {
		System.out.println("name : "+this.name+", level: "+this.level);
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
