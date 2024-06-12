package trafficdatabasesystem;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Tasnem
 */
public class IssueNewDrivingIDForm extends javax.swing.JFrame {


    /**
     * Creates new form IssueNewDrivingIDForm
     */
    public IssueNewDrivingIDForm() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        AddressField = new javax.swing.JTextField();
        NationalIDField = new javax.swing.JTextField();
        Job = new javax.swing.JTextField();
        DateOfIssueField = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        NationalityField = new javax.swing.JTextField();
        DateOfExpField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ConfirmationButton = new javax.swing.JButton();
        LoadDataButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Issue New Driving ID");
        setMinimumSize(new java.awt.Dimension(1108, 581));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setText("Issue New Driving ID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 650, 90);
        jPanel2.add(NameField);
        NameField.setBounds(140, 150, 400, 40);
        jPanel2.add(AddressField);
        AddressField.setBounds(140, 210, 400, 40);

        NationalIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalIDFieldActionPerformed(evt);
            }
        });
        jPanel2.add(NationalIDField);
        NationalIDField.setBounds(170, 280, 340, 40);

        Job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobActionPerformed(evt);
            }
        });
        jPanel2.add(Job);
        Job.setBounds(170, 350, 340, 40);

        DateOfIssueField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateOfIssueFieldActionPerformed(evt);
            }
        });
        jPanel2.add(DateOfIssueField);
        DateOfIssueField.setBounds(650, 150, 400, 40);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setText("TestPassed");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1);
        jCheckBox1.setBounds(670, 350, 110, 40);

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox2.setText("W/Glasses");
        jPanel2.add(jCheckBox2);
        jCheckBox2.setBounds(800, 350, 110, 40);
        jPanel2.add(NationalityField);
        NationalityField.setBounds(690, 280, 330, 40);
        jPanel2.add(DateOfExpField);
        DateOfExpField.setBounds(650, 210, 400, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 160, 60, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("DOI:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(570, 160, 44, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DOE:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(570, 220, 46, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Nationality:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(570, 290, 105, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Address:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 220, 78, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("NationalID:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(60, 290, 106, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Job:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(60, 360, 38, 22);

        ConfirmationButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ConfirmationButton.setText("Confirm");
        ConfirmationButton.setEnabled(false);
        ConfirmationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmationButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ConfirmationButton);
        ConfirmationButton.setBounds(450, 470, 151, 51);

        LoadDataButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LoadDataButton.setText("LoadData");
        LoadDataButton.setActionCommand("Load");
        LoadDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadDataButtonActionPerformed(evt);
            }
        });
        jPanel2.add(LoadDataButton);
        LoadDataButton.setBounds(80, 490, 91, 23);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trafficdatabasesystem/IssueDocument.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 0, 1110, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NationalIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalIDFieldActionPerformed

    private void JobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JobActionPerformed

    private void DateOfIssueFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateOfIssueFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateOfIssueFieldActionPerformed

    private void LoadDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadDataButtonActionPerformed
        // TODO add your handling code here:
 NameField.setText( Global.GlobalNationalID.getName());
 AddressField.setText(Global.GlobalNationalID.getAddress());
 NationalIDField.setText(Long.toString(Global.GlobalNationalID.getNationalID()));
 Job.setText(Global.GlobalNationalID.getJob());
 NationalityField.setText("Egyptian");
 Global.cal.setTime(Global.date);
 Global.cal.add(Calendar.YEAR, 7);
 Global.GlobalNationalID.setDateOfIssue(Global.date);
 Global.GlobalNationalID.setDateOfExpiry(Global.cal.getTime());
DateOfIssueField.setText(Global.formatter.format(Global.GlobalNationalID.getDateOfIssue()));
DateOfExpField.setText(Global.formatter.format(Global.GlobalNationalID.getDateOfExpiry()));
LoadDataButton.setVisible(false);
    }//GEN-LAST:event_LoadDataButtonActionPerformed

    private void ConfirmationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmationButtonActionPerformed
        // TODO add your handling code here:
    DrivingID d=new DrivingID(); //gow ashan lw bara hykrar
            //fileList.add(sc.nextLine());
            d.setName(NameField.getText());
            d.setAddress(AddressField.getText());
            d.setNationalID(Global.GlobalID);
            d.setJob(Job.getText());
            d.setDateOfIssue(Global.GlobalNationalID.getDateOfIssue()); //DATE FORMAT IS TO BE DEBUGGED
            d.setDateOfExpiry(Global.GlobalNationalID.getDateOfExpiry());
            d.setNationality(NationalityField.getText());
if(!jCheckBox1.isSelected()) {
  //not checked
 d.setTestPassed(false);
} else {
d.setTestPassed(true);
}
if(!jCheckBox2.isSelected()) {
  //not checked
 d.setOpticalGlasses(false);
} else {
 d.setOpticalGlasses(true);
}
      Global.DrivingIDList.add(d);
JOptionPane.showMessageDialog(null, "Done Successfully!\nYou can take your driving ID after 2 days!");
this.setVisible(false);//Closing the Current frame
                                new DrivingIDForm().setVisible(true);// Opening a new frame
    }//GEN-LAST:event_ConfirmationButtonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected() && !LoadDataButton.isVisible())
            ConfirmationButton.setEnabled(true);
        else
            ConfirmationButton.setEnabled(false);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(IssueNewDrivingIDForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueNewDrivingIDForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueNewDrivingIDForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueNewDrivingIDForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueNewDrivingIDForm().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JButton ConfirmationButton;
    private javax.swing.JTextField DateOfExpField;
    private javax.swing.JTextField DateOfIssueField;
    private javax.swing.JTextField Job;
    private javax.swing.JButton LoadDataButton;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField NationalIDField;
    private javax.swing.JTextField NationalityField;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
