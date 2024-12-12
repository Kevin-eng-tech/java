package operators;
import java.util.Scanner;

public class Uncicy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner b=new Scanner(System.in);
	    int score = 10;
	    System.out.println("Welcome to a strange place!");
	    System .out.println("Question:Is 2 + 2 = 3?(yes or no)");
	    String answer =b.nextLine();
	    if (answer.equals("no")) {
	    score ++;
	    System.out.println("good");
	    
	    }else {
	    score --;
	    System.out.println("practice more");
	    
	    
	    }
	    

	}

}
