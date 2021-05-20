package site.lagrida.composite;

public class PdfFile extends Component{
	public PdfFile(String name){
		super.setType("pdf");
		super.setName(name);
	}
	@Override
	public void description() {
		System.out.println("type : "+super.getType()+", name : "+super.getName());
	}
}
