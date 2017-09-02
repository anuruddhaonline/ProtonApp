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
public class quick_menu extends javax.swing.JFrame {

    stock_adjustment stock_adjustment = new stock_adjustment();
    warehouse_transfers warehouse_transfers = new warehouse_transfers();
    supplier_returns supplier_returns = new supplier_returns();
    view_purchase view_purchase = new view_purchase();
    view_invoice view_invoice = new view_invoice();
    grn grn = new grn();
    
    public quick_menu() {
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

        jPanel2 = new javax.swing.JPanel();
        view_invoice_quick_btn = new javax.swing.JButton();
        grn_quick_btn = new javax.swing.JButton();
        stock_adjustment_quick_btn = new javax.swing.JButton();
        warehouse_transfer_quick_btn = new javax.swing.JButton();
        view_purchase_quick_btn = new javax.swing.JButton();
        supplier_return_quick_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(485, 55, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        view_invoice_quick_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vew_invoice_icon.png"))); // NOI18N
        view_invoice_quick_btn.setContentAreaFilled(false);
        view_invoice_quick_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vew_invoice_icon_hover.png"))); // NOI18N
        view_invoice_quick_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vew_invoice_icon_hover.png"))); // NOI18N
        view_invoice_quick_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_invoice_quick_btnActionPerformed(evt);
            }
        });
        jPanel2.add(view_invoice_quick_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 185, 50));

        grn_quick_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view_suppliers_icon.png"))); // NOI18N
        grn_quick_btn.setContentAreaFilled(false);
        grn_quick_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view_suppliers_icon_hover.png"))); // NOI18N
        grn_quick_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view_suppliers_icon_hover.png"))); // NOI18N
        grn_quick_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grn_quick_btnActionPerformed(evt);
            }
        });
        jPanel2.add(grn_quick_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 180, 185, 50));

        stock_adjustment_quick_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stock_adjustment_icon.png"))); // NOI18N
        stock_adjustment_quick_btn.setContentAreaFilled(false);
        stock_adjustment_quick_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stock_adjustment_icon_hover.png"))); // NOI18N
        stock_adjustment_quick_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stock_adjustment_icon_hover.png"))); // NOI18N
        stock_adjustment_quick_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_adjustment_quick_btnActionPerformed(evt);
            }
        });
        jPanel2.add(stock_adjustment_quick_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 60, 185, 50));

        warehouse_transfer_quick_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/warehouse_transfer_icon.png"))); // NOI18N
        warehouse_transfer_quick_btn.setContentAreaFilled(false);
        warehouse_transfer_quick_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/warehouse_transfer_icon_hover.png"))); // NOI18N
        warehouse_transfer_quick_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/warehouse_transfer_icon_hover.png"))); // NOI18N
        warehouse_transfer_quick_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehouse_transfer_quick_btnActionPerformed(evt);
            }
        });
        jPanel2.add(warehouse_transfer_quick_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 185, 50));

        view_purchase_quick_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view_purchase_icon.png"))); // NOI18N
        view_purchase_quick_btn.setContentAreaFilled(false);
        view_purchase_quick_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view_purchase_icon_hover.png"))); // NOI18N
        view_purchase_quick_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view_purchase_icon_hover.png"))); // NOI18N
        view_purchase_quick_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_purchase_quick_btnActionPerformed(evt);
            }
        });
        jPanel2.add(view_purchase_quick_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 120, 185, 50));

        supplier_return_quick_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/supplier_return_icon.png"))); // NOI18N
        supplier_return_quick_btn.setContentAreaFilled(false);
        supplier_return_quick_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/supplier_return_icon_hover.png"))); // NOI18N
        supplier_return_quick_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/supplier_return_icon_hover.png"))); // NOI18N
        supplier_return_quick_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplier_return_quick_btnActionPerformed(evt);
            }
        });
        jPanel2.add(supplier_return_quick_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 185, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Quick Launch");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stock_adjustment_quick_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_adjustment_quick_btnActionPerformed
        
            stock_adjustment.setVisible(true);
        
    }//GEN-LAST:event_stock_adjustment_quick_btnActionPerformed

    private void warehouse_transfer_quick_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehouse_transfer_quick_btnActionPerformed
        
        warehouse_transfers.setVisible(true);
        
    }//GEN-LAST:event_warehouse_transfer_quick_btnActionPerformed

    private void supplier_return_quick_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplier_return_quick_btnActionPerformed
        
        supplier_returns.setVisible(true);
        
    }//GEN-LAST:event_supplier_return_quick_btnActionPerformed

    private void view_purchase_quick_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_purchase_quick_btnActionPerformed
        
        view_purchase.setVisible(true);
        
    }//GEN-LAST:event_view_purchase_quick_btnActionPerformed

    private void view_invoice_quick_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_invoice_quick_btnActionPerformed
        
        view_invoice.setVisible(true);
        
    }//GEN-LAST:event_view_invoice_quick_btnActionPerformed

    private void grn_quick_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grn_quick_btnActionPerformed
        
        grn.setVisible(true);
        
    }//GEN-LAST:event_grn_quick_btnActionPerformed

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
            java.util.logging.Logger.getLogger(quick_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quick_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quick_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quick_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quick_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton grn_quick_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton stock_adjustment_quick_btn;
    private javax.swing.JButton supplier_return_quick_btn;
    private javax.swing.JButton view_invoice_quick_btn;
    private javax.swing.JButton view_purchase_quick_btn;
    private javax.swing.JButton warehouse_transfer_quick_btn;
    // End of variables declaration//GEN-END:variables
}
