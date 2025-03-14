package walkthrough1;

public class OneDArray {
	public static void main(String[] args) {
		double[] grades = {90.0, 83.0, 88.5, 79.4, 88.0};
		
		double sum = 0;
		for(double grade: grades) {
			sum += grade;
			
		}
		double average = sum / grades.length;
		
		
		System.out.println("Student Grades:");
		for (int i=0;i<grades.length;i++) {
			System.out.println("Student "+(i+1)+ ": " + grades[i]);
			sum+=grades[i];
		}
		System.out.println("Average Grade: " + average);
	}
}

