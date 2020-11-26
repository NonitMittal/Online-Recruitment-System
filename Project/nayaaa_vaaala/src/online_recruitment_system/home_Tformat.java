/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_recruitment_system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author asus
 */
public class home_Tformat implements Tformat{

    @Override
    public void format(JTable t) {
        DefaultTableCellRenderer cellren = new DefaultTableCellRenderer();
        
        ((DefaultTableCellRenderer)t.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);   
        
            cellren.setHorizontalAlignment(JLabel.CENTER);
            for(int i = 0 ; i < 2; i++){
                t.getColumnModel().getColumn(i).setCellRenderer(cellren);
            }
            t.getTableHeader().setForeground(new Color(255,255,255));
            t.getTableHeader().setBackground(new Color(181,58,61));
            t.getTableHeader().setFont(new Font("Futura Std Medium", Font.BOLD,20));
            t.getTableHeader().setSize(770, 35);
            t.getTableHeader().setOpaque(false);
            t.setRowHeight(30);
            t.setFont(new Font("Futura Std Medium", Font.PLAIN,16));
    }
    public void format(JTable t,int n){
        DefaultTableCellRenderer cellren = new DefaultTableCellRenderer();
        
        ((DefaultTableCellRenderer)t.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);   
        
            cellren.setHorizontalAlignment(JLabel.CENTER);
            for(int i = 0 ; i < 2 ; i++){
                t.getColumnModel().getColumn(i).setCellRenderer(cellren);
            }
            t.getTableHeader().setForeground(new Color(255,255,255));
            t.getTableHeader().setBackground(new Color(15,48,83));
            t.getTableHeader().setFont(new Font("Futura Std Medium", Font.BOLD,20));
            t.getTableHeader().setSize(770, 35);
            t.getTableHeader().setOpaque(false);
            t.setRowHeight(30);
            t.setFont(new Font("Futura Std Medium", Font.PLAIN,16));
    
    
    
    
    
    
    }
    
}
