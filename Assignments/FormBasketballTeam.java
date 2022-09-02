package java8.day2.Assessment;

import java8.day2.data.*;

import java.util.Arrays;
import java.util.List;

import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.function.BiConsumer;

public class FormBasketballTeam {
	
	static List<Person> personList = PersonRepository.getAllPersons();
	
	static BiPredicate<String, Integer> checkHeightAndGenderPredicate = (gender, height) -> gender.equals("Male") && height > 50;
		
	static BiConsumer<Double, List<String>> salaryAndHobbiesConsumer = (salary, hobbies) -> {
		System.out.print("Salary: " + salary + ", Hobbies: ");
		for(String hoby : hobbies) {
			System.out.print(hoby.toUpperCase() + " ");
		}
		System.out.println();
	};
	
	static List<String> cityList = Arrays.asList("Tokyo", "Dharamshala", "New York", "Scranton", "Beijing", "Singapore");
	
	public static void main(String[] args) {
		
		System.out.println("For BasketBall Team: ");
		makeBasketBallTeam();
		
		System.out.println("\nFor Sorted Cities: ");
		sortCityList();
		System.out.println();
		
		System.out.println("\nFor Salary and Hobbeis Cities: ");
		fetchSalaryAndHobbies();
		
	}
	// Q1
	private static void makeBasketBallTeam() {
		personList.forEach(per -> {
			if(checkHeightAndGenderPredicate.test(per.getGender(), per.getHeight())) {
				System.out.println(per);
			}
		});
	}
	
	// Q5
	private static void sortCityList() {
		List<String> sortedList = cityList.stream().sorted().collect(Collectors.toList());
		System.out.println("Original CityList: " + cityList);
		System.out.println("Sorted CityList: " + sortedList);
	}
	// Q2
	private static void fetchSalaryAndHobbies() {
		personList.forEach(per -> {
			salaryAndHobbiesConsumer.accept(per.getSalary(), per.getHobbies());
		});
	}
	
}
