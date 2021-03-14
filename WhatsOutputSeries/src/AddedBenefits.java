interface Benefits{
	void getTotalAllowance();
}
public interface AddedBenefits extends Benefits {

	protected void computeDA();
	
	//cant be protected
}
