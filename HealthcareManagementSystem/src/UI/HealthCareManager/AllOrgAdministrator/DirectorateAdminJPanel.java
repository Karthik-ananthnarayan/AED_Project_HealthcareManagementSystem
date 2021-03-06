/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HealthCareManager.AllOrgAdministrator;

import IntegrationSystem.HealthcareSystemOrganizationIntegration;
import javax.swing.JPanel;


public class DirectorateAdminJPanel extends javax.swing.JPanel {

    /**
     * 
     */
    JPanel userProcessContainer;
    HealthcareSystemOrganizationIntegration hospitalManagementEcoSystem;
    public DirectorateAdminJPanel(JPanel userProcessContainer,HealthcareSystemOrganizationIntegration hospitalManagementEcoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hospitalManagementEcoSystem = hospitalManagementEcoSystem;
        jPanel1.setVisible(false);
   
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PatientsDataButton = new javax.swing.JButton();
        ManageAppointmentsButton = new javax.swing.JButton();
        bgdimg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1720, 1080));
        setLayout(new java.awt.BorderLayout());

        jSplitPane.setPreferredSize(new java.awt.Dimension(1720, 1080));

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setMaximumSize(new java.awt.Dimension(1920, 1183));
        jPanel2.setMinimumSize(new java.awt.Dimension(1920, 1183));
        jPanel2.setPreferredSize(new java.awt.Dimension(1920, 1183));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PatientsDataButton.setBackground(new java.awt.Color(0, 0, 0));
        PatientsDataButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PatientsDataButton.setText("Manage Patients Data");
        PatientsDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientsDataButtonActionPerformed(evt);
            }
        });
        jPanel2.add(PatientsDataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 401, 80));

        ManageAppointmentsButton.setBackground(new java.awt.Color(255, 51, 0));
        ManageAppointmentsButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ManageAppointmentsButton.setForeground(new java.awt.Color(0, 51, 51));
        ManageAppointmentsButton.setText("Manage Appointments");
        ManageAppointmentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageAppointmentsButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ManageAppointmentsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 401, 70));
        jPanel2.add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGroundImages/R1601C_VILLINSKI.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 940));

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void ManageAppointmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageAppointmentsButtonActionPerformed

    }//GEN-LAST:event_ManageAppointmentsButtonActionPerformed

    private void PatientsDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientsDataButtonActionPerformed


    }//GEN-LAST:event_PatientsDataButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageAppointmentsButton;
    private javax.swing.JButton PatientsDataButton;
    private javax.swing.JLabel bgdimg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
