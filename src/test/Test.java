package test;

public class Test {

	public static void main(String[] args) {
		System.out.println("Testing messages #6");
		
		String text = "test message";
		String owner = "Marlon Brando";
		
		Message message = new Message(text, owner);
		System.out.println(message.toString());
		
		FancyMessage fancyMessage = new FancyMessage(text, owner);
		System.out.println(fancyMessage.toString());
		
		System.out.println("KFSPTS-7000");
		
		System.out.println("finished testing");
	}

}
