package java8.day2;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> consumer = (name) -> System.out.println(name.toUpperCase());
		
//		consumer.accept("ssup");
		
		Consumer<String> consumerDemo = (name) -> System.out.println(name.length());
		
//		consumer.andThen(consumerDemo).accept("Team");
		
		Consumer<Integer> consumerInteger = (number) -> System.out.println(number + 10);
		
		Consumer<Integer> consumerIntegerDemo = (number) -> System.out.println(number - 10);
		
		consumerInteger.andThen(consumerIntegerDemo).accept(20);



	}

}
