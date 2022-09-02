package java8.day2;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Data type String as input and Integer as output.
		Function<String, Integer> functionInterface = (name) -> name.length();
		
		System.out.println(functionInterface.apply("Sourav Sharma"));

	}

}
