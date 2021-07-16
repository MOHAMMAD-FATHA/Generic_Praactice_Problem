package GenericJava;

import java.util.Scanner;

/*
 * @Mohammad_Fatha
 * Purpose to find maximum number among three integer numbers using findMax method
 */
public class findMax {

	private static void compareTo(Float n1, Float n2, Float n3) {
		// TODO Auto-generated method stub
		Float max = n1;
		
		if(n2.compareTo(max) > 0) {
			max = n2;
		if (n3.compareTo(max) > 0)
			max = n3;
		System.out.println("The maximum number is : "+max);
		
		}
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to find maximum of three numbers");
		Float a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a");
		a = sc.nextFloat();
		System.out.println("Enter the value of b");
		b = sc.nextFloat();
		System.out.println("Enter the value of c");
		c = sc.nextFloat();
		sc.close();
		compareTo(a, b, c);
	}

}
