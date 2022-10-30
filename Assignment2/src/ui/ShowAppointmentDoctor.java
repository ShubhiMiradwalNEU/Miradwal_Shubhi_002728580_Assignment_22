/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CommunityAdmin;
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

        tblappointmentdoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "City", "Age"
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

        lblPatientVitalSign.setText("Vital Signs");

        lblpatienttemperature.setText("Temperature");

        lblPatientBloodPressure.setText("Blood Pressure");

        lblPatientDescription.setText("Description");

        lblPatientname.setText("Name");

        btnPatientsubmit.setText("Submit");
        btnPatientsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpatienttemperature)
                                    .addComponent(lblPatientBloodPressure)
                                    .addComponent(lblPatientDescription)
                                    .addComponent(lblPatientname))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPatientDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(txtPatienttemperature)
                                    .addComponent(txtPatientName)
                                    .addComponent(txtPatientBloodPressure)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(btnPatientsubmit)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(lblPatientVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lblPatientname))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblPatientVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpatienttemperature)
                    .addComponent(txtPatienttemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientBloodPressure)
                    .addComponent(txtPatientBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnPatientsubmit)
                .addGap(9, 9, 9))
        );
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
            row[1] = doc.getCity();
            row[2] = doc.getAge();
            model.addRow(row);
        }
        
    }
        
          }

