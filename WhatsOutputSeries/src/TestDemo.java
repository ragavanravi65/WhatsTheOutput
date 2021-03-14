import java.util.HashSet;

public class TestDemo {

	public static void main(String[] args) {
HashSet myMap=new HashSet();
String s1=new String("das");
String s2=new String("das");
NameBean s3=new NameBean("abcdef");
NameBean s4=new NameBean("abcdef");

myMap.add(s1);
myMap.add(s2);
myMap.add(s3);
myMap.add(s4);
System.out.println(myMap);
	}

}


class NameBean{
	public NameBean(String string) {
		this.str= string;
	}

	private String str;
	
	public String toString() {
		return str;
	}
	
}