public class LibraryTest{
	
	public static void main(String args[]){
		
		Book b1 = new Book("The Lord of the Rings", new Person("J.R.R Tolkien", new Address("20 Northmoor Road", "New Oxford", "England"), Gender.Male), new Date(29, 7, 1954), "High Fantasy");
		
		System.out.println(b1.toString());
		
	}
	
}