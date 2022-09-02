package java8.day2;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> predicateGreaterThan = (number) -> number>50;
		
		System.out.println(predicateGreaterThan.test(333));
		
		
		Predicate<Integer> predicateSmallerThan = (number) -> number<50;
		System.out.println(predicateSmallerThan.test(333));
		
		Predicate<Integer> predicateEqualTo = (number) -> number==50;
		System.out.println(predicateSmallerThan.test(50));
		
		System.out.println("and operator check " + predicateGreaterThan.and(predicateEqualTo).test(50));
		System.out.println("or operator check " + predicateGreaterThan.or(predicateEqualTo).test(50));
	}

}
