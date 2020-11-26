/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_recruitment_system;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author asus
 */
public class a_focus extends SP_focus {
    Color sp_text_high=new Color(255,153,0);
    Color sp_text=new Color(255,255,255);
    
    public void cChange(JLabel l){
        l.setForeground(sp_text_high);
    }
    public void cReset(JLabel l){
        l.setForeground(sp_text);
    }
    
}
