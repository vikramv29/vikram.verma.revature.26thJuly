package mytasks3Aug;

public class BusinessValidation {
	public boolean isValidPassword(String pass) throws InvalidPassException{
		boolean x= false ;
	if(pass.length()>=5&&pass.length()<=10) {
		if(pass.matches("[a-zA-Z]{1,}[0-9]{1,}[^a-zA-Z0-9]{1,}")) 
			x= true  ;
	}
	
	else { throw new InvalidPassException("Entered Password "+pass+" is INVALID") ;
	}
	return x ;
	}
	
}
