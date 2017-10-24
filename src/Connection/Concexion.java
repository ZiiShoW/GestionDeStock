
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Concexion {
    
     public static final String USERNAME ="zii";
    public static final String PASSWORD ="zii";
    public static final String CONN_URL ="jdbc:mariadb://localhost:3306/ziidb";
  
     Connection conn =null;
        
      public Connection Connect(){
      
        try {
            
            conn = DriverManager.getConnection(CONN_URL,USERNAME,PASSWORD);
           // System.out.println("sayee");
           //Statement stmt = conn.createStatement();
           //String req="insert into ziidb.ziitable values(22)";
           //stmt.executeUpdate(req);
           return conn;
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
       return conn;
       
      
      
      }
}
