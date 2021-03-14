
public class staticReport {

	 int reportId=0;
	static {
		++reportId;
		//instance variable cant be reference inside the static block
	}
	static int empreportId;
	public void pre() {
		empreportId=reportId;
	}
}
