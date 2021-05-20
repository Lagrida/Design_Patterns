package site.lagrida.composite;

public abstract class Component {
	private String type;
	private String name;
	public void add(Component component) {
	}
	public void remove(Component component) {
	}
	public Component getChild(int k) {
		return null;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void description();
}
