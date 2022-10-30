/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author user
 */
public class SAJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminJFrame
     */
    public SAJFrame() {
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
        btnAddDoctors = new javax.swing.JButton();
        btnViewDoctor = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAddPatient = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        btnAddHospitalAdmin = new javax.swing.JButton();
        btnViewHospitalAdmin = new javax.swing.JButton();
        btnAddCommunityAdmin = new javax.swing.JButton();
        btnViewCommunityAdmin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setForeground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddDoctors.setBackground(new java.awt.Color(0, 0, 0));
        btnAddDoctors.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDoctors.setText("Add Doctors");
        btnAddDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctorsActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 165, 29));

        btnViewDoctor.setBackground(new java.awt.Color(0, 0, 0));
        btnViewDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDoctor.setText("View Doctors");
        btnViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, 165, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        btnAddPatient.setBackground(new java.awt.Color(0, 0, 0));
        btnAddPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPatient.setText("Add Patients");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 203, 169, -1));

        btnViewPatient.setBackground(new java.awt.Color(0, 0, 0));
        btnViewPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnViewPatient.setText("View Patients");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 262, 169, -1));

        btnAddHospitalAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnAddHospitalAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAddHospitalAdmin.setText("Add Hospital Admin");
        btnAddHospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHospitalAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddHospitalAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 324, 169, -1));

        btnViewHospitalAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnViewHospitalAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnViewHospitalAdmin.setText("View Hospital Admin");
        btnViewHospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewHospitalAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 384, 169, -1));

        btnAddCommunityAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnAddCommunityAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCommunityAdmin.setText("Add Community Admin");
        btnAddCommunityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCommunityAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddCommunityAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 452, 169, -1));

        btnViewCommunityAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnViewCommunityAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCommunityAdmin.setText("View Community Admin");
        btnViewCommunityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCommunityAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewCommunityAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 520, -1, -1));

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Academy Engraved LET", 1, 18)); // NOI18N
        jLabel1.setText("System Admin Dashboard");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel1)
                .addContainerGap(353, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(613, Short.MAX_VALUE))
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
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctorsActionPerformed
        // TODO add your handling code here:
        AddDAJPanel createDoctors = new AddDAJPanel();
        splitPane.setRightComponent(createDoctors);
    }//GEN-LAST:event_btnAddDoctorsActionPerformed

    private void btnViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorActionPerformed
        // TODO add your handling code here:
        ShowDAJPanel viewDoctor = new ShowDAJPanel();
        splitPane.setRightComponent(viewDoctor);
    }//GEN-LAST:event_btnViewDoctorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainJFrame mainPage = new MainJFrame();
        mainPage.setVisible(true);
        SAJFrame systemAdmin = new SAJFrame();
        systemAdmin.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddHospitalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHospitalAdminActionPerformed
        // TODO add your handling code here:
        AddHAJPanel createHospitalAdmin = new AddHAJPanel();
        splitPane.setRightComponent(createHospitalAdmin);
    }//GEN-LAST:event_btnAddHospitalAdminActionPerformed

    private void btnViewHospitalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalAdminActionPerformed
        // TODO add your handling code here:
        ShowHAJPanel viewHospitalAdmin = new ShowHAJPanel();
        splitPane.setRightComponent(viewHospitalAdmin);
    }//GEN-LAST:event_btnViewHospitalAdminActionPerformed

    private void btnAddCommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCommunityAdminActionPerformed
        // TODO add your handling code here:
        AddCAJPanel createCommuntiyAdmin = new AddCAJPanel();
        splitPane.setRightComponent(createCommuntiyAdmin);
    }//GEN-LAST:event_btnAddCommunityAdminActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        AddPAJPanel createPatient = new AddPAJPanel();
        splitPane.setRightComponent(createPatient);
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void btnViewCommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCommunityAdminActionPerformed
        // TODO add your handling code here:
         ShowCAJPanel viewCommunityAdmin = new ShowCAJPanel();
        splitPane.setRightComponent(viewCommunityAdmin);
    }//GEN-LAST:event_btnViewCommunityAdminActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
        ShowPAJPanel viewPatient = new ShowPAJPanel();
        splitPane.setRightComponent(viewPatient);
    }//GEN-LAST:event_btnViewPatientActionPerformed

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
//            java.util.logging.Logger.getLogger(SAJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SAJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SAJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SAJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SAJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCommunityAdmin;
    private javax.swing.JButton btnAddDoctors;
    private javax.swing.JButton btnAddHospitalAdmin;
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewCommunityAdmin;
    private javax.swing.JButton btnViewDoctor;
    private javax.swing.JButton btnViewHospitalAdmin;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
