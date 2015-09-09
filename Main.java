package Company;

public class Main {

	public static void main(String[] args) {
		
		OurCompany c = new OurCompany();
		Employee[] em = new Employee[3];
		em[0] = new PermanentEmployee("Ionescu","1234",35.6);
		em[1] = new PermanentEmployee("Popescu","1234",31.4);
		em[2] = new EmployeeOnHour("Ionescu","1234",5.6,4);
		
		int i;
		for(i = 0; i < em.length; i++) {
			
			try {
				
				c.add(em[i]);
				
			}
			catch(EmployeeAlreadyExist e) {
				
				System.out.println("The employee already exists!");
				
			}
		}
		
		System.out.println(c);
		
		Strategy s1 = new OneStrategy("Ionescu");
		Strategy s2 = new AnotherStrategy();
		
		System.out.println(c.EmployeeAlreadyExist(s1));
		System.out.println(c.EmployeeAlreadyExist(s2));
 	}


}
