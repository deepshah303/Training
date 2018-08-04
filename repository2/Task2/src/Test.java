
public class Test {

	public static void main(String[] args) {
		Book alc = new Book("The alchemist");
		Member m1 = new Member("Polo");
		
		alc.memberDetails();
		m1.bookDetails();
		alc.issueBook(m1);
		alc.memberDetails();;
		m1.bookDetails();
		alc.returnBook(m1);
		alc.returnBook(m1);
	}

}
