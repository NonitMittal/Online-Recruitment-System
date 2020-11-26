
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import online_recruitment_system.Hashing;
import online_recruitment_system.JavaMailUtil;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */


//class for testing functions_______not for any use in project



public class Test_classs{
    public static void mmmmm(String args[]) throws Exception{
    
        
        String s="nitantgupta@jklu.edu.in";
        String p="hello";
          
        
    JavaMailUtil.sendmail(s,p);
    
    }
    public static void main(String args[]){
        String passhash = null;
        try {
            passhash = Hashing.hashPassword("");
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(passhash);
        
    
    
    
    
    
    }
}
