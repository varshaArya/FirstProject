package Lambdaexp;

public class Driver2 {

	public static void main(String[] args) {
		PrintInput<String> print = (String s)-> System.out.println(s);
		PrintInput<Integer> p = ( s)-> System.out.println(s);
		PrintInput< Object> pany = (s)-> System.out.println(s);
	print.printElement("Soham");
	print.printElement("Varsha");
	p.printElement(12);
	p.printElement(34);
		
	pany.printElement(23.87);
	}

	}


