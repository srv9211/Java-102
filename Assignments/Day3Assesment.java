package java8.day3.AssesmentDay3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day3Assesment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		
		System.out.println("Initial numbers list: " + numbers);
		
		// Q1
		List<Integer> squareList = numbers.stream().distinct().map(number -> number*number).collect(Collectors.toList());
		System.out.println("\nQ1: Square of all distinct numbers: " + squareList);
		
		// Q2
		List<Integer> evenList = numbers.stream().filter(number -> number%2 == 0).collect(Collectors.toList());
		System.out.println("\nQ2: Even numbers exist in the list: " + evenList);
		
		// Q3
		long count = numbers.stream().collect(Collectors.counting());
		System.out.println("\nQ3: Total number of elements in the list = " + count);

	}

}
