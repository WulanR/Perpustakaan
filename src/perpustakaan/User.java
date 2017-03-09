/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Milo Nestlea
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        selectData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        bg = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        judul = new javax.swing.JTextField();
        kelas = new javax.swing.JComboBox<>();
        baca = new javax.swing.JRadioButton();
        pinjam = new javax.swing.JRadioButton();
        lain = new javax.swing.JRadioButton();
        keluar1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bersih = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Data Peminjaman");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 16, -1, -1));

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 51, -1, -1));

        jLabel3.setText("Kelas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 89, -1, -1));

        jLabel4.setText("Kegiatan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 117, -1, -1));

        jLabel5.setText("Judul");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 146, -1, -1));
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 48, 209, -1));
        getContentPane().add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 143, 213, -1));

        kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XI RPL 1", "XI RPL 2", "XI RPL 3", "XI RPL 4", "XI RPL 5", "XI RPL 6", "XI TKJ 1", "XI TKJ 2", "XI TKJ 3", "XI TKJ 4", "XI TKJ 5" }));
        kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasActionPerformed(evt);
            }
        });
        getContentPane().add(kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 86, -1, -1));

        bg.add(baca);
        baca.setText("Membaca");
        getContentPane().add(baca, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 113, -1, -1));

        bg.add(pinjam);
        pinjam.setText("Meminjam");
        getContentPane().add(pinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 113, -1, -1));

        bg.add(lain);
        lain.setText("Lain-lain");
        getContentPane().add(lain, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 113, -1, -1));

        keluar1.setText("Keluar");
        keluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar1ActionPerformed(evt);
            }
        });
        getContentPane().add(keluar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 457, -1, -1));

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 457, -1, -1));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Pinjam", "Nama", "Kelas", "Kegiatan", "Judul Buku"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblDataMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 196, 375, 243));

        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 457, -1, -1));

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 457, -1, -1));

        bersih.setText("Bersihkan");
        bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihActionPerformed(evt);
            }
        });
        getContentPane().add(bersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 457, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 1, 430, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelasActionPerformed

    private void keluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar1ActionPerformed
        thanks a = new thanks();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_keluar1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if ("".equals(nama.getText()) || "".equals(judul.getText())){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String bg = "";
            if(baca.isSelected()){
                bg = "Membaca Buku";
            } else if(pinjam.isSelected()) {
                bg = "Meminjam Buku";
            }
            else {
                bg = "Lain-lain";
            }  
            
            
            String SQL = "INSERT INTO tb_data (id_pinjam,nama,kelas,kegiatan,judul_buku) "
                    + "VALUES("+null+", '"+nama.getText()+"', '"+kelas.getSelectedItem()+"', '"+bg+"', '"
                    + ""+judul.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1){
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       int baris = tblData.getSelectedRow();
       if (baris != -1){
           String id = tblData.getValueAt(baris, 0).toString();
           String SQL = "DELETE FROM tb_data WHERE id_pinjam='"+id+"'";
           int status = KoneksiDB.execute(SQL);
           if (status==1){
               JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
           } else {
               JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
           }
       } else {
           JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
       }
       
       selectData(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihActionPerformed
       nama.setText("");
       kelas.setSelectedItem("");
       bg.clearSelection();
       judul.setText("");
    }//GEN-LAST:event_bersihActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ("".equals(nama.getText()) || "".equals(judul.getText())){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String bg = "";
            if(baca.isSelected()){
                bg = "Membaca Buku";
            } else if(pinjam.isSelected()) {
                bg = "Meminjam Buku";
            }
            else {
                bg = "Lain-lain";
            }  
            
            int baris = tblData.getSelectedRow();
            int id = Integer.parseInt(tblData.getValueAt(baris, 0).toString());
            String SQL = "UPDATE tb_data SET "
                    + "nama='"+nama.getText()+"', "
                    + "kelas='"+kelas.getSelectedItem()+"', "
                    + "kegiatan='"+bg+"', "
                    + "judul_buku='"+judul.getText()+"'"
                    + " WHERE id_pinjam="+id+"";
            int status = KoneksiDB.execute(SQL);
            if (status == 1){
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int baris = tblData.getSelectedRow();
        nama.setText(tblData.getValueAt(baris, 1).toString());
        
        String kelas2 = tblData.getValueAt(baris, 2).toString();
        kelas.setSelectedItem(kelas2);
        
        String kegiatan2 = tblData.getValueAt(baris, 3).toString();
        if(kegiatan2.equals("Membaca Buku")){
            baca.setSelected(true);
        }
        if(kegiatan2.equals("Meminjam Buku"))
        {
            pinjam.setSelected(true);
        }
        
        if(kegiatan2.equals("Lain-lain"))
        {
            lain.setSelected(true);
        }
        
        judul.setText(tblData.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_tblDataMouseClicked

    private void tblDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDataMouseEntered

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton baca;
    private javax.swing.JButton bersih;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField judul;
    private javax.swing.JComboBox<String> kelas;
    private javax.swing.JButton keluar1;
    private javax.swing.JRadioButton lain;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton pinjam;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"id_pinjam","nama","kelas","kegiatan","judul_buku"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_data";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()){
                int id_pinjam = rs.getInt(1);
                String nama = rs.getString(2);
                String kelas = rs.getString(3);
                String bg= rs.getString(4);
                
                String judul = rs.getString(5);
                String data[] = {Integer.toString(id_pinjam),nama,kelas,bg,judul};
                dtm.addRow(data);
            }
        } catch (SQLException ex){
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblData.setModel(dtm);
    }
}