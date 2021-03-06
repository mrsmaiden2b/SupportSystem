package helpline;

import javax.swing.JOptionPane;

public class Login_Form extends javax.swing.JFrame {
   
    int attempt = 0;
    
    public Login_Form() {
        initComponents();
        this.getRootPane().setDefaultButton(btn_Go);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Username = new javax.swing.JLabel();
        btn_Go = new javax.swing.JButton();
        btn_Quit = new javax.swing.JButton();
        txt_Username = new javax.swing.JTextField();
        lbl_Password = new javax.swing.JLabel();
        lbl_HelpLine = new javax.swing.JLabel();
        txt_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Username.setText("Username");

        btn_Go.setText("Go");
        btn_Go.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GoActionPerformed(evt);
            }
        });

        btn_Quit.setText("Quit");
        btn_Quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuitActionPerformed(evt);
            }
        });

        lbl_Password.setText("Password");

        lbl_HelpLine.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        lbl_HelpLine.setText("HelpLine");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Go, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_HelpLine)
                        .addGap(149, 149, 149))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_Username)
                        .addComponent(lbl_Password))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(txt_Password))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbl_HelpLine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Username)
                    .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Password)
                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Go)
                    .addComponent(btn_Quit))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GoActionPerformed
        String sUNInput = txt_Username.getText();
        String sPWInput = txt_Password.getText();
        String sHashedPW;
        sHashedPW = HelpLine.SHA_Hash(sPWInput);
        boolean bLogin = false;

        for (int i = 0; i < HelpLine.User.size(); i++)
        {
            if (HelpLine.User.get(i).equals(sUNInput))
            {
                if (HelpLine.Password.get(i).equals(sHashedPW))
                {
                    bLogin = true;
                }
            }
        }
        
        if (bLogin == true)
        {
            JOptionPane.showMessageDialog(null, "Welcome!", "Login", JOptionPane.INFORMATION_MESSAGE);
            Navigation nav = new Navigation();
            nav.setVisible(true);
            this.dispose();
        }
        else
        {
            switch (attempt)
            {
                case 0:
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Login Details! (2 Tries Left)", "Error", JOptionPane.WARNING_MESSAGE);
                    txt_Username.setText("");
                    txt_Password.setText("");
                    attempt =+ 1;
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Login Details! (1 Try Left)", "Error", JOptionPane.WARNING_MESSAGE);
                    txt_Username.setText("");
                    txt_Password.setText("");
                    attempt =+ 1;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "You failed to enter a valid login. Goodbye!", "Error", JOptionPane.WARNING_MESSAGE);
                    System.exit(0);
                    break;
            }
        }
    }//GEN-LAST:event_btn_GoActionPerformed
    
    private void btn_QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_QuitActionPerformed
    
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
    private javax.swing.JButton btn_Go;
    private javax.swing.JButton btn_Quit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_HelpLine;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_Username;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}