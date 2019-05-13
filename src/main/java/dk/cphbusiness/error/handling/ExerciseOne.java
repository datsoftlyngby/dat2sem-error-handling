package dk.cphbusiness.error.handling;

import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExerciseOne extends HttpServlet {
  private final Logger logger = Logger.getLogger(ExerciseOne.class.getName());
  
  @Override
  protected void service(
      HttpServletRequest request,
      HttpServletResponse response
      ) throws ServletException, IOException {
    String commandKey = request.getParameter("command");
    Command command = Command.from(commandKey);
    try {
      String target = command.execute(request);
      request.getRequestDispatcher(target).forward(request, response);
      }
    catch (NoTicketException nte) {
      logger.warning(nte.getMessage());
      request.setAttribute("message", "Fejlen var "+nte+" "+nte.getMessage());
      request.getRequestDispatcher("error.jsp").forward(request, response);
      }
    catch (Exception e) {
      logger.severe("Ups: "+e);
      
      }
    
    }

  }
