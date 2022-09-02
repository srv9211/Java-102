package java8.day2;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer,Integer> bc1 = (x,y) -> System.out.println(x+y);
		
		bc1.accept(1, 5);
		
		BiConsumer<Integer,Integer> bc2 = (x,y) -> System.out.println(x-y);
		
		bc2.accept(1, 5);

	}

}
