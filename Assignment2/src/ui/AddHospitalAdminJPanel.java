/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import static java.awt.image.ImageObserver.ABORT;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static model.CommunityAdmin.communitydirectory;
import model.HospitalAdmin;
import model.Person;
import static model.Person.personDirectory;

/**
 *
 * @author user
 */
public class AddHospitalAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddHospitalAdminJPanel
     */
    Person person = new Person();
    HospitalAdmin hospitalAdmin = new HospitalAdmin();
      LoginJPanel lp= new LoginJPanel();
    public AddHospitalAdminJPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblHospitalName = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtHospitalName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        comboGender = new javax.swing.JComboBox<>();
        txtPatientcity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboBoxCommunity = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lblName.setBackground(new java.awt.Color(204, 255, 255));
        lblName.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 102, 102));
        lblName.setText("NAME");

        lblGender.setBackground(new java.awt.Color(204, 255, 255));
        lblGender.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblGender.setForeground(new java.awt.Color(0, 102, 102));
        lblGender.setText("GENDER");

        lblHospitalName.setBackground(new java.awt.Color(204, 255, 255));
        lblHospitalName.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblHospitalName.setForeground(new java.awt.Color(0, 102, 102));
        lblHospitalName.setText("HOSPITAL NAME");

        lblCity.setBackground(new java.awt.Color(204, 255, 255));
        lblCity.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblCity.setForeground(new java.awt.Color(0, 102, 102));
        lblCity.setText("CITY");

        lblTitle.setFont(new java.awt.Font("Academy Engraved LET", 1, 18)); // NOI18N
        lblTitle.setText("CREATE  HOSPITAL ADMIN");

        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        jLabel1.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        jLabel1.setText("Community");

        comboBoxCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblHospitalName, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPatientcity)
                                    .addComponent(comboGender, 0, 160, Short.MAX_VALUE)
                                    .addComponent(txtName)
                                    .addComponent(txtHospitalName)
                                    .addComponent(comboBoxCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCity, lblGender, lblHospitalName, lblName});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitle)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblName)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGender)
                    .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospitalName)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtPatientcity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCity, lblGender, lblHospitalName, lblName});

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String name = txtName.getText();
        String gender = (String) comboGender.getSelectedItem();
        String hospitalName = txtHospitalName.getText();
        String community= (String) comboBoxCommunity.getSelectedItem();
        String city=txtPatientcity.getText();
                
         // String city = lp.getCacity();
        
        hospitalAdmin.addNewHospitalAdmin(name, gender, hospitalName,community, city);
        
        String username = name;
        String password = name;
        String usertype = "hospital admin";
        System.out.println("=======CreateHospitalAdminJPanel================="+username+"=="+password+"=="+usertype);
        personDirectory.add(new Person(username, password, usertype, name, 0, gender, "NoHouse",community, city, "NoPhysicianType", hospitalName));
        for(Person per: Person.getPersonDirectory()){
            System.out.println(per.getName()+per.getPassword()+per.getCity());
        }
        JOptionPane.showMessageDialog(this, "Hospital Admin added successfuly");
    }//GEN-LAST:event_btnSaveActionPerformed
    
    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboBoxCommunity;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientcity;
    // End of variables declaration//GEN-END:variables

private void populateTable()
{
    comboBoxCommunity.setModel(new DefaultComboBoxModel<String>(communitydirectory.toArray(new String[0])));
}
}
