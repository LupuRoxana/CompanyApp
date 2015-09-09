/**
 * 
 */
package Company;

/**
 * @author Toshiba
 *
 */
public class PermanentEmployee extends Employee {
    
	private double sumf;
	public PermanentEmployee(String name, String code, double sumf) {
		
		super(name, code);		
		this.sumf = sumf;
		
	}
	
	public double getSum() {
		
		return sumf;
		
	}
	
	public String toString() {
		
		return "Permanent Employee: " +  this.getSum();

	}	

}
