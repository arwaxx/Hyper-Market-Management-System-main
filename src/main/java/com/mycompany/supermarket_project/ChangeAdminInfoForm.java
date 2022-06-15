package com.mycompany.supermarket_project;

import javax.swing.JOptionPane;

public class ChangeAdminInfoForm extends javax.swing.JFrame {

    public ChangeAdminInfoForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminNewNameInput = new javax.swing.JTextField();
        admnNameLbl = new javax.swing.JLabel();
        admnPasswordLbl = new javax.swing.JLabel();
        admnConfirmBtn = new javax.swing.JButton();
        admnCancelBtn = new javax.swing.JButton();
        admnNewPasswordInput = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Admin Information");

        admnNameLbl.setText("New UserName");

        admnPasswordLbl.setText("New Password");

        admnConfirmBtn.setText("Confirm Changes");
        admnConfirmBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admnConfirmBtnMouseClicked(evt);
            }
        });

        admnCancelBtn.setText("Cancel");
        admnCancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admnCancelBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admnNameLbl)
                    .addComponent(admnPasswordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(admnConfirmBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(admnCancelBtn)
                        .addGap(39, 39, 39))
                    .addComponent(adminNewNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addComponent(admnNewPasswordInput))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminNewNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admnNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admnPasswordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admnNewPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admnConfirmBtn)
                    .addComponent(admnCancelBtn))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admnConfirmBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admnConfirmBtnMouseClicked
        // TODO add your handling code here:
        if(adminNewNameInput.getText().trim().length()<5&&new String(admnNewPasswordInput.getPassword()).length()<5){
            JOptionPane.showMessageDialog(this, "Failed, Username && password should be at least 5 characters");
        }else{
            utility.SaveDataToFile.writeToFile(adminNewNameInput.getText().trim(), new String(admnNewPasswordInput.getPassword()).trim());
            JOptionPane.showMessageDialog(this, "Admin UserName & Password Changed Successfully");
        }
    }//GEN-LAST:event_admnConfirmBtnMouseClicked

    private void admnCancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admnCancelBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_admnCancelBtnMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeAdminInfoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminNewNameInput;
    private javax.swing.JButton admnCancelBtn;
    private javax.swing.JButton admnConfirmBtn;
    private javax.swing.JLabel admnNameLbl;
    private javax.swing.JPasswordField admnNewPasswordInput;
    private javax.swing.JLabel admnPasswordLbl;
    // End of variables declaration//GEN-END:variables
}
