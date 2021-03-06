/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_recruitment_system;

import User_Portal.Login_Page;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import keeptoo.KGradientPanel;

/**
 *
 * @author asus
 */
public class Home_page extends javax.swing.JFrame {
SP_focus sp=new SP_focus();
String c_ID,c_NAME,c_TYPE,j_ID,j_TITLE,j_QUALIFICATIONS,j_VACANCIES;

String url="jdbc:derby://localhost:1527/Online_Recruitment_System";
String uname="shrey";
String pass="shrey";
    /**
     * Creates new form Home_page
     */
    public Home_page() {
        initComponents();
        showdate();
        showtime();
        
        sp.setFocus(p1);
        sp.resetFocus(p2);
        home.setVisible(true);
        abt.setVisible(false);
        jscpane.setVisible(false);
        home_Tformat h =new home_Tformat();
        
        h.format(ctable);
        h.format(jtable, 1);
        
        ResultSet crs=null;
        
        DefaultTableModel ct=(DefaultTableModel)ctable.getModel();
        String q1="SELECT * FROM SHREY.COMPANIES";        
        try{
            crs=Connect.connect(q1);
            String a,b;
            while(crs.next())
            {   a=crs.getString(2);
                b=crs.getString(3);               
                Object []ob={a,b};
                ct.addRow(ob);
            }
            crs.close();

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    private void showdate(){
        java.util.Date d = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        date.setText(sdf.format(d));
    }
    
    private void showtime(){
        new Timer(0, (ActionEvent e) -> {
            java.util.Date s = new java.util.Date();
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
            time.setText(sdf.format(s));
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        abt_lbl = new javax.swing.JLabel();
        home_lbl = new javax.swing.JLabel();
        frame_cont = new javax.swing.JPanel();
        abt = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ctable = new javax.swing.JTable();
        jscpane = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cname = new javax.swing.JLabel();
        jtitle = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        qual = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        vac = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pane.setOpaque(false);
        pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p2.setBackground(new java.awt.Color(53, 157, 225));

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        pane.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 61, -1, -1));

        p1.setBackground(new java.awt.Color(53, 157, 225));

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        pane.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 61, 200, -1));

        abt_lbl.setFont(new java.awt.Font("Futura Std Medium", 0, 36)); // NOI18N
        abt_lbl.setForeground(new java.awt.Color(255, 255, 255));
        abt_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abt_lbl.setText("About Us");
        abt_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abt_lblMouseClicked(evt);
            }
        });
        pane.add(abt_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 5, 230, 50));

        home_lbl.setFont(new java.awt.Font("Futura Std Medium", 0, 36)); // NOI18N
        home_lbl.setForeground(new java.awt.Color(255, 255, 255));
        home_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home_lbl.setText("Home");
        home_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_lblMouseClicked(evt);
            }
        });
        pane.add(home_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 5, 200, 50));

        getContentPane().add(pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 890, 70));

        frame_cont.setOpaque(false);
        frame_cont.setLayout(new java.awt.CardLayout());

        abt.setOpaque(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_new/abtus.png"))); // NOI18N

        javax.swing.GroupLayout abtLayout = new javax.swing.GroupLayout(abt);
        abt.setLayout(abtLayout);
        abtLayout.setHorizontalGroup(
            abtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abtLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(29, 29, 29))
        );
        abtLayout.setVerticalGroup(
            abtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        frame_cont.add(abt, "card3");

        home.setOpaque(false);

        ctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company Name", "Company type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ctable.setFillsViewportHeight(true);
        ctable.setSelectionBackground(new java.awt.Color(130, 107, 154));
        ctable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ctable);

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Job Title", "Qualification required", "Vacancies"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable.setFillsViewportHeight(true);
        jtable.setSelectionBackground(new java.awt.Color(130, 107, 154));
        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableMouseClicked(evt);
            }
        });
        jscpane.setViewportView(jtable);

        kGradientPanel1.setkBorderRadius(200);
        kGradientPanel1.setkEndColor(new java.awt.Color(19, 94, 183));
        kGradientPanel1.setkStartColor(new java.awt.Color(252, 123, 123));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setRequestFocusEnabled(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(27, 87, 151));
        jButton2.setFont(new java.awt.Font("Futura Std Medium", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 377, 167, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Company Name");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 76, 133, 30));

        cname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cname.setForeground(new java.awt.Color(255, 255, 255));
        cname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 76, 227, 30));

        jtitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtitle.setForeground(new java.awt.Color(255, 255, 255));
        jtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtitle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(jtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 143, 227, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Job Title");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 143, 133, 30));

        qual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qual.setForeground(new java.awt.Color(255, 255, 255));
        qual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qual.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(qual, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 216, 227, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Qualification");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 216, 133, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Vacancies");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 291, 133, 30));

        vac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vac.setForeground(new java.awt.Color(255, 255, 255));
        vac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(vac, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 291, 227, 30));

        jSeparator1.setForeground(new java.awt.Color(7, 112, 152));

        jLabel1.setFont(new java.awt.Font("Futura Std Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 109, 141));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Click on the button below to Gain Access to All features");

        jButton1.setBackground(new java.awt.Color(27, 87, 151));
        jButton1.setFont(new java.awt.Font("Futura Std Medium", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log-IN/Register");
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addComponent(jscpane))
                .addGap(83, 83, 83)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jscpane, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        frame_cont.add(home, "card2");

        getContentPane().add(frame_cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 115, 1260, 640));

        date.setFont(new java.awt.Font("Futura Std Medium", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 204)));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 40, 100, 30));

        time.setFont(new java.awt.Font("Futura Std Medium", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 204, 204)));
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, 100, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/home_back2_1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void home_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_lblMouseClicked
        sp.setFocus(p1);
        sp.resetFocus(p2);
        home.setVisible(true);
        abt.setVisible(false);
        
    }//GEN-LAST:event_home_lblMouseClicked

    private void abt_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abt_lblMouseClicked
        sp.setFocus(p2);
        sp.resetFocus(p1);
        home.setVisible(false);
        abt.setVisible(true);
        
    }//GEN-LAST:event_abt_lblMouseClicked

    private void ctableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctableMouseClicked
DefaultTableModel tb1=(DefaultTableModel)ctable.getModel();
        DefaultTableModel tb2=(DefaultTableModel)jtable.getModel();
        
        for(int i=0;tb2.getRowCount()!=0;i++)
        tb2.removeRow(0);
        try
        {
        int x=ctable.getSelectedRow();
            
        String Company_name=tb1.getValueAt(x,0).toString();
        
        cname.setText(Company_name);
        ;
        String qy1="SELECT * FROM SHREY.COMPANIES WHERE COMPANY_NAME='"+Company_name+"'";
        
        ResultSet rs1=Connect.connect(qy1);
        
        String company_id="";
        if(rs1.next()){
        company_id=rs1.getString(1);   
        }
        
        String qy2="SELECT * FROM SHREY.JOBS WHERE COMPANY_ID='"+company_id+"' AND VACANCIES>0";
        ResultSet rs2=Connect.connect(qy2);
        
        String a,b,c,d;
        while(rs2.next())
            {   a=rs2.getString("JOB_TITLE");
                b=rs2.getString("SKILLS");
                c=rs2.getString("VACANCIES");
                d=rs2.getString("JOB_ID");
                if(c.equals("0")){continue;}
                Object []ob={d,a,b,c};
                tb2.addRow(ob);
            }
        
            rs2.close();
            rs1.close();
            jscpane.setVisible(true);
        }
        catch(SQLException e)
        {System.out.println(e);}




    }//GEN-LAST:event_ctableMouseClicked

    private void jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableMouseClicked
       DefaultTableModel tb2=(DefaultTableModel)jtable.getModel();
        int i=jtable.getSelectedRow();

        String jobid=tb2.getValueAt(i,0).toString();
        
        String qy="SELECT * FROM SHREY.JOBS WHERE JOB_ID='"+jobid+"'";
        ResultSet rs=Connect.connect(qy);
        
        try{
        if(rs.next()){
        jtitle.setText(rs.getString("JOB_TITLE"));
        qual.setText(rs.getString("QUALIFICATION"));
        vac.setText(rs.getString("VACANCIES"));
        }
        
        }catch(Exception e){
        System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_jtableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cname.setText("");
        jtitle.setText("");
        qual.setText("");
        vac.setText("");
        DefaultTableModel tb=(DefaultTableModel)jtable.getModel();
        for(int i = 0 ; tb.getRowCount()!= 0  ; i++){
                tb.removeRow(0);
            }
        jtable.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows 10".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abt;
    private javax.swing.JLabel abt_lbl;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cname;
    private javax.swing.JTable ctable;
    private javax.swing.JLabel date;
    private javax.swing.JPanel frame_cont;
    private javax.swing.JPanel home;
    private javax.swing.JLabel home_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane jscpane;
    private javax.swing.JTable jtable;
    private javax.swing.JLabel jtitle;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel pane;
    private javax.swing.JLabel qual;
    private javax.swing.JLabel time;
    private javax.swing.JLabel vac;
    // End of variables declaration//GEN-END:variables
}
