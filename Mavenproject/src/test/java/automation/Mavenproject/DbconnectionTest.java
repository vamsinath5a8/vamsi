package automation.Mavenproject;
import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.testng.annotations.BeforeClass;
public class DbconnectionTest {
  @Test
  public void dbinfo() throws Exception{
	  String dburl="jdbc:mysql://localhost:3306/vamsinath";
	  String username="root";
	  String password="vamsi";
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection conn=DriverManager.getConnection(dburl,username,password);
	  Statement st=conn.createStatement();
	  ResultSet rs = st.executeQuery("select *from friendsdetails");
      while (rs.next())
	  {
		  System.out.println("serialnumber:"+rs.getInt("sno"));
		  System.out.println("friendname:"+rs.getString("name"));
		  System.out.println("friendage:"+rs.getInt("age"));
		  System.out.println("friendplace:"+rs.getString("place"));
		  }
	  conn.close();
	 }
	  @BeforeClass
  public void beforeClass() {
  }

}
