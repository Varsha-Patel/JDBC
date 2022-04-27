import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/ecommerce";
		String user = "root";
		String password = "Jaanu@2204";
		
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		Statement statement = connection.createStatement();
		String query = "SELECT * FROM eproduct";
		
		ResultSet resultSet= statement.executeQuery(query);
		
		while(resultSet.next()) {
			
			System.out.println(resultSet.getInt("ID")+ " " + resultSet.getString("name")+ " " + resultSet.getFloat("proce")+ " " +resultSet.getDate("date_added"));
			
			
		}
		
		resultSet.close();
		statement.close();
		connection.close();
		
	}
	
	

}
