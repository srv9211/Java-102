package java8.day3.Practice;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cityList = Arrays.asList("chennai", "", "mumbai", "bangalore", "delhi", "chicago", "chennai");
		
		long count = cityList.stream().filter(cityName -> cityName.startsWith("c")).count();
		System.out.println("count of cities starts with c = " + count);
		
		System.out.println("\nPrinting cities using forEach: ");
		cityList.stream().filter(cityName -> !cityName.isEmpty()).forEach(cityName -> System.out.println(cityName));
		
		List<String> distinctList = cityList.stream().filter(cityName -> !cityName.isEmpty()).distinct().collect(Collectors.toList());
		System.out.println("\ndistinctList: " + distinctList);
		
		long countEmptyString = cityList.stream().filter(cityName -> cityName.isEmpty()).count();
		System.out.println("\ncount of cities which are empty string = " + countEmptyString);
		
		long sum1To25 = IntStream.range(1, 26).sum();
		System.out.println("\nSum of numbers 1 to 25 = " + sum1To25);
	}
}
