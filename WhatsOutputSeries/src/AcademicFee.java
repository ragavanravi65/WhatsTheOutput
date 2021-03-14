
interface AcademicFee {
default void feeChange() {
	System.out.println("deault method");
}
}
interface SportsFee{
	default void feeChange() {
		System.out.println("sport method");
	}
}
 class TotalFee implements AcademicFee,SportsFee{
	public static void main(String[] args) {
new TotalFee().feeChange();
	}
//output :
	//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	at TotalFee.main(AcademicFee.java:13)

	
	//	@Override
//	public void feeChange() {
//		// TODO Auto-generated method stub
//		System.out.println("return data");
//	}

	
	
}
