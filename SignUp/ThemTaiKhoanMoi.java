/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SignUp;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class ThemTaiKhoanMoi extends javax.swing.JFrame {

    /**
     * Creates new form ThemTaiKhoanMoi
     */
    public ThemTaiKhoanMoi() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/project";
            String username = "root";
            String password = "";
            Statement st;
            ResultSet rs;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_user = new javax.swing.JLabel();
        label_pass = new javax.swing.JLabel();
        label_confim = new javax.swing.JLabel();
        label_gmail = new javax.swing.JLabel();
        button_signup = new javax.swing.JButton();
        button_register = new javax.swing.JButton();
        text_username = new javax.swing.JTextField();
        text_gmail = new javax.swing.JTextField();
        text_pass = new javax.swing.JPasswordField();
        text_confim = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Create New Account");

        label_user.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_user.setText("UserName");

        label_pass.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_pass.setText("Password");

        label_confim.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_confim.setText("Confirm Password");

        label_gmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_gmail.setText("Gmail");

        button_signup.setBackground(new java.awt.Color(204, 204, 255));
        button_signup.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button_signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUp/log-in-sharp-icon.png"))); // NOI18N
        button_signup.setText("Sign Up");
        button_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_signupActionPerformed(evt);
            }
        });

        button_register.setBackground(new java.awt.Color(204, 204, 255));
        button_register.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUp/Thanhcong.png"))); // NOI18N
        button_register.setText("Register");
        button_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registerActionPerformed(evt);
            }
        });

        text_username.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        text_gmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        text_pass.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        text_confim.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        text_confim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_confimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button_signup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_register))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_pass)
                                    .addComponent(label_user)
                                    .addComponent(label_gmail)
                                    .addComponent(label_confim))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(text_confim, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(text_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                            .addComponent(text_gmail)
                                            .addComponent(text_username))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)))))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_user)
                    .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_gmail)
                    .addComponent(text_gmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_pass)
                    .addComponent(text_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_confim)
                    .addComponent(text_confim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_signup)
                    .addComponent(button_register))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registerActionPerformed
       int dk = JOptionPane.showConfirmDialog(this, "Would you like to register?", "Confirm", JOptionPane.YES_OPTION);
       if(dk != JOptionPane.YES_OPTION){
           return ;
       }
        try {
           Class.forName(driver);
           Connection  con = DriverManager.getConnection(url, username, password);
           String sql ="insert into user values(?, ?, ?, ?)";
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, text_username.getText());
           ps.setString(2, text_gmail.getText());
           ps.setString(3, text_pass.getText());
           ps.setString(4, text_confim.getText());
           int n = ps.executeUpdate(); //update để thêm dữ liệu
           if(text_username.getText().equals("")|| text_gmail.equals("")|| text_pass.equals("") || text_confim.equals("")){
               JOptionPane.showMessageDialog(this, "Please do not leave the information blank !");
           }else if(n!=0){
               JOptionPane.showMessageDialog(this, "Sign up sucess !");
           }else{
               JOptionPane.showMessageDialog(this, "Registration failed !");
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_button_registerActionPerformed

    private void text_confimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_confimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_confimActionPerformed

    private void button_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_signupActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_signupActionPerformed

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
            java.util.logging.Logger.getLogger(ThemTaiKhoanMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemTaiKhoanMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemTaiKhoanMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemTaiKhoanMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemTaiKhoanMoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_register;
    private javax.swing.JButton button_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_confim;
    private javax.swing.JLabel label_gmail;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_user;
    private javax.swing.JPasswordField text_confim;
    private javax.swing.JTextField text_gmail;
    private javax.swing.JPasswordField text_pass;
    private javax.swing.JTextField text_username;
    // End of variables declaration//GEN-END:variables
}
