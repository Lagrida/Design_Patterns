package site.lagrida.composite;

public class TxtFile extends Component{
	public TxtFile(String name) {
		super.setType("txt");
		super.setName(name);
	}
	@Override
	public void description() {
		System.out.println("type : "+super.getType()+", name : "+super.getName());
	}
}
