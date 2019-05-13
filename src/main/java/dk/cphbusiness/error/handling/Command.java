package dk.cphbusiness.error.handling;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public abstract class Command {
  private static Map<String, Command> commands = null;
  
  private static void init() {
    commands = new HashMap<>();
    commands.put("input", new InputCommand());
    }
  
  public static Command from(String commandKey) {
    if (commands == null) init();
    return commands.get(commandKey);
    }
  
  public abstract String execute(HttpServletRequest request) throws NoTicketException;

  
}
