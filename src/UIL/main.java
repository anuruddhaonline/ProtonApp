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
    
    //quick menu
    
    quick_menu quick_menu = new quick_menu();
    
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
        quick_links_tb = new javax.swing.JToggleButton();
        menu_panel = new javax.swing.JPanel();
        help_tb = new javax.swing.JToggleButton();
        notification_tb = new javax.swing.JToggleButton();
        dashboard_tb = new javax.swing.JToggleButton();
        inventory_tb = new javax.swing.JToggleButton();
        purchase_tb = new javax.swing.JToggleButton();
        production_tb = new javax.swing.JToggleButton();
        invoice_tb = new javax.swing.JToggleButton();
        customer_tb = new javax.swing.JToggleButton();
        supplier_tb = new javax.swing.JToggleButton();
        settings_tb = new javax.swing.JToggleButton();
        main_panel = new javax.swing.JPanel();
        login_panel = new javax.swing.JPanel();
        username_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        login_logo = new javax.swing.JLabel();
        login_border = new javax.swing.JLabel();
        password_lbl = new javax.swing.JLabel();
        username_lbl = new javax.swing.JLabel();
        login_message_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header_panel.setBackground(new java.awt.Color(144, 19, 62));
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

        quick_links_tb.setText("jToggleButton11");
        quick_links_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quick_links_tbActionPerformed(evt);
            }
        });
        header_panel.add(quick_links_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 5, 45, 40));

        getContentPane().add(header_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 50));

        menu_panel.setBackground(new java.awt.Color(31, 36, 39));
        menu_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu_button_group.add(help_tb);
        help_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/help_icon.png"))); // NOI18N
        help_tb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/help_icon_icon.png"))); // NOI18N
        help_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/help_icon_icon.png"))); // NOI18N
        help_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                help_tbActionPerformed(evt);
            }
        });
        menu_panel.add(help_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 140, 35));

        menu_button_group.add(notification_tb);
        notification_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notifications_icon.png"))); // NOI18N
        notification_tb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notifications_icon_hover.png"))); // NOI18N
        notification_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notifications_icon_hover.png"))); // NOI18N
        notification_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notification_tbActionPerformed(evt);
            }
        });
        menu_panel.add(notification_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, 35));

        menu_button_group.add(dashboard_tb);
        dashboard_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dashboard_icon.png"))); // NOI18N
        dashboard_tb.setToolTipText("");
        dashboard_tb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dashboard_icon_hover.png"))); // NOI18N
        dashboard_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dashboard_icon_hover.png"))); // NOI18N
        dashboard_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboard_tbActionPerformed(evt);
            }
        });
        menu_panel.add(dashboard_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 35));

        menu_button_group.add(inventory_tb);
        inventory_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory_icon.png"))); // NOI18N
        inventory_tb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory_icon_hover.png"))); // NOI18N
        inventory_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory_icon_hover.png"))); // NOI18N
        inventory_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventory_tbActionPerformed(evt);
            }
        });
        menu_panel.add(inventory_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 35));

        menu_button_group.add(purchase_tb);
        purchase_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/purchase_icon.png"))); // NOI18N
        purchase_tb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/purchase_icon_hover.png"))); // NOI18N
        purchase_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/purchase_icon_hover.png"))); // NOI18N
        purchase_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchase_tbActionPerformed(evt);
            }
        });
        menu_panel.add(purchase_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 140, 35));

        menu_button_group.add(production_tb);
        production_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producton_icon.png"))); // NOI18N
        production_tb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producton_icon_hover.png"))); // NOI18N
        production_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/producton_icon_hover.png"))); // NOI18N
        production_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                production_tbActionPerformed(evt);
            }
        });
        menu_panel.add(production_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 140, 35));

        menu_button_group.add(invoice_tb);
        invoice_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sales_icon.png"))); // NOI18N
        invoice_tb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sales_icon_hover.png"))); // NOI18N
        invoice_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sales_icon_hover.png"))); // NOI18N
        invoice_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoice_tbActionPerformed(evt);
            }
        });
        menu_panel.add(invoice_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 140, 35));

        menu_button_group.add(customer_tb);
        customer_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loyalty_icon.png"))); // NOI18N
        customer_tb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loyalty_icon_hover.png"))); // NOI18N
        customer_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loyalty_icon_hover.png"))); // NOI18N
        customer_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_tbActionPerformed(evt);
            }
        });
        menu_panel.add(customer_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 140, 35));

        menu_button_group.add(supplier_tb);
        supplier_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/suppliers_icon.png"))); // NOI18N
        supplier_tb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/suppliers_icon_hover.png"))); // NOI18N
        supplier_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/suppliers_icon_hover.png"))); // NOI18N
        supplier_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplier_tbActionPerformed(evt);
            }
        });
        menu_panel.add(supplier_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 140, 35));

        menu_button_group.add(settings_tb);
        settings_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings_icon.png"))); // NOI18N
        settings_tb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings_icon_hover.png"))); // NOI18N
        settings_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings_icon_hover.png"))); // NOI18N
        settings_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings_tbActionPerformed(evt);
            }
        });
        menu_panel.add(settings_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 140, 35));

        getContentPane().add(menu_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 140, 720));

        main_panel.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_panel.setBackground(new java.awt.Color(255, 255, 255));
        login_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        username_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        login_panel.add(username_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 230, 30));

        password_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        password_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        password_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_txtActionPerformed(evt);
            }
        });
        login_panel.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 230, 30));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 204));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setLabel("Forgot your password?");
        login_panel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 340, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 153, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Login");
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 340, 40));

        login_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login_panel_logo.png"))); // NOI18N
        login_logo.setToolTipText("");
        login_panel.add(login_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 9, -1, -1));

        login_border.setBackground(new java.awt.Color(255, 255, 255));
        login_border.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login_border.png"))); // NOI18N
        login_panel.add(login_border, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 100, -1, -1));

        password_lbl.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        password_lbl.setText("Password :");
        login_panel.add(password_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        username_lbl.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        username_lbl.setText("Username :");
        login_panel.add(username_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        login_message_lbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        login_message_lbl.setText("Please Login to Continue!");
        login_panel.add(login_message_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 180, -1, -1));

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

    private void dashboard_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_tbActionPerformed
       dashboard.setVisible(true);
    }//GEN-LAST:event_dashboard_tbActionPerformed

    private void notification_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notification_tbActionPerformed
        notifications.setVisible(true);
    }//GEN-LAST:event_notification_tbActionPerformed

    private void customer_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_tbActionPerformed
        
        customers.setVisible(true);
        
    }//GEN-LAST:event_customer_tbActionPerformed

    private void supplier_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplier_tbActionPerformed
        
        suppliers.setVisible(true);
        
    }//GEN-LAST:event_supplier_tbActionPerformed

    private void inventory_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventory_tbActionPerformed
        
        inventory.setVisible(true);
        
    }//GEN-LAST:event_inventory_tbActionPerformed

    private void purchase_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchase_tbActionPerformed
       
        purchase.setVisible(true);
        
    }//GEN-LAST:event_purchase_tbActionPerformed

    private void production_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_production_tbActionPerformed
        
        production.setVisible(true);
    }//GEN-LAST:event_production_tbActionPerformed

    private void invoice_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoice_tbActionPerformed
        
        sales.setVisible(true);
        
    }//GEN-LAST:event_invoice_tbActionPerformed

    private void settings_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settings_tbActionPerformed
        
        settings.setVisible(true);
        
    }//GEN-LAST:event_settings_tbActionPerformed

    private void help_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_help_tbActionPerformed
        
        help.setVisible(true);
        
    }//GEN-LAST:event_help_tbActionPerformed

    private void menu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buttonActionPerformed
        
        if(menu_button.isSelected()){
            
            menu_panel.setVisible(true);
        }
        
        else{
            
            menu_panel.setVisible(false);
            
        }
        
    }//GEN-LAST:event_menu_buttonActionPerformed

    private void password_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_txtActionPerformed

    private void quick_links_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quick_links_tbActionPerformed
        
        if(quick_links_tb.isSelected()){
            
            quick_menu.setVisible(true);
        }
        
        else{
            
            quick_menu.setVisible(false);
            
        }
        
    }//GEN-LAST:event_quick_links_tbActionPerformed

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
    private javax.swing.JToggleButton customer_tb;
    private javax.swing.JToggleButton dashboard_tb;
    private javax.swing.JPanel header_panel;
    private javax.swing.JToggleButton help_tb;
    private javax.swing.JToggleButton inventory_tb;
    private javax.swing.JToggleButton invoice_tb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel login_border;
    private javax.swing.JLabel login_logo;
    private javax.swing.JLabel login_message_lbl;
    private javax.swing.JPanel login_panel;
    private javax.swing.JPanel main_panel;
    private javax.swing.JToggleButton menu_button;
    private javax.swing.ButtonGroup menu_button_group;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JToggleButton notification_tb;
    private javax.swing.JLabel password_lbl;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JToggleButton production_tb;
    private javax.swing.JToggleButton purchase_tb;
    private javax.swing.JToggleButton quick_links_tb;
    private javax.swing.JToggleButton settings_tb;
    private javax.swing.JToggleButton supplier_tb;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
