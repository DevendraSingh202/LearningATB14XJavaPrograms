package ex_02_Java_Basics;

public class Lab022_Printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		//System.out.println(a);
		//System.out.println(b);
		
		
		//System.out.print(a);
		//System.out.print(b);
		
		
		System.out.printf("Value of a is %d",a);
		System.out.println();
		
		System.out.printf("Value of b is %d",b);
		
		System.out.println();
		
		// %d --> int,short,byte,long - data type.
		// %f --> float,double.
		// %s --> String
		// %b --> boolean
		
		int table = 9;
		System.out.printf(" %d * 1 = %d ", table, table*1);
		System.out.println();
		System.out.printf(" %d * 2 = %d ", table, table*2);
		

	}

}
