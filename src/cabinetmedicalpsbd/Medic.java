
package cabinetmedicalpsbd;

import static cabinetmedicalpsbd.MyDb.con;
import static cabinetmedicalpsbd.MyDb.st;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Position;

public class Medic extends javax.swing.JFrame {
        
    public Medic() {
        initComponents();
        aratamedici();
        
    }
    
    public ArrayList<Medici> mediciList() {
        ArrayList<Medici> mediciList = new ArrayList<>();
       try {
            String query1 = "SELECT * FROM medic";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical", "root", "");
            st = con.prepareStatement(query1);
            ResultSet rs = st.executeQuery(query1);
            
            Medici m;
            while (rs.next()){
                 m= new Medici(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));  
                 mediciList.add(m);
            }

            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mediciList;
        
    }
    
    public void aratamedici() {
        ArrayList<Medici> list = null;
        list = mediciList();
        DefaultTableModel model = (DefaultTableModel)MediciTabel.getModel();
        Object[] row = new Object[4];
        for (int i=0; i<list.size();i++){
            row[0]=list.get(i).getSpecializare();
            row[1]=list.get(i).getNume();
            row[2]=list.get(i).getTitulatura();
            row[3]=list.get(i).getDurata();
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MediciTabel = new javax.swing.JTable();
        Acasa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/hiperdia.png"))); // NOI18N

        MediciTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Specializare", "Nume", "Titulatura", "Durata consultatiei"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(MediciTabel);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Acasa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(Acasa)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcasaActionPerformed
        Main m = new Main();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_AcasaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acasa;
    private javax.swing.JTable MediciTabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void arataMedici() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
