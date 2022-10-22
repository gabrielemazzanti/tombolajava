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
     * https://fonts.google.com/specimen/Secular+One?category=Sans+Serif
     * https://fonts.google.com/specimen/Lexend+Deca?category=Sans+Serif&preview.text=CARTELLA&preview.text_type=custom
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
        setPreferredSize(new java.awt.Dimension(900, 500));

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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenera))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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
        int[][] scheda = new int[3][9];

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
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 9; i++) {
                scheda[j][i]=random.nextInt(i, (i + 1) * 10);
//                row1[i] = random.nextInt(i, (i + 1) * 10);
//                row2[i] = random.nextInt(i, (i + 1) * 10);
//                row3[i] = random.nextInt(i, (i + 1) * 10);
                if (i > 0) {
                    row1[i] = random.nextInt(i * 10, (i + 1) * 10);
                    row2[i] = random.nextInt(i * 10, (i + 1) * 10);
                    row3[i] = random.nextInt(i * 10, (i + 1) * 10);
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            vuoti[i] = random.nextInt(0, 9);
        }
        int diversi = 1;
        while (diversi != 0) {
            diversi = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (vuoti[i] == vuoti[j]) {
                        if (i != j) {
                            vuoti[j] = random.nextInt(0, 9);
                            diversi++;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            row1[vuoti[i]] = null;
        }
        for (int i = 0; i < 4; i++) {
            vuoti[i] = random.nextInt(0, 9);
        }

        diversi = 1;
        while (diversi != 0) {
            diversi = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (vuoti[i] == vuoti[j]) {
                        if (i != j) {
                            vuoti[j] = random.nextInt(0, 9);
                            diversi++;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            row2[vuoti[i]] = null;
        }

        for (int i = 0; i < 4; i++) {
            vuoti[i] = random.nextInt(0, 9);
        }

        diversi = 1;
        while (diversi != 0) {
            diversi = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (vuoti[i] == vuoti[j]) {
                        if (i != j) {
                            vuoti[j] = random.nextInt(0, 9);
                            diversi++;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            row3[vuoti[i]] = null;
        }

        tableModel.addRow(row1);
        tableModel.addRow(row2);
        tableModel.addRow(row3);

        jTable1.setModel(tableModel);
    }

}
