import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
	public static void main(String[] args) {
		
	}
	private Connection con;
	
	public static UserDao userdao = new UserDao();
	
	public UserDao() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root","1234");
			System.out.println("연동성공");
		}
		catch(Exception e ) { System.out.println( "[DB 연동 오류]"+e  ); }
	}
}