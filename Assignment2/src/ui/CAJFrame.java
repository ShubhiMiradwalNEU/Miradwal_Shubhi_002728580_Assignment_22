/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package ui;

/**
 *
 * @author user
 */
public class CAJFrame extends javax.swing.JFrame {

    /** Creates new form CommunityAdminJFrame */
    public CAJFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnCreateHospitalAdmin = new javax.swing.JButton();
        btnViewHospitalAdmin = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        ViewPerson = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        splitPane.setPreferredSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreateHospitalAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnCreateHospitalAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateHospitalAdmin.setText("Create Hospital Admin");
        btnCreateHospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospitalAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateHospitalAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 130, -1, -1));

        btnViewHospitalAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnViewHospitalAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnViewHospitalAdmin.setText("View Hospital Admins");
        btnViewHospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewHospitalAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 210, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 445, -1, -1));

        ViewPerson.setBackground(new java.awt.Color(0, 0, 0));
        ViewPerson.setForeground(new java.awt.Color(255, 255, 255));
        ViewPerson.setText("View Person");
        ViewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPersonActionPerformed(evt);
            }
        });
        jPanel1.add(ViewPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, 30));

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        lblTitle.setFont(new java.awt.Font("Academy Engraved LET", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 102, 102));
        lblTitle.setText("COMMUNITY ADMIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addContainerGap(425, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(jPanel2);

        getContentPane().add(splitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateHospitalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospitalAdminActionPerformed
        // TODO add your handling code here:
        AddHAJPanel hospitaladmin = new AddHAJPanel();
        splitPane.setRightComponent(hospitaladmin);
    }//GEN-LAST:event_btnCreateHospitalAdminActionPerformed

    private void btnViewHospitalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalAdminActionPerformed
        // TODO add your handling code here:
        ShowHAJPanel viewhospitaladmin = new ShowHAJPanel();
        splitPane.setRightComponent(viewhospitaladmin);
    }//GEN-LAST:event_btnViewHospitalAdminActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainJFrame mainPage = new MainJFrame();
        mainPage.setVisible(true);
        CAJFrame commAdmin = new CAJFrame();
        commAdmin.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void ViewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPersonActionPerformed
        // TODO add your handling code here:
          PersonJPanel viewpersonJPanel = new PersonJPanel();
        splitPane.setRightComponent(viewpersonJPanel);
        
    }//GEN-LAST:event_ViewPersonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CAJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CAJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CAJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CAJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CAJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewPerson;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateHospitalAdmin;
    private javax.swing.JButton btnViewHospitalAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables

}
