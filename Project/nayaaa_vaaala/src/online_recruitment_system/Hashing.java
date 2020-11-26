/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_recruitment_system;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author asus
 */
public class Hashing {
    public static String hashPassword(String password) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("SHA");
        md.update(password.getBytes());
        byte[] b = md.digest();
        String encrypt = "";
        for(byte b1 : b){
            encrypt += Integer.toHexString(b1 & 0xff);
        }
        return encrypt;
    }
    
}
