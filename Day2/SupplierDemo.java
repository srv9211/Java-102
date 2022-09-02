package java8.day2;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		Supplier<LocalDateTime> supplierDemo = () -> LocalDateTime.now();		
		System.out.println(supplierDemo.get());
		
	}

}
