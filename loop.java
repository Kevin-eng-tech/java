package operators;
import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=b.nextInt();
		int f =1;
		int i;
		for(i=1;i<=n;i++) {
		f=f*i;
		System.out.println("factorial is "+ f);
					
		}
		

	}

}
