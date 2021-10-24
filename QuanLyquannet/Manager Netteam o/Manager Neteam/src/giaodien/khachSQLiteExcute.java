/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author FancaoFaker
 */
public class khachSQLiteExcute {
    public static Connection con = null ;
    public static ResultSet rs1 = null;
   
    
    public  khachSQLiteExcute(){
    con = sqliteConnection.dbConnector();
}

    
     // select table khach
    
    public ResultSet selectKhach(){
     
        String query ="select * from Khach";
        try {
            PreparedStatement pst = con.prepareStatement(query);
             rs1 = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(""+ex.toString());
        }
        return rs1;
    }
    
    
    
     
        // getid
         public ResultSet getid(int id){
     
        String query ="select * from Khach where `ID_MAY` = ?";
        try {
            PreparedStatement pst = con.prepareStatement(query);
             pst.setInt(1,id);
             rs1 = pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(""+ex.toString());
        }
        return rs1;
    }
    
    
    // show data is selected
	public void showData(ResultSet rs) {
		try {
			while (rs.next()) {
				System.out.printf("%-10s %-20s\n", rs.getInt(1),
						rs.getString(2));
					
			}
		} catch (SQLException e) {
		}
	}
        

    public static void main(String[] args) {
         khachSQLiteExcute kk = new khachSQLiteExcute();
         
        // kk.showData(kk.getid(1));
    }


}
