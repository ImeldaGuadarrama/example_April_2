import java.util.Scanner;

public class Hello2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String last;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your name:");
		name=input.next();
		System.out.println("\nNow enter your last name");
		last=input.next();
		System.out.println("THIS IS A DEBUG LINE!!");
		//we want to commit this patch without the debug line BUT keeping it in 
		//my working copy
		System.out.printf("Hello %s %s!!", name, last);
		
		

	}

}
