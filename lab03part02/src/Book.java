public class Book{
	
	private static int bookID;
	
	private String bookTitle;
	
	private Person author;
	
	private Date publicationDate;
	
	private String genre;
	
	public Book(String bookTitle, Person author, Date publicationDate, String genre){
		
		setBookID();
		
		setBookTitle(bookTitle);
		
		setAuthor(author);
		
		setPublicationDate(publicationDate);
		
		setGenre(genre);
		
	}
	
	public static void setBookID(){
		
		bookID++;
		
	}
	
	public static int getBookID(){
		
		return bookID;
		
	}
	
	public void setBookTitle(String bookTitle){
		
		this.bookTitle = bookTitle;
		
	}
	
	public String getBookTitle(){
		
		return bookTitle;
		
	}
	
	public void setAuthor(Person author){
		
		this.author = author;
		
	}
	
	public Person getAuthor(){
		
		return author;
		
	}
	
	public void setPublicationDate(Date publicationDate){
		
		this.publicationDate = publicationDate;
		
	}
	
	public Date getPublicationDate(){
		
		return publicationDate;
		
	}
	
	public void setGenre(String genre){
		
		this.genre = genre;
		
	}
	
	public String getGenre(){
		
		return genre;
		
	}
	
	@Override
	public String toString(){
		
		return String.format("Book ID: %s\r\nBook Title: %s\r\nAuthor Details\r\n%s\r\nPublication Date: %s\r\nGenre: %s", bookID, bookTitle, author.toString(), publicationDate.toString(), genre);
		
	}
	
}