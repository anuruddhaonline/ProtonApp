/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UIL;

/**
 *
 * @author ASUS
 */
public class change_password extends javax.swing.JFrame {

    /**
     * Creates new form change_password
     */
    public change_password() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        current_password_txt.grabFocus();
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
        change_pass_close_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        confirm_password_txt = new javax.swing.JPasswordField();
        current_password_txt = new javax.swing.JPasswordField();
        new_password_txt = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        confirm_pass_tick_lbl = new javax.swing.JLabel();
        current_pass_tick_lbl = new javax.swing.JLabel();
        change_pass_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 320));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        change_pass_close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sub_close_btn.png"))); // NOI18N
        change_pass_close_btn.setContentAreaFilled(false);
        change_pass_close_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sub_close_btn_hover.png"))); // NOI18N
        change_pass_close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_pass_close_btnActionPerformed(evt);
            }
        });
        jPanel2.add(change_pass_close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Change Password");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, 160, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Confirm New Password :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Username");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Current Password :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("New Password :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        confirm_password_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        confirm_password_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        confirm_password_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_password_txtActionPerformed(evt);
            }
        });
        jPanel1.add(confirm_password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 230, 30));

        current_password_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        current_password_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        current_password_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                current_password_txtActionPerformed(evt);
            }
        });
        jPanel1.add(current_password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 230, 30));

        new_password_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        new_password_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        new_password_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_password_txtActionPerformed(evt);
            }
        });
        jPanel1.add(new_password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 230, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Username :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        confirm_pass_tick_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/red_cross.png"))); // NOI18N
        jPanel1.add(confirm_pass_tick_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 30, 30));

        current_pass_tick_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/green_tick.png"))); // NOI18N
        jPanel1.add(current_pass_tick_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 30, 30));

        change_pass_btn.setBackground(new java.awt.Color(34, 155, 60));
        change_pass_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        change_pass_btn.setForeground(new java.awt.Color(255, 255, 255));
        change_pass_btn.setText("Change Password");
        jPanel1.add(change_pass_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void change_pass_close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_pass_close_btnActionPerformed

        this.dispose();
        System.gc();
    }//GEN-LAST:event_change_pass_close_btnActionPerformed

    private void confirm_password_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_password_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirm_password_txtActionPerformed

    private void current_password_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_current_password_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_current_password_txtActionPerformed

    private void new_password_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_password_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_password_txtActionPerformed

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
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new change_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change_pass_btn;
    private javax.swing.JButton change_pass_close_btn;
    private javax.swing.JLabel confirm_pass_tick_lbl;
    private javax.swing.JPasswordField confirm_password_txt;
    private javax.swing.JLabel current_pass_tick_lbl;
    private javax.swing.JPasswordField current_password_txt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField new_password_txt;
    // End of variables declaration//GEN-END:variables
}
