/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;

/**
 *
 * @author user
 */
public class DoctorsInHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDoctorsJPanel
     */
    Doctor doc = new Doctor();
    public DoctorsInHospitalJPanel() {
        initComponents();
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddDoctors = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblAddDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "PhysicianType", "House", "City", "HospitalName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAddDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAddDoctorsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAddDoctors);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 1000, 350));

        jLabel1.setFont(new java.awt.Font("Academy Engraved LET", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("DOCTOR IN HOSPITAL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 230, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void tblAddDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddDoctorsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAddDoctorsMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAddDoctors;
    // End of variables declaration//GEN-END:variables
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblAddDoctors.getModel();
        model.setRowCount(0);
        
        for(Doctor doc: Doctor.getDoctorInHospitalDirectory()){
            Object[] row = new Object[6];
            row[0] = doc;
            row[1] = doc.getGender();
            row[2] = doc.getPhysicianType();
            row[3] = doc.getHouse();
            row[4] = doc.getCity();
            row[5] = doc.getHospitalName();
            model.addRow(row);
        }       
    }
    private void populateTableDoctorInHospital() {
        DefaultTableModel model = (DefaultTableModel) tblAddDoctors.getModel();
        model.setRowCount(0);
        
        for(Doctor docHosp: Doctor.getDoctorInHospitalDirectory()){
            System.out.println("=========  Populate Add doctors in hospital =================");
            System.out.println(docHosp);
            Object[] row = new Object[6];
            row[0] = docHosp;
            row[1] = docHosp.getGender();
            row[2] = docHosp.getPhysicianType();
            row[3] = docHosp.getHouse();
            row[4] = docHosp.getCity();
            row[5] = docHosp.getHospitalName();
            model.addRow(row);
        }
        
    }
}
