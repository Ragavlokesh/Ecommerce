package lokesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	
	public class void main(String[] args) throws Exception {
		
		createTable();
		
	}
	public static Connection getConnection()throws Exception{
		try{
			Connection con = getConnection();
			PreparedStatement create con.prepareStataement("CREATE TABLE IF NOT EXISTS iamalive(id NOT NULL AUTO_INCREMENT, First varchar(255), PRIMARY KEY(id))");
			create.executeUpdate();
		}catch(Exception e)(System.out.println(e));}
	    finally{
	    	(System.out.println("Function complete."));
	    };
	    
    }
    public static Connection getConnection() throws Exception{
    	try{
			String driver = "con.mysql.jdbc.Driver";
			String url="jdbc:mysql://24.196.52.166.3306/testdb";
			String username = "codewind";
			String password = "1234";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			return conn;
		  } catchException e)(System.println(e));}
	
		
		return null;
	}

}