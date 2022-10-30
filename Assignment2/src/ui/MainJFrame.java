/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.Person;

/**
 *
 * @author user
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Person person = new Person();
    public MainJFrame() {
        initComponents();
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnPatient = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnCommunityAdmin = new javax.swing.JButton();
        btnHospitalAdmin = new javax.swing.JButton();
        btnSystemAdmin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        btnPatient.setBackground(new java.awt.Color(0, 0, 0));
        btnPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnPatient.setText("Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnDoctor.setBackground(new java.awt.Color(0, 0, 0));
        btnDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        btnCommunityAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnCommunityAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnCommunityAdmin.setText("Community Admin");
        btnCommunityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityAdminActionPerformed(evt);
            }
        });

        btnHospitalAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnHospitalAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnHospitalAdmin.setText("Hospital Admin");
        btnHospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalAdminActionPerformed(evt);
            }
        });

        btnSystemAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnSystemAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnSystemAdmin.setText("System Admin");
        btnSystemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHospitalAdmin)
                            .addComponent(btnPatient))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSystemAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDoctor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCommunityAdmin, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCommunityAdmin, btnDoctor, btnHospitalAdmin, btnPatient, btnSystemAdmin});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnPatient)
                .addGap(40, 40, 40)
                .addComponent(btnDoctor)
                .addGap(35, 35, 35)
                .addComponent(btnHospitalAdmin)
                .addGap(40, 40, 40)
                .addComponent(btnCommunityAdmin)
                .addGap(43, 43, 43)
                .addComponent(btnSystemAdmin)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Academy Engraved LET", 1, 18)); // NOI18N
        jLabel1.setText("SELECT USER TYPE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHospitalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalAdminActionPerformed
        // TODO add your handling code here:
        LoginJPanel login = new LoginJPanel();
        splitPane.setRightComponent(login);
    }//GEN-LAST:event_btnHospitalAdminActionPerformed

    private void btnSystemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemAdminActionPerformed
        // TODO add your handling code here:
        person.addNewPerson("systemAdmin", "systemAdmin", "system admin", "System Admin", 20, "Female", "Huntington Ave", "Boston", "NoPhysicianType", "NoHospitalName");
        
        LoginJPanel login = new LoginJPanel();
        splitPane.setRightComponent(login);
    }//GEN-LAST:event_btnSystemAdminActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        LoginJPanel login = new LoginJPanel();
        splitPane.setRightComponent(login);
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
        LoginJPanel login = new LoginJPanel();
        splitPane.setRightComponent(login);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnCommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityAdminActionPerformed
        // TODO add your handling code here:
        LoginJPanel login = new LoginJPanel();
        splitPane.setRightComponent(login);
    }//GEN-LAST:event_btnCommunityAdminActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommunityAdmin;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnHospitalAdmin;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnSystemAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
