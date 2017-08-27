/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UIL;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author ASUS
 */
public class main extends javax.swing.JFrame {

    dashboard dashboard = new dashboard();
    notifications notifications = new notifications();
    customers customers = new customers();
    suppliers suppliers = new suppliers();
    inventory inventory = new inventory();
    purchase purchase = new purchase();
    production production = new production();
    sales sales = new sales();
    settings settings = new settings();
    help help = new help();
    
    public main() {
        initComponents();
        
        //setss screen resolution
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0,0,1366, 768);
        setVisible(true);
        setLocationRelativeTo(null);
        
        menu_panel.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_button_group = new javax.swing.ButtonGroup();
        header_panel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        menu_button = new javax.swing.JToggleButton();
        menu_panel = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        main_panel = new javax.swing.JPanel();
        login_panel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        login_logo = new javax.swing.JLabel();
        login_border = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header_panel.setBackground(new java.awt.Color(204, 255, 0));
        header_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Minimize");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        header_panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, -1));

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        header_panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, -1, -1));

        menu_button.setText("jToggleButton11");
        menu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buttonActionPerformed(evt);
            }
        });
        header_panel.add(menu_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        getContentPane().add(header_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 50));

        menu_panel.setBackground(new java.awt.Color(255, 51, 51));
        menu_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu_button_group.add(jToggleButton1);
        jToggleButton1.setText("HELP");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        menu_panel.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 140, -1));

        menu_button_group.add(jToggleButton2);
        jToggleButton2.setText("NOTI");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        menu_panel.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 140, -1));

        menu_button_group.add(jToggleButton3);
        jToggleButton3.setText("DASH");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        menu_panel.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 140, -1));

        menu_button_group.add(jToggleButton4);
        jToggleButton4.setText("INVEN");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        menu_panel.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, -1));

        menu_button_group.add(jToggleButton5);
        jToggleButton5.setText("PURCH");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        menu_panel.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 140, -1));

        menu_button_group.add(jToggleButton6);
        jToggleButton6.setText("PROD");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        menu_panel.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, -1));

        menu_button_group.add(jToggleButton7);
        jToggleButton7.setText("SALES");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        menu_panel.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 140, -1));

        menu_button_group.add(jToggleButton8);
        jToggleButton8.setText("CUS");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });
        menu_panel.add(jToggleButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 140, -1));

        menu_button_group.add(jToggleButton9);
        jToggleButton9.setText("SUP");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });
        menu_panel.add(jToggleButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 140, -1));

        menu_button_group.add(jToggleButton10);
        jToggleButton10.setText("SETT");
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });
        menu_panel.add(jToggleButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 140, -1));

        getContentPane().add(menu_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 140, 720));

        main_panel.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_panel.setBackground(new java.awt.Color(255, 255, 255));
        login_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        login_panel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 230, 30));
        login_panel.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 230, -1));

        jButton4.setText("Forgot your password ?");
        login_panel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jButton3.setText("Login");
        login_panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        login_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login_panel_logo.png"))); // NOI18N
        login_logo.setToolTipText("");
        login_panel.add(login_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 9, -1, -1));

        login_border.setBackground(new java.awt.Color(255, 255, 255));
        login_border.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login_border.png"))); // NOI18N
        login_panel.add(login_border, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Password :");
        login_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Username :");
        login_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        main_panel.add(login_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 470, 490));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setState(ICONIFIED);
        //dashboard.setState(ICONIFIED);
        //notifications.setState(ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
       dashboard.setVisible(true);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        notifications.setVisible(true);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        
        customers.setVisible(true);
        
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        
        suppliers.setVisible(true);
        
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        
        inventory.setVisible(true);
        
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
       
        purchase.setVisible(true);
        
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        
        production.setVisible(true);
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        
        sales.setVisible(true);
        
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        
        settings.setVisible(true);
        
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        help.setVisible(true);
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void menu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buttonActionPerformed
        
        if(menu_button.isSelected()){
            
            menu_panel.setVisible(true);
        }
        
        else{
            
            menu_panel.setVisible(false);
            
        }
        
    }//GEN-LAST:event_menu_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel header_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JLabel login_border;
    private javax.swing.JLabel login_logo;
    private javax.swing.JPanel login_panel;
    private javax.swing.JPanel main_panel;
    private javax.swing.JToggleButton menu_button;
    private javax.swing.ButtonGroup menu_button_group;
    private javax.swing.JPanel menu_panel;
    // End of variables declaration//GEN-END:variables
}
