package operators;
import java.util.Scanner;

public class logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b =new Scanner(System.in);
		System.out.println("Enter you math score:");
		int math =b.nextInt();
		System.out.println("Enter you Science score:");
		int Sc =b.nextInt();
		System.out.println("Enter you english score:");
		int Eng =b.nextInt();
		if((Sc > 80 && math > 80 )|| Eng>=70){
		System.out.println("You can get eligible");
	} else {
		System.out.println("You are not");}
		

	}

}
