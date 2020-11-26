/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_recruitment_system;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author asus
 */
public class Connect {
    
    public static ResultSet connect(String s){
        Connection con = null;
        Statement stmt=null;
        ResultSet rs=null;
        String username = "shrey";
        String password = "shrey";
        String url = "jdbc:derby://localhost:1527/Online_Recruitment_System";
        try {
            con = DriverManager.getConnection(url,username,password);
            stmt=con.createStatement();
            rs=stmt.executeQuery(s);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null,"Connection Failed...\n "+ex.getMessage());        
        }
        return rs;
    }
    public static int update(String s){
        Connection con = null;
        Statement stmt=null;
        String username = "shrey";
        String password = "shrey";
        int i=0;
        String url = "jdbc:derby://localhost:1527/Online_Recruitment_System";
        try {
            con = DriverManager.getConnection(url,username,password);
            stmt=con.createStatement();
            i=stmt.executeUpdate(s);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null,"Connection Failed...\n"+ex.getMessage());        
        }
        return i;
    }
    public static void infocus(JTextField tf){
        tf.setEnabled(true);
        }
    public static void outfocus(JTextField tf){
        tf.setEnabled(false);
        }
        
        
}
    

