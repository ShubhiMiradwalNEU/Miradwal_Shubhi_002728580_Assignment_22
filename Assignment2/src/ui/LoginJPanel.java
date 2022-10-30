/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.HospitalAdmin;
import model.Person;
import static model.Person.personDirectory;

/**
 *
 * @author user
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    Person person = new Person();
    public LoginJPanel() {
        initComponents();
    }

       public static  String cacity;
       public static String pacity;
       public static String paname;
       public static int paAge;
       public static String docName;
       public static String pacommunity;

    public static String getPacommunity() {
        return pacommunity;
    }

    public static void setPacommunity(String pacommunity) {
        LoginJPanel.pacommunity = pacommunity;
    }

    public static String getDocName() {
        return docName;
    }

    public static void setDocName(String docName) {
        LoginJPanel.docName = docName;
    }

    public static String getPaname() {
        return paname;
    }

    public static void setPaname(String paname) {
        LoginJPanel.paname = paname;
    }

    public static int getPaAge() {
        return paAge;
    }

    public static void setPaAge(int paAge) {
        LoginJPanel.paAge = paAge;
    }
    public static String getPacity() {
        return pacity;
    }

    public static void setPacity(String pacity) {
        LoginJPanel.pacity = pacity;
    }

    public String getCacity() {
        return cacity;
    }

    public static void setCacity(String cacity) {
        LoginJPanel.cacity = cacity;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setBackground(new java.awt.Color(0, 0, 0));
        lblUsername.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 102, 102));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("USERNAME");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 92, 50));

        txtUsername.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        txtUsername.setAlignmentX(0.0F);
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 170, 50));

        lblPassword.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 102, 102));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("PASSWORD");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 92, 50));

        jPasswordField1.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        jPasswordField1.setAlignmentX(0.0F);
        add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 170, 50));

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Academy Engraved LET", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        MainJFrame mainPage = new MainJFrame();
        
        String username = txtUsername.getText();
        String password = jPasswordField1.getText();

        System.out.println("====== LOGIN PAGE ==========");
        System.out.println("username- "+username);
        System.out.println("password- "+password);

        for(Person person: Person.getPersonDirectory()){
            if((person.getPassword().equals(password))&&person.getUserName().equals(username)){
                System.out.println("== Username and Password Matches for== "+person.getUserType());
                
                if(person.getUserType().equals("system admin")){
                    
                    SystemAdminJFrame systemAdmin = new SystemAdminJFrame();
                    systemAdmin.setVisible(true);
                    
                }
                else if(person.getUserType().equals("community admin")){
                    LoginJPanel.setCacity(person.getCity());
                 
                   
                    CommunityAdminJFrame communityAdmin = new CommunityAdminJFrame();
                    communityAdmin.setVisible(true);
                }
                else if(person.getUserType().equals("hospital admin")){
                    HospitalAdminJFrame hospAdmin = new HospitalAdminJFrame();
                    hospAdmin.setVisible(true); 
                }
                else if(person.getUserType().equals("doctor")){
                    DoctorJFrame doctor = new DoctorJFrame();
                    doctor.setVisible(true);
                    LoginJPanel.setDocName(person.getName());
                 
                    
                }
                else if(person.getUserType().equals("patient")){
                    //LoginJPanel.setPacity(person.getCity());
                    PatientJFrame patient = new PatientJFrame();
                      LoginJPanel.setPaname(person.getName());
                    LoginJPanel.setPaAge(person.getAge());
                    LoginJPanel.setPacity(person.getCity());
                       LoginJPanel.setPacommunity(person.getCommunity());
                    patient.setVisible(true);
                    
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "Invalid Username or Password");
                }
            }
//            else{
//                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
//            }
    }
        
//        if (username.equals("hospitalAdmin") && password.equals("1234")){
//            System.out.println("== Username and Password Matches ==");
//            HospitalAdminJFrame hospAdmin = new HospitalAdminJFrame();
//            hospAdmin.setVisible(true);
//        }
//        else if (username.equals("communityAdmin") && password.equals("12345")){
//            System.out.println("== Username and Password Matches ==");
//            CommunityAdminJFrame communityAdmin = new CommunityAdminJFrame();
//            communityAdmin.setVisible(true);
//        }
//        else if (username.equals("systemAdmin") && password.equals("123456")){
//            System.out.println("== Username and Password Matches ==");
//            SystemAdminJFrame systemAdmin = new SystemAdminJFrame();
//            systemAdmin.setVisible(true);
//        }

    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    
}

