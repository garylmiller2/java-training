package InstructorLab;

public class InstructorLab {

	public static void main(String[] args) {
		//Create a Student
		Student stu1 = new Student("Janelle", "321456987");
		Student stu2 = new Student("Thomas", "548245858");
		Student stu3 = new Student("Elizabeth", "933678457");
		
		stu1.enroll("Math101");
		stu1.enroll("English255");
		stu1.enroll("History211");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(600);
		stu1.checkBalance();
		
		System.out.println(stu1.toString());
		

	}
	
	

}

class Student {
	// Properties
	private static int iD = 0;
	private String city;
	private String phone;
	private String state;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@sdetuniveristy.com";
		System.out.println("Your email: " + email);
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max - min));
		randNum = randNum + min;
		userId = iD + "" + randNum + ssn.substring(5);
		System.out.println("Your User ID is: " + userId);
	}
	
	public void enroll(String courses) {
		this.courses = this.courses + "\n" + courses;
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("Payment: $" + amount);
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}

	@Override
	public String toString() {
		return "Student [userId=" + userId + ", name=" + name + ", ssn=" + ssn + ", email=" + email + ", courses="
				+ courses + ", balance=" + balance + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	

	
	
}
