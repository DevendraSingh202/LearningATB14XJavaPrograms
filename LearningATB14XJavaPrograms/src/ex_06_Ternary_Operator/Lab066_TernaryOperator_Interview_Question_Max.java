package ex_06_Ternary_Operator;

public class Lab066_TernaryOperator_Interview_Question_Max {

	public static void main(String[] args) {
		
		int n1 = 2;
		int n2 = 9;
		int n3 = -11;
		
		// LBF
		// Logic Building Formula
		
		// Step 1 -> Find the input and outputs Data Types
		// I/O -> n1,n2,n3 -> int
		// o/P -> int - Max number or string we can message with max number
		
		// Step 2 -> Rough Logic , Think about it.
		// n1 > n2 && n1 > n3 -> n1 
		// n2 > n3 && n2 > n1 -> n2
		// n3
		
		// Step 3 -> Dry Run - Program
		int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
		System.out.printf("max is %d" , max); // It gives the output in String
		System.out.println();
		System.out.println(max); // It gives the output in integer
		
		
		
		

	}

}
