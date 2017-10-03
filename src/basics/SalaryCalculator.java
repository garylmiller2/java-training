package basics;

public class SalaryCalculator {
     public static void main(String[] args) {
    	 
    	 //Let's create a variable to define our career
    	 
    	 // Declare a variable
    	 String career;
    	 
    	 //Defined a variable
    	 career = "Software Developer";
    	 System.out.println("My career is: " + career);
    	 
    	 // Declare and Define
    	 int hoursPerWeek = 40;
    	 int weeksPerYear = 50;
    	 double rate = 42.50;
    	 
    	 
    	 //Compute our annual salary
    	 double salary = hoursPerWeek * weeksPerYear * rate;
    	 System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
    	 
    	 //rate * hoursPerWeek * weeksPerYear
     }
}
