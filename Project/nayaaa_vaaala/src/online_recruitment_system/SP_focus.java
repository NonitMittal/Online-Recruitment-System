/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_recruitment_system;

import java.awt.Color;
import static java.awt.Color.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import keeptoo.KGradientPanel;

/**
 *
 * @author asus
 */
public class SP_focus implements Focus {
    
    Color def =new Color(95, 51, 40);
    Color high=new Color(31,59,67);
    Color neww=new Color(255,255,255);
    Color sp_text_high=new Color(36,206,243);
    Color sp_text=new Color(228,238,240);
    
    
    
    public void setFocus(JPanel pane){
        pane.setVisible(true);
                                                //overridden functions 
    }
    public void resetFocus(JPanel pane){
        pane.setVisible(false);
        
    
    }
    
    
    public void setFocus(JPanel pane,JPanel[] a){
        pane.setVisible(true);
        
        SP_focus.resetFocus(a);
    }
    public static void resetFocus(JPanel[] a){
        
        for (int i=0;i<a.length;i++){
        a[i].setVisible(false);
        }
    }
    
    
    
    
    
    
    
    public void setFocus(KGradientPanel pane,KGradientPanel[] a){
        pane.setVisible(true);
        
        SP_focus.resetFocus(a);
    }
    public static void resetFocus(KGradientPanel[] a){
        
        for (int i=0;i<a.length;i++){
        a[i].setVisible(false);
        }
    }
    
    
    
    
    
    
    
    public void cChange(JLabel l){
        l.setForeground(sp_text_high);
    }
    public void cReset(JLabel l){
        l.setForeground(sp_text);
    }
    
    public void cChange(JLabel l1,JLabel l2,JLabel l3,JLabel l4){
        
        l1.setForeground(sp_text_high);
        l2.setForeground(sp_text);
        l3.setForeground(sp_text);
        l4.setForeground(sp_text);
   
    }

    
}

/*
        sp.setFocus(sp1);
        sp.setFocus(highlight1);
        JPanel[] pane={sp2,sp3,sp4};
        JPanel[] menu={highlight2,highlight3,highlight4};
        sp.resetFocus(pane,menu);
*/