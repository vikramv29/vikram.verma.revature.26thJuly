package mytasks3Aug;


public class PresenterMain {
	public static void main(String[]args) {
		
	BusinessValidation b1=new BusinessValidation();
	try {
		if(b1.isValidPassword("ABCdef45*")) {
			System.out.println("Pan Validated");
		}
		}catch(InvalidPassException e){
			System.out.println(e.getMessage());
		}

}
}
