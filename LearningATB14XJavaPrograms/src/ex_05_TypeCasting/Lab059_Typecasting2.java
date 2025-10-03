package ex_05_TypeCasting;

public class Lab059_Typecasting2 {

	public static void main(String[] args) {
		
		int val = 300;
		
		// **00000000000000000000000100101101**
		
		// byte b = val ; // Narrowing -> Implicit casting -> valid ->No
		
		byte b = (byte) val; // Narrowing -> Explicit casting -> valid
		
		System.out.println(b);
		// **00101100**
		// value is
		// 
		// 0 + 00 + 32 + 0 + 8 + 4 + 0 + 0 = **44.**
		//
		//**(00101100)

	}

}
