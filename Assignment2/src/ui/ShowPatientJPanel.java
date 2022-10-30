/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static model.CommunityAdmin.communitydirectory;
import model.Patient;
import model.Person;

/**
 *
 * @author user
 */
public class ShowPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShowPatientJPanel
     */
    Person person = new Person();
    Patient patient = new Patient();
    public ShowPatientJPanel() {
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
        tblPatient = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        comboGender = new javax.swing.JComboBox<>();
        lblAge = new javax.swing.JLabel();
        lblHouse = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtHouse = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        ComboboxCommunity = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "House", "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatient);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, 908, 106));

        lblName.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblName.setText("NAME");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 183, 114, -1));

        txtName.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 180, 106, -1));

        lblGender.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblGender.setText("GENDER");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 269, 114, -1));

        comboGender.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        add(comboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 266, 106, -1));

        lblAge.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblAge.setText("AGE");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 230, 114, -1));

        lblHouse.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblHouse.setText("HOUSE");
        add(lblHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 318, 114, -1));

        lblCity.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblCity.setText("Community");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 359, 114, -1));

        txtHouse.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        add(txtHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 315, 106, -1));

        txtAge.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 224, 106, -1));

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 120, 30));

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 130, 30));

        ComboboxCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(ComboboxCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void tblPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblPatient.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();

        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);
        System.out.println(selectedPatient);

        txtName.setText(selectedPatient.getName());
        comboGender.setSelectedItem(selectedPatient.getGender());
        txtAge.setText(Integer.toString(selectedPatient.getAge()));
        txtHouse.setText(selectedPatient.getHouse());
        ComboboxCommunity.setSelectedItem(selectedPatient.getCommunity());
        
    }//GEN-LAST:event_tblPatientMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        int selectedRowIndex = tblPatient.getSelectedRow();

        if (tblPatient.getSelectedRowCount()==1){
            //-- if single row is selected than update--
            String name = txtName.getText();
            int age = Integer.parseInt(txtAge.getText());
            String gender = (String) comboGender.getSelectedItem();
            String house = txtHouse.getText();
            String city = (String)ComboboxCommunity.getSelectedItem();
            
            //UPDATE PATIENTS DATA IN PATIENT DIRECTORY
            Patient updatePatient = new Patient();

            //-- set updated value on the table row
            updatePatient.setName(name);
            updatePatient.setGender(gender);
            updatePatient.setAge(age);
            updatePatient.setHouse(house);
            updatePatient.setCity(city);
            patient.updatePatient(updatePatient, selectedRowIndex);
            
            
            //UPDATE PATIENT DATA IN PERSON DIRECTORY
            Person updatePerson = new Person();

            //-- set updated value on the table row
            updatePerson.setName(name);
            updatePerson.setGender(gender);
            updatePerson.setAge(age);
            updatePerson.setHouse(house);
            updatePerson.setCity(city);
            person.updatePerson(person, selectedRowIndex);
            
            populateTable();
            JOptionPane.showMessageDialog(this, "Data Updated Successfully ");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatient.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this,"please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();

        //DELETE PATIENT FROM PATIENT DIRECTORY
        Patient selectedPatient = (Patient) model.getValueAt(selectedRowIndex, 0);
        patient.deletePatient(selectedPatient);
        
        //DELETE PATIENT FROM PERSON DIRECTORY
//        Person selectedPerson = (Person) model.getValueAt(selectedRowIndex, 0);
//        person.deleteDoctor(selectedPerson);
//        JOptionPane.showMessageDialog(this,"Patient deleted");

        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboboxCommunity;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        model.setRowCount(0);
        
        for(Patient pa: Patient.getPatientDirectory()){
            Object[] row = new Object[5];
            row[0] = pa;
            row[1] = pa.getAge();
            row[2] = pa.getGender();
            row[3] = pa.getHouse();
            row[4] = pa.getCommunity();
            model.addRow(row);}
        
    }
       private void populatecommunity() {

    ComboboxCommunity.setModel(new DefaultComboBoxModel<String>(communitydirectory.toArray(new String[0])));  
        
    }
}
