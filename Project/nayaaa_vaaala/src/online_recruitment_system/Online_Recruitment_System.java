/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_recruitment_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nonit_Mittal
 */
public class Online_Recruitment_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Home_page().setVisible(true);
    }
    public static Connection connect(){
        Connection conn = null;
        String uname = "shrey";
        String pass = "shrey";
        String url = "jdbc:derby://localhost:1527/Online_Recruitment_System";
        try {
            conn = DriverManager.getConnection(url,uname,pass);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog (null,"Connection Failed..."+e.getMessage());        
        }
        return conn;
    }
}


