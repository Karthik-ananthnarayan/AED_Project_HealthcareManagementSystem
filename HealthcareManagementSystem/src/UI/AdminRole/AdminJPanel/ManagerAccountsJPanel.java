/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole.AdminJPanel;


import IntegrationSystem.HealthcareSystemOrganizationIntegration;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author karthik 
 */
public class ManagerAccountsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminChannelJPanel
     */
    JPanel panelStatusJPanel;
    HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration;
    
    private static final int N = 32;
    public ManagerAccountsJPanel(JPanel panelStatusJPanel,HealthcareSystemOrganizationIntegration healthcareSystemOrganizationIntegration) {
        initComponents();
        this.panelStatusJPanel = panelStatusJPanel;
        this.healthcareSystemOrganizationIntegration = healthcareSystemOrganizationIntegration;
        this.setBorder(BorderFactory.createEmptyBorder(N, N, N, N));
        
        jPanel1.setVisible(false);
 
    }
  
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Color color1 = getBackground();
        Color color2 = color1.darker();
        int w = getWidth();
        int h = getHeight();
        GradientPaint gp = new GradientPaint(
            0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
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
        jPanel2 = new javax.swing.JPanel();
        HospitalManagementButton = new javax.swing.JButton();
        CustomerSupportManagementButton = new javax.swing.JButton();
        WarehouseManagementButton = new javax.swing.JButton();
        DeliveryAgencyManagement = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1720, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane.setPreferredSize(new java.awt.Dimension(1720, 1080));

        jPanel2.setBackground(new java.awt.Color(0, 70, 169));
        jPanel2.setPreferredSize(new java.awt.Dimension(1720, 1080));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HospitalManagementButton.setBackground(new java.awt.Color(204, 204, 204));
        HospitalManagementButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        HospitalManagementButton.setText("Hospitals Management");
        HospitalManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalManagementButtonActionPerformed(evt);
            }
        });
        jPanel2.add(HospitalManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 401, -1));

        CustomerSupportManagementButton.setBackground(new java.awt.Color(204, 204, 204));
        CustomerSupportManagementButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CustomerSupportManagementButton.setText("Customer Support Management");
        CustomerSupportManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerSupportManagementButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CustomerSupportManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 401, -1));

        WarehouseManagementButton.setBackground(new java.awt.Color(204, 204, 204));
        WarehouseManagementButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        WarehouseManagementButton.setText("Warehouses Management");
        WarehouseManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarehouseManagementButtonActionPerformed(evt);
            }
        });
        jPanel2.add(WarehouseManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 401, -1));

        DeliveryAgencyManagement.setBackground(new java.awt.Color(204, 204, 204));
        DeliveryAgencyManagement.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DeliveryAgencyManagement.setText("Delivery Agency Management");
        DeliveryAgencyManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveryAgencyManagementActionPerformed(evt);
            }
        });
        jPanel2.add(DeliveryAgencyManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 401, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("System Admin Work Area");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 510, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\noopu\\OneDrive\\Desktop\\Rishi\\AED\\Final project Images\\istockphoto-1295964655-170667a (1).jpg")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 870));

        jSplitPane.setRightComponent(jPanel2);

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 1080));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1078, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        add(jSplitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1747, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void HospitalManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalManagementButtonActionPerformed
        // TODO add your handling code here:
        ERSystemConsultationPanel hospitalAccountsPage = new ERSystemConsultationPanel(panelStatusJPanel,healthcareSystemOrganizationIntegration);
        panelStatusJPanel.add("HospitalAccountsPage",hospitalAccountsPage);
        CardLayout cardLayout = (CardLayout) panelStatusJPanel.getLayout();
        cardLayout.show(panelStatusJPanel,"HospitalAccountsPage");
    }//GEN-LAST:event_HospitalManagementButtonActionPerformed

    private void CustomerSupportManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerSupportManagementButtonActionPerformed
        // TODO add your handling code here:
        SupportTeamManagerPanel customerSupportAccountsPage = new SupportTeamManagerPanel(panelStatusJPanel,healthcareSystemOrganizationIntegration);
        panelStatusJPanel.add("CustomerSupportAccountsPage",customerSupportAccountsPage);
        CardLayout cardLayout = (CardLayout) panelStatusJPanel.getLayout();
        cardLayout.show(panelStatusJPanel,"CustomerSupportAccountsPage");
    }//GEN-LAST:event_CustomerSupportManagementButtonActionPerformed

    private void WarehouseManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarehouseManagementButtonActionPerformed
        // TODO add your handling code here:
        FirstAidSupplyInventoryRecordsJPanel medicalEquipWarehouseAccountsPage = new FirstAidSupplyInventoryRecordsJPanel(panelStatusJPanel,healthcareSystemOrganizationIntegration);
        panelStatusJPanel.add("MedicalEquipWarehouseAccountsPage",medicalEquipWarehouseAccountsPage);
        CardLayout cardLayout = (CardLayout) panelStatusJPanel.getLayout();
        cardLayout.show(panelStatusJPanel,"MedicalEquipWarehouseAccountsPage");
    }//GEN-LAST:event_WarehouseManagementButtonActionPerformed

    private void DeliveryAgencyManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveryAgencyManagementActionPerformed
        // TODO add your handling code here:
        DispatcherCoordinatorPanel deliveryAgencyAccountsPage = new DispatcherCoordinatorPanel(panelStatusJPanel,healthcareSystemOrganizationIntegration);
        panelStatusJPanel.add("DeliveryAgencyAccountsPage",deliveryAgencyAccountsPage);
        CardLayout cardLayout = (CardLayout) panelStatusJPanel.getLayout();
        cardLayout.show(panelStatusJPanel,"DeliveryAgencyAccountsPage");
        
    }//GEN-LAST:event_DeliveryAgencyManagementActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerSupportManagementButton;
    private javax.swing.JButton DeliveryAgencyManagement;
    private javax.swing.JButton HospitalManagementButton;
    private javax.swing.JButton WarehouseManagementButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
