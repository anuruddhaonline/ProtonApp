/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UIL;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;

/**
 *
 * @author ASUS
 */
public class warehouse_transfers extends javax.swing.JFrame {

    /**
     * Creates new form warehouse_transfers
     */
    public warehouse_transfers() {
        initComponents();
        
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pro_id_txt = new javax.swing.JTextField();
        stock_count_id_txt = new javax.swing.JTextField();
        date_txt = new javax.swing.JTextField();
        system_count_txt = new javax.swing.JTextField();
        stock_count_complete_btn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        product_name_txt = new javax.swing.JTextField();
        search_stock_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        warehouse_tra_close_btn = new javax.swing.JButton();
        search_product_btn = new javax.swing.JButton();
        stock_dif_txt = new javax.swing.JTextField();
        actual_count_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Product Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Stock Count ID :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Date :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("System Count :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Actual Count :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Difference :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        pro_id_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pro_id_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(pro_id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 230, 30));

        stock_count_id_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        stock_count_id_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        stock_count_id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_count_id_txtActionPerformed(evt);
            }
        });
        jPanel1.add(stock_count_id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 230, 30));

        date_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        date_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 230, 30));

        system_count_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        system_count_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(system_count_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 230, 30));

        stock_count_complete_btn.setBackground(new java.awt.Color(34, 155, 60));
        stock_count_complete_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stock_count_complete_btn.setForeground(new java.awt.Color(255, 255, 255));
        stock_count_complete_btn.setText("Complete");
        stock_count_complete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_count_complete_btnActionPerformed(evt);
            }
        });
        jPanel1.add(stock_count_complete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Product ID :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        product_name_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        product_name_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(product_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 230, 30));

        search_stock_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        search_stock_btn.setContentAreaFilled(false);
        search_stock_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_hover.png"))); // NOI18N
        jPanel1.add(search_stock_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 30, 30));

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stock Count");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, 110, -1));

        warehouse_tra_close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sub_close_btn.png"))); // NOI18N
        warehouse_tra_close_btn.setContentAreaFilled(false);
        warehouse_tra_close_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sub_close_btn_hover.png"))); // NOI18N
        warehouse_tra_close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehouse_tra_close_btnActionPerformed(evt);
            }
        });
        jPanel2.add(warehouse_tra_close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 50));

        search_product_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        search_product_btn.setContentAreaFilled(false);
        search_product_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_hover.png"))); // NOI18N
        jPanel1.add(search_product_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 30, 30));

        stock_dif_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        stock_dif_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(stock_dif_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 230, 30));

        actual_count_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        actual_count_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(actual_count_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stock_count_complete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_count_complete_btnActionPerformed
     
        
        String productID= pro_id_txt.getText();
        String transferID = stock_count_id_txt.getText();
        String date=date_txt.getText();
        int systemCount= Integer.parseInt(system_count_txt.getText());
        int actualCount = Integer.parseInt(actual_count_txt.getText());
        String comments= system_count_txt.getText();
        
        if(productID.isEmpty() || transferID.isEmpty() || date.isEmpty() || actual_count_txt.getText().isEmpty() || comments.isEmpty()){}
        
        
        
        
    }//GEN-LAST:event_stock_count_complete_btnActionPerformed

    private void stock_count_id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_count_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stock_count_id_txtActionPerformed

    private void warehouse_tra_close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehouse_tra_close_btnActionPerformed
        
        this.dispose();
        System.gc();
        
    }//GEN-LAST:event_warehouse_tra_close_btnActionPerformed

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
            java.util.logging.Logger.getLogger(warehouse_transfers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(warehouse_transfers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(warehouse_transfers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(warehouse_transfers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new warehouse_transfers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actual_count_txt;
    private javax.swing.JTextField date_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pro_id_txt;
    private javax.swing.JTextField product_name_txt;
    private javax.swing.JButton search_product_btn;
    private javax.swing.JButton search_stock_btn;
    private javax.swing.JButton stock_count_complete_btn;
    private javax.swing.JTextField stock_count_id_txt;
    private javax.swing.JTextField stock_dif_txt;
    private javax.swing.JTextField system_count_txt;
    private javax.swing.JButton warehouse_tra_close_btn;
    // End of variables declaration//GEN-END:variables
}
