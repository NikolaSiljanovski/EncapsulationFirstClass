import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Variables variables = new Variables(); 
		
		System.out.println("Vnesi prv broj (a) : ");
		variables.setA(input.nextInt());
		
		System.out.println("Vnesi vtor broj (b) :");
		variables.setB(input.nextInt());
		
		 int c = variables.getA() + variables.getB();
		 System.out.println("+ == Vkupno e: " + c);

		  c = variables.getA() * variables.getB();
		 System.out.println("* == Vkupno e: " + c);
		 
		  c = variables.getA() / variables.getB();
		  System.out.println("/ == Vkupno e: " + c);
		  
		  c = variables.getA() - variables.getB();
		  System.out.println("- == Vkupno e: " + c);
		
	}

}
