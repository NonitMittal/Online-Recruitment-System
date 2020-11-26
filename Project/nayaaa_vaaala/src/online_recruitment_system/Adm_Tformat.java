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
public class Adm_Tformat implements Tformat{

    @Override
    public void format(JTable t) {
        DefaultTableCellRenderer cellren = new DefaultTableCellRenderer();
        
        ((DefaultTableCellRenderer)t.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);   
        
            cellren.setHorizontalAlignment(JLabel.CENTER);
            for(int i = 0 ; i < 3 ; i++){
                t.getColumnModel().getColumn(i).setCellRenderer(cellren);
            }
            t.getTableHeader().setForeground(new Color(255,255,255));
            t.getTableHeader().setBackground(new Color(255,153,0));
            t.getTableHeader().setFont(new Font("Roboto Bk", Font.BOLD,14));
            t.getTableHeader().setSize(771, 25);
            t.getTableHeader().setOpaque(false);
            t.setRowHeight(25);
            t.setFont(new Font("Bahnschrift", Font.PLAIN,12));
    }
    
}
