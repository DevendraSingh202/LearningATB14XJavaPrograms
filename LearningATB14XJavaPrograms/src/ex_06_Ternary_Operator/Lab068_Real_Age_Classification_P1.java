package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification_P1 {

	public static void main(String[] args) {
		
		String user_input = args[0];
		System.out.println(user_input);
		System.out.println(user_input instanceof String);
		
		// Input -> String
		// String -> Integer
		int age = Integer.parseInt(user_input);
	
		String result = (age < 18) ? "Minor" : (age < 60) ? "Adult" : "Sr.Citizen";
		System.out.println(result);

	}

}
