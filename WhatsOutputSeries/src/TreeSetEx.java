import java.awt.List;
import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet();
		ts.add("first");
		ts.add("First");
		ts.add("Second");
		System.out.println(ts.ceiling("Fir"));
		
		ArrayList list=new ArrayList();
		list.add(0,"a");
		list.add(1,"b");
		list.add(1,"c");
		for(Object obj:list) {
			System.out.println(" "+obj);
		}
	}

}
