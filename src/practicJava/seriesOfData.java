package practicJava;

public class seriesOfData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int givenNumber[]= {1,3,5,2,4,6,0};
		
		 for(int i=0; i<=6; i++) {
			 if (givenNumber[i] %2 != 0) {
				 System.out.println("even number is:"+ givenNumber[i]);
			 }
		 }
		
	}

}
