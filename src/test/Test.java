package test;

public class Test {

	public static void main(String[] args) {
		System.out.println("Some text");
		String text = "test message";
		String owner = "Marlon Brando";
		
		Message message = new Message(text, owner);
		System.out.println(message.toString());
		FancyMessage fancyMessage = new FancyMessage(text, owner);
		System.out.println(fancyMessage.toString());
	}

}
