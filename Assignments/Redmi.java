package java8;

public class Redmi implements MobileInterface{
	public void sendSms() {
		
	}
	public void msg() {
		
	}
	public void checkBattery() {
		System.out.println("Printing check battery from redmi.");
	}
	
	public static void main(String[] args) {
		Redmi redmiNote7 = new Redmi();
	}
}
