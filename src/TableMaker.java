
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class TableMaker {
    
    public static void main(String [] args){
        Connection con = null;
        
        Statement st = null;
        
        try{
            con = MySqlConnection.getConnection();
            
            st = con.createStatement();
            
            st.execute("CREATE TABLE IF NOT EXISTS userdata.`tabledata` (\n"
        + "  `INDEX` int(10) NOT NULL AUTO_INCREMENT,\n"
        + "  `NAME` varchar(100) DEFAULT NULL,\n"
        + "  `USERNAME` varchar(100) DEFAULT NULL,\n"
        + "  `MAIL` varchar(200) DEFAULT NULL,\n"
        + "  `PHONE` varchar(200) DEFAULT NULL,\n"
        + "  `PASSWORD` varchar(200) DEFAULT NULL,\n"
        + "  `NameFile` varchar(200) DEFAULT NULL,\n"
        + "  `PathFile` varchar(200) DEFAULT NULL,\n"            
        + "  PRIMARY KEY (`INDEX`)\n"
        + ") ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;");
            
            JOptionPane.showMessageDialog(null,"Table Created");
            
        }catch(HeadlessException | SQLException ex){
            System.out.println(ex);
        }finally{
            try{
                con.close();
                st.close();
            }catch(SQLException ex){
                 System.out.println(ex);
            }
        }
    }
}
