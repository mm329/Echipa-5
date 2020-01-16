/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinetmedicalpsbd;

import static clase.MyDb.con;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import javax.swing.JOptionPane;
import cabinetmedicalpsbd.IstoricPacient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import net.sf.jasperreports.engine.charts.design;
/**
 *
 * @author Maria
 */
public class IstoricPacient extends javax.swing.JFrame {

    private Object query;

    public IstoricPacient() {
        initComponents();
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        
        
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getWidth();
       this.setSize(xsize, ysize); 
    }

    Connection con;
    PreparedStatement ps;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Acasa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        InapoiButon = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Acasa.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Acasa.setForeground(new java.awt.Color(0, 0, 153));
        Acasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/med.jpg"))); // NOI18N
        Acasa.setText("Acasa");
        Acasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcasaActionPerformed(evt);
            }
        });
        getContentPane().add(Acasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/hiperdia.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 153));
        jLabel2.setText("Nume:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 70, 60));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 153));
        jLabel3.setText("Cauta istoricul pacientului");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 210, 60));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 210, 30));

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/dd.jpg"))); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 130, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/pacient.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 100, 90));

        InapoiButon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        InapoiButon.setForeground(new java.awt.Color(0, 0, 51));
        InapoiButon.setText("Inapoi");
        InapoiButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InapoiButonActionPerformed(evt);
            }
        });
        getContentPane().add(InapoiButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabinetmedicalpsbd/fundal2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcasaActionPerformed
        Main m = new Main();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_AcasaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      /*  
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical", "root", "");
            JasperDesign jd = JRXmlLoader.
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IstoricPacient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IstoricPacient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            InputStream in = new FileInputStream(new File("C:\\Users\\Maria\\Documents\\NetBeansProjects\\CabinetMedicalPSBD\\src\\cabinetmedicalpsbd\\Ist.jrxml"));
            JasperDesign jd = JRXmlLoader.load(in);
            String sql = "SELECT * from consultatie";
            query.setText(sql);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            HashMap para = new HashMap();
            JasperPrint j = JasperFillManager.fillReport(jr, para, con);
            JasperViewer.viewReport(j, false);
            OutputStream os = new FileOutputStream(new File(""));
            JasperExportManager.exportReportToPdfStream(j, os);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void InapoiButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InapoiButonActionPerformed
        PacientiCRUD m = new PacientiCRUD();
        m.setVisible(true);
        dispose();

    }//GEN-LAST:event_InapoiButonActionPerformed

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
            java.util.logging.Logger.getLogger(IstoricPacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IstoricPacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IstoricPacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IstoricPacient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IstoricPacient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acasa;
    private javax.swing.JButton InapoiButon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private static class JRXmlLoader {

        private static JasperDesign load(InputStream in) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public JRXmlLoader() {
        }
    }

    private static class JasperDesign {

        public JasperDesign() {
        }
    }
}
