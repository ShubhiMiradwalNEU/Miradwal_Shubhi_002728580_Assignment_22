/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static model.CommunityAdmin.communitydirectory;
import model.Doctor;
import model.Person;

/**
 *
 * @author user
 */
public class ShowDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShowDoctorJPanel
     */
    Person person = new Person();
    Doctor doc = new Doctor();
    public ShowDoctorJPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblHouse = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        comboGender = new javax.swing.JComboBox<>();
        lblPhysicianType = new javax.swing.JLabel();
        txtPhysicianType = new javax.swing.JTextField();
        txtHouse = new javax.swing.JTextField();
        lblHospitalName = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        comboBoxCommunity = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "PhysicianType", "House", "Community", "HospitalName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoctor.setSelectionBackground(new java.awt.Color(153, 255, 255));
        tblDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoctorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDoctor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 7, 1010, 140));

        lblName.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 102, 102));
        lblName.setText("NAME");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 114, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 106, -1));

        lblGender.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblGender.setForeground(new java.awt.Color(0, 102, 102));
        lblGender.setText("GENDER");
        jPanel1.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lblHouse.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblHouse.setForeground(new java.awt.Color(0, 102, 102));
        lblHouse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHouse.setText("HOUSE");
        jPanel1.add(lblHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        lblCity.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblCity.setForeground(new java.awt.Color(0, 102, 102));
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCity.setText("Community");
        jPanel1.add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 153, -1, -1));

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 153, -1, -1));

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        jPanel1.add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 106, -1));

        lblPhysicianType.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblPhysicianType.setForeground(new java.awt.Color(0, 102, 102));
        lblPhysicianType.setText("PHYSICIAN TYPE");
        jPanel1.add(lblPhysicianType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        jPanel1.add(txtPhysicianType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 106, -1));
        jPanel1.add(txtHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 106, -1));

        lblHospitalName.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblHospitalName.setForeground(new java.awt.Color(0, 102, 102));
        lblHospitalName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalName.setText("HOSPITAL NAME");
        jPanel1.add(lblHospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));
        jPanel1.add(txtHospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 106, -1));

        comboBoxCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboBoxCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 100, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void tblDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoctorMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblDoctor.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();

        Doctor selectedDoctor = (Doctor) model.getValueAt(selectedRowIndex, 0);
        System.out.println(selectedDoctor);

        txtName.setText(selectedDoctor.getName());
        comboGender.setSelectedItem(selectedDoctor.getGender());
        txtPhysicianType.setText(selectedDoctor.getPhysicianType());
        txtHouse.setText(selectedDoctor.getHouse());
        comboBoxCommunity.setSelectedItem(selectedDoctor.getCommunity());
        txtHospitalName.setText(selectedDoctor.getHospitalName());
        
    }//GEN-LAST:event_tblDoctorMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        int selectedRowIndex = tblDoctor.getSelectedRow();

        if (tblDoctor.getSelectedRowCount()==1){
            //-- if single row is selected than update--
            String name = txtName.getText();
            String gender = (String) comboGender.getSelectedItem();
            String physicianType = txtPhysicianType.getText();
            String house = txtHouse.getText();
            String hospitalName = txtHospitalName.getText();
            String city = (String)comboBoxCommunity.getSelectedItem();

            Doctor updateDoc = new Doctor();            
            //-- set updated value on the table row
            updateDoc.setName(name);
            updateDoc.setGender(gender);
            updateDoc.setPhysicianType(physicianType);
            updateDoc.setHouse(house);
            updateDoc.setHospitalName(hospitalName);
            updateDoc.setCommunity(city);
            doc.updateDoctor(updateDoc,selectedRowIndex);
            
            //UPDATE DOCTOR DATA IN PERSON DIRECTORY
            Person updatePerson = new Person();

            //-- set updated value on the table row
            updatePerson.setName(name);
            updatePerson.setGender(gender);
            updatePerson.setPhysicianType(physicianType);
            updatePerson.setHouse(house);
            updatePerson.setHospitalName(hospitalName);
            updatePerson.setCommunity(city);
            person.updatePerson(person, selectedRowIndex);
            
            populateTable();

            JOptionPane.showMessageDialog(this, "Data Updated Successfully ");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDoctor.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this,"please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        Doctor selectedDoctor = (Doctor) model.getValueAt(selectedRowIndex, 0);

        doc.deleteDoctor(selectedDoctor);
        JOptionPane.showMessageDialog(this,"doctor deleted");

        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxCommunity;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhysicianType;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhysicianType;
    // End of variables declaration//GEN-END:variables
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        model.setRowCount(0);
        
        for(Doctor doc: Doctor.getDoctorDirectory()){
            Object[] row = new Object[6];
            row[0] = doc;
            row[1] = doc.getGender();
            row[2] = doc.getPhysicianType();
            row[3] = doc.getHouse();
            row[4] = doc.getCommunity();
            row[5] = doc.getHospitalName();
            model.addRow(row);
        }
        
    }
    private void populatecommunity() {

    comboBoxCommunity.setModel(new DefaultComboBoxModel<String>(communitydirectory.toArray(new String[0])));  
        
    }

}
