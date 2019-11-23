package day1.classroom;

public class Mobile {
	
	public String makeCall(long number) {
		
		System.out.println(number);
		
		return "Hello";
		
	}
	
	public String sendSms(String Text) {
		
		System.out.println(Text);
		return "Sms Sent";
		
	}
	
	public boolean shutDown() {
		System.out.println("Powered Off");
		return true;
	}
	
	public static void main(String[] args) {
		
		Mobile functions = new Mobile();
		String makeCall = functions.makeCall(1234567890);
		System.out.println(makeCall);
		String sendSms = functions.sendSms("Hey this is");
		System.out.println(sendSms);
		boolean shutDown = functions.shutDown();
		System.out.println(shutDown);
	}
	
	

}
