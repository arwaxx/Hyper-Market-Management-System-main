package com.mycompany.supermarket_project;

import com.mycompany.supermarket_project.model.Employee;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminForm extends javax.swing.JFrame {

    public AdminForm() {
        initComponents();
        for (String employeeRole : Supermarket.employeeRoles) {
            roleChoose.addItem(employeeRole);
        }
        roleChoose.setSelectedIndex(0);
        addDataToTable();
    }
    
    public boolean checkEmptyInputs(){
        if(idInput.getText().length()==0||
                nameInput.getText().length()==0||
                mobileInput.getText().length()==0||
                ageInput.getText().length()==0||
                emailInput.getText().length()==0||
                addressInput.getText().length()==0||
                passwordInput.getPassword().length==0){
            JOptionPane.showMessageDialog(this, "You have entered All Fields");
            return false;
        }
        return true;
    }
   
    public void clearForm(){
        idInput.setText("");
        nameInput.setText("");
        mobileInput.setText("");
        emailInput.setText("");
        addressInput.setText("");
        ageInput.setText("");
        passwordInput.setText("");
        roleChoose.setSelectedItem("Admin");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idLable = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        mobileLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        roleLbl = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        mobileInput = new javax.swing.JTextField();
        ageInput = new javax.swing.JTextField();
        emailInput = new javax.swing.JTextField();
        addressInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JPasswordField();
        addEmplyeeBtn = new javax.swing.JButton();
        EditEmplyeeBtn = new javax.swing.JButton();
        searchByIdBtn = new javax.swing.JButton();
        deleteEmployeeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        roleChoose = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        signOutBtn1 = new javax.swing.JMenu();
        ChgAdminData = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");
        setMaximumSize(null);

        idLable.setText("ID");

        nameLbl.setText("Name");

        mobileLbl.setText("Mobile Number");

        ageLbl.setText("age");

        emailLbl.setText("Email");

        addressLbl.setText("Address");

        passwordLbl.setText("Password");
        passwordLbl.setMaximumSize(null);
        passwordLbl.setPreferredSize(null);

        roleLbl.setText("Role");

        addEmplyeeBtn.setLabel("Add Emplyee");
        addEmplyeeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmplyeeBtnMouseClicked(evt);
            }
        });

        EditEmplyeeBtn.setLabel("Update info");
        EditEmplyeeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditEmplyeeBtnMouseClicked(evt);
            }
        });

        searchByIdBtn.setText("Seach");
        searchByIdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchByIdBtnMouseClicked(evt);
            }
        });

        deleteEmployeeBtn.setLabel("Delete Employee");
        deleteEmployeeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteEmployeeBtnMouseClicked(evt);
            }
        });

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Mobile ", "age", "Email", "Address", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(resultTable);

        signOutBtn1.setText("Sign Out");
        signOutBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOutBtn1MouseClicked(evt);
            }
        });
        jMenuBar1.add(signOutBtn1);

        ChgAdminData.setText("Change Admin User Name");
        ChgAdminData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChgAdminDataMouseClicked(evt);
            }
        });
        jMenuBar1.add(ChgAdminData);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(idInput)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobileLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailInput, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(mobileInput, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(addressInput, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(ageInput)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(roleChoose, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(deleteEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addEmplyeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(80, 80, 80)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(searchByIdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EditEmplyeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditEmplyeeBtn)
                    .addComponent(addEmplyeeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchByIdBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteEmployeeBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    
    private void addEmplyeeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmplyeeBtnMouseClicked
        // TODO add your handling code here:
        if(checkEmptyInputs()&&
                utility.Utilities.isValidLong(this, idInput.getText())&&
                !utility.Utilities.isEmplyeeIdExist(this, Long.parseLong(idInput.getText()))&&
                utility.Utilities.isValidInteger(this, ageInput.getText())&&
                utility.Utilities.passwordValidation(this, passwordInput.getPassword())){
            
                 Employee emp=new Employee(Long.parseLong(idInput.getText()), nameInput.getText(), 
                    mobileInput.getText(), Integer.parseInt(ageInput.getText()),
                    emailInput.getText(), addressInput.getText(), 
                    new String(passwordInput.getPassword()), roleChoose.getSelectedItem().toString());
                    Supermarket.employeesList.add(emp);
                    addDataToTable();
                    clearForm();
                    utility.Utilities.saveEmployeesToFile();
        }
    }//GEN-LAST:event_addEmplyeeBtnMouseClicked

    private void EditEmplyeeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditEmplyeeBtnMouseClicked
        // TODO add your handling code here:
        if(checkEmptyInputs()&&
                utility.Utilities.isValidLong(this, idInput.getText())&&
                utility.Utilities.isValidInteger(this, ageInput.getText())&&
                utility.Utilities.passwordValidation(this, passwordInput.getPassword())){
                    long id=Long.parseLong(idInput.getText());
                    for (int i = 0; i < Supermarket.employeesList.size(); i++) {
                        if(Supermarket.employeesList.get(i).getId()==id){
                            Supermarket.employeesList.get(i).setName(nameInput.getText());
                            Supermarket.employeesList.get(i).setPhoneNumber(mobileInput.getText());
                            Supermarket.employeesList.get(i).setAge(Integer.parseInt(ageInput.getText()));
                            Supermarket.employeesList.get(i).setEmail(emailInput.getText());
                            Supermarket.employeesList.get(i).setAddress(addressInput.getText());
                            Supermarket.employeesList.get(i).setPassword(new String(passwordInput.getPassword()));
                            Supermarket.employeesList.get(i).setRole(roleChoose.getSelectedItem().toString());
                            JOptionPane.showMessageDialog(this, "Info updated Successfully");
                            addDataToTable();
                            utility.Utilities.saveEmployeesToFile();
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(this, "Can't change The Emplyee ID");
        }
    }//GEN-LAST:event_EditEmplyeeBtnMouseClicked

    private void searchByIdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchByIdBtnMouseClicked
        // TODO add your handling code here:
        String input=JOptionPane.showInputDialog("Enter Employee ID");
        if(input.length()==0||!utility.Utilities.isValidLong(this, input)){
            //if user input empty string or non-numeric characters
            JOptionPane.showMessageDialog(this, "Invalid ID it should be numbers");
        }else{
            long id=Long.parseLong(input);
            for (int i = 0; i < Supermarket.employeesList.size(); i++) {
                if(Supermarket.employeesList.get(i).getId()==id){
                    Employee emp=Supermarket.employeesList.get(i);
                    idInput.setText(emp.getId()+"");
                    nameInput.setText(emp.getName());
                    mobileInput.setText(emp.getPhoneNumber());
                    emailInput.setText(emp.getEmail());
                    addressInput.setText(emp.getAddress());
                    ageInput.setText(emp.getAge()+"");
                    passwordInput.setText(emp.getPassword());
                    roleChoose.setSelectedItem(emp.getRole());
                    return;
                }
            }
            //If user search for non exist id
            JOptionPane.showMessageDialog(this, "This ID not exist in system");
            clearForm();
        }
    }//GEN-LAST:event_searchByIdBtnMouseClicked

    private void deleteEmployeeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteEmployeeBtnMouseClicked
        // TODO add your handling code here:
        if(checkEmptyInputs()&&
                utility.Utilities.isValidLong(this, idInput.getText())&&
                utility.Utilities.isValidInteger(this, ageInput.getText())&&
                utility.Utilities.passwordValidation(this, passwordInput.getPassword())){
            long id=Long.parseLong(idInput.getText());
            for (int i = 0; i < Supermarket.employeesList.size(); i++) {
                if(Supermarket.employeesList.get(i).getId()==id){
                    Supermarket.employeesList.remove(i);
                    addDataToTable();
                    clearForm();
                    JOptionPane.showMessageDialog(this, "employee info deleted successfully");
                    utility.Utilities.saveEmployeesToFile();
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "This ID isn't exist");
        }
    }//GEN-LAST:event_deleteEmployeeBtnMouseClicked

    private void ChgAdminDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChgAdminDataMouseClicked
        // TODO add your handling code here:
        new ChangeAdminInfoForm().setVisible(true);
    }//GEN-LAST:event_ChgAdminDataMouseClicked

    private void addDataToTable(){ 
        DefaultTableModel tableModel=(DefaultTableModel)resultTable.getModel();
        tableModel.setRowCount(0);
        Object rowData[]=new Object[7];
        for (int i = 0; i < Supermarket.employeesList.size(); i++) {
            rowData[0]=Supermarket.employeesList.get(i).getId();
            rowData[1]=Supermarket.employeesList.get(i).getName();
            rowData[2]=Supermarket.employeesList.get(i).getPhoneNumber();
            rowData[3]=Supermarket.employeesList.get(i).getAge();
            rowData[4]=Supermarket.employeesList.get(i).getEmail();
            rowData[5]=Supermarket.employeesList.get(i).getAddress();
            rowData[6]=Supermarket.employeesList.get(i).getRole();
            tableModel.addRow(rowData);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame adminForm=new AdminForm();
                adminForm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ChgAdminData;
    private javax.swing.JButton EditEmplyeeBtn;
    private javax.swing.JButton addEmplyeeBtn;
    private javax.swing.JTextField addressInput;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField ageInput;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JButton deleteEmployeeBtn;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel idLable;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobileInput;
    private javax.swing.JLabel mobileLbl;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTable resultTable;
    private javax.swing.JComboBox<String> roleChoose;
    private javax.swing.JLabel roleLbl;
    private javax.swing.JButton searchByIdBtn;
    private javax.swing.JMenu signOutBtn1;
    // End of variables declaration//GEN-END:variables
}
