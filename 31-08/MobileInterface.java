package java8;

@FunctionalInterface
public interface MobileInterface {
	
	public void sendSms();
	public void msg();
	public default void checkBattery() {
		System.out.println("Printing check battery from interface.");
	}
	
}
