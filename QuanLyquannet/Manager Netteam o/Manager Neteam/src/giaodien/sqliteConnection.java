/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author PC
 */
public class sqliteConnection {
   
Connection conn= null;
public static Connection dbConnector(){
try{
    String dbURL = "jdbc:mysql://localhost:3306/dbusers";
        String username = "root";
        String password = "vanhoang2001";
        Connection con = DriverManager.getConnection(dbURL,username,password);
        return con;
     //JOptionPane.showMessageDialog(null, "Connection Successful");
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
}
    


}

    public static void main(String[] args) {
        sqliteConnection.dbConnector();
    }
}
