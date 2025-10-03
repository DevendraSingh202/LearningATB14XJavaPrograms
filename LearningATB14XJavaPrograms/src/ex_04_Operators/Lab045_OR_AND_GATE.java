package ex_04_Operators;

public class Lab045_OR_AND_GATE {

	public static void main(String[] args) {
	
		// || --> OR Gate
		// && --> AND Gate
		
		System.out.println(true || true);   // T || T = true
		System.out.println(true || false);  // T || F = true
		System.out.println(false || true);  // F || T = true
		System.out.println(false || false); // F || F = false
		
		
		System.out.println(true && true);   // T || T = true
		System.out.println(true && false);  // T || F = false
		System.out.println(false && true);  // F || T = false
		System.out.println(false && false); // F || F = false
		

		
		
	}

}
