package test;

public class FancyMessage extends Message {

	public FancyMessage(String message, String owner) {
		super(message, owner);
	}
	
	@Override
	public String toString() {
	 return getOwner() + " sends you this message: " + getMessage();
	}

}
