/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole.PracticeAdminJPanel;


import HealthCareManager.Emergency.EmergencyProviderDirectory;
import WorkerProvider.Worker;
import IntegrationSystem.HealthcareSystemOrganizationIntegration;

import HealthCareSystem.Directorate.DirectorateDirectory;
import HealthCareSystem.Directorate.Directorate;
import HealthCareManager.Specialist.Specialist;
import HealthCareManager.Specialist.SpecialistModelDirectory;
import HealthCareManager.Emergency.EmergencyProvider;
import HealthCareManager.PartnerInfirmaries.PartnerInfirmiries;


import HealthCareMainSystem.UserRoles.DirectorateRole;
import HealthCareMainSystem.UserRoles.PhysicianRole;
import HealthCareMainSystem.UserRoles.EmergencyResponderRole;
import HealthCareMainSystem.UserRoles.Role;
import HealthCareMainSystem.UserRoles.TechnicianRole;
import HealthCareManager.ServicesProvider.ServiceProvider;
import HealthCareManager.ServicesProvider.ServiceProviderDirectory;

import IntegrationSystem.ConsumerRecords;
import IntegrationSystem.EnterpriseUserDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author harshithnarahari
 */
public class ServiceTeamAccountsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration;
    SpecialistModelDirectory specialistModelDirectory;
    EmergencyProviderDirectory emergencyProviderDirectory;
    ServiceProviderDirectory serviceTeamModelDirectory;
    ConsumerRecords consumers;
    EnterpriseUserDirectory enterpriseUserDirectory;
    PartnerInfirmiries infirmiries;
    public ServiceTeamAccountsJPanel(JPanel userProcessContainer , HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration, PartnerInfirmiries infirmiries) {
        
        this.userProcessContainer = userProcessContainer;
        this.healthcareSystemOrganizationIntegration = healthcareSystemOrganizationIntegration;
        this.infirmiries = infirmiries;
        initComponents();
        if(infirmiries.getSpecialistModelDirectory()== null)
           infirmiries.setSpecialistModelDirectory(new SpecialistModelDirectory());
        if(infirmiries.getEmergencyProviderDirectory()== null)
           infirmiries.setEmergencyProviderDirectory(new EmergencyProviderDirectory());
        if(infirmiries.getTechnicianDirectory()== null)
           infirmiries.setTechnicianDirectory(new ServiceProviderDirectory());
        
        insertRoleBasedSelectionBox();
        insertDataJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployee = new javax.swing.JTable();
        jButtonCreate = new javax.swing.JButton();
        jTextName = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        Password = new javax.swing.JLabel();
        jTextPassword = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jLabelRole = new javax.swing.JLabel();
        DesignationToggle = new javax.swing.JComboBox<>();
        jLabelID = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1920, 1183));
        setMinimumSize(new java.awt.Dimension(1920, 1920));
        setPreferredSize(new java.awt.Dimension(1920, 1183));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Technical and Lab Testing");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 706, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Role", "Password"
            }
        ));
        jTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployee);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 540, 90));

        jButtonCreate.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCreate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonCreate.setText("CREATE");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 110, 40));
        add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 290, 30));

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, 100, 40));

        Password.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Password.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Password.setText("Password :");
        add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 104, -1));

        jTextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPasswordActionPerformed(evt);
            }
        });
        add(jTextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 290, 30));

        jTextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDActionPerformed(evt);
            }
        });
        add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 290, 30));

        jLabelRole.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelRole.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelRole.setText("Designation");
        add(jLabelRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 104, -1));

        DesignationToggle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DesignationToggle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Nurse" }));
        add(DesignationToggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));

        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelID.setText("ID :");
        add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 120, -1));

        jButtonDelete.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, 100, 40));

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelName.setText("Name :");
        add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\noopu\\OneDrive\\Desktop\\Rishi\\AED\\Final project Images\\images (2).png")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, -310, 1610, 1040));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"hospitalAdminWorkAreaJPanel");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPasswordActionPerformed

    private void jTextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel) jTableEmployee.getModel();
        ArrayList<String> input_Value = validate_Null_Fields();
        EnterpriseUserDirectory enterpriseUserDirectory = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        if(enterpriseUserDirectory.verifyUserUnique(input_Value.get(0))){
            
            
            if(input_Value.get(2) == "Specialist"){

                consumers = new ConsumerRecords(input_Value.get(0), input_Value.get(3), new PhysicianRole());
                enterpriseUserDirectory.addConsumerData(consumers);
                Specialist specialist = new Specialist();
                specialist.setSpecialistId(input_Value.get(0));
                specialist.setSpecialist_Name(input_Value.get(1));                
                specialistModelDirectory.addSpecialist(input_Value.get(0), specialist);
                infirmiries.setSpecialistModelDirectory(specialistModelDirectory);
                consumers.setInfirmiries(infirmiries);
            }
            if(input_Value.get(2) == "Radiologist"){

                consumers = new ConsumerRecords(input_Value.get(0), input_Value.get(3), new EmergencyResponderRole());
                enterpriseUserDirectory.addConsumerData(consumers);
                EmergencyProvider emergencyProvider = new EmergencyProvider();
                emergencyProvider.setEmergencyProviderId(input_Value.get(0));
                emergencyProvider.setEmergencyProviderName(input_Value.get(1));                
                emergencyProviderDirectory.addRadiologist(input_Value.get(0), emergencyProvider);
                infirmiries.setEmergencyProviderDirectory(emergencyProviderDirectory);
                consumers.setInfirmiries(infirmiries);
            }
            if(input_Value.get(2) == "Technician"){

                consumers = new ConsumerRecords(input_Value.get(0), input_Value.get(3), new TechnicianRole());
                enterpriseUserDirectory.addConsumerData(consumers);
                ServiceProvider servicesProvider = new ServiceProvider();
                servicesProvider.setServiceTeam_Id(input_Value.get(0));
                servicesProvider.setServiceTeam_Name(input_Value.get(81));                
                serviceTeamModelDirectory.addTechnician(input_Value.get(0), servicesProvider);
                infirmiries.setTechnicianDirectory(serviceTeamModelDirectory);
                consumers.setInfirmiries(infirmiries);
            }
            
            JOptionPane.showMessageDialog(this, "New Employee Information has been added.");
            model.addRow(new Object[]{consumers,input_Value.get(1),input_Value.get(2),input_Value.get(3)});
            clearFields();
        }
        else{
            JOptionPane.showMessageDialog(this, "This username is not available. Please select a new one.");
        }
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model =(DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords set_consumer_details = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);        
        enterpriseUserDirectory = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        ArrayList<ConsumerRecords> userAccountList = enterpriseUserDirectory.get_User_Details();
        for(ConsumerRecords consumerRecords: userAccountList)
        {
            if(consumerRecords.getEmail_Id().equals(set_consumer_details.getEmail_Id()))
            {
                PartnerInfirmiries infirmiries = consumerRecords.getInfirmiries();
                ArrayList<String> user_input = validate_Null_Fields();
//                model.setValueAt(user_input.get(1), selected_row_ix, 0);
                model.setValueAt(user_input.get(1), selected_row_ix, 1);
//                model.setValueAt(user_input.get(2), selected_row_ix, 2);
                model.setValueAt(user_input.get(3), selected_row_ix, 3);
                enterpriseUserDirectory.updateEnterpriseUser(set_user_input_values(consumerRecords, user_input));
                break;
            }
        }   
        
//        healthcareSystemOrganizationIntegration.setRestaurantDirectory(restaurantDirectory);
        JOptionPane.showMessageDialog(this, "Values updated");
//        addrecordstotable();
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
       int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model =(DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords set_consumer_detials = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);
        enterpriseUserDirectory = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        enterpriseUserDirectory.removeConsumerRecord(set_consumer_detials);
//        ecosystem.setRestaurantDirectory(restaurantDirectory);
        model.removeRow(selected_row_ix);
        insertDataJTable();
        clearFields();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeMouseClicked
        // TODO add your handling code here:
        jButtonCreate.setEnabled(false);
        DesignationToggle.setEnabled(false);
        int selected_row_ix = jTableEmployee.getSelectedRow();
        DefaultTableModel model =(DefaultTableModel) jTableEmployee.getModel();
        ConsumerRecords consumer_details_data = (ConsumerRecords)model.getValueAt(selected_row_ix, 0);
        jTextID.setEditable(false);
        jTextID.setText(consumer_details_data.getEmail_Id());
        
        Role role = consumer_details_data.getRole();
        System.out.println("role.toString(): "+role.toString());
        DesignationToggle.setSelectedItem(role.toString()); 
        
        
        if(role.toString().equals("Radiologist")){
            PartnerInfirmiries infirmiries = consumer_details_data.getInfirmiries();
            emergencyProviderDirectory = infirmiries.getEmergencyProviderDirectory();
            HashMap<String, EmergencyProvider> radiologistList = emergencyProviderDirectory.getResponderList();
            EmergencyProvider emergencyProvider = radiologistList.get(consumer_details_data.getEmail_Id());
            jTextName.setText(emergencyProvider.getEmergencyProviderName());
        }
        else if(role.toString().equals("Pathologist")){
            PartnerInfirmiries infirmiries = consumer_details_data.getInfirmiries();
            specialistModelDirectory = infirmiries.getSpecialistModelDirectory();
            HashMap<String, Specialist> specialistList = specialistModelDirectory.getSpecialist_List();
            Specialist specialist = specialistList.get(consumer_details_data.getEmail_Id());
            jTextName.setText(specialist.getSpecialist_Name());
        }
        else if(role.toString().equals("Technician")){
            PartnerInfirmiries infirmiries = consumer_details_data.getInfirmiries();
            serviceTeamModelDirectory = infirmiries.getTechnicianDirectory();
            HashMap<String, ServiceProvider> serviceTeam = serviceTeamModelDirectory.getTechnicianList();
            ServiceProvider services = serviceTeam.get(consumer_details_data.getEmail_Id());
            jTextName.setText(services.getServiceTeam_Name());
        }
        
        
        jTextPassword.setText(consumer_details_data.getPassword());
        
    }//GEN-LAST:event_jTableEmployeeMouseClicked
    private ConsumerRecords set_user_input_values(ConsumerRecords consumerRecords, ArrayList<String> user_input) {
//        consumers.getEmployee().setEmployee_id(user_input.get(0));
//        consumers.getEmployee().setEmployee_name(user_input.get(1));
        consumerRecords.setPassword(user_input.get(3));
        return consumerRecords;
    }
    private void clearFields(){
        jTextID.setText("");
        jTextName.setText("");
        jTextPassword.setText("");
        DesignationToggle.setSelectedItem("");
    }
    
    public ArrayList<String> validate_Null_Fields(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_emp_id = jTextID.getText();
        String user_emp_name = jTextName.getText();
        String user_password = jTextPassword.getText();
        String user_role = (String) DesignationToggle.getSelectedItem();

        
        if(user_emp_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "User ID can't be left empty.");
        }
        else if(user_emp_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "User Name can't be left empty.");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Password.");
        }
        else if(user_role.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please select a Role.");
        }
        
        user_input.add(user_emp_id);
        user_input.add(user_emp_name);
        user_input.add(user_role);
        user_input.add(user_password);
        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DesignationToggle;
    private javax.swing.JLabel Password;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelRole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    

    private void insertRoleBasedSelectionBox() {
        DesignationToggle.removeAllItems();
        DesignationToggle.addItem("");
        DesignationToggle.addItem("Radiologist");
        DesignationToggle.addItem("Pathologist");
        DesignationToggle.addItem("Technician");
    }

    private void insertDataJTable() {
        specialistModelDirectory = infirmiries.getSpecialistModelDirectory();
        emergencyProviderDirectory = infirmiries.getEmergencyProviderDirectory();
        serviceTeamModelDirectory = infirmiries.getTechnicianDirectory();
        DefaultTableModel model =(DefaultTableModel) jTableEmployee.getModel();
        model.setRowCount(0);
//        ArrayList<Accountant> accountantList = accountantDirectory.getAccountantList();
//        for(Accountant accountant: accountantList)
//        {
//            model.addRow(new Object[]{accountant.getUserAccount(),accountant.getUserAccount().getEmployee().getEmployee_name(),"Accountant",accountant.getUserAccount().getPassword()});
//        }
        EnterpriseUserDirectory userAccountDirectory = healthcareSystemOrganizationIntegration.getUserAccDirectory();
        ArrayList<ConsumerRecords> consumerRecordsList = userAccountDirectory.get_User_Details();
//        hospitalDirectory = healthcareSystemOrganizationIntegration.getHospitalDirectory();
        
        model.setRowCount(0);
//        ArrayList<Hospital> hospitalList = hospitalDirectory.getHospitalList();
        for(ConsumerRecords userAccount: consumerRecordsList)
        {   
            if(userAccount.getRole().toString() == "Radiologist" && userAccount.getInfirmiries().equals(infirmiries)){
                
                emergencyProviderDirectory = infirmiries.getEmergencyProviderDirectory();
                HashMap<String, EmergencyProvider> radiologistList = emergencyProviderDirectory.getResponderList();
                EmergencyProvider radiologist = radiologistList.get(userAccount.getEmail_Id());
                model.addRow(new Object[]{userAccount,radiologist.getEmergencyProviderName(),userAccount.getRole(),userAccount.getPassword()});
            }
            else if(userAccount.getRole().toString() == "Pathologist" && userAccount.getInfirmiries().equals(infirmiries)){
                
                specialistModelDirectory = infirmiries.getSpecialistModelDirectory();
                HashMap<String, Specialist> pathologistList = specialistModelDirectory.getSpecialist_List();
                Specialist specialist = pathologistList.get(userAccount.getEmail_Id());
                model.addRow(new Object[]{userAccount,specialist.getSpecialist_Name(),userAccount.getRole(),userAccount.getPassword()});
            }
            else if(userAccount.getRole().toString() == "Technician" && userAccount.getInfirmiries().equals(infirmiries)){
                
                serviceTeamModelDirectory = infirmiries.getTechnicianDirectory();
                HashMap<String, ServiceProvider> serviceTeam = serviceTeamModelDirectory.getTechnicianList();
                ServiceProvider services = serviceTeam.get(userAccount.getEmail_Id());
                model.addRow(new Object[]{userAccount,services.getServiceTeam_Name(),userAccount.getRole(),userAccount.getPassword()});
          
    }
        }
         jTableEmployee.setModel(model);
    
        }
}
