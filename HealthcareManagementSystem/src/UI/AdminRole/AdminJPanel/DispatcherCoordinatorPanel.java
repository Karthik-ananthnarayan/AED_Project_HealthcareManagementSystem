
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole.AdminJPanel;



import IntegrationSystem.HealthcareSystemOrganizationIntegration;


import HealthCareMainSystem.AdminRoles.DispatcherServiceRole;
import HealthCareMainSystem.UserRoles.Role;

import Model.DispatcherServiceProvider.DispatcherService;
import Model.DispatcherServiceProvider.DispatcherServiceDirectory;
import IntegrationSystem.ConsumerRecords;
import IntegrationSystem.EnterpriseUserDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karthik 
 */
public class DispatcherCoordinatorPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryAgencyAccountsPage
     */
    JPanel JpanelThread;
    HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration;
    DispatcherServiceDirectory dispatcherServiceDirectory;
    ConsumerRecords consumerRecords;
    EnterpriseUserDirectory enterpriseUserDir;

    public DispatcherCoordinatorPanel(JPanel userProcessContainer , HealthcareSystemOrganizationIntegration medicalServiceCentralisationEcoSystem) {
        
        this.JpanelThread = userProcessContainer;
        this.healthcareSystemOrganizationIntegration = medicalServiceCentralisationEcoSystem;
        initComponents();
        if(medicalServiceCentralisationEcoSystem.getDispatcherServiceDirectory()== null)
           medicalServiceCentralisationEcoSystem.setDispatcherServiceDirectory(new DispatcherServiceDirectory());
       
        addDefaultvalues();
        InsertDataToJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployee = new javax.swing.JTable();
        CreateButton = new javax.swing.JButton();
        jTextName = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        jLabelPassword = new javax.swing.JLabel();
        jTextPassword = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jLabelEmpID = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        jLabelEmpName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Delivery Details");
        add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 832, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, 50));

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Delivery ID", "Delivery Name", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 790, 217));

        CreateButton.setBackground(new java.awt.Color(0, 0, 0));
        CreateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CreateButton.setText("CREATE");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 140, 40));
        add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 351, -1));

        UpdateButton.setBackground(new java.awt.Color(0, 0, 0));
        UpdateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, 140, 40));

        jLabelPassword.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelPassword.setText("Password:");
        add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 100, 30));

        jTextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPasswordActionPerformed(evt);
            }
        });
        add(jTextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 351, 26));

        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });
        add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 351, -1));

        jLabelEmpID.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelEmpID.setText("ID :");
        add(jLabelEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 50, 30));

        DeleteButton.setBackground(new java.awt.Color(0, 0, 0));
        DeleteButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, 140, 40));

        jLabelEmpName.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelEmpName.setText("Name :");
        add(jLabelEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 70, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\noopu\\OneDrive\\Desktop\\Rishi\\AED\\Final project Images\\Medi (1) (1).jpg")); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -200, 1920, 1190));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) JpanelThread.getLayout();
            crdLyt.show(JpanelThread,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPasswordActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ArrayList<String> user_input = check_empty_field();
        dispatcherServiceDirectory = healthcareSystemOrganizationIntegration.getDispatcherServiceDirectory();
        EnterpriseUserDirectory usersList = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        if(usersList.verifyUserUnique(user_input.get(0))){
                        
            consumerRecords = new ConsumerRecords(user_input.get(0), user_input.get(2), new DispatcherServiceRole());
            
            DispatcherService dispatcherService = new DispatcherService(user_input.get(0), user_input.get(1));
            consumerRecords.setDispatcher_Service(dispatcherService);
            dispatcherServiceDirectory.addDeliveryAgency(dispatcherService);
            
            usersList.addConsumerData(consumerRecords);
            
            JOptionPane.showMessageDialog(this, "New Dispatcher Service has been added.");
            model.addRow(new Object[]{consumerRecords,user_input.get(1),user_input.get(2)});
            remove_empty_input_Values();
        }
        else{
            JOptionPane.showMessageDialog(this, "This username is not available. Please select a new one.");
        }
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_consumer_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);        
        enterpriseUserDir = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        dispatcherServiceDirectory = healthcareSystemOrganizationIntegration.getDispatcherServiceDirectory();
        ArrayList<ConsumerRecords> userAccountList = enterpriseUserDir.get_User_Details();
        for(ConsumerRecords userAccount: userAccountList)
        {
            if(userAccount.getEmail_Id().equals(select_consumer_details.getEmail_Id()))
            {
                DispatcherService deliveryAgency = userAccount.getDispatcher_Service();
                ArrayList<String> user_input = check_empty_field();
                model.setValueAt(user_input.get(1), selected_row_ix, 1);
                model.setValueAt(user_input.get(2), selected_row_ix, 2);
                dispatcherServiceDirectory.updateDeliveryAgency(user_input, deliveryAgency);
                enterpriseUserDir.updateEnterpriseUser(set_user_input_values(userAccount, user_input));
                break;
            }
        }
        JOptionPane.showMessageDialog(this, "Updated Input Values!");

        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Select a row to be deleted");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_user_account_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);
        enterpriseUserDir = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        DispatcherService deliveryAgency = select_user_account_details.getDispatcher_Service();
        dispatcherServiceDirectory.deleteDeliveryAgency(deliveryAgency);
        enterpriseUserDir.removeConsumerRecord(select_user_account_details);
        model.removeRow(selected_row_ix);
        InsertDataToJTable();
        remove_empty_input_Values();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void jTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeMouseClicked
        // TODO add your handling code here:
        CreateButton.setEnabled(false);
        int selected_row_ix = jTableEmployee.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_user_account_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);
        jTextID.setEditable(false);
        jTextID.setText(select_user_account_details.getEmail_Id());
        jTextName.setText(select_user_account_details.getDispatcher_Service().getDeliveryAgencyName());
        jTextPassword.setText(select_user_account_details.getPassword());
        
    }//GEN-LAST:event_jTableEmployeeMouseClicked
    private ConsumerRecords set_user_input_values(ConsumerRecords userAccount, ArrayList<String> user_input) {
//        consumerRecords.getEmployee().setEmployee_id(user_input.get(0));
        userAccount.getDispatcher_Service().setDeliveryAgencyName(user_input.get(1));
        userAccount.setPassword(user_input.get(2));
        return userAccount;
    }
    private void remove_empty_input_Values(){
        jTextID.setText("");
        jTextName.setText("");
        jTextPassword.setText("");
    }
    
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_emp_id = jTextID.getText();
        String user_emp_name = jTextName.getText();
        String user_password = jTextPassword.getText();

        
        if(user_emp_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Email/Username cannot be empty");
        }
        else if(user_emp_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Username cannot be empty");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter a valid 6 letter Password");
        }
        
        
        user_input.add(user_emp_id);
        user_input.add(user_emp_name);
        user_input.add(user_password);
        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel Header;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEmpID;
    private javax.swing.JLabel jLabelEmpName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextPassword;
    // End of variables declaration//GEN-END:variables

    
    private void InsertDataToJTable() {
        EnterpriseUserDirectory userAccountDirectory = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        ArrayList<ConsumerRecords> usersList = userAccountDirectory.get_User_Details();
    
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        model.setRowCount(0);
        for(ConsumerRecords consumer_acc: usersList)
        {   
            if(consumer_acc.getRole().toString() == "DeliveryAgencyAdmin"){
                model.addRow(new Object[]{consumer_acc,consumer_acc.getDispatcher_Service().getDeliveryAgencyName(),consumer_acc.getPassword()});
            }
            
        }
        
        jTableEmployee.setModel(model);
    }

    private void addDefaultvalues() {
        
        EnterpriseUserDirectory enterpriseUsers = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        consumerRecords = new ConsumerRecords("dispatcherService", "password",new DispatcherServiceRole());
        DispatcherService dispatcherService = new DispatcherService("dispatcherService","DispatcherAgency1");
        dispatcherServiceDirectory = healthcareSystemOrganizationIntegration.getDispatcherServiceDirectory();
        dispatcherServiceDirectory.addDeliveryAgency(dispatcherService);
        consumerRecords.setDispatcher_Service(dispatcherService);
        if(enterpriseUsers.verifyUserUnique("dispatcherService")){
            enterpriseUsers.addConsumerData(consumerRecords);
        }
        
  
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole.AdminJPanel;



import IntegrationSystem.HealthcareSystemOrganizationIntegration;


import HealthCareMainSystem.AdminRoles.DispatcherServiceRole;
import HealthCareMainSystem.UserRoles.RoleBasedAuthPanel;

import DispatcherServiceProvider.DispatcherService;
import DispatcherServiceProvider.DispatcherServiceDirectory;
import IntegrationSystem.ConsumerRecords;
import IntegrationSystem.EnterpriseUserDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karthik 
 */
public class DispatcherCoordinatorPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryAgencyAccountsPage
     */
    JPanel JpanelThread;
    HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration;
    DispatcherServiceDirectory dispatcherServiceDirectory;
    ConsumerRecords consumerRecords;
    EnterpriseUserDirectory enterpriseUserDir;

    public DispatcherCoordinatorPanel(JPanel userProcessContainer , HealthcareSystemOrganizationIntegration medicalServiceCentralisationEcoSystem) {
        
        this.JpanelThread = userProcessContainer;
        this.healthcareSystemOrganizationIntegration = medicalServiceCentralisationEcoSystem;
        initComponents();
        if(medicalServiceCentralisationEcoSystem.getDispatcherServiceDirectory()== null)
           medicalServiceCentralisationEcoSystem.setDispatcherServiceDirectory(new DispatcherServiceDirectory());
       
        addDefaultvalues();
        InsertDataToJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployee = new javax.swing.JTable();
        CreateButton = new javax.swing.JButton();
        jTextName = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        jLabelPassword = new javax.swing.JLabel();
        jTextPassword = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jLabelEmpID = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        jLabelEmpName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Delivery Details");
        add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 832, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, 50));

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Delivery ID", "Delivery Name", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 790, 217));

        CreateButton.setBackground(new java.awt.Color(0, 0, 0));
        CreateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CreateButton.setText("CREATE");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 140, 40));
        add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 351, -1));

        UpdateButton.setBackground(new java.awt.Color(0, 0, 0));
        UpdateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, 140, 40));

        jLabelPassword.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelPassword.setText("Password:");
        add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 100, 30));

        jTextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPasswordActionPerformed(evt);
            }
        });
        add(jTextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 351, 26));

        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });
        add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 351, -1));

        jLabelEmpID.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelEmpID.setText("ID :");
        add(jLabelEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 50, 30));

        DeleteButton.setBackground(new java.awt.Color(0, 0, 0));
        DeleteButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, 140, 40));

        jLabelEmpName.setFont(new java.awt.Font("Dubai Medium", 1, 16)); // NOI18N
        jLabelEmpName.setText("Name :");
        add(jLabelEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 70, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\noopu\\OneDrive\\Desktop\\Rishi\\AED\\Final project Images\\Medi (1) (1).jpg")); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -200, 1920, 1190));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) JpanelThread.getLayout();
            crdLyt.show(JpanelThread,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPasswordActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ArrayList<String> user_input = check_empty_field();
        dispatcherServiceDirectory = healthcareSystemOrganizationIntegration.getDispatcherServiceDirectory();
        EnterpriseUserDirectory usersList = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        if(usersList.verifyUserUnique(user_input.get(0))){
                        
            consumerRecords = new ConsumerRecords(user_input.get(0), user_input.get(2), new DispatcherServiceRole());
            
            DispatcherService dispatcherService = new DispatcherService(user_input.get(0), user_input.get(1));
            consumerRecords.setDispatcher_Service(dispatcherService);
            dispatcherServiceDirectory.addDeliveryAgency(dispatcherService);
            
            usersList.addConsumerData(consumerRecords);
            
            JOptionPane.showMessageDialog(this, "New Dispatcher Service has been added.");
            model.addRow(new Object[]{consumerRecords,user_input.get(1),user_input.get(2)});
            remove_empty_input_Values();
        }
        else{
            JOptionPane.showMessageDialog(this, "This username is not available. Please select a new one.");
        }
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_consumer_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);        
        enterpriseUserDir = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        dispatcherServiceDirectory = healthcareSystemOrganizationIntegration.getDispatcherServiceDirectory();
        ArrayList<ConsumerRecords> userAccountList = enterpriseUserDir.get_User_Details();
        for(ConsumerRecords userAccount: userAccountList)
        {
            if(userAccount.getEmail_Id().equals(select_consumer_details.getEmail_Id()))
            {
                DispatcherService deliveryAgency = userAccount.getDispatcher_Service();
                ArrayList<String> user_input = check_empty_field();
                model.setValueAt(user_input.get(1), selected_row_ix, 1);
                model.setValueAt(user_input.get(2), selected_row_ix, 2);
                dispatcherServiceDirectory.updateDeliveryAgency(user_input, deliveryAgency);
                enterpriseUserDir.updateEnterpriseUser(set_user_input_values(userAccount, user_input));
                break;
            }
        }
        JOptionPane.showMessageDialog(this, "Updated Input Values!");

        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Select a row to be deleted");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_user_account_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);
        enterpriseUserDir = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        DispatcherService deliveryAgency = select_user_account_details.getDispatcher_Service();
        dispatcherServiceDirectory.deleteDeliveryAgency(deliveryAgency);
        enterpriseUserDir.removeConsumerRecord(select_user_account_details);
        model.removeRow(selected_row_ix);
        InsertDataToJTable();
        remove_empty_input_Values();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void jTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeMouseClicked
        // TODO add your handling code here:
        CreateButton.setEnabled(false);
        int selected_row_ix = jTableEmployee.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_user_account_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);
        jTextID.setEditable(false);
        jTextID.setText(select_user_account_details.getEmail_Id());
        jTextName.setText(select_user_account_details.getDispatcher_Service().getDeliveryAgencyName());
        jTextPassword.setText(select_user_account_details.getPassword());
        
    }//GEN-LAST:event_jTableEmployeeMouseClicked
    private ConsumerRecords set_user_input_values(ConsumerRecords userAccount, ArrayList<String> user_input) {
//        consumerRecords.getEmployee().setEmployee_id(user_input.get(0));
        userAccount.getDispatcher_Service().setDeliveryAgencyName(user_input.get(1));
        userAccount.setPassword(user_input.get(2));
        return userAccount;
    }
    private void remove_empty_input_Values(){
        jTextID.setText("");
        jTextName.setText("");
        jTextPassword.setText("");
    }
    
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_emp_id = jTextID.getText();
        String user_emp_name = jTextName.getText();
        String user_password = jTextPassword.getText();

        
        if(user_emp_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Email/Username cannot be empty");
        }
        else if(user_emp_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Username cannot be empty");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter a valid 6 letter Password");
        }
        
        
        user_input.add(user_emp_id);
        user_input.add(user_emp_name);
        user_input.add(user_password);
        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel Header;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEmpID;
    private javax.swing.JLabel jLabelEmpName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextPassword;
    // End of variables declaration//GEN-END:variables

    
    private void InsertDataToJTable() {
        EnterpriseUserDirectory userAccountDirectory = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        ArrayList<ConsumerRecords> usersList = userAccountDirectory.get_User_Details();
    
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        model.setRowCount(0);
        for(ConsumerRecords consumer_acc: usersList)
        {   
            if(consumer_acc.getRole().toString() == "DeliveryAgencyAdmin"){
                model.addRow(new Object[]{consumer_acc,consumer_acc.getDispatcher_Service().getDeliveryAgencyName(),consumer_acc.getPassword()});
            }
            
        }
        
        jTableEmployee.setModel(model);
    }

    private void addDefaultvalues() {
        
        EnterpriseUserDirectory enterpriseUsers = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        consumerRecords = new ConsumerRecords("dispatcherService", "password",new DispatcherServiceRole());
        DispatcherService dispatcherService = new DispatcherService("dispatcherService","DispatcherAgency1");
        dispatcherServiceDirectory = healthcareSystemOrganizationIntegration.getDispatcherServiceDirectory();
        dispatcherServiceDirectory.addDeliveryAgency(dispatcherService);
        consumerRecords.setDispatcher_Service(dispatcherService);
        if(enterpriseUsers.verifyUserUnique("dispatcherService")){
            enterpriseUsers.addConsumerData(consumerRecords);
        }
        
  
    }
    
}

