package tombola;

import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author utente
 */
public class TombolaClient extends javax.swing.JFrame {

    /**
     * Creates new form TombolaClient
     */
    public TombolaClient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableModel = new DefaultTableModel();
        DefaultTableModel tableModel = new DefaultTableModel(0, 0);
        jTable1 = new javax.swing.JTable();
        btnGenera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(tableModel);
        jTable1.setTableHeader(null);
        jScrollPane2.setViewportView(jTable1);

        btnGenera.setText("nuova scheda");
        btnGenera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenera)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(btnGenera)
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeneraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneraActionPerformed
        generateNewTable();
    }//GEN-LAST:event_btnGeneraActionPerformed

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
            java.util.logging.Logger.getLogger(TombolaClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TombolaClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TombolaClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TombolaClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TombolaClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenera;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel tableModel;

    private void generateNewTable() {
        int[] vuoti = new int[4];
        Random random = new Random();
        tableModel = new DefaultTableModel();
        tableModel.addColumn("a");
        tableModel.addColumn("b");
        tableModel.addColumn("c");
        tableModel.addColumn("d");
        tableModel.addColumn("e");
        tableModel.addColumn("f");
        tableModel.addColumn("g");
        tableModel.addColumn("h");
        tableModel.addColumn("i");
        Object[] row1 = new Object[9];
        Object[] row2 = new Object[9];
        Object[] row3 = new Object[9];

        for (int i = 0; i < 9; i++) {
            row1[i] = random.nextInt(i, (i + 1) * 10);
            row2[i] = random.nextInt(i, (i + 1) * 10);
            row3[i] = random.nextInt(i, (i + 1) * 10);
            if (i > 0) {
                row1[i] = random.nextInt(i * 10, (i + 1) * 10);
                row2[i] = random.nextInt(i * 10, (i + 1) * 10);
                row3[i] = random.nextInt(i * 10, (i + 1) * 10);
            }
        }
        
        for (int i = 0; i < 4; i++) {
            vuoti[i] = random.nextInt(0, 9);
            for (int j = 0; j < i; j++) {
                while (vuoti[i] == vuoti[j]) {
                    vuoti[i] = random.nextInt(0, 9);
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            row1[vuoti[i]]=null;
        }

        tableModel.addRow(row1);
        tableModel.addRow(row2);
        tableModel.addRow(row3);

        jTable1.setModel(tableModel);
//        int[] vuoti = new int[4];
//        tableModel = new DefaultTableModel();
//        tableModel.addColumn("a");
//        tableModel.addColumn("b");
//        tableModel.addColumn("c");
//        tableModel.addColumn("d");
//        tableModel.addColumn("e");
//        tableModel.addColumn("f");
//        tableModel.addColumn("g");
//        tableModel.addColumn("h");
//        tableModel.addColumn("i");
//        Random random = new Random();
//        Object[] row = new Object[9];
//        for (int j = 0; j < 3; j++) {
//            for (int i = 0; i < 9; i++) {
//                row[i] = random.nextInt(0, 90);
//            }
//            vuoti[0] = random.nextInt(0, 9);
//            vuoti[1] = random.nextInt(0, 9);
//            vuoti[2] = random.nextInt(0, 9);
//            vuoti[3]=random.nextInt(0,9);
//            row[vuoti[0]]=null;
//            row[vuoti[1]]=null;
//            row[vuoti[2]]=null;
//            row[vuoti[3]]=null;
//
//            tableModel.addRow(row);
//        }
//
//        jTable1.setModel(tableModel);
    }

}
