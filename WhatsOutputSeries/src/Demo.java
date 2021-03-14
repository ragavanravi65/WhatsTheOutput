
public class Demo extends Book{

	int bookId=4567;
	
	public int getValue() {
		return bookId;
	}
	public void call() {
		System.out.println(super.getValue());
	}
	public static void main(String[] args) {
		Book book=new Book();
		super.call();
		
		//cant call super on static context
	}

}

class Book{
	int bookId=17897;
	
	public int getValue() {
		return bookId;
	}
}

