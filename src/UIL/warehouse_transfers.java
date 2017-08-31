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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pro_id_txt = new javax.swing.JTextField();
        trans_id_txt = new javax.swing.JTextField();
        date_txt = new javax.swing.JTextField();
        ware_source_txt = new javax.swing.JTextField();
        ware_dest_txt = new javax.swing.JTextField();
        com_txt = new javax.swing.JTextField();
        bt_warehouse_complete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Warehouse Transfer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 110, -1));

        jLabel2.setText("Product ID :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel3.setText("Transfer ID :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel4.setText("Date :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel5.setText(" Warehouse Source :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel6.setText("Warehouse Destination :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel7.setText("Comments :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));
        jPanel1.add(pro_id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 130, -1));
        jPanel1.add(trans_id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 130, -1));
        jPanel1.add(date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 130, -1));
        jPanel1.add(ware_source_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 130, -1));
        jPanel1.add(ware_dest_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 130, -1));
        jPanel1.add(com_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 130, -1));

        bt_warehouse_complete.setText("Complete");
        bt_warehouse_complete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_warehouse_completeActionPerformed(evt);
            }
        });
        jPanel1.add(bt_warehouse_complete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_warehouse_completeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_warehouse_completeActionPerformed
     
        
        String productID= pro_id_txt.getText();
        String transferID = trans_id_txt.getText();
        String date=date_txt.getText();
        String warehouseSource= ware_source_txt.getText();
        String comments= com_txt.getText();
        
        if(productID.isEmpty() || transferID.isEmpty() || date.isEmpty() || warehouseSource.isEmpty() || comments.isEmpty()){}
        
        
        
        
    }//GEN-LAST:event_bt_warehouse_completeActionPerformed

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
    private javax.swing.JButton bt_warehouse_complete;
    private javax.swing.JTextField com_txt;
    private javax.swing.JTextField date_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pro_id_txt;
    private javax.swing.JTextField trans_id_txt;
    private javax.swing.JTextField ware_dest_txt;
    private javax.swing.JTextField ware_source_txt;
    // End of variables declaration//GEN-END:variables
}
