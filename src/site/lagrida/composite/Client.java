package site.lagrida.composite;

public class Client {
	public static void main(String[] args) {
		Folder folder1 = new Folder("folder1");
		
		folder1.add(new TxtFile("txtFile1"));
		folder1.add(new TxtFile("txtFile2"));
		folder1.add(new PdfFile("pdfFile1"));
		
		folder1.getChild(0).description();
		System.out.println("-----------------------------");
		folder1.description();
		System.out.println("-----------------------------");
		Folder folder2 = new Folder("folder2");
		folder2.add(new PdfFile("pdfFile2"));
		folder1.description();
		folder1.add(folder2);
		System.out.println("-----------------------------");
		folder1.getChild(3).add(new TxtFile("txtFile3"));
		folder2.description();
	}
}
