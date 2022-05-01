/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole.AdminJPanel;



import IntegrationSystem.HealthcareSystemOrganizationIntegration;


import HealthCareMainSystem.AdminRoles.PartnerAdminRole;

import HealthCareManager.PartnerInfirmaries.PartnerInfirmiries;
import HealthCareManager.PartnerInfirmaries.PartnerInfirmiriesDirectory;
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
public class ERSystemConsultationPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAccountsPage
     */
    JPanel userProcessContainer;
    HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration;
    PartnerInfirmiriesDirectory partnerInfirmiriesDirectory;
    ConsumerRecords consumerRecords;
    EnterpriseUserDirectory enterpriseUserDir;

    public ERSystemConsultationPanel(JPanel userProcessContainer , HealthcareSystemOrganizationIntegration medicalServiceCentralisationEcoSystem) {
        
        this.userProcessContainer = userProcessContainer;
        this.healthcareSystemOrganizationIntegration = medicalServiceCentralisationEcoSystem;
        initComponents();
        if(medicalServiceCentralisationEcoSystem.getInfirmaryDirectory()== null)
           medicalServiceCentralisationEcoSystem.setInfirmaryDirectory(new PartnerInfirmiriesDirectory());
       
        
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

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployee = new javax.swing.JTable();
        CreateButton = new javax.swing.JButton();
        jTextFieldHospName = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldHospPassword = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();
        jLabelPincode = new javax.swing.JLabel();
        jTextFieldHospPincode = new javax.swing.JTextField();
        bgdimg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setPreferredSize(new java.awt.Dimension(1920, 1183));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Accounts ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 706, -1));

        jButton2.setBackground(new java.awt.Color(0, 70, 169));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 40, 100, 40));

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital ID", "Hospital Name", "Pincode", "Password"
            }
        ));
        jTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 787, 90));

        CreateButton.setBackground(new java.awt.Color(22, 81, 129));
        CreateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CreateButton.setText("CREATE");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 680, 100, 30));
        add(jTextFieldHospName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 280, -1));

        UpdateButton.setBackground(new java.awt.Color(22, 81, 129));
        UpdateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 680, 100, 30));

        jLabelPassword.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPassword.setText("Password:");
        add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 120, -1));

        jTextFieldHospPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHospPasswordActionPerformed(evt);
            }
        });
        add(jTextFieldHospPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 280, 20));

        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });
        add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 280, -1));

        jLabelID.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelID.setText("ID:");
        add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 120, -1));

        DeleteButton.setBackground(new java.awt.Color(22, 81, 129));
        DeleteButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 680, 100, 30));

        jLabelName.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelName.setText("Name:");
        add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 120, -1));

        jLabelPincode.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabelPincode.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPincode.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPincode.setText("Pincode:");
        add(jLabelPincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 120, -1));
        add(jTextFieldHospPincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 280, -1));

        bgdimg.setToolTipText("");
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1920, 1220));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldHospPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHospPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHospPasswordActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ArrayList<String> input_data = check_empty_field();
        partnerInfirmiriesDirectory = healthcareSystemOrganizationIntegration.getInfirmaryDirectory();
        EnterpriseUserDirectory usersList = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        if(usersList.verifyUserUnique(input_data.get(0))){
            
            
            
            consumerRecords = new ConsumerRecords(input_data.get(0), input_data.get(3), new PartnerAdminRole());
            
            PartnerInfirmiries hospital = new PartnerInfirmiries(input_data.get(0), input_data.get(1), input_data.get(2));
            consumerRecords.setInfirmiries(hospital);
            partnerInfirmiriesDirectory.addHospital(hospital);
            
            usersList.addConsumerData(consumerRecords);
            
            JOptionPane.showMessageDialog(this, "New Hospital Information has been added.");
            model.addRow(new Object[]{consumerRecords,input_data.get(1),input_data.get(2),input_data.get(3)});
            remove_empty_input_Values();
        }
        else{
            JOptionPane.showMessageDialog(this, "This username is not available. Please select a new one.");
        }
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        int get_selected_Row = jTableEmployee.getSelectedRow();

        if(get_selected_Row < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords select_account_details = (ConsumerRecords)model.getValueAt(get_selected_Row, 0);        
        enterpriseUserDir = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        partnerInfirmiriesDirectory = healthcareSystemOrganizationIntegration.getInfirmaryDirectory();
        ArrayList<ConsumerRecords> consumerRecordses = enterpriseUserDir.get_User_Details();
        for(ConsumerRecords userAccount: consumerRecordses)
        {
            if(userAccount.getEmail_Id().equals(select_account_details.getEmail_Id()))
            {
                PartnerInfirmiries infirmiries = userAccount.getInfirmiries();
                ArrayList<String> user_input = check_empty_field();
                model.setValueAt(user_input.get(1), get_selected_Row, 1);
                model.setValueAt(user_input.get(2), get_selected_Row, 2);
                model.setValueAt(user_input.get(3), get_selected_Row, 3);
                partnerInfirmiriesDirectory.updateHospital(user_input, infirmiries);
                enterpriseUserDir.updateEnterpriseUser(set_user_input_values(userAccount, user_input));
                break;
            }
        }
        JOptionPane.showMessageDialog(this, "Values updated");
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int get_selected_Row_Data = jTableEmployee.getSelectedRow();

        if(get_selected_Row_Data < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords set_ConsumerRecords = (ConsumerRecords)model.getValueAt(get_selected_Row_Data, 0);
        enterpriseUserDir = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        PartnerInfirmiries infirmiries = set_ConsumerRecords.getInfirmiries();
        partnerInfirmiriesDirectory.deleteHospital(infirmiries);
        enterpriseUserDir.removeConsumerRecord(set_ConsumerRecords);
        model.removeRow(get_selected_Row_Data);
        InsertDataToJTable();
        remove_empty_input_Values();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void jTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeMouseClicked
        // TODO add your handling code here:
        CreateButton.setEnabled(false);
        int row_selected = jTableEmployee.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords get_consumer_acc_details = (ConsumerRecords)model.getValueAt(row_selected, 0);
      jTextID.setEditable(false);
      jTextID.setText(get_consumer_acc_details.getEmail_Id());
        jTextFieldHospName.setText(get_consumer_acc_details.getInfirmiries().getInfirmary_Name());
        jTextFieldHospPassword.setText(get_consumer_acc_details.getPassword());
        jTextFieldHospPincode.setText(get_consumer_acc_details.getInfirmiries().getInfirmary_postcode());
        
    }//GEN-LAST:event_jTableEmployeeMouseClicked
    private ConsumerRecords set_user_input_values(ConsumerRecords consumerRecords, ArrayList<String> user_input) {
        consumerRecords.getInfirmiries().setInfirmary_Name(user_input.get(1));
        consumerRecords.getInfirmiries().setInfirmary_postcode(user_input.get(2));
        consumerRecords.setPassword(user_input.get(3));
        return consumerRecords;
    }
    private void remove_empty_input_Values(){
      jTextID.setText("");
        jTextFieldHospName.setText("");
        jTextFieldHospPassword.setText("");
        jTextFieldHospPincode.setText("");
    }
    
    public ArrayList<String> check_empty_field(){
        ArrayList<String> input_user_data = new ArrayList<>();
        String consumer_id =  jTextID.getText();
        String consumer_name = jTextFieldHospName.getText();
        String consumer_passwd = jTextFieldHospPassword.getText();
        String consumer_pincode = jTextFieldHospPincode.getText();

        
        if(consumer_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Email/Username cannot be empty.");
        }
        else if(consumer_name.isEmpty()){
            JOptionPane.showMessageDialog(this,"Username cannot be empty.");
        }
        else if(consumer_passwd.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Password to proceed");
        }
        else if(consumer_pincode.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Pincode to proceed");
        }
        
        input_user_data.add(consumer_id);
        input_user_data.add(consumer_name);
        input_user_data.add(consumer_pincode);
        input_user_data.add(consumer_passwd);
        
        return input_user_data;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPincode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextFieldHospName;
    private javax.swing.JTextField jTextFieldHospPassword;
    private javax.swing.JTextField jTextFieldHospPincode;
    private javax.swing.JTextField jTextID;
    // End of variables declaration//GEN-END:variables

    
    private void InsertDataToJTable() {
        EnterpriseUserDirectory enterpriseUserDirectory = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        addDefaultvalues();
        ArrayList<ConsumerRecords> usersList = enterpriseUserDirectory.get_User_Details();
    
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        model.setRowCount(0);

        for(ConsumerRecords consumers: usersList)
        {   
            if(consumers.getRole().toString() == "HospitalAdmin"){
                model.addRow(new Object[]{consumers,consumers.getInfirmiries().getInfirmary_Name(),consumers.getInfirmiries().getInfirmary_postcode(),consumers.getPassword()});
            }
        }
        
        jTableEmployee.setModel(model);
    }

    private void addDefaultvalues() {
        
        EnterpriseUserDirectory usersList = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        consumerRecords = new ConsumerRecords("infirmiry", "password",new PartnerAdminRole());
        PartnerInfirmiries partnerInfirmiries = new PartnerInfirmiries("infirmiry","Infirmiry","22220");
        partnerInfirmiriesDirectory = healthcareSystemOrganizationIntegration.getInfirmaryDirectory();
        partnerInfirmiriesDirectory.addHospital(partnerInfirmiries);
        consumerRecords.setInfirmiries(partnerInfirmiries);
        if(usersList.verifyUserUnique("infirmiry")){
        usersList.addConsumerData(consumerRecords);
        }
      
    }
}
