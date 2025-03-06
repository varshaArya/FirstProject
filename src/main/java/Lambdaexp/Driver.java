package Lambdaexp;

public class Driver {

	public static void main(String[] args) {
		
		PrintInput<String> print = new PrintInput<>() {
	
			public void printElement(String s  ) {
				System.out.println(s);
			}
	
	};
	
	print.equals("Soham");
	print.printElement("Varsha");
		
		
	}
}