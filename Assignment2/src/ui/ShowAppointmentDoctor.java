/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CommunityAdmin;
import static model.CommunityAdmin.communitydirectory;
import model.Doctor;
import model.PatientAppointment;
import model.VitalSigns;

/**
 *
 * @author shubhimiradwal
 */
public class ShowAppointmentDoctor extends javax.swing.JPanel {

    /**
     * Creates new form ShowAppointmentDoctor
     */
    public ShowAppointmentDoctor() {
        initComponents();
        populateTable();
        //populatecommunity();
    }
    VitalSigns vs= new VitalSigns();
    LoginJPanel lb= new LoginJPanel();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblappointmentdoctor = new javax.swing.JTable();
        lblPatientVitalSign = new javax.swing.JLabel();
        lblpatienttemperature = new javax.swing.JLabel();
        txtPatienttemperature = new javax.swing.JTextField();
        lblPatientBloodPressure = new javax.swing.JLabel();
        txtPatientBloodPressure = new javax.swing.JTextField();
        lblPatientDescription = new javax.swing.JLabel();
        txtPatientDescription = new javax.swing.JTextField();
        lblPatientname = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        btnPatientsubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblappointmentdoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Community", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblappointmentdoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblappointmentdoctorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblappointmentdoctor);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 130));

        lblPatientVitalSign.setFont(new java.awt.Font("Academy Engraved LET", 1, 18)); // NOI18N
        lblPatientVitalSign.setForeground(new java.awt.Color(0, 102, 102));
        lblPatientVitalSign.setText("Vital Signs");
        add(lblPatientVitalSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 94, 28));

        lblpatienttemperature.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblpatienttemperature.setForeground(new java.awt.Color(0, 102, 102));
        lblpatienttemperature.setText("Temperature");
        add(lblpatienttemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 264, -1, -1));

        txtPatienttemperature.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        add(txtPatienttemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 256, 217, 34));

        lblPatientBloodPressure.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblPatientBloodPressure.setForeground(new java.awt.Color(0, 102, 102));
        lblPatientBloodPressure.setText("Blood Pressure");
        add(lblPatientBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 328, -1, -1));

        txtPatientBloodPressure.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        add(txtPatientBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 313, 217, 32));

        lblPatientDescription.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblPatientDescription.setForeground(new java.awt.Color(0, 102, 102));
        lblPatientDescription.setText("Description");
        add(lblPatientDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 385, -1, -1));

        txtPatientDescription.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        add(txtPatientDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 382, 217, -1));

        lblPatientname.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblPatientname.setForeground(new java.awt.Color(0, 102, 102));
        lblPatientname.setText("Name");
        add(lblPatientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 189, 58, 26));

        txtPatientName.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 187, 217, 32));

        btnPatientsubmit.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        btnPatientsubmit.setText("Submit");
        btnPatientsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientsubmitActionPerformed(evt);
            }
        });
        add(btnPatientsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 443, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tblappointmentdoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblappointmentdoctorMouseClicked
        // TODO add your handling code here:
         int selectedRowIndex = tblappointmentdoctor.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblappointmentdoctor.getModel();

        PatientAppointment selectedPatient = (PatientAppointment) model.getValueAt(selectedRowIndex, 0);
        System.out.println(selectedPatient);

//        Double BloodPressure= Double.parseDouble(txtPatientBloodPressure.getText());
//        Double Patienttemp= Double.parseDouble(txtPatienttemperature);
//        String issue= txtPatientDescription.getText();
        
        txtPatientName.setText(selectedPatient.getName());
            
    }//GEN-LAST:event_tblappointmentdoctorMouseClicked

    private void btnPatientsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientsubmitActionPerformed
        // TODO add your handling code here:
        String doctorName= lb.getDocName();
        String PatientName=txtPatientName.getText();
        Double BloodPressure= Double.parseDouble(txtPatientBloodPressure.getText());
        Double Patienttemp= Double.parseDouble(txtPatienttemperature.getText());
        String issue= txtPatientDescription.getText();        
        vs.addNewVitalSigns(doctorName,PatientName,Patienttemp, BloodPressure, issue);
        JOptionPane.showMessageDialog(this, "Vital Signs added in "+PatientName);
    }//GEN-LAST:event_btnPatientsubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPatientsubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPatientBloodPressure;
    private javax.swing.JLabel lblPatientDescription;
    private javax.swing.JLabel lblPatientVitalSign;
    private javax.swing.JLabel lblPatientname;
    private javax.swing.JLabel lblpatienttemperature;
    private javax.swing.JTable tblappointmentdoctor;
    private javax.swing.JTextField txtPatientBloodPressure;
    private javax.swing.JTextField txtPatientDescription;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatienttemperature;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
         DefaultTableModel model = (DefaultTableModel) tblappointmentdoctor.getModel();
        model.setRowCount(0);
        
        for(PatientAppointment doc: PatientAppointment.getAppointment()){
            Object[] row = new Object[3];
            row[0] = doc;
            row[1] = doc.getCommunity();
            row[2] = doc.getAge();
            model.addRow(row);
        }
        
    }
   
        
          }

