package java8.day4.Tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> foodList = Arrays.asList("Pizza", "Pasta", "gulabjamun", "Samosa", "Pakora");
		
		System.out.println("Food List : " + foodList);
						
		Optional<String> findAnyOptional = foodList.stream().findAny();
		System.out.println("\n1.1 -> Find Any: " + findAnyOptional);
		
		Optional<String> findFirstOptional = foodList.stream().findFirst();
		System.out.println("\n1.2 -> Find First: " + findFirstOptional);
		
		boolean anyMatch = foodList.stream().anyMatch(food -> Character.isLowerCase(food.charAt(0)));
		System.out.println("\n1.3 -> Any match that first letter is lowerCase: " + anyMatch);

		boolean allMatch = foodList.stream().allMatch(food -> food.length()>7);
		System.out.println("\n1.4 -> All match that the length of foodName > 7: " + allMatch);
		
		boolean noneMatch = foodList.stream().noneMatch(food -> food.isEmpty());
		System.out.println("\n1.5 -> None match that length of foodName is zero: " + noneMatch);
		
		HashMap<Integer, String> foodMap = new HashMap<>();
		foodMap.putIfAbsent(201, "Momos");
		foodMap.put(200, "Spring Roll");
		foodMap.putIfAbsent(201, "Fried Momos");
		
		System.out.println("\n2.1 -> Food map: " + foodMap);
	}

}
