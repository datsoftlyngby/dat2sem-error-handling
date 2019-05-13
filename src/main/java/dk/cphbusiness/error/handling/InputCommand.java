package dk.cphbusiness.error.handling;

import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;

public class InputCommand extends Command {

  public InputCommand() {
    
  }
  
  @Override
  public String execute(HttpServletRequest request) throws NoTicketException {
    String phone = request.getParameter("phone");
    String alphas = request.getParameter("alphas");
    String justOne = request.getParameter("justone");
    
    if (!Pattern.matches("[0-9]{8}", phone))
      throw new NoTicketException("Bad number");
    
    if (!Pattern.matches("[a-zA-Z0-9 ]*", alphas))
      throw new NoTicketException("Only Alpha numerics");
    
    return "output.jsp";
    }
  
}
