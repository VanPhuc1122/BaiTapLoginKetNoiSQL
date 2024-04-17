/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SignUp;


import View.Welcome;
import java.security.MessageDigest;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
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
        button_sign = new javax.swing.JButton();
        button_create = new javax.swing.JButton();
        text_user = new javax.swing.JTextField();
        text_pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("System Login");

        label_user.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUp/Admin-icon.png"))); // NOI18N
        label_user.setText("Username");

        label_pass.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUp/preferences-desktop-user-password-icon.png"))); // NOI18N
        label_pass.setText("Password");

        button_sign.setBackground(new java.awt.Color(204, 255, 255));
        button_sign.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button_sign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUp/log-in-sharp-icon.png"))); // NOI18N
        button_sign.setText("Sign Up");
        button_sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_signActionPerformed(evt);
            }
        });

        button_create.setBackground(new java.awt.Color(204, 255, 255));
        button_create.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        button_create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SignUp/Actions-contact-new-icon.png"))); // NOI18N
        button_create.setText("Create New Account");
        button_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_createActionPerformed(evt);
            }
        });

        text_user.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        text_pass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(button_sign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(button_create)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_pass)
                            .addComponent(label_user))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_user, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(text_pass)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_user)
                            .addComponent(text_user, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_pass)
                            .addComponent(text_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 199, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_sign)
                            .addComponent(button_create))
                        .addGap(82, 82, 82))))
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

    private void button_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_createActionPerformed
       ThemTaiKhoanMoi tk = new ThemTaiKhoanMoi();
       tk.setVisible(true);
       dispose();
    }//GEN-LAST:event_button_createActionPerformed

    private void button_signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_signActionPerformed
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
            PreparedStatement ps = con.prepareStatement(sql); // khi chạy chương trinnh, và sử dụng lệnh Preparestatement để tránh bị lộ mật khẩu một cách dễ dangfg
            ps.setString(1, text_user.getText());
            ps.setString(2, text_pass.getText());
            rs = ps.executeQuery(); // Thực thi câu lệnh
            if(text_user.getText().equals("") || text_pass.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please enter your account information or password !");
            }else if(rs.next()){ // cs dữ liệu
                Welcome w = new Welcome();
                w.setVisible(true);
                dispose();
                JOptionPane.showMessageDialog(this, "Sign Up Sucess !");
            }else{
                JOptionPane.showMessageDialog(this, "Account information or password is incorrect !");
            }
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_create;
    private javax.swing.JButton button_sign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_user;
    private javax.swing.JPasswordField text_pass;
    private javax.swing.JTextField text_user;
    // End of variables declaration//GEN-END:variables
}
