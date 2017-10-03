package lab2;

public class StudentDatabase {

	public static void main(String[] args) {

		NewStudent ns1 = new NewStudent("Gary", "123456789", "(909)548-3264", "Beaumont", "California");
		NewStudent ns2 = new NewStudent("Sara", "548326457", "(951)845-4578", "Calimesa", "California");
		NewStudent ns3 = new NewStudent("Carla", "248547215", "(322)877-2418", "Redlands", "Montana");

		System.out.println(ns3.toString());

	}

}

class NewStudent {
	private static int id = 1000;
	private String name;
	private String SSN;
	private String email;
	private String usrID;
	private String phone;
	private String city;
	private String state;
	private double balance;
	private double startingBalance;
	private double afterPayBalance;

	public NewStudent(String name, String SSN, String phone, String city, String state) {
		this.SSN = SSN;
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.state = state;

		id++;
		generateUserId();
		generateEmail();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void generateUserId() {
		int random = (int) (Math.random() * 9000 + 1000);
		usrID = id + "" + random + SSN.substring(5, 9);
		System.out.println("Your User ID is: " + usrID);
	}

	public void generateEmail() {
		email = name + "@studb.edu";
		System.out.println("Your new email is: " + email);
	}

	public void startingBalance(double loanAmnt) {
		double fulltimeCost = 45000;
		startingBalance = fulltimeCost - loanAmnt;
		System.out.println("This is the Student's current balance: " + startingBalance);

	}

	public void pay(double makePayment) {

		afterPayBalance = startingBalance - makePayment;
		System.out.println("Student balance after Payment: " + afterPayBalance);
	}

	public void checkBalance() {
		System.out.println(afterPayBalance);

	}

	public void enroll() {
		System.out.println("You are now enrolled as a student at the University.");
	}

	@Override
	public String toString() {
		return "NewStudent [name=" + name + ", SSN=" + SSN + ", email=" + email + ", usrID=" + usrID + ", phone="
				+ phone + ", city=" + city + ", state=" + state + "]";
	}

	

	

	
}