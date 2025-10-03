package ex_05_TypeCasting;

public class Lab057_Typecasting_Narrowing {

	public static void main(String[] args) {
		
		int val = 300;
		// byte b = val; // Narrowing -> Implicit casting -> valid -> No
		
		byte b = (byte) val; // Narrowing -> Explicit casting -> valid

	}

}
