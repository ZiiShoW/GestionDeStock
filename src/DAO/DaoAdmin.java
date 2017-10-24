
package DAO;

import Connection.Concexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;


public class DaoAdmin {
    
    public boolean log(String name,String pass){
        boolean bool = false;
        Concexion cnx = new Concexion();
        Connection c= cnx.Connect();
        
       try {
           
           Statement stmt = c.createStatement();
           String req ="Select * from ziidb.admins";
          ResultSet res = stmt.executeQuery(req);
          while (res.next()){
              
              String nom = res.getString(1);
              String passw = res.getString(2);
              
            //  System.out.println(nom);
               //  System.out.println(passw);
              
              
              if(nom.equals(name) && passw.equals(pass) )
                  bool = true;
              
           
          }
       
       }
           
           
   
       catch(SQLException e){
        
        System.out.println(e);
        
        
            }
       
       return bool;
    
    }}
    

