package java8;

import java.util.stream.IntStream;

public class Java7VsJava8Demo {
	
	public static void main(String[] args) {
		// java 7
		int total = 0;
		for(int index = 0; index <= 50; index++) {
			total += index;
		}
		System.out.println(total);
		
		// java 8
		int output = IntStream.rangeClosed(0, 50).sum();
		System.out.println(output);
		
		
	}
}
