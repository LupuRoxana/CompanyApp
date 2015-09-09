package Company;

public class AnotherStrategy implements Strategy {

	public boolean condition(Employee e) {
		
		if(e.getSum()==1000.0) {
			
			return true;
		
		}
		
		else {
		
			return false;
		
		}	
	}
}
