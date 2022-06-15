package com.mycompany.supermarket_project;

import com.mycompany.supermarket_project.model.Employee;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        admnNameLbl = new javax.swing.JLabel();
        admnPasswordLbl = new javax.swing.JLabel();
        admnLoginBtn = new javax.swing.JButton();
        admnCancelBtn = new javax.swing.JButton();
        adminNameInput = new javax.swing.JTextField();
        admnPasswordInput = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        passwdInput = new javax.swing.JPasswordField();
        idInput = new javax.swing.JFormattedTextField();
        passwordLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in");
        setName("SuperMarket (Login)"); // NOI18N

        admnNameLbl.setText("UserName");

        admnPasswordLbl.setText("Password");

        admnLoginBtn.setText("Login");
        admnLoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admnLoginBtnMouseClicked(evt);
            }
        });

        admnCancelBtn.setText("Cancel");
        admnCancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admnCancelBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(admnPasswordLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admnNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(admnLoginBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                .addComponent(admnCancelBtn))
                            .addComponent(adminNameInput)))
                    .addComponent(admnPasswordInput))
                .addGap(208, 208, 208))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admnNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admnPasswordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admnPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admnLoginBtn)
                    .addComponent(admnCancelBtn))
                .addGap(79, 79, 79))
        );

        jTabbedPane1.addTab("Admin Login   ", jPanel2);

        loginBtn.setText("Log in");
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        idInput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idInputKeyPressed(evt);
            }
        });

        passwordLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLbl.setText("Password");

        idLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLbl.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn)
                .addGap(114, 114, 114)
                .addComponent(cancelBtn)
                .addGap(185, 185, 185))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(passwordLbl)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(loginBtn))
                .addGap(90, 90, 90))
        );

        jTabbedPane1.addTab("Users Login  ", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean isValidId(){
        try {
          Long.parseLong(idInput.getText());
          return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public Employee getEmplyeeById(long Id){
        for (int i = 0; i < Supermarket.employeesList.size(); i++) {
            if(Id==Supermarket.employeesList.get(i).getId()){
                return Supermarket.employeesList.get(i);
            }
        }
        return null;
    }
    
    public boolean isPasswordCorrect(String password){
        char[]passwordChars=password.toCharArray();
        if(passwdInput.getPassword().length==passwordChars.length){
            if(Arrays.equals(passwdInput.getPassword(), passwordChars))return true;
        }
        return false;
    }
    
    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        if(idInput.getText().equals("")||passwdInput.getPassword().length==0){
            JOptionPane.showMessageDialog(this, "You Should Enter User ID and Password");
        }else if(!isValidId()){
            JOptionPane.showMessageDialog(this, "You Should Enter User ID only numbers 0-9");
        }else{
            Employee emp=getEmplyeeById(Long.parseLong(idInput.getText()));
            if(emp!=null&&isPasswordCorrect(emp.getPassword())){
                Supermarket.currentEmplyee=emp;
                switch (emp.getRole().toLowerCase()) {
                    case "admin":
                        new AdminForm().setVisible(true);
                        this.dispose();
                        break;
                    case "marketing":
                        new MarketingForm().setVisible(true);
                        this.dispose();
                        break;
                    case "inventory":
                        new InventoryForm().setVisible(true);
                        this.dispose();
                        break;
                    case "sales":
                        new SalesForm().setVisible(true);
                        this.dispose();
                        break;
                    default:
                        throw new AssertionError();
                }
            }else{
                JOptionPane.showMessageDialog(this, "Invalid Id or Password");
            }
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnActionPerformed

    private void idInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idInputKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idInputKeyPressed

    private void admnCancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admnCancelBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_admnCancelBtnMouseClicked

    private void admnLoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admnLoginBtnMouseClicked
        // TODO add your handling code here:
        String adminUserName="admin";
        String adminPassword="admin";
        String[]adminInfo=utility.ReadDataFromFile.ReadFromFile();
        if(adminInfo[0]!=null&&adminInfo[1]!=null){
            adminUserName=adminInfo[0];
            adminPassword=adminInfo[1];
        }
        if(adminNameInput.getText().equals(adminUserName)&&new String(admnPasswordInput.getPassword()).equals(adminPassword)){
            new AdminForm().setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Username or password is wrong");
        }
    }//GEN-LAST:event_admnLoginBtnMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminNameInput;
    private javax.swing.JButton admnCancelBtn;
    private javax.swing.JButton admnLoginBtn;
    private javax.swing.JLabel admnNameLbl;
    private javax.swing.JPasswordField admnPasswordInput;
    private javax.swing.JLabel admnPasswordLbl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JFormattedTextField idInput;
    private javax.swing.JLabel idLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwdInput;
    private javax.swing.JLabel passwordLbl;
    // End of variables declaration//GEN-END:variables
}
