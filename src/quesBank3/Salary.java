package quesBank3;

public abstract class Salary implements Gross{

	double hra = 0.8;
	
	public void disp_sal(double basicSalary) {
		  double grossSalary = gross_sal(basicSalary);
		  double hraAmount = grossSalary*hra;
		  System.out.println("Basic Salary" +basicSalary);
		  System.out.println("HRA amount" +hraAmount);
		  System.out.println("Gross Salary" +grossSalary);
		  
	}

	

	

	
	
	
	
	
	
	

}
