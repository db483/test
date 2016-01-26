package test;

public class Message {
	private String message;
	private String owner;
	
	public Message(String message, String owner) {
		this.message = message;
		this.owner = owner;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
