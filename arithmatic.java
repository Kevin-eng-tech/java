package operators;

public class arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b= new Scanner(System.in);
		System.out.print("Enter first number:");
		double num1 =b.nextDouble();
		System.out.print("Enter second number:");
		double num2 =b.nextDouble();
		double sum = num1 + num2;
		double mul = num1 * num2;
		double div = num1 / num2;
		double sub = num1 - num2;
		
		System.out.println("Result of Arithmetic oeperation ");
		System.out.println("Addition: "+num1 + " + " + num2 + " = " + sum );
		System.out.println("Multiplication: " + num1 + " * " + num2 + " = " +  mul );
		System.out.println("Division: " + num1 + " / " + num2 + " = " + div );
		System.out.println("Subtraction: " + num1 + " - " + num2 +" = " + sub);
		
		
	}

}
