
import java.sql.*;


public class MySqlConnection{
    
   public static Connection getConnection(){
       
       Connection con = null;
       try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata","Taj","tajmilur");
          
       }catch(ClassNotFoundException | SQLException ex){
           
       }

       return con;
   } 
    
}
