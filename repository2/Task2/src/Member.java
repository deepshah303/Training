
public class Member {
	
	private String name;
	private Book book;

	public Member() {
	}
	
	public Member(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public void bookDetails() {
		if(book != null) {
			System.out.println("Member " + name + " has issued the book " + book.getName());
		} else {
			System.out.println("Member " + name + " has not been issued any book");
		}
	}
	

}
