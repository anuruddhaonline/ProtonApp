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
public class purchase extends javax.swing.JFrame {

    
    supplier_returns supplier_returns = new supplier_returns();
    view_purchase view_purchase = new view_purchase();
    grn grn = new grn();

    double totalAmount;
    double totalQty;
     String code;
    
    String supCode;
       String id;
    
    
    public purchase() {
        initComponents();
        createPurchaseCode();
        supplier_id_txt.grabFocus();
        qty_txt.setEnabled(false);
        jScrollPane2.setVisible(false);
        jList1.setVisible(false);
        supplier_id_txt.grabFocus();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        supplier_name_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_list_table = new javax.swing.JTable();
        supplier_id_txt = new javax.swing.JTextField();
        pu_order_Id = new javax.swing.JTextField();
        complete_print_invoice_btn = new javax.swing.JButton();
        complete_invoice_btn = new javax.swing.JButton();
        total_amountl_lbl = new javax.swing.JLabel();
        total_qty_lbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        qty_txt = new javax.swing.JTextField();
        search_purchase_order_btn = new javax.swing.JButton();
        search_supplier_btn = new javax.swing.JButton();
        supplier_return_btn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        view_purchase_btn = new javax.swing.JButton();
        product_name_cmb = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        unit_price_txt = new javax.swing.JTextField();
        add_new_purchase_clear_btn = new javax.swing.JButton();
        delete_product_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(140, 50, 0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1230, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("Purchase");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Purchase Order ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Purchase Order ID :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Supplier Name :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Product Name :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Total Quantity : ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Total Amount :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        supplier_name_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        supplier_name_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        supplier_name_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                supplier_name_txtKeyReleased(evt);
            }
        });
        jPanel1.add(supplier_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 230, 30));

        product_list_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        product_list_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Name", "Unit Price", "Quantity", "Sub Total"
            }
        ));
        product_list_table.setRowHeight(20);
        jScrollPane1.setViewportView(product_list_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 1130, 220));

        supplier_id_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        supplier_id_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(supplier_id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 230, 30));

        pu_order_Id.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pu_order_Id.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        jPanel1.add(pu_order_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 230, 30));

        complete_print_invoice_btn.setBackground(new java.awt.Color(34, 155, 60));
        complete_print_invoice_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        complete_print_invoice_btn.setForeground(new java.awt.Color(255, 255, 255));
        complete_print_invoice_btn.setText("Complete & Print");
        complete_print_invoice_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complete_print_invoice_btnActionPerformed(evt);
            }
        });
        jPanel1.add(complete_print_invoice_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 660, -1, -1));

        complete_invoice_btn.setBackground(new java.awt.Color(34, 155, 60));
        complete_invoice_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        complete_invoice_btn.setForeground(new java.awt.Color(255, 255, 255));
        complete_invoice_btn.setText("Complete");
        complete_invoice_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complete_invoice_btnActionPerformed(evt);
            }
        });
        jPanel1.add(complete_invoice_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 660, -1, -1));

        total_amountl_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total_amountl_lbl.setText(" 0.0");
        jPanel1.add(total_amountl_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 70, -1));

        total_qty_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total_qty_lbl.setText("0");
        jPanel1.add(total_qty_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 670, 70, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Quantity :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 340, -1, -1));

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jList1MouseEntered(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 230, 60));

        qty_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        qty_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        qty_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty_txtActionPerformed(evt);
            }
        });
        qty_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty_txtKeyTyped(evt);
            }
        });
        jPanel1.add(qty_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 230, 30));

        search_purchase_order_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        search_purchase_order_btn.setContentAreaFilled(false);
        search_purchase_order_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_hover.png"))); // NOI18N
        search_purchase_order_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_purchase_order_btnActionPerformed(evt);
            }
        });
        jPanel1.add(search_purchase_order_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 30, 30));

        search_supplier_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        search_supplier_btn.setContentAreaFilled(false);
        search_supplier_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_hover.png"))); // NOI18N
        search_supplier_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_supplier_btnActionPerformed(evt);
            }
        });
        jPanel1.add(search_supplier_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 30, 30));

        supplier_return_btn.setBackground(new java.awt.Color(34, 155, 60));
        supplier_return_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supplier_return_btn.setForeground(new java.awt.Color(255, 255, 255));
        supplier_return_btn.setText("Supplier Return");
        supplier_return_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplier_return_btnActionPerformed(evt);
            }
        });
        jPanel1.add(supplier_return_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1208, 10));

        view_purchase_btn.setBackground(new java.awt.Color(34, 155, 60));
        view_purchase_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        view_purchase_btn.setForeground(new java.awt.Color(255, 255, 255));
        view_purchase_btn.setText("View Purchase");
        view_purchase_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_purchase_btnActionPerformed(evt);
            }
        });
        jPanel1.add(view_purchase_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, -1, -1));

        product_name_cmb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        product_name_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Product" }));
        product_name_cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_name_cmbActionPerformed(evt);
            }
        });
        jPanel1.add(product_name_cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 230, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Supplier ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Unit Price :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        unit_price_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        unit_price_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        unit_price_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unit_price_txtActionPerformed(evt);
            }
        });
        unit_price_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unit_price_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unit_price_txtKeyTyped(evt);
            }
        });
        jPanel1.add(unit_price_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 230, 30));

        add_new_purchase_clear_btn.setBackground(new java.awt.Color(34, 155, 60));
        add_new_purchase_clear_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_new_purchase_clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_new_purchase_clear_btn.setText("New");
        add_new_purchase_clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_new_purchase_clear_btnActionPerformed(evt);
            }
        });
        jPanel1.add(add_new_purchase_clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        delete_product_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_icon.png"))); // NOI18N
        delete_product_btn.setToolTipText("Delete Product");
        delete_product_btn.setContentAreaFilled(false);
        delete_product_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_icon_hover.png"))); // NOI18N
        delete_product_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_product_btnActionPerformed(evt);
            }
        });
        jPanel1.add(delete_product_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 390, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void complete_invoice_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complete_invoice_btnActionPerformed
               
      String purchaseId= pu_order_Id.getText();

       String supplier_code=supCode;

       
        
        
        try {
         
            ConnDB.iud("insert into purchase_order values('"+purchaseId+"','"+supplier_id_txt.getText()+"','"+ supplier_name_txt.getText()+"')");
           
           DefaultTableModel dtm = (DefaultTableModel) product_list_table.getModel();
            Vector v = new Vector();

            for (int i = 0; i < dtm.getRowCount(); ++i) {

                String pro_code = dtm.getValueAt(i, 0).toString();
                String pro_name = dtm.getValueAt(i, 1).toString();
                
                String unit_price = dtm.getValueAt(i, 2).toString();
                String qty001 = dtm.getValueAt(i,3).toString();
                String sub_total = dtm.getValueAt(i, 4).toString();
                
                double unit2=Double.parseDouble(unit_price);
                double qty02=Double.parseDouble(qty001);
                double sub2=Double.parseDouble(sub_total);
                
                ConnDB.iud("insert into purchase_items (purchase_order_id,product_code,product_name,unit_price, qty,subtotal) values('"+purchaseId+"','"+pro_code+"','"+pro_name+"','"+unit2+"','"+ qty02+"','"+sub2+"')");
             
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }

       

    }//GEN-LAST:event_complete_invoice_btnActionPerformed

    private void supplier_return_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplier_return_btnActionPerformed
        
        
        supplier_returns.setVisible(true);
        
    }//GEN-LAST:event_supplier_return_btnActionPerformed

    private void view_purchase_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_purchase_btnActionPerformed
        
        view_purchase.setVisible(true);
        
    }//GEN-LAST:event_view_purchase_btnActionPerformed

    private void unit_price_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unit_price_txtActionPerformed
         qty_txt.setEditable(true);
    }//GEN-LAST:event_unit_price_txtActionPerformed

    private void product_name_cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_name_cmbActionPerformed
      
        
        try{
        String selectedPrice=null;
      
        if(product_name_cmb.getSelectedItem().equals("Select Product")){
        
        }else
        {
        
        selectedPrice=product_name_cmb.getSelectedItem().toString();
       
        ResultSet rs;
        
        try {
            
           rs=ConnDB.search("select * from product where product_name='"+selectedPrice+"'");
            while(rs.next()){
        id =rs.getString("product_code");
            rs=ConnDB.search("select * from product_purchase where product_code='"+id+"' and supplier_code='"+supplier_id_txt.getText()+"'");
               if(rs.next()){ 
                unit_price_txt.setText(rs.getString("purchase_price"));
                qty_txt.setEnabled(true);
                qty_txt.grabFocus();
               }
              }  
            
        } 
        catch (Exception e) {
            
            e.printStackTrace();
        }
        
        } }catch(Exception e){
        
        
        }
    }//GEN-LAST:event_product_name_cmbActionPerformed

    private void qty_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty_txtActionPerformed
    double max=0.0;
    double qty1=0.0;
    double qty=Double.parseDouble(qty_txt.getText());
    double unit=Double.parseDouble(unit_price_txt.getText());
        
    
    if(qty_txt.getText().length()==0){
      
        
        }else{
        
        
           
            
            try {
                   ResultSet rs=ConnDB.search("select * from inventory where product_code='"+id+"'");
                   if(rs.next()){
                   
                       max=Double.parseDouble(rs.getString("max_stock_level"));
                       qty1=Double.parseDouble(rs.getString("qty"));
                     qty+=qty1; 
                   
                   }
            } catch (Exception e) {
            }
        
       
        if(qty<=max){
            
        double subTot= (qty*unit);
        
         String exsist="No";
         Vector v = new Vector();
         DefaultTableModel dtm = (DefaultTableModel) product_list_table.getModel();

        for (int i = 0; i < dtm.getRowCount(); ++i) {
            System.out.println("ok");
             System.out.println(code);
            if (dtm.getValueAt(i, 0).equals(id)) {
                System.out.println(code);
                exsist = "yes";
               double qty2,qtyText,dis,sub;
                qty2 = (double) dtm.getValueAt(i, 3);

                qtyText = Double.parseDouble(qty_txt.getText());
                
                qty2+=qtyText;
                double qtyTable=qty2+qty1;
               
                System.out.println(qtyTable);
              if(qtyTable<=max){
 
                
                dtm.setValueAt(qty2, i, 3);

               
                sub = (double) dtm.getValueAt(i, 4);
                double subText = Double.parseDouble(qty_txt.getText()) * Double.parseDouble(unit_price_txt.getText());
                sub+=subText;
              
             
                dtm.setValueAt(sub, i, 4);
                
                
                totalAmount = totalAmount + subTot;
                totalQty=totalQty+qty;
                
               
                
                calTot();
                
                supplier_id_txt.setEditable(false);
                qty_txt.setText(null);
                unit_price_txt.setText(null);
                supplier_name_txt.setEditable(false);
                product_name_cmb.setSelectedIndex(0);
                qty_txt.setEnabled(false);

            }else{
        
            System.out.println("cvvvb");
        }
            }
        }
        
        
        
        if (exsist != "yes" || dtm.getRowCount() == 0) {
             
            v.add(id);
            v.add(supplier_name_txt.getText());
            v.add(unit_price_txt.getText());

           double r = Double.parseDouble(qty_txt.getText());
            v.add(r);
            
            
            
            Double d = Double.parseDouble(qty_txt.getText()) * Double.parseDouble(unit_price_txt.getText());
          
            
            v.add(d);
            dtm.addRow(v);
              
                
                calTot();
                
                  
                supplier_id_txt.setEditable(false);
                qty_txt.setText(null);
                unit_price_txt.setText(null);
                supplier_name_txt.setEditable(false);
              
                 product_name_cmb.setSelectedIndex(0);
                qty_txt.setEnabled(false);
                calTot();

        }
             
                 

             
        }else{
        
            System.out.println("exceed maximum count "+qty1+"");
        
        
        }
    
        
        }
        
        
        
        
                  
    }//GEN-LAST:event_qty_txtActionPerformed

    private void search_supplier_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_supplier_btnActionPerformed
       
      
        String sup_id=supplier_id_txt.getText();

        product_name_cmb.removeAllItems();
        product_name_cmb.addItem("select Product");
         
        ResultSet rs;
        
        try {
            
            rs=ConnDB.search("select * from suppliers where supplier_code='"+sup_id+"'");
            while(rs.next()){
            
                supplier_name_txt.setText(rs.getString("supplier_name"));
                
            
            }
            
                        rs=ConnDB.search("select * from product_purchase where supplier_code='"+supplier_id_txt.getText()+"'");
                // WHERE product_code='"+product_id_txt.getText()+"'
                while(rs.next()){
                  code =rs.getString("product_code");
          
                  ResultSet   rs1=ConnDB.search("select * from product where product_code='"+code+"'");
                  System.out.println(code);
                    
              while(rs1.next()){     
              product_name_cmb.addItem(rs1.getString("product_name"));
               String product =rs1.getString("product_code");
              }
              
                
                }
    
        } 
        catch (Exception e) {
        e.printStackTrace();
        
        }
    }//GEN-LAST:event_search_supplier_btnActionPerformed

    private void delete_product_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_product_btnActionPerformed
        DefaultTableModel df = (DefaultTableModel) product_list_table.getModel();
        try {
            int selectedIndex = product_list_table.getSelectedRow();
           
          double totLb=Double.parseDouble(total_amountl_lbl.getText());
          double qtyLb=Double.parseDouble(total_qty_lbl.getText());
          double totTable=(double) df.getValueAt(selectedIndex, 4);
          double qtyTable=(double) df.getValueAt(selectedIndex, 3);
          qtyLb-=qtyTable;
          totLb-=totTable;
          total_amountl_lbl.setText(totLb+"");
          total_qty_lbl.setText(qtyLb+"");
          totalAmount=0;
            totalQty=0;
            
             df.removeRow(selectedIndex);
           
        } catch (Exception e) {
        }
    }//GEN-LAST:event_delete_product_btnActionPerformed

    private void add_new_purchase_clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_new_purchase_clear_btnActionPerformed
   
        
        DefaultTableModel dtm=(DefaultTableModel)product_list_table.getModel();
        dtm.setRowCount(0);
        
        pu_order_Id.setText(null);
        supplier_id_txt.setText(null);
        supplier_name_txt.setText(null);
        
        qty_txt.setText(null);
        unit_price_txt.setText(null);
        
        total_amountl_lbl.setText(null);
        total_qty_lbl.setText(null);
        
        pu_order_Id.grabFocus();
        createPurchaseCode();
        
        
        
    }//GEN-LAST:event_add_new_purchase_clear_btnActionPerformed

    private void qty_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty_txtKeyTyped
          char t=evt.getKeyChar();
           if(!Character.isDigit(t)){
            
                evt.consume();
            }
    }//GEN-LAST:event_qty_txtKeyTyped

    private void unit_price_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unit_price_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_unit_price_txtKeyReleased

    private void unit_price_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unit_price_txtKeyTyped
           char t=evt.getKeyChar();
            if(!Character.isDigit(t)){
           
                evt.consume();
            }
    }//GEN-LAST:event_unit_price_txtKeyTyped

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String name1 = jList1.getSelectedValue().toString();
        supplier_name_txt.setText(jList1.getSelectedValue().toString());
        jList1.setVisible(false);
        jScrollPane2.setVisible(false);

        try {

            ResultSet rs = ConnDB.search("select * from suppliers where supplier_name like '" + supplier_name_txt.getText() + "%' and status='active' ");
            Vector v = new Vector();
            while (rs.next()) {
                supplier_id_txt.setText(rs.getString("supplier_code"));
              
                jList1.setListData(v);

            }
            
            
                rs=ConnDB.search("select * from product_purchase where supplier_code='"+supplier_id_txt.getText()+"'");
              
                while(rs.next()){
                  code =rs.getString("product_code");
          
                  ResultSet   rs1=ConnDB.search("select * from product where product_code='"+code+"'");
                  System.out.println(code);
                    
              while(rs1.next()){     
              product_name_cmb.addItem(rs1.getString("product_name"));
               String product =rs1.getString("product_code");
              }
                
                }

            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed

    }//GEN-LAST:event_jList1KeyPressed

    private void jList1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1MouseEntered

    private void supplier_name_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplier_name_txtKeyReleased
         try {

            int i = supplier_name_txt.getText().length();
            if (i == 0) {
                System.out.println("4444");
                jScrollPane2.setVisible(false);
                jList1.setVisible(false);

            } else {
                ResultSet rs = ConnDB.search("select * from suppliers where supplier_name like '" + supplier_name_txt.getText() + "%' and status='active' ");
                Vector v = new Vector();
                while (rs.next()) {
                   
                    v.add(rs.getString("supplier_name"));
                    jScrollPane2.setVisible(true);
                    jList1.setVisible(true);

                }
                jList1.setListData(v);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_supplier_name_txtKeyReleased

    private void complete_print_invoice_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complete_print_invoice_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complete_print_invoice_btnActionPerformed

    private void search_purchase_order_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_purchase_order_btnActionPerformed
       
        String poID=pu_order_Id.getText();
        
        try {
            
            ResultSet rs=ConnDB.search("select * from purchase_order purchase_order where ='"+poID+"' ");
            
            supplier_id_txt.setText(rs.getString("supplier_code"));
            supplier_name_txt.setText(rs.getString("supplier_name"));
            
            
            
        } catch (Exception e) {
        
        e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_search_purchase_order_btnActionPerformed

    
    
    public void calTot(){
        
             double qty1=0;
             double sub=0;
           
     DefaultTableModel dtm=(DefaultTableModel)product_list_table.getModel();
        double tot=0;
        for(int i= 0;i<dtm.getRowCount();i++){
           
            String qty=dtm.getValueAt(i, 3).toString();
            String subTbale=dtm.getValueAt(i, 4).toString();
             
           
             
              qty1+=Double.parseDouble(qty);
             sub+=Double.parseDouble(subTbale);
             
             
        }
        total_amountl_lbl.setText(sub+"");
        total_qty_lbl.setText(qty1+"");
       
        
    
    }
    
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
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_new_purchase_clear_btn;
    private javax.swing.JButton complete_invoice_btn;
    private javax.swing.JButton complete_print_invoice_btn;
    private javax.swing.JButton delete_product_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable product_list_table;
    private javax.swing.JComboBox product_name_cmb;
    private javax.swing.JTextField pu_order_Id;
    private javax.swing.JTextField qty_txt;
    private javax.swing.JButton search_purchase_order_btn;
    private javax.swing.JButton search_supplier_btn;
    private javax.swing.JTextField supplier_id_txt;
    private javax.swing.JTextField supplier_name_txt;
    private javax.swing.JButton supplier_return_btn;
    private javax.swing.JLabel total_amountl_lbl;
    private javax.swing.JLabel total_qty_lbl;
    private javax.swing.JTextField unit_price_txt;
    private javax.swing.JButton view_purchase_btn;
    // End of variables declaration//GEN-END:variables

    private void createPurchaseCode() {
        ResultSet rs;
            
        try{
        
             rs = ConnDB.search("select purchase_order from prifixes where prifix_id='1' ");
          
            if (rs.next()) {
               String name=(rs.getString("purchase_order"));
                
                
                   rs=ConnDB.search("select count(purchase_order_id) as x from purchase_order");
                  if(rs.next()){
                   int i=Integer.parseInt(rs.getString("x"));
                  i++;
                  
                  if(i<10){
                    pu_order_Id.setText(name+"000"+i);
                  }else if(i<100){
                  
                  pu_order_Id.setText(name+"00"+i);
                  }else if(i<1000){
                    pu_order_Id.setText(name+"0"+i);
                  }
               
                     supplier_name_txt.grabFocus();
        }
                
                
            }
            
             
        } catch (Exception ex) {
                ex.printStackTrace();
        } 

    }
}
