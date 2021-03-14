final class Square{
	private double length=102,breadth;
	public Square(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	Square(Square sq){
		System.out.println("copy constructor invoked");
		length=this.length;
		breadth=sq.breadth;
	}
	public String toString() {
		return "("+length+"+" + breadth +"i)";
	}
	
}
public class Main {

	public static void main(String[] args) {
		Square s1=new Square(110,115);
		Square s2=new Square(s1);
		System.out.println(s2);
	}

}
