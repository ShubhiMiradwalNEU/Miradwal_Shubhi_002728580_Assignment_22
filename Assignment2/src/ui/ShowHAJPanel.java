/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static model.CommunityAdmin.communitydirectory;
import model.HospitalAdmin;

/**
 *
 * @author user
 */
public class ShowHAJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShowHAJPanel
     */
    HospitalAdmin ha = new HospitalAdmin();
   
    public ShowHAJPanel() {
        initComponents();
       
        populateTable();
        populatecommunity();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitalAdmins = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblHospitalName = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        comboGender = new javax.swing.JComboBox<>();
        comboBoxCommunity = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 650));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 650));

        tblHospitalAdmins.setForeground(new java.awt.Color(204, 255, 255));
        tblHospitalAdmins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "HospitalName", "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHospitalAdmins.setGridColor(new java.awt.Color(153, 255, 255));
        tblHospitalAdmins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHospitalAdminsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHospitalAdmins);

        lblName.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 102, 102));
        lblName.setText("NAME");

        lblGender.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblGender.setForeground(new java.awt.Color(0, 102, 102));
        lblGender.setText("GENDER");

        lblHospitalName.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblHospitalName.setForeground(new java.awt.Color(0, 102, 102));
        lblHospitalName.setText("HOSPITAL NAME");

        lblCity.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblCity.setForeground(new java.awt.Color(0, 102, 102));
        lblCity.setText("Community");

        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        comboBoxCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(comboBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGender)
                    .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCity))
                    .addComponent(comboBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtHospitalNameActionPerformed

    private void tblHospitalAdminsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHospitalAdminsMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblHospitalAdmins.getSelectedRow();     
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHospitalAdmins.getModel();
        
        HospitalAdmin selectedHospitalAdmin = (HospitalAdmin) model.getValueAt(selectedRowIndex, 0);
        System.out.println(selectedHospitalAdmin);
        
        txtName.setText(selectedHospitalAdmin.getName());
        comboGender.setSelectedItem(selectedHospitalAdmin.getGender());
        txtHospitalName.setText(selectedHospitalAdmin.getHospitalName());
        comboBoxCommunity.setSelectedItem(selectedHospitalAdmin.getCommunity());

    }//GEN-LAST:event_tblHospitalAdminsMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblHospitalAdmins.getModel();
        int selectedRowIndex = tblHospitalAdmins.getSelectedRow();
            
        if (tblHospitalAdmins.getSelectedRowCount()==1){
            //-- if single row is selected than update--
            String name = txtName.getText();
            String gender = (String) comboGender.getSelectedItem();
            String hospitalName = txtHospitalName.getText();
            String city = (String)comboBoxCommunity.getSelectedItem();
            
            HospitalAdmin updateHospitalAdmin = new HospitalAdmin();
            //-- set updated value on the table row
            updateHospitalAdmin.setName(name);
            updateHospitalAdmin.setGender(gender);
            updateHospitalAdmin.setHospitalName(hospitalName);
            updateHospitalAdmin.setCommunity(city);
            ha.updateHospitalAdmin(updateHospitalAdmin,selectedRowIndex);
            populateTable();
            
            JOptionPane.showMessageDialog(this, "Data Updated Successfully ");
    }   
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHospitalAdmins.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this,"please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHospitalAdmins.getModel();
        HospitalAdmin selectedHospitalAdmin = (HospitalAdmin) model.getValueAt(selectedRowIndex, 0);
        
        ha.deleteHospitalAdmin(selectedHospitalAdmin);
        JOptionPane.showMessageDialog(this,"employee deleted");
        
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxCommunity;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblHospitalAdmins;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblHospitalAdmins.getModel();
        model.setRowCount(0);
        
        for(HospitalAdmin ha: HospitalAdmin.getHospitalDirectory()){
            Object[] row = new Object[4];
            row[0] = ha;
            row[1] = ha.getGender();
            row[2] = ha.getHospitalName();
            row[3] = ha.getCommunity();
            model.addRow(row);
        }
        
    }
     private void populatecommunity() {

    comboBoxCommunity.setModel(new DefaultComboBoxModel<String>(communitydirectory.toArray(new String[0])));  
        
    }
}
