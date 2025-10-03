package ex_06_Ternary_Operator;

public class Lab063_TernaryOperator_Interview_Question {

	public static void main(String[] args) {
		int age = 21;
		
		// Nested Ternary 
		// result = condition1 ? (condition2 ? expression1 : expression2)
		String result = age > 18 ? (age > 25 ? "You can Drink" : "You can go to Goa but you can't drink") : "No" ; 
		System.out.println(result);

	}

}
