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
public class grn extends javax.swing.JFrame {

    
    
    public grn() {
        initComponents();
        
        this.setLocation(145, 115);
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
        jLabel10 = new javax.swing.JLabel();
        grn_close_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        grn_id_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        product_id_txt = new javax.swing.JTextField();
        search_grn_btn = new javax.swing.JButton();
        search_purchase_order_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_list_table = new javax.swing.JTable();
        discount_lbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        total_qty_lbl = new javax.swing.JLabel();
        total_amountl_lbl = new javax.swing.JLabel();
        complete_print_grn_btn = new javax.swing.JButton();
        complete_grn_btn = new javax.swing.JButton();
        purchase_order_txt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        supplier_name_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GRN");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, 50, -1));

        grn_close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sub_close_btn.png"))); // NOI18N
        grn_close_btn.setContentAreaFilled(false);
        grn_close_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sub_close_btn_hover.png"))); // NOI18N
        grn_close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grn_close_btnActionPerformed(evt);
            }
        });
        jPanel2.add(grn_close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1215, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("GRN ID :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        grn_id_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(grn_id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 230, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("GRN Date :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        product_id_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(product_id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 230, 30));

        search_grn_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        search_grn_btn.setContentAreaFilled(false);
        search_grn_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_hover.png"))); // NOI18N
        jPanel1.add(search_grn_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 30, 30));

        search_purchase_order_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        search_purchase_order_btn.setContentAreaFilled(false);
        search_purchase_order_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_hover.png"))); // NOI18N
        jPanel1.add(search_purchase_order_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Supplier Name :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Purchase Order ID :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        product_list_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        product_list_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product Code", "Product Name", "Unit Price", "Ordered Qty", "Received Qty", "Sub Total"
            }
        ));
        product_list_table.setRowHeight(20);
        jScrollPane1.setViewportView(product_list_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 1130, 200));

        discount_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        discount_lbl.setText("0");
        jPanel1.add(discount_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Total Quantity : ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, -1, -1));

        total_qty_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total_qty_lbl.setText("0");
        jPanel1.add(total_qty_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 70, -1));

        total_amountl_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total_amountl_lbl.setText("LKR 0.00");
        jPanel1.add(total_amountl_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 70, -1));

        complete_print_grn_btn.setBackground(new java.awt.Color(34, 155, 60));
        complete_print_grn_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        complete_print_grn_btn.setForeground(new java.awt.Color(255, 255, 255));
        complete_print_grn_btn.setText("Complete & Print");
        jPanel1.add(complete_print_grn_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 590, -1, -1));

        complete_grn_btn.setBackground(new java.awt.Color(34, 155, 60));
        complete_grn_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        complete_grn_btn.setForeground(new java.awt.Color(255, 255, 255));
        complete_grn_btn.setText("Complete");
        complete_grn_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complete_grn_btnActionPerformed(evt);
            }
        });
        jPanel1.add(complete_grn_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 590, -1, -1));

        purchase_order_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        purchase_order_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(purchase_order_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 230, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Add New GRN");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Total Amount :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Discount :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, -1));

        supplier_name_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(supplier_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1215, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grn_close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grn_close_btnActionPerformed

        this.dispose();
        System.gc();
    }//GEN-LAST:event_grn_close_btnActionPerformed

    private void complete_grn_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complete_grn_btnActionPerformed

        String purchaseId= grn_id_txt.getText();
        String productID= product_id_txt.getText();
        String supplierName = supplier_name_txt.getText();
        int quantity= Integer.parseInt(total_qty_lbl.getText());

        double total= Double.parseDouble(total_amountl_lbl.getText());

        if (purchaseId.isEmpty()|| purchaseId.isEmpty() || productID.isEmpty() || supplierName.isEmpty() || total_qty_lbl.getText().isEmpty() || total_amountl_lbl.getText().isEmpty()   ){}
    }//GEN-LAST:event_complete_grn_btnActionPerformed

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
            java.util.logging.Logger.getLogger(grn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton complete_grn_btn;
    private javax.swing.JButton complete_print_grn_btn;
    private javax.swing.JLabel discount_lbl;
    private javax.swing.JButton grn_close_btn;
    private javax.swing.JTextField grn_id_txt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField product_id_txt;
    private javax.swing.JTable product_list_table;
    private javax.swing.JTextField purchase_order_txt;
    private javax.swing.JButton search_grn_btn;
    private javax.swing.JButton search_purchase_order_btn;
    private javax.swing.JTextField supplier_name_txt;
    private javax.swing.JLabel total_amountl_lbl;
    private javax.swing.JLabel total_qty_lbl;
    // End of variables declaration//GEN-END:variables
}
