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
public class company_details extends javax.swing.JFrame {

    
    
    public company_details() {
        initComponents();
        
        setLocationRelativeTo(null);
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
        jSeparator4 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        set_details_btn = new javax.swing.JButton();
        company_name_txt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        company_details_close_btn = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        category_txt = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        owner_name_txt = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        city_txt = new javax.swing.JTextField();
        address_02_txt = new javax.swing.JTextField();
        address_01_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        postal_code_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        telephone_01_txt = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        mobile_no_txt = new javax.swing.JTextField();
        telephone_02_txt = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        fax_txt = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        website_txt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 10, 410));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Company Name :");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        set_details_btn.setBackground(new java.awt.Color(34, 155, 60));
        set_details_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        set_details_btn.setForeground(new java.awt.Color(255, 255, 255));
        set_details_btn.setText("Save Details");
        set_details_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_details_btnActionPerformed(evt);
            }
        });
        jPanel1.add(set_details_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 120, -1));

        company_name_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        company_name_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(company_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 230, 30));

        jPanel4.setBackground(new java.awt.Color(153, 0, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Company Details");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, 150, -1));

        company_details_close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sub_close_btn.png"))); // NOI18N
        company_details_close_btn.setContentAreaFilled(false);
        company_details_close_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sub_close_btn_hover.png"))); // NOI18N
        company_details_close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                company_details_close_btnActionPerformed(evt);
            }
        });
        jPanel4.add(company_details_close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 30, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 50));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Category :");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 150, -1, -1));

        category_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        category_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(category_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 230, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Owner Name :");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 190, -1, -1));

        owner_name_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        owner_name_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(owner_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 230, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Address Line 01 :");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Address Line 02 :");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("City :");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 390, -1, -1));

        city_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        city_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(city_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 230, 30));

        address_02_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        address_02_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(address_02_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 230, 30));

        address_01_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        address_01_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(address_01_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 230, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Address Details");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Contact Details");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Postal Code :");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        postal_code_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        postal_code_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(postal_code_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 230, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Company Details");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Telephone 02 :");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        telephone_01_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        telephone_01_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(telephone_01_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 230, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("Mobile No :");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 190, -1, -1));

        mobile_no_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mobile_no_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(mobile_no_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 230, 30));

        telephone_02_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        telephone_02_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(telephone_02_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 230, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel33.setText("Telephone 01 :");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setText("Fax :");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 230, -1, -1));

        fax_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fax_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(fax_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 230, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setText("E mail :");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 270, -1, -1));

        email_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        email_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 230, 30));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setText("Website :");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 310, -1, -1));

        website_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        website_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(website_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 230, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 400, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 495));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void company_details_close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_company_details_close_btnActionPerformed

        this.dispose();
        System.gc();

    }//GEN-LAST:event_company_details_close_btnActionPerformed

    private void set_details_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_details_btnActionPerformed
       
       String comName = company_name_txt.getText();
        String comCat = category_txt.getText();
        String ownerName = owner_name_txt.getText();
        String add01 = address_01_txt.getText();
        String add02 = address_02_txt.getText();
        String city = city_txt.getText();
        int postalCode = Integer.parseInt(postal_code_txt.getText());
        int tel01 = Integer.parseInt(telephone_01_txt.getText());
        int tel02 = Integer.parseInt(telephone_02_txt.getText());
        int mobile = Integer.parseInt(mobile_no_txt.getText());
        int fax = Integer.parseInt(fax_txt.getText());
        String email = email_txt.getText();
        String web = website_txt.getText();
        
        if (comName.isEmpty() || comCat.isEmpty() || ownerName.isEmpty() || add01.isEmpty() || add02.isEmpty() || city.isEmpty() || postal_code_txt.getText().isEmpty() || telephone_01_txt.getText().isEmpty() || telephone_02_txt.getText().isEmpty() || mobile_no_txt.getText().isEmpty() || fax_txt.getText().isEmpty() || email.isEmpty() || web.isEmpty()) {
        
        
        }
        else {
        
        if (postal_code_txt.getText().length()!=6){
        
        System.out.println("account number is not valid");
        }else{
        
            
        if( telephone_01_txt.getText().length()!=10){
           
            System.out.println("mbile numver is not valid");
            
        }else{
            
        if(telephone_02_txt.getText().length()!=10){
        
         System.out.println("office no is not valid");
        
        
        }else{

        //chceking email
            String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String email1 = email_txt.getText();
        Boolean b = email1.matches(EMAIL_REGEX);
        
            if(!b){
            
                System.out.println("email is not valid");
                
            }else{
            
           
        try {

            ConnDB.iud("insert into company_details (com_name,com_cat,owner_name,add_01,add_02,city,postal_code,tel_01,tel_02,mob,fax,email,web) values('" + comName + "','" + comCat + "','" + ownerName + "','" + add01 + "','" + add02 + "','" + city + "','" + postalCode + "', '" + tel01 + "','" + tel02 + "','" + mobile + "','" + fax + "','" + email + "','" + web + "')");

        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
         }//email
        }//accNoLength

        }//ofNoLength
        }//mobilelength
        }//isempty
        
        company_name_txt.setText(null);
        category_txt.setText(null);
        owner_name_txt.setText(null);
        
        address_01_txt.setText(null);
        address_02_txt.setText(null);
        city_txt.setText(null);
        postal_code_txt.setText(null);
        
        telephone_01_txt.setText(null);
        telephone_02_txt.setText(null);
        mobile_no_txt.setText(null);
        fax_txt.setText(null);
        email_txt.setText(null);
        website_txt.setText(null);
        
        company_name_txt.grabFocus();
        
        
        
    }//GEN-LAST:event_set_details_btnActionPerformed

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
            java.util.logging.Logger.getLogger(company_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(company_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(company_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(company_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new company_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_01_txt;
    private javax.swing.JTextField address_02_txt;
    private javax.swing.JTextField category_txt;
    private javax.swing.JTextField city_txt;
    private javax.swing.JButton company_details_close_btn;
    private javax.swing.JTextField company_name_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField fax_txt;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField mobile_no_txt;
    private javax.swing.JTextField owner_name_txt;
    private javax.swing.JTextField postal_code_txt;
    private javax.swing.JButton set_details_btn;
    private javax.swing.JTextField telephone_01_txt;
    private javax.swing.JTextField telephone_02_txt;
    private javax.swing.JTextField website_txt;
    // End of variables declaration//GEN-END:variables
}
