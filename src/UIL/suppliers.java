/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UIL;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class suppliers extends javax.swing.JFrame {

    /**
     * Creates new form suppliers
     */
    public suppliers() {
        initComponents();
          createSupCode();
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
        address_2_txt = new javax.swing.JTextField();
        sup_code_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        address_1_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        city_txt = new javax.swing.JTextField();
        postal_code_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        address_name_txt = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        mobile_txt = new javax.swing.JTextField();
        office_no_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        add_supplier_btn = new javax.swing.JButton();
        search_supplier_btn = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        supplier_name_txt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        supplier_website_txt = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        view_suppliers_jt = new javax.swing.JTable();
        view_suppliers_btn = new javax.swing.JButton();
        update_supplier_btn = new javax.swing.JButton();
        delete_supplier_btn = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        supplier_bank_name_txt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        suupler_account_num_txt = new javax.swing.JTextField();
        add_new_supplier_clear_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(140, 50, 0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1230, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("Suppliers");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Address Line 02 :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        address_2_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(address_2_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 230, 30));

        sup_code_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(sup_code_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 230, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Honorific :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Supplier Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Address Line 01 :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        address_1_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(address_1_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 230, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Name :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 240, -1, -1));

        city_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(city_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 230, 30));

        postal_code_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(postal_code_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 230, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("City :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Postal Code :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Supplier Code :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        address_name_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(address_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 230, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Mrs.", "Ms." }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 230, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Contact Details");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, -1, -1));

        mobile_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        mobile_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobile_txtKeyTyped(evt);
            }
        });
        jPanel1.add(mobile_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 140, 230, 30));

        office_no_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        office_no_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                office_no_txtKeyTyped(evt);
            }
        });
        jPanel1.add(office_no_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 190, 230, 30));

        email_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 240, 230, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Mobile No :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Office No :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 190, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Website :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 290, -1, -1));

        add_supplier_btn.setBackground(new java.awt.Color(34, 155, 60));
        add_supplier_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_supplier_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_supplier_btn.setText("Save Supplier");
        add_supplier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_supplier_btnActionPerformed(evt);
            }
        });
        jPanel1.add(add_supplier_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1085, 340, 130, -1));

        search_supplier_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        search_supplier_btn.setContentAreaFilled(false);
        search_supplier_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_hover.png"))); // NOI18N
        search_supplier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_supplier_btnActionPerformed(evt);
            }
        });
        jPanel1.add(search_supplier_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 30, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1208, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Supplier Details");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        supplier_name_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        supplier_name_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(supplier_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 230, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Address Name :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Email :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, -1, -1));

        supplier_website_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(supplier_website_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 290, 230, 30));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 75, 10, 312));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 75, 10, 312));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("View Suppliers");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        view_suppliers_jt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        view_suppliers_jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Supplier Code", "Name", "Address Name", "Address Line 01", "Address Line 02", "City", "Postal Code", "Mobile No.", "Office No.", "E mail", "Website"
            }
        ));
        view_suppliers_jt.setRowHeight(20);
        jScrollPane1.setViewportView(view_suppliers_jt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 1150, 230));

        view_suppliers_btn.setBackground(new java.awt.Color(34, 155, 60));
        view_suppliers_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        view_suppliers_btn.setForeground(new java.awt.Color(255, 255, 255));
        view_suppliers_btn.setText("View Suppliers");
        view_suppliers_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_suppliers_btnActionPerformed(evt);
            }
        });
        jPanel1.add(view_suppliers_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1085, 420, -1, -1));

        update_supplier_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update_icon.png"))); // NOI18N
        update_supplier_btn.setToolTipText("Update Loyalty");
        update_supplier_btn.setContentAreaFilled(false);
        update_supplier_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update_icon_hover.png"))); // NOI18N
        update_supplier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_supplier_btnActionPerformed(evt);
            }
        });
        jPanel1.add(update_supplier_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 30, 30));

        delete_supplier_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_icon.png"))); // NOI18N
        delete_supplier_btn.setToolTipText("Delete Loyalty");
        delete_supplier_btn.setContentAreaFilled(false);
        delete_supplier_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_icon_hover.png"))); // NOI18N
        delete_supplier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_supplier_btnActionPerformed(evt);
            }
        });
        jPanel1.add(delete_supplier_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 30, 30));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 1208, 10));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Bank Name :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 290, -1, -1));

        supplier_bank_name_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        supplier_bank_name_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(supplier_bank_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 230, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Account No :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 340, -1, -1));

        suupler_account_num_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        suupler_account_num_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        suupler_account_num_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                suupler_account_num_txtKeyTyped(evt);
            }
        });
        jPanel1.add(suupler_account_num_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 230, 30));

        add_new_supplier_clear_btn.setBackground(new java.awt.Color(34, 155, 60));
        add_new_supplier_clear_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_new_supplier_clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_new_supplier_clear_btn.setText("New");
        add_new_supplier_clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_new_supplier_clear_btnActionPerformed(evt);
            }
        });
        jPanel1.add(add_new_supplier_clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_supplier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_supplier_btnActionPerformed
       
        String supCode = sup_code_txt.getText();
        String honro = jComboBox1.getSelectedItem().toString();
        String supName = supplier_name_txt.getText();
        String bankName = supplier_bank_name_txt.getText();
        String accNo = suupler_account_num_txt.getText();

        String address = address_name_txt.getText();
        String add01 = address_1_txt.getText();
        String add02 = address_2_txt.getText();
        String city = city_txt.getText();
        String postal = postal_code_txt.getText();

        String mobile = mobile_txt.getText();
        String officeNo = office_no_txt.getText();
        String email = email_txt.getText();
        String website = supplier_website_txt.getText();
        String status="active";

        if (supCode.isEmpty() || honro.isEmpty() || supName.isEmpty() || address.isEmpty() || add01.isEmpty() || add02.isEmpty() || city.isEmpty() || postal.isEmpty() || mobile_txt.getText().isEmpty() || office_no_txt.getText().isEmpty() || email.isEmpty() || bankName.isEmpty() || suupler_account_num_txt.getText().isEmpty() || website.isEmpty()) {
        
        
        }
        
        else {
        
        if (suupler_account_num_txt.getText().length()!=16){
        
        System.out.println("account number is not valid");
        }else{
        
            
        if( mobile_txt.getText().length()!=10){
           
            System.out.println("mbile numver is not valid");
            
        }else{
            
        if(office_no_txt.getText().length()!=10){
        
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

            ConnDB.iud("insert into suppliers values('" + supCode + "','" + honro + "','" + supName + "','" + address + "','" + add01 + "','" + add02 + "','" + city + "','" + postal + "', '" + mobile + "','" + officeNo + "','" + email + "','" + bankName + "','" + accNo + "','" + website + "','"+status+"')");

        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
         }//email
        }//accNoLength

        }//ofNoLength
        }//mobilelength
        }//isempty
        
        clear_text();
    }//GEN-LAST:event_add_supplier_btnActionPerformed

    private void add_new_supplier_clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_new_supplier_clear_btnActionPerformed
              clear_text();
    }//GEN-LAST:event_add_new_supplier_clear_btnActionPerformed

    private void suupler_account_num_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_suupler_account_num_txtKeyTyped
        char t=evt.getKeyChar();
            if(!Character.isDigit(t)){
            
                evt.consume();
            }
    }//GEN-LAST:event_suupler_account_num_txtKeyTyped

    private void mobile_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobile_txtKeyTyped
        char t=evt.getKeyChar();
            if(!Character.isDigit(t)){
            
                evt.consume();
            }
    }//GEN-LAST:event_mobile_txtKeyTyped

    private void office_no_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_office_no_txtKeyTyped
        char t=evt.getKeyChar();
            if(!Character.isDigit(t)){
            
                evt.consume();
            }
    }//GEN-LAST:event_office_no_txtKeyTyped

    private void update_supplier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_supplier_btnActionPerformed
       String supCode = sup_code_txt.getText();
        String honro = jComboBox1.getSelectedItem().toString();
        String supName = supplier_name_txt.getText();
        String bankName = supplier_bank_name_txt.getText();
        int accNo = Integer.parseInt(suupler_account_num_txt.getText());

        String address = address_name_txt.getText();
        String add01 = address_1_txt.getText();
        String add02 = address_2_txt.getText();
        String city = city_txt.getText();
        String postal = postal_code_txt.getText();

        int mobile = Integer.parseInt(mobile_txt.getText());
        int officeNo = Integer.parseInt(office_no_txt.getText());
        String email = email_txt.getText();
        String website = supplier_website_txt.getText();

        ResultSet rs;

        try {

            //rs = ConnDB.iud("update suppliers SET honorofics ='" + honro + "' , supplier_name='" + supName + "', address_name='" + address + "', address_line1='" + add01 + "', address_line2='" + add02 + "', city='" + city + "', postal_code= '" + postal + "', mobile_number='" + mobile + "' , office_phone='" + officeNo + "', emial='" + email + "', bank_name='" + bankName + "', bank_account_number='" + accNo + "', website='" + website + "' WHERE supplier_code='" + supCode + "'  ");
            ConnDB.iud("update suppliers SET honorifics ='" + honro + "' , supplier_name='" + supName + "', address_name='" + address + "', address_line1='" + add01 + "', address_line2='" + add02 + "', city='" + city + "', postal_code= '" + postal + "', mobile_number='" + mobile + "' , office_phone='" + officeNo + "', email='" + email + "', bank_name='" + bankName + "', bank_account_number='" + accNo + "', website='" + website + "' WHERE supplier_code='" + supCode + "'  ");
            
            
        } catch (Exception e) {
            e.printStackTrace();       
        }
        
        clear_text();
    }//GEN-LAST:event_update_supplier_btnActionPerformed

    private void delete_supplier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_supplier_btnActionPerformed
       ResultSet rs;

        try {

            //rs = ConnDB.search("delete from suppliers where supplier_code='" + sup_code_txt.getText() + "' ");
            ConnDB.iud("UPDATE suppliers set status='innactive' WHERE supplier_code='"+sup_code_txt.getText()+"' " );
            

        } catch (Exception e) {
            
            e.printStackTrace();

        }

        clear_text();
    }//GEN-LAST:event_delete_supplier_btnActionPerformed

    private void search_supplier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_supplier_btnActionPerformed
        
        ResultSet rs;

        try {

            rs = ConnDB.search("select * from suppliers where supplier_code='" + sup_code_txt.getText() + "' ");
            if (rs.next()) {

                jComboBox1.setSelectedItem(rs.getString("honorifics"));
                supplier_name_txt.setText(rs.getString("supplier_name"));
                supplier_bank_name_txt.setText(rs.getString("bank_name"));
                suupler_account_num_txt.setText(rs.getString("bank_account_number"));
                address_name_txt.setText(rs.getString("address_name"));
                address_1_txt.setText(rs.getString("address_line1"));
                address_2_txt.setText(rs.getString("address_line2"));
                city_txt.setText(rs.getString("city"));
                postal_code_txt.setText(rs.getString("postal_code"));
                mobile_txt.setText(rs.getString("mobile_number"));
                office_no_txt.setText(rs.getString("office_phone"));
                email_txt.setText(rs.getString("email"));
                supplier_website_txt.setText(rs.getString("website"));

            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }//GEN-LAST:event_search_supplier_btnActionPerformed

    private void view_suppliers_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_suppliers_btnActionPerformed
        
        ResultSet rs;

        try {

            DefaultTableModel dtm = (DefaultTableModel) view_suppliers_jt.getModel();
            dtm.setRowCount(0);

            
            rs = ConnDB.search("select * from suppliers");
           
            while (rs.next()) {
                
                
                Vector v = new Vector();

                v.add(rs.getString("supplier_code"));
                v.add(rs.getString("supplier_name"));
                v.add(rs.getString("address_name"));
                v.add(rs.getString("address_line1"));
                v.add(rs.getString("address_line2"));
                v.add(rs.getString("city"));
                v.add(rs.getString("postal_code"));
                v.add(rs.getString("mobile_number"));
                v.add(rs.getString("office_phone"));
                v.add(rs.getString("email"));
                v.add(rs.getString("website"));
                v.add(rs.getString("status"));

                dtm.addRow(v);
                

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_view_suppliers_btnActionPerformed

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
            java.util.logging.Logger.getLogger(suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_new_supplier_clear_btn;
    private javax.swing.JButton add_supplier_btn;
    private javax.swing.JTextField address_1_txt;
    private javax.swing.JTextField address_2_txt;
    private javax.swing.JTextField address_name_txt;
    private javax.swing.JTextField city_txt;
    private javax.swing.JButton delete_supplier_btn;
    private javax.swing.JTextField email_txt;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField mobile_txt;
    private javax.swing.JTextField office_no_txt;
    private javax.swing.JTextField postal_code_txt;
    private javax.swing.JButton search_supplier_btn;
    private javax.swing.JTextField sup_code_txt;
    private javax.swing.JTextField supplier_bank_name_txt;
    private javax.swing.JTextField supplier_name_txt;
    private javax.swing.JTextField supplier_website_txt;
    private javax.swing.JTextField suupler_account_num_txt;
    private javax.swing.JButton update_supplier_btn;
    private javax.swing.JButton view_suppliers_btn;
    private javax.swing.JTable view_suppliers_jt;
    // End of variables declaration//GEN-END:variables

    private void createSupCode() {
          
        try{
        
               ResultSet rs = ConnDB.search("select suppliers from prifixes where prifix_id='1' ");
          
            if (rs.next()) {
               String name=(rs.getString("suppliers"));
                
                
                   rs=ConnDB.search("select count(supplier_code) as x from suppliers");
                  if(rs.next()){
                   int i=Integer.parseInt(rs.getString("x"));
                  i++;
                  
                  if(i<10){
                    sup_code_txt.setText(name+"000"+i);
                  }else if(i<100){
                  
                  sup_code_txt.setText(name+"00"+i);
                  }else if(i<1000){
                    sup_code_txt.setText(name+"0"+i);
                  }
               
                     supplier_name_txt.grabFocus();
        }
                
                
            }
            
             
        } catch (Exception ex) {
                ex.printStackTrace();
        }
    }
    
    
     public void clear_text(){
    
        sup_code_txt.setText(null);
        jComboBox1.setSelectedIndex(0);
        supplier_name_txt.setText(null);
        supplier_bank_name_txt.setText(null);
        suupler_account_num_txt.setText(null);
        address_name_txt.setText(null);
        address_1_txt.setText(null);
        address_2_txt.setText(null);
        city_txt.setText(null);
        postal_code_txt.setText(null);
        mobile_txt.setText(null);
        office_no_txt.setText(null);
        email_txt.setText(null);
        supplier_website_txt.setText(null);
        
        DefaultTableModel dtm = (DefaultTableModel) view_suppliers_jt.getModel();
        dtm.setRowCount(0);
        
    
    
    }
    
}
