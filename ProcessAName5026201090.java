import java.util.Scanner;

public class ProcessAName5026201090 { 
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Type your name: ");
	String name = sc.nextLine();
	int space1 = name.indexOf(' ');
	String lastName = name.substring(space1+1); 
	System.out.println("Your name is: " + lastName + ", " + name.charAt(0) + ".");
	}
}
