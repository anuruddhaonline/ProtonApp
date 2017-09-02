/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UIL;


import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class inventory extends javax.swing.JFrame {

    stock_adjustment stock_adjustment = new stock_adjustment();
    Stock_count warehouse_transfers = new Stock_count();
    
    public inventory() {
        initComponents();
        createPro();
        readymade_product_type_tb.setSelected(true);
        product_name_txt.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        product_type_group = new javax.swing.ButtonGroup();
        inventory_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        product_id_txt = new javax.swing.JTextField();
        selling_price_txt = new javax.swing.JTextField();
        product_name_txt = new javax.swing.JTextField();
        pack_size_txt = new javax.swing.JTextField();
        product_category_cmb = new javax.swing.JComboBox();
        product_unit_cmb = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        assembled_product_type_tb = new javax.swing.JToggleButton();
        readymade_product_type_tb = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        component_product_type_tb = new javax.swing.JToggleButton();
        jLabel12 = new javax.swing.JLabel();
        stock_value_txt = new javax.swing.JTextField();
        bin_location_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        min_stock_txt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        max_stock_txt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        add_product_btn = new javax.swing.JButton();
        stock_adjust_btn = new javax.swing.JButton();
        stock_count_btn = new javax.swing.JButton();
        product_search_button = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        total_qty_txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        supplier_code_txt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        supplier_name_txt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        purchase_price_txt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        supplier_code_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        delete_product_btn = new javax.swing.JButton();
        update_product_btn = new javax.swing.JButton();
        add_new_pro_clear_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(140, 50, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inventory_panel.setBackground(new java.awt.Color(255, 255, 255));
        inventory_panel.setPreferredSize(new java.awt.Dimension(1300, 720));
        inventory_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ready-made Product");
        inventory_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

        product_id_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        product_id_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        product_id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_id_txtActionPerformed(evt);
            }
        });
        inventory_panel.add(product_id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 230, 30));

        selling_price_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        selling_price_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        inventory_panel.add(selling_price_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 230, 30));

        product_name_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        product_name_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        inventory_panel.add(product_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 230, 30));

        pack_size_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pack_size_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        pack_size_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pack_size_txtKeyTyped(evt);
            }
        });
        inventory_panel.add(pack_size_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 230, 30));

        product_category_cmb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        product_category_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        inventory_panel.add(product_category_cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 230, 30));

        product_unit_cmb.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        product_unit_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        inventory_panel.add(product_unit_cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 230, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Inventory");
        inventory_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Supplier Code :");
        inventory_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 520, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Product Name :");
        inventory_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Pack Size :");
        inventory_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Selling Price :");
        inventory_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Unit of Measure :");
        inventory_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Product Category :");
        inventory_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 390, -1, -1));

        product_type_group.add(assembled_product_type_tb);
        assembled_product_type_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toggle_off.png"))); // NOI18N
        assembled_product_type_tb.setContentAreaFilled(false);
        assembled_product_type_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toggle_on.png"))); // NOI18N
        assembled_product_type_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assembled_product_type_tbActionPerformed(evt);
            }
        });
        inventory_panel.add(assembled_product_type_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 40, -1));

        product_type_group.add(readymade_product_type_tb);
        readymade_product_type_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toggle_off.png"))); // NOI18N
        readymade_product_type_tb.setContentAreaFilled(false);
        readymade_product_type_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toggle_on.png"))); // NOI18N
        readymade_product_type_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readymade_product_type_tbActionPerformed(evt);
            }
        });
        inventory_panel.add(readymade_product_type_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 40, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Product Type :");
        inventory_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Assembled Product");
        inventory_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Component Product");
        inventory_panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        product_type_group.add(component_product_type_tb);
        component_product_type_tb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toggle_off.png"))); // NOI18N
        component_product_type_tb.setContentAreaFilled(false);
        component_product_type_tb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toggle_on.png"))); // NOI18N
        component_product_type_tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                component_product_type_tbActionPerformed(evt);
            }
        });
        inventory_panel.add(component_product_type_tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 40, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Total Quantity :");
        inventory_panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, -1, -1));

        stock_value_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        stock_value_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        inventory_panel.add(stock_value_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 290, 230, 30));

        bin_location_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bin_location_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        inventory_panel.add(bin_location_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, 230, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Bin Location :");
        inventory_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, -1, -1));

        min_stock_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        min_stock_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        inventory_panel.add(min_stock_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 230, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Min. Stock Level :");
        inventory_panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, -1));

        max_stock_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        max_stock_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        inventory_panel.add(max_stock_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 230, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Max. Stock Level :");
        inventory_panel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, -1, -1));

        add_product_btn.setBackground(new java.awt.Color(34, 155, 60));
        add_product_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_product_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_product_btn.setText("Save Product");
        add_product_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_product_btnActionPerformed(evt);
            }
        });
        inventory_panel.add(add_product_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 660, 130, -1));

        stock_adjust_btn.setBackground(new java.awt.Color(34, 155, 60));
        stock_adjust_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stock_adjust_btn.setForeground(new java.awt.Color(255, 255, 255));
        stock_adjust_btn.setText("Stock Adjustment");
        stock_adjust_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_adjust_btnActionPerformed(evt);
            }
        });
        inventory_panel.add(stock_adjust_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, -1, -1));

        stock_count_btn.setBackground(new java.awt.Color(34, 155, 60));
        stock_count_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stock_count_btn.setForeground(new java.awt.Color(255, 255, 255));
        stock_count_btn.setText("Stock Count");
        stock_count_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_count_btnActionPerformed(evt);
            }
        });
        inventory_panel.add(stock_count_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, -1, -1));

        product_search_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        product_search_button.setContentAreaFilled(false);
        product_search_button.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_hover.png"))); // NOI18N
        product_search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_search_buttonActionPerformed(evt);
            }
        });
        inventory_panel.add(product_search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 30, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Stock Value :");
        inventory_panel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Inventory Details");
        inventory_panel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, -1, -1));

        total_qty_txt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        total_qty_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        total_qty_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_qty_txtActionPerformed(evt);
            }
        });
        inventory_panel.add(total_qty_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, 230, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Purchase Details");
        inventory_panel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));
        inventory_panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1208, 10));

        supplier_code_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        inventory_panel.add(supplier_code_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 230, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Product Details");
        inventory_panel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Product ID :");
        inventory_panel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        supplier_name_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        supplier_name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplier_name_txtActionPerformed(evt);
            }
        });
        inventory_panel.add(supplier_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 230, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Supplier Name :");
        inventory_panel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        purchase_price_txt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5)));
        inventory_panel.add(purchase_price_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 230, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Purchase Price :");
        inventory_panel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 620, -1, -1));

        supplier_code_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        supplier_code_btn.setContentAreaFilled(false);
        supplier_code_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_hover.png"))); // NOI18N
        inventory_panel.add(supplier_code_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 30, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Code", "Supplier Name", "Purchase Price"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        inventory_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 650, 130));

        jButton1.setBackground(new java.awt.Color(34, 155, 60));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Price");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        inventory_panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 660, 120, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        inventory_panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 10, 340));
        inventory_panel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 1208, 10));

        delete_product_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_icon.png"))); // NOI18N
        delete_product_btn.setToolTipText("Delete Product");
        delete_product_btn.setContentAreaFilled(false);
        delete_product_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_icon_hover.png"))); // NOI18N
        inventory_panel.add(delete_product_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 30, 30));

        update_product_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update_icon.png"))); // NOI18N
        update_product_btn.setToolTipText("Update Product");
        update_product_btn.setContentAreaFilled(false);
        update_product_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update_icon_hover.png"))); // NOI18N
        inventory_panel.add(update_product_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 30, 30));

        add_new_pro_clear_btn.setBackground(new java.awt.Color(34, 155, 60));
        add_new_pro_clear_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_new_pro_clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_new_pro_clear_btn.setText("New");
        inventory_panel.add(add_new_pro_clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        getContentPane().add(inventory_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void assembled_product_type_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assembled_product_type_tbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assembled_product_type_tbActionPerformed

    private void readymade_product_type_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readymade_product_type_tbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_readymade_product_type_tbActionPerformed

    private void component_product_type_tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_component_product_type_tbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_component_product_type_tbActionPerformed

    private void add_product_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_product_btnActionPerformed
         try {
        double packSize =0.0;
        double sellingPrice=0.0;
       
        String productID =(product_id_txt.getText());

        String productName = product_name_txt.getText();
        packSize = Double.parseDouble(pack_size_txt.getText());
        sellingPrice = Double.parseDouble(selling_price_txt.getText());
        String unitOfMes = product_category_cmb.getSelectedItem().toString();
        String category = product_category_cmb.getSelectedItem().toString();
        String bin=bin_location_txt.getText();
        double min=Double.parseDouble(min_stock_txt.getText());
        double max=Double.parseDouble(max_stock_txt.getText());
        double value=Double.parseDouble(stock_value_txt.getText());
        String qty=total_qty_txt.getText();
        double qty1=Double.parseDouble(qty);
        
        
        String productType=null;
        if(readymade_product_type_tb.isSelected()){
        
            productType="readyMade";
        
        }
        
        else if(component_product_type_tb.isSelected()){
        
            productType ="componentProduct";
        
        }
        
        else if(assembled_product_type_tb.isSelected()){
        
            productType ="assembledProduct";
        
        }
        
        
        
        if(productID.isEmpty()||productName.isEmpty() || pack_size_txt.getText().isEmpty() || selling_price_txt.getText().isEmpty() || unitOfMes.isEmpty() || category.isEmpty() || productType.isEmpty() ){}
        
         
            ConnDB.iud("insert into product values('"+productID+"','"+productName+"','"+unitOfMes+"','"+category+"','"+ packSize+"','"+productType+"','"+ sellingPrice+"')");
              ConnDB.iud("INSERT INTO inventory( product_code, bin_location, min_stock_level, max_stock_level, qty, stock_value) values('"+productID+"','"+bin+"','"+min+"','"+max+"','"+qty+"','"+value+"')");
         
         
           DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            Vector v = new Vector();

            for (int i = 0; i < dtm.getRowCount(); ++i) {

                String supCode = dtm.getValueAt(i, 0).toString();
                String supName = dtm.getValueAt(i, 1).toString();
                String price =dtm.getValueAt(i, 2).toString();
                double price1=Double.parseDouble(price);
                ConnDB.iud("insert into product_purchase(product_code,supplier_name,supplier_code,purchase_price) values('"+productID+"','"+supCode+"','"+supName+"','"+price1+"')");

            }
         
         
         
         
         } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        System.out.println("");
        
        
        
        
        
        
    }//GEN-LAST:event_add_product_btnActionPerformed

    private void product_id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_id_txtActionPerformed
        
        
        
        
        
    }//GEN-LAST:event_product_id_txtActionPerformed

    private void product_search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_search_buttonActionPerformed
        ResultSet rs;
        try {
            rs = ConnDB.search("select * from product where product_code='"+product_id_txt.getText()+"' ");
             if(rs.next()){
                 
          
           product_id_txt.setText(rs.getString("product_code"));
           product_name_txt.setText(rs.getString("product_name"));
           pack_size_txt.setText(rs.getString("pack_size"));
           product_unit_cmb.setSelectedItem(rs.getString("unit"));
           selling_price_txt.setText(rs.getString("selling_price"));
           product_category_cmb.setSelectedItem(rs.getString("product_category"));
           
           
             }
             
             rs = ConnDB.search("select * from inventory where product_code='"+product_id_txt.getText()+"' ");
             if(rs.next()){
                 
          
           bin_location_txt.setText(rs.getString("bin_location"));
           min_stock_txt.setText(rs.getString("min_stock_level"));
           max_stock_txt.setText(rs.getString("max_stock_level"));
           total_qty_txt.setText(rs.getString("qty"));
           stock_value_txt.setText(rs.getString("stock_value"));
           
           
             }
             
               
            DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
            dtm.setRowCount(0);
            
             Vector v=new Vector();
              rs = ConnDB.search("select * from product_purchase where product_code='"+product_id_txt.getText()+"' ");
             while(rs.next()){
                 
           v.add(rs.getString("supplier_code"));
           v.add(rs.getString("supplier_name"));
           v.add(rs.getString("purchase_price"));
           dtm.addRow(v);
           
           
             }
             
        } catch (Exception ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_product_search_buttonActionPerformed

    private void total_qty_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_qty_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_qty_txtActionPerformed

    private void supplier_name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplier_name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplier_name_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        Vector v=new Vector();
        v.add(supplier_code_txt.getText());
        v.add(supplier_name_txt.getText());
        v.add(purchase_price_txt.getText());
         
        
         dtm.addRow(v);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pack_size_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pack_size_txtKeyTyped
        
        String text=pack_size_txt.getText();
        


    }//GEN-LAST:event_pack_size_txtKeyTyped

    private void stock_adjust_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_adjust_btnActionPerformed
       
        stock_adjustment.setVisible(true);
        
    }//GEN-LAST:event_stock_adjust_btnActionPerformed

    private void stock_count_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_count_btnActionPerformed
        
        warehouse_transfers.setVisible(true);
        
    }//GEN-LAST:event_stock_count_btnActionPerformed

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
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_new_pro_clear_btn;
    private javax.swing.JButton add_product_btn;
    private javax.swing.JToggleButton assembled_product_type_tb;
    private javax.swing.JTextField bin_location_txt;
    private javax.swing.JToggleButton component_product_type_tb;
    private javax.swing.JButton delete_product_btn;
    private javax.swing.JPanel inventory_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField max_stock_txt;
    private javax.swing.JTextField min_stock_txt;
    private javax.swing.JTextField pack_size_txt;
    private javax.swing.JComboBox product_category_cmb;
    private javax.swing.JTextField product_id_txt;
    private javax.swing.JTextField product_name_txt;
    private javax.swing.JButton product_search_button;
    private javax.swing.ButtonGroup product_type_group;
    private javax.swing.JComboBox product_unit_cmb;
    private javax.swing.JTextField purchase_price_txt;
    private javax.swing.JToggleButton readymade_product_type_tb;
    private javax.swing.JTextField selling_price_txt;
    private javax.swing.JButton stock_adjust_btn;
    private javax.swing.JButton stock_count_btn;
    private javax.swing.JTextField stock_value_txt;
    private javax.swing.JButton supplier_code_btn;
    private javax.swing.JTextField supplier_code_txt;
    private javax.swing.JTextField supplier_name_txt;
    private javax.swing.JTextField total_qty_txt;
    private javax.swing.JButton update_product_btn;
    // End of variables declaration//GEN-END:variables



  private void createPro() {
 try {
            
            ResultSet rs=ConnDB.search("select count(product_code) as x from product");
        if(rs.next()){
        int i=Integer.parseInt(rs.getString("x"));
        i++;
        product_id_txt.setText("PRO"+i);
        product_name_txt.grabFocus();
        }
        
        
        } catch (Exception ex) {
            
        }
    }



}
