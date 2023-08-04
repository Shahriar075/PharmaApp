
import java.sql.*;
import javax.swing.JOptionPane;
public class LogInconnection {
    Connection cin=null;
    public static Connection ConnecrDB()
    {
        try
        {   
           Class.forName("org.sqlite.JDBC");
           Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Pharmacyfile\\LogIn.db");
          // JOptionPane.showMessageDialog(null,"Connection established!!");
           return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        }
    }
