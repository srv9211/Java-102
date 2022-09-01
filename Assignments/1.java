import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

public class Assignment {
	
	//1 print number 1 to 50
	public static void print1to50() {
		for(int number = 1; number <= 50; number++) {
			System.out.print(number + " ");
		}
		System.out.println("\n");
	}
	
	// 2. write a logic to print only the unique data(i.e., remove duplicates)
	public static void removeDuplicates(List<String> names, List<String> tempNames) {
		
		HashSet<String> hashset = new HashSet<>();
		for(int index = 0; index < names.size(); index++) {
			String name = names.get(index);
			if(!hashset.contains(name)) {
				hashset.add(name);
				tempNames.add(name);				
			}
		}
	}
	
	// 3.have a list of string with some data and try to print the count of the datas having length greater than 3 
	public static void countData(List<String> data) {
		int count = 0;
		for(String dataString : data) {
			if(dataString.length() > 3) count++;
		}
		System.out.println(", Count = " + count + "\n");
	}
	
//	4. write a logic to convert all the datas in a collection to uppercase 
	public static void convertToUpperCase(List<String> data) {
		System.out.print("Previous data: " + data);
		for(int index = 0; index < data.size(); index++) {
			String dataString = data.get(index);
			data.set(index, dataString.toUpperCase());
		}
		System.out.print(", Current data: " + data);
	}

	public static void main(String[] args) {
		System.out.println("1) Print 1 to 50:");
		print1to50();
		
		System.out.println("2) Remove Duplicates: ");
		
		List<String> names = new ArrayList();
		names = Arrays.asList("Sam", "Peter","ballon","Sam", "ballon", "Gaurav");
		List<String> tempNames = new ArrayList();
		removeDuplicates(names, tempNames);
		System.out.print("Previous data: " + names);
		names = tempNames;
		System.out.println(",Current data: " + names + "\n");
		
		List<String> data = new ArrayList();
		data = Arrays.asList("America", "India","Goa","UK", "UAE", "Japan");
		System.out.print("3) Count of data having length greater than 3: \nData: " + data);
		countData(data);
		
		System.out.println("4) Convert all the data to upper case: ");
		convertToUpperCase(data);

	}

}
