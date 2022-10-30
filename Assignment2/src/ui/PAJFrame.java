/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.List;
import model.Patient;
import static model.Patient.patientDirectory;
import model.Person;
import static model.Person.personDirectory;

/**
 *
 * @author user
 */
public class PAJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PatientJFrame
     */
    public PAJFrame() {
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
        btnDoctorList = new javax.swing.JButton();
        btnDoctorBooked = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnEncounterHistory = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDoctorList.setBackground(new java.awt.Color(0, 0, 0));
        btnDoctorList.setForeground(new java.awt.Color(255, 255, 255));
        btnDoctorList.setText("Doctor List");
        btnDoctorList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorListActionPerformed(evt);
            }
        });
        jPanel1.add(btnDoctorList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 138, -1));

        btnDoctorBooked.setBackground(new java.awt.Color(0, 0, 0));
        btnDoctorBooked.setForeground(new java.awt.Color(255, 255, 255));
        btnDoctorBooked.setText("Doctor Booked");
        btnDoctorBooked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorBookedActionPerformed(evt);
            }
        });
        jPanel1.add(btnDoctorBooked, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 138, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 302, 61, -1));

        btnEncounterHistory.setBackground(new java.awt.Color(0, 0, 0));
        btnEncounterHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnEncounterHistory.setText("Encounter History");
        btnEncounterHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterHistoryActionPerformed(evt);
            }
        });
        jPanel1.add(btnEncounterHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 138, -1));

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoctorBookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorBookedActionPerformed
        // TODO add your handling code here:
        DoctorBookedJPanel doctorBooked = new DoctorBookedJPanel();
        splitPane.setRightComponent(doctorBooked);
        
    }//GEN-LAST:event_btnDoctorBookedActionPerformed

    private void btnDoctorListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorListActionPerformed
        // TODO add your handling code here:
        DoctorListPatientJPanel doctorList = new DoctorListPatientJPanel();
        splitPane.setRightComponent(doctorList);
    }//GEN-LAST:event_btnDoctorListActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainJFrame mainPage = new MainJFrame();
        mainPage.setVisible(true);
        PAJFrame patient = new PAJFrame();
        patient.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEncounterHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterHistoryActionPerformed
        // TODO add your handling code here:'
        EncounterHistoryPAJPanel profile = new EncounterHistoryPAJPanel();
        splitPane.setRightComponent(profile);
        
    }//GEN-LAST:event_btnEncounterHistoryActionPerformed
    
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
//            java.util.logging.Logger.getLogger(PAJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PAJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PAJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PAJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PAJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDoctorBooked;
    private javax.swing.JButton btnDoctorList;
    private javax.swing.JButton btnEncounterHistory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
