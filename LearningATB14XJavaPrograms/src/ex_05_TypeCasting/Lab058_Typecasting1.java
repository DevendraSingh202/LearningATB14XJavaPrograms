package ex_05_TypeCasting;

public class Lab058_Typecasting1 {

	public static void main(String[] args) {
		
		long phone_no = 9521546455l;
		// short s = phone_no; // Narrowing -> Implicit
		short s = (short) phone_no; // Narrowing -> Explicit
		System.out.println(s);

	}

}
