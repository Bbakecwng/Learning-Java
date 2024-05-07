package practicJava;

public class equalToTheCourseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String courseName = "Diploma QA";
		
		if(courseName.equalsIgnoreCase("Diploma Qa")) {
		System.out.println("The course is correct");
		} else {
			System.out.println("The course name is incorrect");
		}
	}

}
