package Lambdaexp;

public class ArrayDriver {

	public static void main(String[] args) {
	int[] a = new int [] {12, 65, 45, 64, 87,23};
	int[] b = new int [] {34, 65, 76, 87, 87,12};
	int[] c = new int [] {88, 32, 47, 64, 87,23};
	int[] d = new int [] {12, 65, 45, 64, 87,23};
	
	PrintArrayElement p = (int[] x)-> {
		
		for(int k : x)
			System.out.print(k+ " ");
		System.out.println();
	};
	
	p.printElement(a);
	p.printElement(b);
	p.printElement(c);
	p.printElement(d);

	}

}
