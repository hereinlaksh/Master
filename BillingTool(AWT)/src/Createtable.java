

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Createtable {
    /**
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO Auto-generated method stub
 
      //  String Driver = "com.mysql.jdbc.Driver";
      //String url = "jdbc:mysql://localhost/test";
      //  String uName ="root";
       // String pwd = "root";
        Connection c=null;
 
        try {
            //Class.forName(Driver).newInstance();
            //conn = DriverManager.getConnection(url, uName, pwd);
            //Statement stmt = conn.createStatement();
        	Connection cc= DriverManager.getConnection("jdbc:mysql://localhost/userlogin?useSSL=false","root","Vishnuk12");
			Statement stm = cc.createStatement();
            String sql = "create table staff(name varchar(25),department varchar(5),subject_name varchar(25))";
            stm.executeUpdate(sql);
            System.out.println("CreateTable sucessfully");
 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            try {
                
				c.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
 
    }
 
}
