package java8.day2;

import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class tasksSep2 {
	
	public static void main(String[] args) {
		// Consumer
		Consumer<int[]> consumer = (intArray) -> System.out.println(java.util.Arrays.toString(intArray));
		consumer.accept(new int[]{1, 2, 3});
		
		Consumer<Integer> consumer1 = (age) -> System.out.println("Riya is " + age + " years old.");
		consumer1.accept(55);
		Consumer<Integer> consumer3 = (age) -> System.out.println("Shubham is " + age + " years old.");
		consumer3.accept(50);
		
		Consumer<String> consumer2 = (name) -> System.out.println("My name is " + name);
		consumer2.accept("Sourav");
		
		consumer1.andThen(consumer3).accept(20);
		
		// BiConsumer
		BiConsumer<int[], Integer> biConsumer = (intArray, num) -> System.out.println(java.util.Arrays.toString(intArray) + " " + num);
		biConsumer.accept(new int[]{1, 2, 3}, 44);
		
		BiConsumer<Integer, Integer> biConsumer2 = (num1, num2) -> System.out.println(num1 * num2 * 10);
		biConsumer2.accept(5, 7);
		
		BiConsumer<String, String> biConsumer3 = (string1, string2) -> System.out.println("After concatenation = " + string1 + string2);
		biConsumer3.accept("Sourav", "Sharma");
		
		//Predicate
		Predicate<String> greaterThanPredicate = (name) -> name.length()>3;
		System.out.println("Checking length of string greater than 3 or not: " + greaterThanPredicate.test("Sourav"));
		
		Predicate<String> SmallerThanPredicate = (name) -> name.length()<3;
		System.out.println("Checking length of string lesser than 3 or not: " + greaterThanPredicate.test("Sourav"));
		
		// BiPredicate
		BiPredicate<String, String> testBiPredicate = (name, name1) -> name.length()<name1.length();
		System.out.println("Checking length string1 is of greater or not: " + testBiPredicate.test("Sourav", "Shubham"));
		
		
		System.out.println(greaterThanPredicate.and(SmallerThanPredicate).test("Chayanika"));
		
		
		
	}
}