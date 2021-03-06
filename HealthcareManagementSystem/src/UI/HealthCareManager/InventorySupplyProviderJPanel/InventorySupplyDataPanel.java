/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HealthCareManager.InventorySupplyProviderJPanel;


import HealthCareManager.PartnerInfirmaries.PartnerInfirmiries;
import HealthCareManager.Consultation.ConsultationTestResults;
import HealthCareManager.SupplyStore.EquipmentSupplyStore;
import HealthCareManager.SupplyStore.MedSupEquipInternalDirectory;
import IntegrationSystem.HealthcareSystemOrganizationIntegration;
import IntegrationSystem.ConsumerRecords;
import IntegrationSystem.EnterpriseUserDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rishi
 */
public class InventorySupplyDataPanel extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration;
    ConsumerRecords consumerRecords;
    EnterpriseUserDirectory userAccountDirectory;
    ConsultationTestResults consultationTestResults;
    PartnerInfirmiries partnerInfirmiries;
    public InventorySupplyDataPanel(JPanel userProcessContainer , HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration, PartnerInfirmiries partnerInfirmiries) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.healthcareSystemOrganizationIntegration = healthcareSystemOrganizationIntegration;
        this.partnerInfirmiries = partnerInfirmiries;
        if(partnerInfirmiries.getMedSupEquipInternalDirectory()== null)
           partnerInfirmiries.setMedSupEquipInternalDirectory(new MedSupEquipInternalDirectory());
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

        jButtonExit = new javax.swing.JButton();
        jButtonCreateOrder = new javax.swing.JButton();
        jButtonUpdateOrder = new javax.swing.JButton();
        jButtonViewOrder = new javax.swing.JButton();
        jButtonDeleteOrder = new javax.swing.JButton();
        jLabelMedicalQuipmentName = new javax.swing.JLabel();
        jTextFieldEquipName = new javax.swing.JTextField();
        jLabelPatientName = new javax.swing.JLabel();
        jLabelHeader = new javax.swing.JLabel();
        jTextFieldEquipmentQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTestDB = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonExit.setBackground(new java.awt.Color(0, 70, 169));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jButtonCreateOrder.setText("CREATE");
        jButtonCreateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateOrderActionPerformed(evt);
            }
        });
        add(jButtonCreateOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jButtonUpdateOrder.setText("UPDATE");
        add(jButtonUpdateOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jButtonViewOrder.setText("VIEW");
        jButtonViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewOrderActionPerformed(evt);
            }
        });
        add(jButtonViewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 240, -1, -1));

        jButtonDeleteOrder.setText("DELETE");
        add(jButtonDeleteOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, -1));

        jLabelMedicalQuipmentName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelMedicalQuipmentName.setText("Equipment  Name");
        add(jLabelMedicalQuipmentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 130, -1));

        jTextFieldEquipName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEquipNameActionPerformed(evt);
            }
        });
        add(jTextFieldEquipName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 270, -1));

        jLabelPatientName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientName.setText(" Equipment Qauntity");
        add(jLabelPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 130, -1));

        jLabelHeader.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeader.setText("Medical Inventory Database");
        add(jLabelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 870, -1));

        jTextFieldEquipmentQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEquipmentQuantityActionPerformed(evt);
            }
        });
        add(jTextFieldEquipmentQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, 270, -1));

        jTableTestDB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Equipment Name", "Equipment Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTestDB);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 430, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/COVID-ICU-illustration (1) (1) (1).jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 840));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"medSupAdminWorkAreaJPanel");
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldEquipNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEquipNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEquipNameActionPerformed

    private void jButtonViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonViewOrderActionPerformed

    private void jTextFieldEquipmentQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEquipmentQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEquipmentQuantityActionPerformed

    private void jButtonCreateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateOrderActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTableTestDB.getModel();
        MedSupEquipInternalDirectory medSupEquipInternalDirectory = partnerInfirmiries.getMedSupEquipInternalDirectory();
        EquipmentSupplyStore equipmentSupplyStore = new EquipmentSupplyStore();
        String equip_name = jTextFieldEquipName.getText();
        String equip_quantity = jTextFieldEquipmentQuantity.getText();
        equipmentSupplyStore.setSupply_Item_name(equip_name);
        equipmentSupplyStore.setSupply_quantity(equip_quantity);
        medSupEquipInternalDirectory.addMedSupEquip(equipmentSupplyStore);
        partnerInfirmiries.setMedSupEquipInternalDirectory(medSupEquipInternalDirectory);
        JOptionPane.showMessageDialog(this, "New Supply Store equipment has been added.");
        model.addRow(new Object[]{equipmentSupplyStore,equipmentSupplyStore.getSupply_quantity()});
        remove_empty_input_Values();
    }//GEN-LAST:event_jButtonCreateOrderActionPerformed
  
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateOrder;
    private javax.swing.JButton jButtonDeleteOrder;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonUpdateOrder;
    private javax.swing.JButton jButtonViewOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelMedicalQuipmentName;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTestDB;
    private javax.swing.JTextField jTextFieldEquipName;
    private javax.swing.JTextField jTextFieldEquipmentQuantity;
    // End of variables declaration//GEN-END:variables

    private void remove_empty_input_Values() {
        jTextFieldEquipName.setText("");
        jTextFieldEquipmentQuantity.setText("");
    }

    private void InsertDataToJTable() {
        
        MedSupEquipInternalDirectory medSupEquipInternalDirectory = partnerInfirmiries.getMedSupEquipInternalDirectory();
        ArrayList<EquipmentSupplyStore> equipmentSupplyStores = medSupEquipInternalDirectory.getMedSupEquipInternalList();
        DefaultTableModel model = (DefaultTableModel) jTableTestDB.getModel();
        model.setRowCount(0);
        
        for(EquipmentSupplyStore equipmentSupplyStore: equipmentSupplyStores)
        {
            model.addRow(new Object[]{equipmentSupplyStore, equipmentSupplyStore.getSupply_quantity()});

        }
        jTableTestDB.setModel(model);
    }
}
