// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		// converts the input to int variable		
		int o = num%10;
		int t = (num%100)/10;
		int h = num/100;
		// Calculates the hundreds, tens, ones of the number
		System.out.println(h + " hundreds, " + t + " tens, " + o + " ones.");
	    // Prints the answer
	}
}
