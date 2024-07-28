/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academic_records_maintenance_system;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.sql.ResultSet;
import java.sql.PreparedStatement; 

/**
 *
 * @author TEBALELO MADUMETSA
 */
public class Login_Form extends javax.swing.JFrame {

    /**
     * Creates new form Login_Form
     */
    public Login_Form() {
    initComponents();
//connect with mysql database

// create a connection with a database


//center the form
this.setLocationRelativeTo(null);

    //center thre form
    this.setLocationRelativeTo(null);


    //create yellow border for the pnlTittle
    // 0 border in the top  
    Border pnlTittle_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.black);
    // set the border to the pnlTittle
    pnlTittle.setBorder(pnlTittle_border);

    // create a orange border  for global panel
    Border global_panel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.orange);
    jPanel1.setBorder(global_panel_border);
    //lblMinimize.setBorder(global_panel_border);
    
    
    // create a black border  for close and minimize
    Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
    lblClose.setBorder(pnlTittle_border);
    //Border lblMinimize_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.black);
    lblMinimize.setBorder(pnlTittle_border);
    
    
   
    Border label_icon_border = BorderFactory.createMatteBorder(1, 1, 1, 1,new Color(153, 153, 153));
    lblUsername.setBorder(label_icon_border);
    lblPassword.setBorder(label_icon_border);
    
    
    Border field_border = BorderFactory.createMatteBorder(1, 5, 1, 1,Color.orange);
    txtUsername.setBorder(field_border);
    passfPassword.setBorder(field_border);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        passfPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        pnlTittle = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        lblUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic_records_maintenance_system/username21.png"))); // NOI18N

        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academic_records_maintenance_system/password2.png"))); // NOI18N

        txtUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(153, 153, 153));
        txtUsername.setText("username");
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        passfPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        passfPassword.setForeground(new java.awt.Color(153, 153, 153));
        passfPassword.setText("123456");
        passfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passfPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passfPasswordFocusLost(evt);
            }
        });
        passfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 84, 140));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(passfPassword)))
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(passfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, 60)
                .addComponent(btnLogin)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        lblClose.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblClose.setText("  x");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });

        lblMinimize.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblMinimize.setText("  -");
        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseExited(evt);
            }
        });

        pnlTittle.setBackground(new java.awt.Color(0, 204, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login");

        javax.swing.GroupLayout pnlTittleLayout = new javax.swing.GroupLayout(pnlTittle);
        pnlTittle.setLayout(pnlTittleLayout);
        pnlTittleLayout.setHorizontalGroup(
            pnlTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTittleLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        pnlTittleLayout.setVerticalGroup(
            pnlTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTittleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(pnlTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
lblClose.setBorder(label_border);
lblClose.setForeground(Color.white);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
lblMinimize.setBorder(label_border);
lblMinimize.setForeground(Color.white);
        
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
   Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
   lblMinimize.setBorder(label_border);
   lblMinimize.setForeground(Color.black);
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
lblClose.setBorder(label_border);
lblClose.setForeground(Color.black);
    }//GEN-LAST:event_lblCloseMouseExited

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void passfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfPasswordActionPerformed
       
    }//GEN-LAST:event_passfPasswordActionPerformed

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
  //clear the textfield on focus if the text is "username"
    if(txtUsername.getText().trim().toLowerCase().equals("username"))
    {
        txtUsername.setText("");
        txtUsername.setForeground(Color.black);
    }

//set a yellow border to the lbl icon
 Border lbl_icon = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
 lblUsername.setBorder(lbl_icon);
        
        
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        
   //if  text field is equal to  username or empty
  //  will set the "username" text in the field  
  // on focus lost event 
  
  if(txtUsername.getText().trim().equals("")|| 
     txtUsername.getText().trim().toLowerCase().equals("username"))
  {
      txtUsername.setText("username");
      txtUsername.setForeground(new Color(153, 153, 153));
  }
  
  lblUsername.setBorder(null);
    }//GEN-LAST:event_txtUsernameFocusLost

    private void passfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passfPasswordFocusGained
        //clear the password field on focus if the text is "password"
        
        //get the password text
        String pass = String.valueOf(passfPassword.getPassword());
        
    if(pass.trim().toLowerCase().equals("password"))
    {
        passfPassword.setText("");
        passfPassword.setForeground(Color.black);
    }

//set a yellow border to the lbl icon
 Border lbl_icon = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
 lblPassword.setBorder(lbl_icon);
    }//GEN-LAST:event_passfPasswordFocusGained

    private void passfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passfPasswordFocusLost
     //if  password field is equal to  password or empty
  //  will set the "password" text in the field  
  // on focus lost event 
  
   //get the password text
   String pass = String.valueOf(passfPassword.getPassword());
  
  if(pass.trim().equals("")|| 
     pass.trim().toLowerCase().equals("password"))
  {
      passfPassword.setText("password");
      passfPassword.setForeground(new Color(153, 153, 153));
  }
  
  lblPassword.setBorder(null);
    }//GEN-LAST:event_passfPasswordFocusLost

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
       // set button background
        btnLogin.setBackground(new Color (0, 101, 183));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // set button background
        btnLogin.setBackground(new Color (0, 84, 104));
    }//GEN-LAST:event_btnLoginMouseExited

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
      
        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField passfPassword;
    private javax.swing.JPanel pnlTittle;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
