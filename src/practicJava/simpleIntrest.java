package practicJava;

public class simpleIntrest {


	public static void main(String[] args) {
		simpleIntrest obj = new simpleIntrest();
	
		obj.calculateSI();

	}
	
	public void calculateSI() {
		 int principal = 2500;	 
		 int time= 3; 
		 int rateOfIntrest= 5; 
		 int simpleIntrest= 0;
		 
		 simpleIntrest = principal*time*rateOfIntrest/100;
		 
		 System.out.println(simpleIntrest);
		 
	}
	
}
