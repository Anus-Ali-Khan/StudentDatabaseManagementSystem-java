import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tutionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName +  " " + gradeYear + " " + studentID);
				
	}
	
	// Generate an ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id; 
		
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		
		System.out.println("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(course != "Q") {
			courses = courses + "\n" + course;
			tutionBalance = tutionBalance + costOfCourse;
		}
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUTION BALANCE: " + tutionBalance);
		
	}
	
	// View balance
	
	// Pay Tuition
	
	// Show Status
}
