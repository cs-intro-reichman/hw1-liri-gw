// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0], name2 = args[1], name3 = args [2], sum = args[3];
		// defines and takes input of the variables of the three names and amount of the bill

		Double doubleSum  = Double.parseDouble(sum);
		// Convert the String containing the number to a double number

		Double bill4Each = Math.ceil((doubleSum) / 3);
		// saves the bill of each diner and round the double number to the upper nearest whole number


		System.out.println("Dear " + name3 + ", " + name2 + ", " + "and " + name1 + ": pay " + bill4Each + " shekels each");
	    // prints the answer to how much each of the diners need to pay
	}
}
