package operators;

import java.util.Scanner;

public class newlogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b= new Scanner(System.in);
		System.out.print("Enter the number:");
		double num1 =b.nextDouble();
		
		if(num1 % 2 ==0)
		System.out.print("num1 is even");
		else
		System.out.print("num1 is odd");
	}

}
