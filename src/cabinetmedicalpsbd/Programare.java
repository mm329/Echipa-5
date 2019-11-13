package cabinetmedicalpsbd;

import static cabinetmedicalpsbd.MyDb.con;
import static cabinetmedicalpsbd.MyDb.st;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

 
public class Programare extends javax.swing.JFrame {

    public Programare() {
        initComponents();
    }
    
    public ArrayList<ProgramareClasa> programareList() {
        ArrayList<ProgramareClasa> programareList = new ArrayList<>();
       try {
            String query1 = "SELECT * FROM programare";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical", "root", "");
            st = con.prepareStatement(query1);
            ResultSet rs = st.executeQuery(query1);
            
            ProgramareClasa p;
            while (rs.next()){
            p = new ProgramareClasa(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));  
            programareList.add(p);
            }

            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return programareList;
    }
    
    public void arataprogramare() {
        ArrayList<ProgramareClasa> list = null;
        list = programareList();

        Object[] row = new Object[4];
        for (int i=0; i<list.size();i++){
            row[0]=list.get(i).getMedic();
            row[1]=list.get(i).getPacient();
            row[2]=list.get(i).getData();
            row[3]=list.get(i).getAchitata();

        }
        dispose();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Programare = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/hiperdia.png"))); // NOI18N

        Programare.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Dublea Ioan", "Manole Maria", "21/01/2019", "100 lei"},
                {"Bariz Luminita", "Munteanu Andreea", "22/01/2019", "500l ei"},
                {"Fanaca Ionut", "Lefterache Andreea", "5/01/2019", "120 lei"},
                {"Dublea Ioan", "Jec Valentin", "12/01/2019", "140 lei"}
            },
            new String [] {
                "Medic", "Pacient", "Data", "Achitata"
            }
        ));
        jScrollPane1.setViewportView(Programare);

        jButton1.setText("Export .txt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(95, 95, 95)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String filePath = "C:\\Users\\Maria\\Desktop\\Text.txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i=0; i<Programare.getRowCount(); i++){
                for(int j=0; j<Programare.getColumnCount();j++){
                    bw.write(Programare.getValueAt(i,j).toString()+" ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Programare.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Programare;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
