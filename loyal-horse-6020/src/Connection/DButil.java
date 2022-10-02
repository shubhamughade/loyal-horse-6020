package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	
public static Connection provideConnection() {
		
		Connection conn=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/java_project";
		
		try {
			conn= DriverManager.getConnection(url,"root","Shubham@8421");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
}
}
