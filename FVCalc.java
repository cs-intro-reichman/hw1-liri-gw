// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		// converts the inputs to double and int variables

		double futureRate = currentValue*Math.pow((1+(rate/100)),n);
		// calculates the futureRate by the formula

		int futureRateInt = (int)futureRate;
		System.out.println("After " + n + " years, " + currentValue + "$" + " saved at " + rate/100 + "% " + "will yield " + futureRateInt + "$");
		// Returning the future rate to integer and Printing the futureRate as a integer
}
}