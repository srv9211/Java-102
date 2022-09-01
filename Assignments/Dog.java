package java8;

public class Dog extends Animal {
	
	@Override
	public void sound() {
		System.out.println("bow bow");
	}
	
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
	}
}
