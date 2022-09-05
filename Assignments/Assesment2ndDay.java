package java8.day2.Assessment;

import java8.day2.data.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.function.BiConsumer;

public class Assesment2ndDay {
	
	static List<Person> personList = PersonRepository.getAllPersons();
	
	static List<String> cityList = Arrays.asList("Tokyo", "Dharamshala", "New York", "Scranton", "Beijing", "Singapore");
	
	public static void main(String[] args) {
		
		System.out.println("Q1 -> For BasketBall Team, print persons having height greater than 50: ");
		makeBasketBallTeam();
		
		System.out.println("\nQ2 -> For Salary and Hobbeis Cities: ");
		fetchSalaryAndHobbies();
		
		System.out.println("\nQ3 -> Cities which contain (in): ");
		printWithCondition();
		
		System.out.println("\nQ4 -> For appending metro: ");
		appendMetro();
		
		System.out.println("\nQ5 -> For Sorted Cities: ");
		sortCityList();
		
	}
	// Q1
	private static void makeBasketBallTeam() {
		
		BiPredicate<String, Integer> checkHeightAndGenderPredicate = (gender, height) -> gender.equals("Male") && height > 50;
		
		personList.forEach(per -> {
			if(checkHeightAndGenderPredicate.test(per.getGender(), per.getHeight())) {
				System.out.println(per);
			}
		});
	}
	
	// Q2
	private static void fetchSalaryAndHobbies() {
		
		BiConsumer<Double, List<String>> salaryAndHobbiesConsumer = (salary, hobbies) -> {
			System.out.print("Salary: " + salary + ", Hobbies: ");
			ArrayList<String> upperCaseCity = new ArrayList();
			for(String hoby : hobbies) {
				upperCaseCity.add(hoby.toUpperCase());
			}
			System.out.println(upperCaseCity);
		};
		
		personList.forEach(per -> {
			salaryAndHobbiesConsumer.accept(per.getSalary(), per.getHobbies());
		});
	}
	
	// Q3
	private static void printWithCondition() {
		List<String> alteredCity = cityList.stream().filter(name -> name.contains("in")).collect(Collectors.toList());
		System.out.println("Original CityList: " + cityList);
		System.out.println("CityList which contains (in): " + alteredCity);
	}
	
	// Q4
	private static void appendMetro() {
		List<String> alteredCity = cityList.stream().map(name -> name.concat(" Metro")).collect(Collectors.toList());
		System.out.println("Original CityList: " + cityList);
		System.out.println("Metro CityList: " + alteredCity);
	}
	
	// Q5
	private static void sortCityList() {
		List<String> sortedList = cityList.stream().sorted().collect(Collectors.toList());
		System.out.println("Original CityList: " + cityList);
		System.out.println("Sorted CityList: " + sortedList);
	}
}
