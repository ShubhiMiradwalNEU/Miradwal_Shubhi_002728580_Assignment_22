/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.VitalSigns;

/**
 *
 * @author shubhimiradwal
 */
public class EncounterHistoryPatientJPanel extends javax.swing.JPanel {
        
    LoginJPanel lp= new LoginJPanel();
    /**
     * Creates new form EncounterHistoryPatientJPanel
     */
    public EncounterHistoryPatientJPanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientEncounterHistory = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPatientEncounterHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Temperature", "BloodPressure", "Description"
            }
        ));
        tblPatientEncounterHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientEncounterHistoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatientEncounterHistory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void tblPatientEncounterHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientEncounterHistoryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientEncounterHistoryMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPatientEncounterHistory;
    // End of variables declaration//GEN-END:variables

 private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatientEncounterHistory.getModel();
        model.setRowCount(0);
        
        for(VitalSigns doc: VitalSigns.getVitalSigns()){
            if(doc.getPatientName().equals(lp.getPaname()))
            {
            Object[] row = new Object[6];
            row[0] = doc.getDoctorName();
            row[1] = doc.getPatientName();
            row[2] = doc.getBloodPressure();
            row[3] = doc.getDescription();
            model.addRow(row);
            }
            else{
            continue;
            }
        }
 }
}
 
