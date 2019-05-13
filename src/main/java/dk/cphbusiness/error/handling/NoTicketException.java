package dk.cphbusiness.error.handling;

// public class NoTicketException extends RuntimeException {

public class NoTicketException extends Exception {
  private String name;
  private int messageLength; 
  
  public NoTicketException(String message) {
    super(message);
    messageLength = message.length();
    }
  
  public NoTicketException(String message, String name) {
    this(message);
    this.name = name;
    }
  
  public String getName() { return name; }

  public int getMessageLength() { return messageLength; }
  
  
  
  }
