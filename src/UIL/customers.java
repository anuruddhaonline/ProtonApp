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
public class customers extends javax.swing.JFrame {

    /**
     * Creates new form customers
     */
    public customers() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        address_2_txt = new javax.swing.JTextField();
        loyalty_card_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        honorifics = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        address_1_txt = new javax.swing.JTextField();
        mobile_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        issue_date_txt = new javax.swing.JTextField();
        expire_date_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        customer_name_txt = new javax.swing.JTextField();
        hon_combo = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        issue_loyalty_btn = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        search_loyalty_btn = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        update_loyalty_btn = new javax.swing.JButton();
        delete_loyalty_btn = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        view_loyalty_jt = new javax.swing.JTable();
        view_loyalty_btn = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        add_new_loyalty_clear_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(140, 50, 0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1230, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Address Line 02 :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        address_2_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        address_2_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(address_2_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 230, 30));

        loyalty_card_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        loyalty_card_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(loyalty_card_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 230, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Loyalty");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        honorifics.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        honorifics.setText("Honorific :");
        jPanel1.add(honorifics, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Name :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Address Line 01 :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        address_1_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        address_1_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(address_1_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 230, 30));

        mobile_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mobile_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(mobile_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 230, 30));

        email_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        email_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 230, 30));

        issue_date_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        issue_date_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(issue_date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 230, 30));

        expire_date_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        expire_date_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(expire_date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 230, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Mobile No :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Email :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Issue Date :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Expire Date :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Loyalty Card :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        customer_name_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        customer_name_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(customer_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 230, 30));

        hon_combo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        hon_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Mrs.", "Ms." }));
        jPanel1.add(hon_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 230, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Contact Details");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        issue_loyalty_btn.setBackground(new java.awt.Color(34, 155, 60));
        issue_loyalty_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        issue_loyalty_btn.setForeground(new java.awt.Color(255, 255, 255));
        issue_loyalty_btn.setText("Issue Loyalty");
        issue_loyalty_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issue_loyalty_btnActionPerformed(evt);
            }
        });
        jPanel1.add(issue_loyalty_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1095, 340, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("Card Details");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, 20));

        search_loyalty_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        search_loyalty_btn.setContentAreaFilled(false);
        search_loyalty_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_hover.png"))); // NOI18N
        jPanel1.add(search_loyalty_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 30, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 1208, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("View Loyalty");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        update_loyalty_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update_icon.png"))); // NOI18N
        update_loyalty_btn.setToolTipText("Update Loyalty");
        update_loyalty_btn.setContentAreaFilled(false);
        update_loyalty_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update_icon_hover.png"))); // NOI18N
        jPanel1.add(update_loyalty_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 30, 30));

        delete_loyalty_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_icon.png"))); // NOI18N
        delete_loyalty_btn.setToolTipText("Delete Loyalty");
        delete_loyalty_btn.setContentAreaFilled(false);
        delete_loyalty_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_icon_hover.png"))); // NOI18N
        jPanel1.add(delete_loyalty_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 30, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1208, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Customer Details");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        view_loyalty_jt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        view_loyalty_jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Loyalty Card", "Name", "Address Line 01", "Address Line 02", "Mobile Number", "E mail", "Issue Date", "Expire Date"
            }
        ));
        view_loyalty_jt.setRowHeight(20);
        jScrollPane1.setViewportView(view_loyalty_jt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 1150, 230));

        view_loyalty_btn.setBackground(new java.awt.Color(34, 155, 60));
        view_loyalty_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        view_loyalty_btn.setForeground(new java.awt.Color(255, 255, 255));
        view_loyalty_btn.setText("View Loyalty");
        jPanel1.add(view_loyalty_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1095, 410, -1, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 70, 10, 312));

        add_new_loyalty_clear_btn.setBackground(new java.awt.Color(34, 155, 60));
        add_new_loyalty_clear_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_new_loyalty_clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_new_loyalty_clear_btn.setText("New");
        jPanel1.add(add_new_loyalty_clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void issue_loyalty_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issue_loyalty_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issue_loyalty_btnActionPerformed

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
            java.util.logging.Logger.getLogger(customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_new_loyalty_clear_btn;
    private javax.swing.JTextField address_1_txt;
    private javax.swing.JTextField address_2_txt;
    private javax.swing.JTextField customer_name_txt;
    private javax.swing.JButton delete_loyalty_btn;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField expire_date_txt;
    private javax.swing.JComboBox hon_combo;
    private javax.swing.JLabel honorifics;
    private javax.swing.JTextField issue_date_txt;
    private javax.swing.JButton issue_loyalty_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField loyalty_card_txt;
    private javax.swing.JTextField mobile_txt;
    private javax.swing.JButton search_loyalty_btn;
    private javax.swing.JButton update_loyalty_btn;
    private javax.swing.JButton view_loyalty_btn;
    private javax.swing.JTable view_loyalty_jt;
    // End of variables declaration//GEN-END:variables
}
