package dk.cphbusiness.error.handling;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;

public class CustomerMapper {
  private final DBConnector connector;

  public CustomerMapper(DBConnector connector) {
    this.connector = connector;
    }
  
  
  public Collection<User> listAllUsers() throws UserLstUnavailableException {
    try {
      Connection conn = connector.getConnection();
      // More code goes here
      return null;
      }
    catch (SQLException e) {
      throw new UserLstUnavailableException();
      }
    }
  
  }
