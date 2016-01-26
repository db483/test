package test;

public class Test {

	public static void main(String[] args) {
		System.out.println("Some text");
		
		Message message = new Message("test this message", "Marlon Brando");
		System.out.println(message.toString());
	}

}
