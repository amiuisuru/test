
package connet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Connet {

  
    public static void main(String[] args) {
       Connection conn= null;
    PreparedStatement pre =null;
    
    
    
    
    
       
           conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/age","root","");
    
    
    
    
    
    }
          
         
          
}


