package basics;

public class Factoral {

	public static void main(String[] args) {
		// Write a function that takes a value N and returns the sum of 1 to n
		
		System.out.println(sum(5));
		
		int[] numbers = {5, -2, 0, 234, -438, 63};
		System.out.println("Min: " + findMin(numbers));
	}
	
	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
			System.out.println(i + " " + sum);
		}
		
		return sum;
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
}
