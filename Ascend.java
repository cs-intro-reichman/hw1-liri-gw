// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		// Convert the input to integer
		int a = (int) (lim * Math.random()), b = (int)(lim * Math.random()), c = (int) (lim * Math.random());
		// Generating three integer random numbers in the limit
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);
		// Finding the minimum and maximum
		int mid = a + b + c - max - min;
		// Calculates the middle number by subtructing the minimum& maximum
		System.out.println(min + ", " + mid + ", " + max);	
		// Prints the numbers in increasing order
	}
}
