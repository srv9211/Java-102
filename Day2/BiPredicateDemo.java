package java8.day2;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer, Integer> biPredicateCompare = (number1, number2) -> number1>number2;
		
		System.out.println(biPredicateCompare.test(333, 33));
	}

}
