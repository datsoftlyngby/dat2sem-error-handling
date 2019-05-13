package dk.cphbusiness.error.handling;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnector {
  
  public Connection getConnection() throws SQLException {
    throw new SQLException("Just kidding");
    }
  
  }
