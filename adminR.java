/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.assignment;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexl
 */
public class adminR extends javax.swing.JFrame {

    /**
     * Creates new form studentR
     */
    File f = new File("C:\\Users\\alexl\\OneDrive\\Documents\\NetBeansProjects\\Assignment\\src\\main\\java");
    String line;
    String at;
    String Taid;
    String Tap;
    String line1;
    int ln;
    

    public adminR() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblsi = new javax.swing.JLabel();
        lblsn = new javax.swing.JLabel();
        lbltp = new javax.swing.JLabel();
        lble = new javax.swing.JLabel();
        anametxt = new javax.swing.JTextField();
        aptxt = new javax.swing.JTextField();
        aidtxt = new javax.swing.JTextField();
        butRegister = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        mBox = new javax.swing.JCheckBox();
        tBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(4, 194, 198));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 2, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APU Hostel Appliances ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADMIN REGISTRATION");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblsi.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        lblsi.setText("ADMIN ID:");

        lblsn.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        lblsn.setText("NAME:");

        lbltp.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        lbltp.setText("TYPE:");

        lble.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        lble.setText("PASSWORD:");

        anametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                anametxtKeyPressed(evt);
            }
        });

        aptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aptxtKeyPressed(evt);
            }
        });

        aidtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aidtxtKeyPressed(evt);
            }
        });

        butRegister.setText("Register");
        butRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRegisterActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(mBox);
        mBox.setText("Manager");
        mBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBoxActionPerformed(evt);
            }
        });

        buttonGroup1.add(tBox);
        tBox.setText("Technician");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblsi)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(aidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(lbltp)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                        .addComponent(butRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lble)
                            .addComponent(lblsn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aptxt, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(anametxt))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsi)
                    .addComponent(aidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltp)
                            .addComponent(lble)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(mBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void countline(){
        try {
            ln = 1;
            RandomAccessFile raf = new RandomAccessFile(f+"\\admin\\admin.txt","rw");
            try {
                for(int i =0;raf.readLine()!=null;i++){
                    ln++;
                }
            } catch (IOException ex) {
                Logger.getLogger(Rlogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Rlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void aidtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aidtxtKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c) || Character.isUpperCase(c)|| Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            aidtxt.setEditable(true);
        }else
        {
            aidtxt.setEditable(false);
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            anametxt.requestFocusInWindow();
        }
    }//GEN-LAST:event_aidtxtKeyPressed

    private void anametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anametxtKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) ||   Character.isWhitespace(c) || Character.isISOControl(c)){
            anametxt.setEditable(true);
        }else if(Character.isDigit(c))
        {
            anametxt.setEditable(false);
            JOptionPane.showMessageDialog(null, "Digit number is not allow","Registered", JOptionPane.ERROR_MESSAGE);
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            aptxt.requestFocusInWindow();
        }
    }//GEN-LAST:event_anametxtKeyPressed

    private void aptxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aptxtKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            butRegister.doClick();
        }
    }//GEN-LAST:event_aptxtKeyPressed
    
    public String getat(){
        
        if(mBox.isSelected()){
            return at = "m";
        }
        else if(tBox.isSelected()){
            return at = "t";
        }

        return at;
    }
    
    
    
    
    private void butRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRegisterActionPerformed
        getat();
        Admin admin1 = new Admin(aidtxt.getText(),anametxt.getText());
        admin1.setP(aptxt.getText());
        countline();
        try {
            // TODO add your handling code here:
            RandomAccessFile raf = new RandomAccessFile(f+"\\admin\\admin.txt","rw");
            try {
                if(aidtxt.getText().equals("") || anametxt.getText().equals("") || aptxt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill up all the field","Registered", JOptionPane.ERROR_MESSAGE);
                }
                else{
                for(int i=0;i<ln;i+=5){ //if have 5 line for 1 user put 5,6 put 6
                    String userid = raf.readLine().substring(4);
                    String userpass = raf.readLine().substring(10);
                    String utype = raf.readLine().substring(6);
                    if(admin1.getID().equals(userid)){
                        JOptionPane.showMessageDialog(null, "Admin ID is existed","Registered", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    else if(i==(ln-5)){ //meeting the next username 5+1 5 skip then meet but dont add that meeting line
                        admin1.registration(at);
                        /*
                        String filepath1 = f+"\\admin\\admin.txt"; // if got out of indexbound problem check for textfile remove extra white blankline.
                        File file1 = new File(filepath1);
                        try{
                        FileWriter writer = new FileWriter(file1,true);
                        writer.append("\n"+ "id::" + admin1.getID() +"\n" + "password::" +admin1.getP()+ "\n" + "type::"+admin1.gettype(at) + "\n"+ "name::"+ admin1.getN());
                        writer.write(System.getProperty("line.separator"));
                        writer.close();
                        JOptionPane.showMessageDialog(null, "Successfully Registered","Registered", JOptionPane.ERROR_MESSAGE);
                        System.out.println(admin1.toString());
                        } catch(IOException e){
                        e.printStackTrace();
                        }*/
                        break;
                    }
                    for(int x=1;x<=2;x++){ // how many line to skip for login start from unused line
                        raf.readLine();
                    }
                    aidtxt.setText("");
                    anametxt.setText("");
                    aptxt.setText("");
                    mBox.setSelected(false);
                    tBox.setSelected(false);
                }
                }
                
            } catch (IOException ex) {
                Logger.getLogger(Rlogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Rlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_butRegisterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManagerInterface newframe = new ManagerInterface();
        newframe.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBoxActionPerformed
        // TODO add your handling code here:    
        tBox.enable(false);
    }//GEN-LAST:event_mBoxActionPerformed
    public String getAIDTxt() {
        return aidtxt.getText();

    }
    
    public String getANtxt() {
        return anametxt.getText();

    }
    
   
    
    public String geAPtxt(){
        return aptxt.getText();
    }
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aidtxt;
    private javax.swing.JTextField anametxt;
    private javax.swing.JTextField aptxt;
    private javax.swing.JButton butRegister;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lble;
    private javax.swing.JLabel lblsi;
    private javax.swing.JLabel lblsn;
    private javax.swing.JLabel lbltp;
    private javax.swing.JCheckBox mBox;
    private java.awt.Panel panel1;
    private javax.swing.JCheckBox tBox;
    // End of variables declaration//GEN-END:variables
}