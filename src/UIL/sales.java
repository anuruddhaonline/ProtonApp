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
public class sales extends javax.swing.JFrame {

    view_invoice view_invoice = new view_invoice();
    
    public sales() {
        initComponents();
        
        product_code_txt.grabFocus();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        invoice_id_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        loyalty_card_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        customer_name_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        invoice_date_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        product_code_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        available_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_list_table = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        discount_txt = new javax.swing.JTextField();
        balance_lbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cash_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        quantity_txt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        gross_amount_lbl = new javax.swing.JLabel();
        net_amount_lbl = new javax.swing.JLabel();
        search_customer_mobile_btn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        product_name_txt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        item_count_lbl = new javax.swing.JLabel();
        save_and_print_btn = new javax.swing.JButton();
        complete_invoice_btn = new javax.swing.JButton();
        search_invoice_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        search_product_btn = new javax.swing.JButton();
        view_invoice_btn = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        add_new_invoice_clear_btn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        unit_price_txt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        mobile_txt = new javax.swing.JTextField();
        loyalty_discount_icon_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(140, 50, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("Sales");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Invoice ID :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        invoice_id_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        invoice_id_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(invoice_id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 230, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Loyalty Card No :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 240, -1, -1));

        loyalty_card_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        loyalty_card_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(loyalty_card_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 230, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Customer Name :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        customer_name_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        customer_name_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(customer_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 230, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Invoice Date :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        invoice_date_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        invoice_date_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(invoice_date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 230, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Product Code :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        product_code_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        product_code_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(product_code_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 230, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Balance :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 640, -1, -1));

        available_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        available_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(available_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 230, 30));

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
                "Product Code", "Product Name", "Unit Price", "Quantity", "Discount", "Sub Total"
            }
        ));
        product_list_table.setRowHeight(20);
        jScrollPane1.setViewportView(product_list_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 1120, 170));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Availability :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Discount :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        discount_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        discount_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(discount_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 230, 30));

        balance_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        balance_lbl.setText("LKR 0.00");
        jPanel1.add(balance_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Cash :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, -1, -1));

        cash_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cash_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(cash_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 390, 230, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Net Amount :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Quantity :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        quantity_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        quantity_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(quantity_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 230, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Gross Amount :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, -1, -1));

        gross_amount_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gross_amount_lbl.setText("LKR 0.00");
        jPanel1.add(gross_amount_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, -1, -1));

        net_amount_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        net_amount_lbl.setText("LKR 0.00");
        jPanel1.add(net_amount_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 680, -1, -1));

        search_customer_mobile_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        search_customer_mobile_btn.setContentAreaFilled(false);
        search_customer_mobile_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_hover.png"))); // NOI18N
        jPanel1.add(search_customer_mobile_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 30, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Product Name :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 290, -1, -1));

        product_name_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        product_name_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(product_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 230, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Item Count :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, -1, -1));

        item_count_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        item_count_lbl.setText("LKR 0.00");
        jPanel1.add(item_count_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 680, -1, -1));

        save_and_print_btn.setBackground(new java.awt.Color(34, 155, 60));
        save_and_print_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        save_and_print_btn.setForeground(new java.awt.Color(255, 255, 255));
        save_and_print_btn.setText("Save & Print");
        jPanel1.add(save_and_print_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(972, 670, -1, -1));

        complete_invoice_btn.setBackground(new java.awt.Color(34, 155, 60));
        complete_invoice_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        complete_invoice_btn.setForeground(new java.awt.Color(255, 255, 255));
        complete_invoice_btn.setText("Complete");
        complete_invoice_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complete_invoice_btnActionPerformed(evt);
            }
        });
        jPanel1.add(complete_invoice_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1092, 670, -1, -1));

        search_invoice_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        search_invoice_btn.setContentAreaFilled(false);
        search_invoice_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_hover.png"))); // NOI18N
        jPanel1.add(search_invoice_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 30, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Sales Invoice");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        search_product_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        search_product_btn.setContentAreaFilled(false);
        search_product_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_hover.png"))); // NOI18N
        jPanel1.add(search_product_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 30, 30));

        view_invoice_btn.setBackground(new java.awt.Color(34, 155, 60));
        view_invoice_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        view_invoice_btn.setForeground(new java.awt.Color(255, 255, 255));
        view_invoice_btn.setText("View Invoice");
        view_invoice_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_invoice_btnActionPerformed(evt);
            }
        });
        jPanel1.add(view_invoice_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1208, 10));

        add_new_invoice_clear_btn.setBackground(new java.awt.Color(34, 155, 60));
        add_new_invoice_clear_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_new_invoice_clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_new_invoice_clear_btn.setText("New");
        jPanel1.add(add_new_invoice_clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Unit Price :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 340, -1, -1));

        unit_price_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(unit_price_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 230, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Mobile No :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 140, -1, -1));

        mobile_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mobile_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(mobile_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 230, 30));

        loyalty_discount_icon_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loyalty_discount_icon.png"))); // NOI18N
        jPanel1.add(loyalty_discount_icon_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 391, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void complete_invoice_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complete_invoice_btnActionPerformed
        
        
//         int loyaltyCardNo=0;
//         int packSize=0;
//         int quantity=0;
//         double discount=0.0;
//         double cash=0.0;
//         double grossAmount=0.0;
//         double netAmount=0.0;
//         double balance=0.0;
//         int itemCount=0;
        
        
        String invoiceId= invoice_id_txt.getText();
        String customerName= customer_name_txt.getText();
        int loyaltyCardNo= Integer.parseInt(loyalty_card_txt.getText());
        String date = invoice_date_txt.getText();
        String productCode= product_code_txt.getText();
        int packSize= Integer.parseInt(product_name_txt.getText());
        int quantity = Integer.parseInt(quantity_txt.getText());
        double discount = Double.parseDouble(discount_txt.getText());
        double cash= Double.parseDouble(cash_txt.getText());
        String availablity = available_txt.getText();
        
        double grossAmount= Double.parseDouble(gross_amount_lbl.getText());
        double netAmount= Double.parseDouble(net_amount_lbl.getText());
        double balance= Double.parseDouble(balance_lbl.getText());
        
        int itemCount= Integer.parseInt(item_count_lbl.getText());
        
        
        
        
        if (invoiceId.isEmpty()|| customerName.isEmpty() || loyalty_card_txt.getText().isEmpty() || date.isEmpty() || productCode.isEmpty() || product_name_txt.getText().isEmpty() || quantity_txt.getText().isEmpty() || discount_txt.getText().isEmpty() || cash_txt.getText().isEmpty() || availablity.isEmpty() || gross_amount_lbl.getText().isEmpty() || net_amount_lbl.getText().isEmpty() || balance_lbl.getText().isEmpty()|| item_count_lbl.getText().isEmpty()  ){}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_complete_invoice_btnActionPerformed

    private void view_invoice_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_invoice_btnActionPerformed
       
        view_invoice.setVisible(true);
        
    }//GEN-LAST:event_view_invoice_btnActionPerformed

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
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_new_invoice_clear_btn;
    private javax.swing.JTextField available_txt;
    private javax.swing.JLabel balance_lbl;
    private javax.swing.JTextField cash_txt;
    private javax.swing.JButton complete_invoice_btn;
    private javax.swing.JTextField customer_name_txt;
    private javax.swing.JTextField discount_txt;
    private javax.swing.JLabel gross_amount_lbl;
    private javax.swing.JTextField invoice_date_txt;
    private javax.swing.JTextField invoice_id_txt;
    private javax.swing.JLabel item_count_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField loyalty_card_txt;
    private javax.swing.JLabel loyalty_discount_icon_lbl;
    private javax.swing.JTextField mobile_txt;
    private javax.swing.JLabel net_amount_lbl;
    private javax.swing.JTextField product_code_txt;
    private javax.swing.JTable product_list_table;
    private javax.swing.JTextField product_name_txt;
    private javax.swing.JTextField quantity_txt;
    private javax.swing.JButton save_and_print_btn;
    private javax.swing.JButton search_customer_mobile_btn;
    private javax.swing.JButton search_invoice_btn;
    private javax.swing.JButton search_product_btn;
    private javax.swing.JTextField unit_price_txt;
    private javax.swing.JButton view_invoice_btn;
    // End of variables declaration//GEN-END:variables
}
