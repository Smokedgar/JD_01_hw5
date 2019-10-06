package by.htp.hw5.task1;
public class Task1 {
	public static void main(String[] args) {
		Directory resource = new Directory("resource");
		
		Directory subresource = new Directory("subresource");
		resource.addDirectory(subresource);
		
		TextFile newBook = new TextFile("Java", "txt");
		resource.addFile(newBook);
		TextFile newBook1 = new TextFile("Java2", "txt"); 
		resource.addFile(newBook1);
		System.out.println(resource.toString());
	
		newBook.setName("Java1");
		System.out.println(resource.toString());
		
		resource.deleteFile(newBook);
		System.out.println(resource.toString());
	}
}
