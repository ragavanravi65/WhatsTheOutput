
public class problemOne {

	public static void main(String[] args) {

		String s1="Mississippi";
		String  s2=new String(s1);
		s1=s1.replace("i","!");
		System.out.println(s1+","+s2+","+(s1==s2));
		System.out.println(s2);
		System.out.println(s1==s2);
	}
	/* 
	 * M!ss!ss!pp!,Mississippi,false
	Mississippi
	false
	 * */
}
