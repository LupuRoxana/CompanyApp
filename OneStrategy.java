package Company;

public class OneStrategy implements Strategy {

private String name;
	
	public OneStrategy(String name)	{
		
		this.name=name;
	}
	
	public boolean condition(Employee e) {
		
		if((e.getName()).equals(name)) {
			
			return true;
		}
		
		else {
		
		return false;
		
		}
	}

}
