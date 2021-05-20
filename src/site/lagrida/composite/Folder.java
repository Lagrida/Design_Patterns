package site.lagrida.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{
	private List<Component> components;
	public Folder(String name) {
		super.setType("folder");
		super.setName(name);
		this.components = new ArrayList<>();
	}
	@Override
	public void add(Component component) {
		this.components.add(component);
	}
	@Override
	public void remove(Component component) {
		this.components.remove(component);
	}
	@Override
	public Component getChild(int k) {
		return this.components.get(k);
	}
	@Override
	public void description() {
		System.out.println("type : "+super.getType()+", name : "+super.getName());
		// Afficher les noms de tous les composants du dossier
		System.out.print("Les composants : ");
		for(Component c: components) {
			System.out.print(c.getName()+", ");
		}
		System.out.println();
	}
}
