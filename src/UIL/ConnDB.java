/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UIL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Imantha
 */
public class ConnDB {
        private static Connection con;
    
    public static void createMyconnection() {
        try{
        Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://148.66.136.214:3306/proton_db", "protonDB", "Codelife2017");
    }catch(Exception e){
        
        createMyconnection();
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
