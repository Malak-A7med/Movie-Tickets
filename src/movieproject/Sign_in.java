package movieproject;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class Sign_in extends javax.swing.JFrame {
    public Sign_in() {
        
        initComponents();
        pass.setEchoChar('•');
        this.setLocationRelativeTo(null);
        user_name1.setBackground(new java.awt.Color(0, 0, 0, 0));
        pass.setBackground(new java.awt.Color(0, 0, 0, 0));
        
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        show_pass = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        user_name1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1083, 608));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/user (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 110, -1));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 34)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sign In");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 140, -1));

        show_pass.setForeground(new java.awt.Color(255, 255, 255));
        show_pass.setText("<html>\n<u>show password</u>\n</html>");
        show_pass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_passMouseClicked(evt);
            }
        });
        jPanel1.add(show_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 90, -1));

        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("Password");
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 250, 30));

        jButton2.setBackground(new java.awt.Color(36, 80, 154));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 110, 40));

        user_name1.setForeground(new java.awt.Color(255, 255, 255));
        user_name1.setText("Username");
        user_name1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        user_name1.setCaretColor(new java.awt.Color(255, 255, 255));
        user_name1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                user_name1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                user_name1FocusLost(evt);
            }
        });
        jPanel1.add(user_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 250, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cartoonBG.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 480));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_name1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_name1FocusGained
        if (user_name1.getText().equals("Username")) {
         user_name1.setText("");
      }
    }//GEN-LAST:event_user_name1FocusGained

    private void user_name1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_name1FocusLost
         if (user_name1.getText().isEmpty()) {
                    user_name1.setText("Username");
                }
    }//GEN-LAST:event_user_name1FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        if (pass.getText().equals("Password")) {
         pass.setText("");
      }
    }//GEN-LAST:event_passFocusGained

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
       if (pass.getText().isEmpty()) {
                    pass.setText("Password");
                }
    }//GEN-LAST:event_passFocusLost
    
    private boolean showing = false;
    private void show_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_passMouseClicked
          if (showing) {
                    pass.setEchoChar('•'); 
                    showing = false;
                } else {
                    pass.setEchoChar((char) 0); 
                    showing = true;
                }   
   
    }//GEN-LAST:event_show_passMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if(user_name1.getText().equals("Malak Ahmed Samih") && pass.getText().equals("1372023")){
            dashboard dash = new dashboard();
            this.setVisible(false);
            dash.setVisible(true);  
        }
        else if(user_name1.getText().equals("Username")){
            JOptionPane.showMessageDialog(null, "Please Enter Username");
        }
        else if(pass.getText().equals("Password")){
            JOptionPane.showMessageDialog(null, "Please Enter Password");
        }
        else{
            JOptionPane.showMessageDialog(null, "Wrong Username Or Password, Try Again");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_in().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel show_pass;
    private javax.swing.JTextField user_name1;
    // End of variables declaration//GEN-END:variables
}
