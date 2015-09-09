package Company;

import java.util.ArrayList;
import java.util.Iterator;

public class OurCompany {
	
    ArrayList<Employee> em=new ArrayList<Employee>();
	
			public void add(Employee x) throws EmployeeAlreadyExist {
				
				Iterator<Employee> it=em.iterator();
				
				while(it.hasNext())	{
					
					Employee aux = it.next();
					
					if(x.equals(aux)) {
					
						throw new EmployeeAlreadyExist();
					}	
				}
			
			em.add(x);
	}
	
	public String toString() {
		
		String s="";
		Iterator<Employee> it=em.iterator();
		
		while(it.hasNext())	{
			
			Employee aux = it.next();
			s += (aux).toString() + "\n";
			
		}
		
		return s;
	}
	
	public boolean EmployeeAlreadyExist(Strategy strategy) {
		
		Iterator <Employee> it=em.iterator();
		boolean found = false;
		
		while(it.hasNext()) {
		
			Employee aux = it.next();
			if(strategy.condition(aux)) {
			
				found=true;
				break;
			}	
		
	   }	
	   return found;
    }
}	
