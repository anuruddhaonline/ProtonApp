/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UIL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.Timer;

/**
 *
 * @author Imantha
 */
public class ConnDB {
        private static Connection con;
    
    public static void createMyconnection() {
        try{
        Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proton_db", "root", "");
      con.createStatement().executeQuery("SET wait_timeout=1800000");
      
      
    }catch(Exception e){
        
       
    }
        

}
    public static void iud (String sql) throws Exception {
        if (con==null) {
             createMyconnection();
        }
        
        con.createStatement().executeUpdate(sql);
        
        
        }
        
    public static ResultSet search(String sql)throws Exception {
        if (con==null) {
             createMyconnection();
        }
        return con.createStatement().executeQuery(sql);
    }

public static Connection getMyconnection () throws Exception  {
    if (con==null) {
        
        createMyconnection ();
        
    }
    return con;

}   
    
    
}
