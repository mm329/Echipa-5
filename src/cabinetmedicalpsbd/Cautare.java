
package cabinetmedicalpsbd;

import static cabinetmedicalpsbd.MyDb.con;
import static cabinetmedicalpsbd.MyDb.st;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.Position;

public class Cautare extends javax.swing.JFrame {
    
    final void FillList(){
        
        try {
            String query = "SELECT * FROM pacient";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical", "root", "");
            st = con.prepareStatement(query);
            
            ResultSet rs = st.executeQuery(query);
            
            DefaultListModel DLM = new DefaultListModel();
            
            while (rs.next()){
                
                DLM.addElement(rs.getString(1));
            }
            
            List1.setModel(DLM);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        dispose();
    }
    
    public Cautare() {
        initComponents();
        FillList();
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelefonText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SexText = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        VarstaText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NumeText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        InaltimeText = new javax.swing.JTextField();
        GreutateText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        ModificaPacient = new javax.swing.JButton();
        StergePacient = new javax.swing.JButton();
        CautareText = new javax.swing.JTextField();
        CautarePacient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Acasa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Data nasterii:");

        SexText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminin", "Masculin" }));
        SexText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexTextActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefon:");

        VarstaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VarstaTextActionPerformed(evt);
            }
        });

        jLabel6.setText("Sex:");

        jLabel3.setText("Nume:");

        jLabel7.setText("Greutate:");

        jLabel9.setText("Inaltime:");

        GreutateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreutateTextActionPerformed(evt);
            }
        });

        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        ModificaPacient.setText("Modifica");
        ModificaPacient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaPacientActionPerformed(evt);
            }
        });

        StergePacient.setText("Sterge!");
        StergePacient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StergePacientActionPerformed(evt);
            }
        });

        CautareText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CautareTextActionPerformed(evt);
            }
        });

        CautarePacient.setText("Cautare...");
        CautarePacient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CautarePacientActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/hiperdia.png"))); // NOI18N

        Acasa.setText("Acasa");
        Acasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcasaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CautarePacient)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CautareText, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VarstaText, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GreutateText, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InaltimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SexText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumeText, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(117, 117, 117)
                                    .addComponent(ModificaPacient, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(StergePacient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TelefonText, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Acasa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Acasa)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumeText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VarstaText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SexText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InaltimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GreutateText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefonText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ModificaPacient, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StergePacient, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CautareText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CautarePacient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SexTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexTextActionPerformed

    private void VarstaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarstaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VarstaTextActionPerformed

    private void GreutateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreutateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GreutateTextActionPerformed

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
       try {
            String query = "SELECT * FROM pacient WHERE nume = '"+List1.getSelectedValue()+"'";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical", "root", "");
            st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()){
                NumeText.setText(rs.getString(1));
                VarstaText.setText(rs.getString(2));
                SexText.setSelectedItem(rs.getString(3));
                InaltimeText.setText(rs.getString(4));
                GreutateText.setText(rs.getString(5));
                TelefonText.setText(rs.getString(6));
            }

            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
       dispose();
    }//GEN-LAST:event_List1ValueChanged

    private void ModificaPacientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaPacientActionPerformed
    
       try {
            String query = "UPDATE pacient set nume='"+NumeText.getText()+"', varsta='"+VarstaText.getText()+
                    "', sex='"+SexText.getSelectedItem()+"', inaltime='"+InaltimeText.getText()+"', greutate='"
                    +GreutateText.getText()+"', telefon='"+TelefonText.getText()+"' WHERE nume ='"+List1.getSelectedValue()+"'";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical", "root", "");
            st = con.prepareStatement(query);
            st.execute(query);
            
            JOptionPane.showMessageDialog(null, "A fost modificat!");
            
            FillList();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }        
        
    }//GEN-LAST:event_ModificaPacientActionPerformed

    private void StergePacientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StergePacientActionPerformed
        try {
            String query = "DELETE FROM pacient WHERE nume = '"+List1.getSelectedValue()+"'";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical", "root", "");
            st = con.prepareStatement(query);
            st.execute(query);
            
            JOptionPane.showMessageDialog(null, "A fost sters!");
            
            FillList();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        dispose();
    }//GEN-LAST:event_StergePacientActionPerformed

    private void CautareTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CautareTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CautareTextActionPerformed

    private void CautarePacientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CautarePacientActionPerformed
        int rezultat = List1.getNextMatch(CautareText.getText(), 0, Position.Bias.Forward);
        List1.setSelectedIndex(rezultat);
        dispose();
    }//GEN-LAST:event_CautarePacientActionPerformed

    private void AcasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcasaActionPerformed
        Main m = new Main();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_AcasaActionPerformed

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
            java.util.logging.Logger.getLogger(Cautare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cautare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cautare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cautare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cautare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acasa;
    private javax.swing.JButton CautarePacient;
    private javax.swing.JTextField CautareText;
    private javax.swing.JTextField GreutateText;
    private javax.swing.JTextField InaltimeText;
    private javax.swing.JList<String> List1;
    private javax.swing.JButton ModificaPacient;
    private javax.swing.JTextField NumeText;
    private javax.swing.JComboBox<String> SexText;
    private javax.swing.JButton StergePacient;
    private javax.swing.JTextField TelefonText;
    private javax.swing.JTextField VarstaText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
