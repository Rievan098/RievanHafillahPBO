/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p9;

/**
 *
 * @author Rievan Hafillah
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FormWarnet extends javax.swing.JFrame {

    /**
     * Creates new form FormWarnet
     */
    WarnetController controller;
    public FormWarnet() {
        initComponents();
        controller = new WarnetController(this);
        controller.clearForm();
        controller.tampil();
    }

    public JComboBox<String> getCbJenis() {
        return cbJenis;
    }

    public JTable getTblWarnet() {
        return tblWarnet;
    }

    public JTextField getTxtKeluar() {
        return txtKeluar;
    }

    public JTextField getTxtKode() {
        return txtKode;
    }

    public JTextField getTxtMasuk() {
        return txtMasuk;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtTanggal() {
        return txtTanggal;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cbJenis = new javax.swing.JComboBox<>();
        txtTanggal = new javax.swing.JTextField();
        txtMasuk = new javax.swing.JTextField();
        txtKeluar = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWarnet = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Form Warnet ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(165, 6, 90, 16);

        jLabel2.setText("Kode Pelanggan ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(16, 43, 169, 16);

        jLabel3.setText("Nama Pelanggan ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(16, 74, 169, 16);

        jLabel4.setText("Jenis Pelanggan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(16, 105, 169, 16);

        jLabel5.setText("Tanggal Masuk");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(16, 136, 169, 16);

        jLabel6.setText("Jam Masuk");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(16, 167, 169, 16);

        jLabel7.setText("Jam Keluar");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(16, 201, 169, 16);

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtKode);
        txtKode.setBounds(191, 40, 201, 22);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama);
        txtNama.setBounds(191, 68, 201, 22);

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbJenis);
        cbJenis.setBounds(191, 102, 201, 22);
        getContentPane().add(txtTanggal);
        txtTanggal.setBounds(191, 130, 201, 22);
        getContentPane().add(txtMasuk);
        txtMasuk.setBounds(191, 164, 201, 22);
        getContentPane().add(txtKeluar);
        txtKeluar.setBounds(191, 198, 201, 22);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(6, 238, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(99, 238, 72, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(192, 238, 72, 23);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(285, 238, 72, 23);

        tblWarnet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama Pelanggan", "Jenis Pelanggan", "Tanggal Masuk", "Jam Masuk", "Jam Keluar", "Lama", "Tarif", "Diskon", "Total Bayar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWarnet);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 279, 820, 276);

        setSize(new java.awt.Dimension(840, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        btnInsert.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.saveWarnet();
            controller.tampil();
        }
    });// TODO add your handling code here:
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        btnUpdate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.updateWarnet();
            controller.tampil();
        }
    });// TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        btnDelete.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.deleteWarnet();
            controller.tampil();
        }
    });// TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        btnCancel.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            controller.clearForm();
        }
    });// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    
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
            java.util.logging.Logger.getLogger(FormWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormWarnet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWarnet;
    private javax.swing.JTextField txtKeluar;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtMasuk;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables

    Object getTxtkodePelanggan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
