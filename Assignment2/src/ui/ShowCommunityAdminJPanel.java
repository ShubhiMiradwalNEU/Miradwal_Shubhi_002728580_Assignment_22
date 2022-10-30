/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CommunityAdmin;
import model.Doctor;
import model.Person;

/**
 *
 * @author user
 */
public class ShowCommunityAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCommunityAdminJPanel
     */
    public ShowCommunityAdminJPanel() {
        initComponents();
        populateTable();
    }
    CommunityAdmin ca= new CommunityAdmin();
Person per= new Person();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCommunityAdmin = new javax.swing.JTable();
        lblCommunityAdminname = new javax.swing.JLabel();
        txtCommunityAdminname = new javax.swing.JTextField();
        lblCommunityAdminGender = new javax.swing.JLabel();
        lblCommunityAdminHouse = new javax.swing.JLabel();
        txtCommunityAdminhouse = new javax.swing.JTextField();
        lblCommunityAdminCity = new javax.swing.JLabel();
        txtCommunityAdminCity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        CombobuttonCommunityAdmin = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCommunityAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "House", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCommunityAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCommunityAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCommunityAdmin);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 990, 140));

        lblCommunityAdminname.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblCommunityAdminname.setForeground(new java.awt.Color(0, 102, 102));
        lblCommunityAdminname.setText("Name");
        add(lblCommunityAdminname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 93, 29));

        txtCommunityAdminname.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        add(txtCommunityAdminname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 152, 29));

        lblCommunityAdminGender.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblCommunityAdminGender.setForeground(new java.awt.Color(0, 102, 102));
        lblCommunityAdminGender.setText("Gender");
        add(lblCommunityAdminGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 93, 27));

        lblCommunityAdminHouse.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblCommunityAdminHouse.setForeground(new java.awt.Color(0, 102, 102));
        lblCommunityAdminHouse.setText("House");
        add(lblCommunityAdminHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        txtCommunityAdminhouse.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        add(txtCommunityAdminhouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 152, -1));

        lblCommunityAdminCity.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblCommunityAdminCity.setForeground(new java.awt.Color(0, 102, 102));
        lblCommunityAdminCity.setText("City");
        add(lblCommunityAdminCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 58, 25));

        txtCommunityAdminCity.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        add(txtCommunityAdminCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 152, -1));

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 140, 50));

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 150, 50));

        CombobuttonCommunityAdmin.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        CombobuttonCommunityAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        CombobuttonCommunityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombobuttonCommunityAdminActionPerformed(evt);
            }
        });
        add(CombobuttonCommunityAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 152, 25));
    }// </editor-fold>//GEN-END:initComponents

    private void tblCommunityAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCommunityAdminMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblCommunityAdmin.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunityAdmin.getModel();

        CommunityAdmin selectedCommunity = (CommunityAdmin) model.getValueAt(selectedRowIndex, 0);
        System.out.println(selectedCommunity);

        txtCommunityAdminname.setText(selectedCommunity.getName());
        CombobuttonCommunityAdmin.setSelectedItem(selectedCommunity.getGender());
        txtCommunityAdminhouse.setText(selectedCommunity.getHouse());
        txtCommunityAdminCity.setText(selectedCommunity.getCity());
 

    }//GEN-LAST:event_tblCommunityAdminMouseClicked

    private void CombobuttonCommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombobuttonCommunityAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombobuttonCommunityAdminActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = tblCommunityAdmin.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this,"please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunityAdmin.getModel();
        CommunityAdmin selectedDoctor = (CommunityAdmin) model.getValueAt(selectedRowIndex, 0);

        ca.deleteCommunityAdmin(selectedDoctor);
        JOptionPane.showMessageDialog(this,"doctor deleted");

        populateTable();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
          DefaultTableModel model = (DefaultTableModel) tblCommunityAdmin.getModel();
        int selectedRowIndex = tblCommunityAdmin.getSelectedRow();

        if (tblCommunityAdmin.getSelectedRowCount()==1){
            //-- if single row is selected than update--
            String name = txtCommunityAdminname.getText();
            String gender = (String) CombobuttonCommunityAdmin.getSelectedItem();
            //String physicianType = txtPhysicianType.getText();
            String house = txtCommunityAdminhouse.getText();          
            String city = txtCommunityAdminCity.getText();

            CommunityAdmin updateca = new CommunityAdmin();            
            //-- set updated value on the table row
            updateca.setName(name);
            updateca.setGender(gender);
            //updateDoc.setPhysicianType(physicianType);
            updateca.setHouse(house);
            //updateDoc.setHospitalName(hospitalName);
            updateca.setCity(city);
            ca.updateCommunityAdmin(updateca,selectedRowIndex);
            
            //UPDATE DOCTOR DATA IN PERSON DIRECTORY
            Person updatePerson = new Person();

            //-- set updated value on the table row
            updatePerson.setName(name);
            updatePerson.setGender(gender);
            //updatePerson.setPhysicianType(physicianType);
            updatePerson.setHouse(house);
            //updatePerson.setHospitalName(hospitalName);
            updatePerson.setCity(city);
            per.updatePerson(per, selectedRowIndex);
            
            populateTable();

            JOptionPane.showMessageDialog(this, "Data Updated Successfully ");
    }//GEN-LAST:event_btnUpdateActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CombobuttonCommunityAdmin;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommunityAdminCity;
    private javax.swing.JLabel lblCommunityAdminGender;
    private javax.swing.JLabel lblCommunityAdminHouse;
    private javax.swing.JLabel lblCommunityAdminname;
    private javax.swing.JTable tblCommunityAdmin;
    private javax.swing.JTextField txtCommunityAdminCity;
    private javax.swing.JTextField txtCommunityAdminhouse;
    private javax.swing.JTextField txtCommunityAdminname;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblCommunityAdmin.getModel();
        model.setRowCount(0);
        
        for(CommunityAdmin doc: CommunityAdmin.getCommunityAdminDirectory()){
            Object[] row = new Object[4];
            row[0] = doc;
            row[1] = doc.getGender();
           // row[2] = doc.getPhysicianType();
            row[2] = doc.getHouse();
            row[3] = doc.getCity();
            model.addRow(row);
        }
        
    }


}
