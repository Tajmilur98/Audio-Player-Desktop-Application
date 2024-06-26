
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jakir Hossain
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("REGISTER FORM");
        ImageIcon icon= new ImageIcon(getClass().getResource("media.png")) ;
        this.setIconImage(icon.getImage());
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
        goToLogInLabel = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        CancelRegButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mailField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        u_NameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goToLogInLabel.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        goToLogInLabel.setForeground(new java.awt.Color(0, 204, 204));
        goToLogInLabel.setText("GO TO LOG IN ");
        goToLogInLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToLogInLabelMouseClicked(evt);
            }
        });
        jPanel1.add(goToLogInLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 434, 120, -1));

        RegisterButton.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        RegisterButton.setText("REGISTER");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 100, -1));

        CancelRegButton.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        CancelRegButton.setText("CANCEL");
        CancelRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelRegButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelRegButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 90, -1));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setText("password");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 270, 30));

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("PASSWORD");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 110, 30));

        phoneField.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        phoneField.setText("017");
        jPanel1.add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 270, 30));

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("PHONE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 110, 30));

        mailField.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        mailField.setText("name@gmail.com");
        jPanel1.add(mailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 270, 30));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("E-MAIL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, 30));

        u_NameField.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        u_NameField.setText("USER");
        jPanel1.add(u_NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 270, 30));

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("USER NAME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 120, 30));

        nameField.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        nameField.setText("Mr. Name");
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 270, 30));

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 100, 30));

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("REGISTRATION FORM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 250, 40));

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void goToLogInLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToLogInLabelMouseClicked
        // TODO add your handling code here:
        LogInForm lgf = new LogInForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_goToLogInLabelMouseClicked

    private void CancelRegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelRegButtonActionPerformed
        // TODO add your handling code here:
          System.exit(0);
    }//GEN-LAST:event_CancelRegButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        String name = nameField.getText();
        String user_name = u_NameField.getText();
        String mail = mailField.getText();
        String phone = phoneField.getText();
        String password = jPasswordField1.getText();
        
        if(name.equals("")|user_name.equals("")|mail.equals("")|phone.equals("")|password.equals("") ){
             JOptionPane.showMessageDialog(null,"All Fields are required!");
        }
        else if(checkUserName(user_name)){
              JOptionPane.showMessageDialog(null,"User name already exists!");  
        }
        else{  
        //create files
        
      String path = "F:/2.2/User Files/";   
      path = path+user_name+phone;  
      //Instantiate the File class   
      File f1 = new File(path);  
      //Creating a folder using mkdir() method  
      f1.mkdir();  
      
      //creating 2 text file in folder
      String nameLoc = path+"/names.txt";
      String pathLoc = path+"/paths.txt";
      
      
      try{
      File nameFile = new File (nameLoc);
      nameFile.createNewFile();
      File pathFile = new File (pathLoc);
      pathFile.createNewFile();
      }catch (IOException e){
          //prints exception if any  
      }
        
      //finish creating files
      
      //add to database table
      PreparedStatement ps ;
      // the mysql insert statement
      String query = " insert into `tabledata` (`name`, `user_name`, `mail`, `phone`, `password`,`namefile`,`pathfile`)"
        + " values (?, ?, ?, ?, ?, ?,?)";
      
        try {
            ps = MySqlConnection.getConnection().prepareStatement(query);
            
            // create the mysql insert preparedstatement
            ps.setString (1, name);
            ps.setString (2, user_name);
            ps.setString (3, mail);
            ps.setString (4, phone);
            ps.setString (5, password);
            ps.setString (6, nameLoc);
            ps.setString (7, pathLoc);
            
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null,"New user added!");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_RegisterButtonActionPerformed
// check if the username exists
    public boolean checkUserName(String user_name){
        
        PreparedStatement ps;
        ResultSet rs ;
        boolean checkUserName =false;
            
        String query ="select *from `tabledata` where `user_name`=?";
        try {
            ps = MySqlConnection.getConnection().prepareStatement(query);
            ps.setString(1,user_name);
            rs = ps.executeQuery();
            
            if(rs.next()){
                checkUserName = true;
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         return checkUserName ;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelRegButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel goToLogInLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField mailField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField u_NameField;
    // End of variables declaration//GEN-END:variables
}
