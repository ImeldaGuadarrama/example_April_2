import java.util.Scanner;

public class HelloAskPart {
	
	public void askName(StringBuilder first, StringBuilder last){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your name:");
		first.append(input.next());
		System.out.println("\nNow enter your last name");
		last.append(input.next());
		
	}

}
