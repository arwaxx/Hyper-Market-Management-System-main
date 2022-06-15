package com.mycompany.supermarket_project;

import com.mycompany.supermarket_project.model.Product;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InventoryForm extends javax.swing.JFrame {

    public InventoryForm() {
        initComponents();
        refreshShowTables();
    }
    
    private boolean checkEmptyInputs(){
        if(idInput.getText().length()==0||
                nameInput.getText().length()==0||
                quantityInput.getText().length()==0||
                minQuantityInput.getText().length()==0||
                priceInput.getText().length()==0||
                expireDateChooseer.getDate()==null||
                descriptionInput_.getText().length()==0){
            JOptionPane.showMessageDialog(this, "You have entered All Fields");
            return false;
        }
        return true;
    }
    
    private void refreshShowTables(){
            addDataToTable();
            addDataToExpiredNotifyTable();
            addDataToquantityNotifyTable();
    }
   
    private void clearForm(){
        idInput.setText("");
        nameInput.setText("");
        quantityInput.setText("");
        minQuantityInput.setText("");
        priceInput.setText("");
        expireDateChooseer.setDate(new Date());
        descriptionInput_.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        idLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        quantityLbl = new javax.swing.JLabel();
        minQuantityLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        expireDateLbl = new javax.swing.JLabel();
        descriptionLbl = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        quantityInput = new javax.swing.JTextField();
        minQuantityInput = new javax.swing.JTextField();
        expireDateChooseer = new com.toedter.calendar.JDateChooser();
        priceInput = new javax.swing.JTextField();
        descriptionInput = new javax.swing.JScrollPane();
        descriptionInput_ = new javax.swing.JTextArea();
        addNewBtn = new javax.swing.JButton();
        editProductBtn = new javax.swing.JButton();
        deleteProductBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchResultTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        quantityTableLbl = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        quantityNotificationTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        expireNotificationTableTable = new javax.swing.JTable();
        expireLbl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        chngInfoBtn = new javax.swing.JMenu();
        signOutBtn1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Panel");

        idLbl.setText("Id");
        idLbl.setName(""); // NOI18N

        nameLbl.setText("Name");

        quantityLbl.setText("Quantity");

        minQuantityLbl.setText("Minimum Quantity");

        priceLbl.setText("Price");

        expireDateLbl.setText("Expire Date");

        descriptionLbl.setText("Description");

        expireDateChooseer.setDateFormatString("yyyy-MM-dd");

        descriptionInput_.setColumns(20);
        descriptionInput_.setRows(5);
        descriptionInput.setViewportView(descriptionInput_);

        addNewBtn.setLabel("Add Product");
        addNewBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewBtnMouseClicked(evt);
            }
        });

        editProductBtn.setLabel("Update Info");
        editProductBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProductBtnMouseClicked(evt);
            }
        });

        deleteProductBtn.setLabel("Delete Product");
        deleteProductBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteProductBtnMouseClicked(evt);
            }
        });

        searchBtn.setLabel("Search");
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });

        searchResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Quantity", "Min Quantity", "Price", "Expire Date", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchResultTable.setMinimumSize(new java.awt.Dimension(50, 50));
        searchResultTable.setShowGrid(true);
        jScrollPane2.setViewportView(searchResultTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addNewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(minQuantityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(minQuantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(quantityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(quantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(priceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(priceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(expireDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(descriptionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(descriptionInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(expireDateChooseer, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editProductBtn)
                    .addComponent(addNewBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteProductBtn)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minQuantityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minQuantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(priceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(priceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(expireDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(expireDateChooseer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(descriptionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descriptionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(726, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Products    ", jPanel1);

        quantityTableLbl.setText("Quantity less tha minimum");

        quantityNotificationTable.setBackground(new java.awt.Color(255, 0, 0));
        quantityNotificationTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quantityNotificationTable.setForeground(new java.awt.Color(255, 255, 255));
        quantityNotificationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Quantity", "Min Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(quantityNotificationTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(quantityTableLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(quantityTableLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        expireNotificationTableTable.setBackground(new java.awt.Color(255, 0, 0));
        expireNotificationTableTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        expireNotificationTableTable.setForeground(new java.awt.Color(255, 255, 255));
        expireNotificationTableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Expire Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        expireNotificationTableTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expireNotificationTableTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(expireNotificationTableTable);

        expireLbl.setText("Close To Expire Products");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expireLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(expireLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 114, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 294, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1048, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Notifications    ", jPanel2);

        chngInfoBtn.setText("Change My Information");
        chngInfoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chngInfoBtnMouseClicked(evt);
            }
        });
        jMenuBar1.add(chngInfoBtn);

        signOutBtn1.setText("Sign Out");
        signOutBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOutBtn1MouseClicked(evt);
            }
        });
        jMenuBar1.add(signOutBtn1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signOutBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutBtn1MouseClicked
        // TODO add your handling code here:
        Supermarket.signout();
        this.dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_signOutBtn1MouseClicked

    private void chngInfoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chngInfoBtnMouseClicked
        // TODO add your handling code here:
        new ChangeOwnInfoForm().setVisible(true);
    }//GEN-LAST:event_chngInfoBtnMouseClicked

    private void addNewBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewBtnMouseClicked
        // TODO add your handling code here:
        if(checkEmptyInputs()&&
                utility.Utilities.isValidLong(this, idInput.getText())&&
                !utility.Utilities.isProductIdExist(this, Long.parseLong(idInput.getText()))&&
                utility.Utilities.isValidInteger(this, quantityInput.getText())&&
                utility.Utilities.isValidInteger(this, minQuantityInput.getText())&&
                utility.Utilities.isValidDouble(this, priceInput.getText())){
                    Supermarket.productList.add(new Product(Long.parseLong(idInput.getText()), nameInput.getText(),
                    Integer.parseInt(quantityInput.getText()), Integer.parseInt(minQuantityInput.getText()),
                    expireDateChooseer.getDate(),Double.parseDouble(priceInput.getText()), descriptionInput_.getText()));
                    refreshShowTables();
                    utility.Utilities.saveProductsToFile();
                    JOptionPane.showMessageDialog(this, "Product Added Successfully");
        }
    }//GEN-LAST:event_addNewBtnMouseClicked

    private void editProductBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProductBtnMouseClicked
        // TODO add your handling code here:
        if(checkEmptyInputs()&&
                utility.Utilities.isValidLong(this, idInput.getText())&&
                utility.Utilities.isValidInteger(this, quantityInput.getText())&&
                utility.Utilities.isValidInteger(this, minQuantityInput.getText())&&
                utility.Utilities.isValidDouble(this, priceInput.getText())){
                                long id=Long.parseLong(idInput.getText());
                    for (int i = 0; i < Supermarket.productList.size(); i++) {
                        if(Supermarket.productList.get(i).getId()==id){
                            Supermarket.productList.get(i).setName(nameInput.getText());
                            Supermarket.productList.get(i).setQuantity(Integer.parseInt(quantityInput.getText()));
                            Supermarket.productList.get(i).setMinQuantity(Integer.parseInt(minQuantityInput.getText()));
                            Supermarket.productList.get(i).setPrice(Double.parseDouble(priceInput.getText()));
                            Supermarket.productList.get(i).setExpireDate(expireDateChooseer.getDate());
                            Supermarket.productList.get(i).setDescription(descriptionInput_.getText());
                            refreshShowTables();
                            utility.Utilities.saveProductsToFile();
                            JOptionPane.showMessageDialog(this, "Info updated Successfully");
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(this, "Can't change The Product ID");
        }
    }//GEN-LAST:event_editProductBtnMouseClicked

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        // TODO add your handling code here:
        String input=JOptionPane.showInputDialog("Enter Employee ID");
        if(input.length()==0||!utility.Utilities.isValidLong(this, input)){
            //if user input empty string or non-numeric characters
            JOptionPane.showMessageDialog(this, "Invalid ID it should be numbers");
        }else{
            long id=Long.parseLong(input);
            for (int i = 0; i < Supermarket.productList.size(); i++) {
                if(Supermarket.productList.get(i).getId()==id){
                    Product product=Supermarket.productList.get(i);
                    idInput.setText(product.getId()+"");
                    nameInput.setText(product.getName());
                    quantityInput.setText(product.getQuantity()+"");
                    minQuantityInput.setText(product.getMinQuantity()+"");
                    priceInput.setText(product.getPrice()+"");
                    expireDateChooseer.setDate(product.getExpireDate());
                    descriptionInput_.setText(product.getDescription());
                    return;
                }
            }
            //If user search for non exist id
            JOptionPane.showMessageDialog(this, "This ID not exist in system");
            clearForm();
        }
    }//GEN-LAST:event_searchBtnMouseClicked

    private void deleteProductBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProductBtnMouseClicked
        // TODO add your handling code here:
         if(checkEmptyInputs()&&
                utility.Utilities.isValidLong(this, idInput.getText())&&
                utility.Utilities.isValidInteger(this, quantityInput.getText())&&
                utility.Utilities.isValidInteger(this, minQuantityInput.getText())&&
                utility.Utilities.isValidDouble(this, priceInput.getText())){
                
                long id=Long.parseLong(idInput.getText());
                for (int i = 0; i < Supermarket.productList.size(); i++) {
                    if(Supermarket.productList.get(i).getId()==id){
                        Supermarket.productList.remove(i);
                        refreshShowTables();
                        utility.Utilities.saveProductsToFile();
                        clearForm();
                        JOptionPane.showMessageDialog(this, "Product info deleted successfully");
                        return;
                    }
            }
            JOptionPane.showMessageDialog(this, "This ID isn't exist");
        }
    }//GEN-LAST:event_deleteProductBtnMouseClicked

    private void expireNotificationTableTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expireNotificationTableTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_expireNotificationTableTableMouseClicked
  
    private void addDataToTable(){ 
        DefaultTableModel tableModel=(DefaultTableModel)searchResultTable.getModel();
        tableModel.setRowCount(0);
        Object rowData[]=new Object[7];
        for (int i = 0; i < Supermarket.productList.size(); i++) {
            rowData[0]=Supermarket.productList.get(i).getId();
            rowData[1]=Supermarket.productList.get(i).getName();
            rowData[2]=Supermarket.productList.get(i).getQuantity();
            rowData[3]=Supermarket.productList.get(i).getMinQuantity();
            rowData[4]=Supermarket.productList.get(i).getPrice();
            rowData[5]=Supermarket.productList.get(i).getExpireDate().toString();
            rowData[6]=Supermarket.productList.get(i).getDescription();
            tableModel.addRow(rowData);
        }
    }
    
    private void addDataToExpiredNotifyTable(){
        List<Product> searchProductList=new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 1);
        Date nextYear = cal.getTime();
        for (int i = 0; i < Supermarket.productList.size(); i++) {
            if(Supermarket.productList.get(i).getExpireDate().before(nextYear)){
                searchProductList.add(Supermarket.productList.get(i));
            }
        }
        DefaultTableModel tableModel=(DefaultTableModel)expireNotificationTableTable.getModel();
        tableModel.setRowCount(0);
        Object rowData[]=new Object[3];
        for (int i = 0; i < searchProductList.size(); i++) {
            rowData[0]=searchProductList.get(i).getId();
            rowData[1]=searchProductList.get(i).getName();
            rowData[2]=searchProductList.get(i).getExpireDate().toString();
            tableModel.addRow(rowData);
        }
    }
    
    private void addDataToquantityNotifyTable(){
        List<Product> searchProductList=new ArrayList<>();
        for (int i = 0; i < Supermarket.productList.size(); i++) {
            if(Supermarket.productList.get(i).getQuantity()<=Supermarket.productList.get(i).getMinQuantity()){
                searchProductList.add(Supermarket.productList.get(i));
            }
        }
        DefaultTableModel tableModel=(DefaultTableModel)quantityNotificationTable.getModel();
        tableModel.setRowCount(0);
        Object rowData[]=new Object[4];
        for (int i = 0; i < searchProductList.size(); i++) {
            rowData[0]=searchProductList.get(i).getId();
            rowData[1]=searchProductList.get(i).getName();
            rowData[2]=searchProductList.get(i).getQuantity();
            rowData[3]=searchProductList.get(i).getMinQuantity();
            tableModel.addRow(rowData);
        }
    }
    
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
            java.util.logging.Logger.getLogger(InventoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewBtn;
    private javax.swing.JMenu chngInfoBtn;
    private javax.swing.JButton deleteProductBtn;
    private javax.swing.JScrollPane descriptionInput;
    private javax.swing.JTextArea descriptionInput_;
    private javax.swing.JLabel descriptionLbl;
    private javax.swing.JButton editProductBtn;
    private com.toedter.calendar.JDateChooser expireDateChooseer;
    private javax.swing.JLabel expireDateLbl;
    private javax.swing.JLabel expireLbl;
    private javax.swing.JTable expireNotificationTableTable;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel idLbl;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField minQuantityInput;
    private javax.swing.JLabel minQuantityLbl;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField priceInput;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JTextField quantityInput;
    private javax.swing.JLabel quantityLbl;
    private javax.swing.JTable quantityNotificationTable;
    private javax.swing.JLabel quantityTableLbl;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable searchResultTable;
    private javax.swing.JMenu signOutBtn1;
    // End of variables declaration//GEN-END:variables
}
