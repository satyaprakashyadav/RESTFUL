package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DbConnection {
 
 public Connection getConnection() throws Exception
 {
 try
 { 
	 final String value = System.getenv("DBCONNECTIONIP");
	 
 //String connectionURL = "jdbc:mysql://172.17.0.69:3306/testdb";
 
 String connectionURL = "jdbc:mysql://"+value+":3306/testdb";
 
 Connection connection = null;
 Class.forName("com.mysql.jdbc.Driver");
 connection = DriverManager.getConnection(connectionURL, "root", "root");
 
 System.out.println("connectionURL : "+connectionURL);
 System.out.println("connected to database");
 
 return connection;
 }
 catch (SQLException e)
 {
 throw e;
 }
 catch (Exception e)
 {
 throw e;
 }
 }
 
}