/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

import static giaodien.khachSQLiteExcute.con;
import static giaodien.khachSQLiteExcute.rs1;
import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author FancaoFaker
 */
public class doanhthuSQL {
     public static Connection con = null ;
    public static ResultSet rs2 = null;
    public static float tongtientotal ;
    
 public  static  ArrayList tinhtienarr = new  ArrayList ();
   
    
    public  doanhthuSQL(){
    con = sqliteConnection.dbConnector();
}

    
     // select table khach
    
    public ResultSet selectKhach(){
     
        String query ="select thanhtien from Khach";
        try {
            PreparedStatement pst = con.prepareStatement(query);
             rs2 = pst.executeQuery();
           //  JOptionPane.showMessageDialog(null, "doanh thu thành công");
        } catch (SQLException ex) {
            System.out.println(""+ex.toString());
           
        }
        return rs2;
    }
    
    
    
     
       
    
    
    
    // show data is selected
	public void showData(ResultSet rs) {
		try {
			while (rs.next()) {
                            
                            
                             tinhtienarr.add(rs.getFloat(1));
					
			}
                        for(int i = 0 ; i <tinhtienarr.size();i++){
                           tongtientotal += (float) tinhtienarr.get(i);
                           
                           
                        }
                       //  JOptionPane.showMessageDialog(null, tongtientotal);
                     
                      
		} catch (SQLException e) {
		}
	}
        

    public static void main(String[] args) {
         doanhthuSQL kk = new doanhthuSQL();
         kk.showData(kk.selectKhach());
         
        
    }

   
	}
    
    


    
   






