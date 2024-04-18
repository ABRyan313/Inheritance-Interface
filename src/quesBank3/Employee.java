package quesBank3;

public class Employee extends Salary implements Gross{
	
	private String name;
	 double basic_sal;
	public Employee(String name, double basic_sal) {
		
		this.name = name;
		this.basic_sal = basic_sal;
	}
	
	public double gross_sal(double basicSalary) {
		return basicSalary+ (basicSalary * ta) + (basicSalary * da);
	}

	
	

}
