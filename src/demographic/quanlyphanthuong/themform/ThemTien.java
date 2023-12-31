/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demographic.quanlyphanthuong.themform;

import demographic.models.ListOfHocSinh;
import demographic.models.ListOfNganQuy;
import demographic.models.NganQuyTangThuong;

import javax.swing.*;

/**
 *
 * @author MIXI_COMPUTER
 */
public class ThemTien extends javax.swing.JFrame {
  private ListOfNganQuy listOfNganQuy;

  /**
   * Creates new form Them_thong_tin_hoc_ki
   */
  public ThemTien(ListOfNganQuy listOfNganQuy) {
    this.listOfNganQuy = listOfNganQuy;
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

    jPanel1 = new javax.swing.JPanel();
    lbThemThongTinHocKi = new javax.swing.JLabel();
    lbSoTien = new javax.swing.JLabel();
    tfSoTien = new javax.swing.JTextField();
    btnLuu = new javax.swing.JButton();
    btnHuy = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    lbThemThongTinHocKi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    lbThemThongTinHocKi.setForeground(new java.awt.Color(0, 102, 102));
    lbThemThongTinHocKi.setText("Thêm/Bớt tiền ngân quỹ");

    lbSoTien.setForeground(new java.awt.Color(0, 102, 102));
    lbSoTien.setText("Số tiền");

    btnLuu.setBackground(new java.awt.Color(0, 51, 51));
    btnLuu.setForeground(new java.awt.Color(255, 255, 255));
    btnLuu.setText("Lưu");
    btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnLuuMouseClicked(evt);
      }
    });

    btnHuy.setBackground(new java.awt.Color(102, 0, 0));
    btnHuy.setForeground(new java.awt.Color(255, 255, 255));
    btnHuy.setText("Huỷ");
    btnHuy.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnHuyMouseClicked(evt);
      }
    });
    btnHuy.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnHuyActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbSoTien)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbThemThongTinHocKi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfSoTien)
                )
                .addContainerGap(129, Short.MAX_VALUE)
                .addGap(51, 51, 51)
            )
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnLuu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHuy)
                .addGap(73, 73, 73))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbThemThongTinHocKi)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSoTien)
                    .addComponent(tfSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
                .addGap(15, 15, 15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnHuy))
                .addGap(30, 30, 30))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
  }//GEN-LAST:event_btnLuuActionPerformed

  private void btnHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuyMouseClicked
    // TODO add your handling code here:
    this.dispose();
  }//GEN-LAST:event_btnHuyMouseClicked

  private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
    this.dispose();
  }//GEN-LAST:event_btnHuyActionPerformed

  private void btnLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseClicked
    // TODO add your handling code here:
    if(tfSoTien.getText().isEmpty()){
      JOptionPane.showMessageDialog(this, "Vui lòng điền đủ thông tin");
      return;
    }
    int soTienHienCo = NganQuyTangThuong.getTongSoTien();
    String soTienThayDoiText = tfSoTien.getText();
    int soTienThayDoi;
    if (soTienThayDoiText.matches("^-?\\d+$")) {
      soTienThayDoi = Integer.parseInt(soTienThayDoiText);
      if (-soTienThayDoi > soTienHienCo) {
        JOptionPane.showMessageDialog(this, "Số tiền muốn bớt nhiều hơn số tiền hiện có");
      } else {
        NganQuyTangThuong.setTongSoTien(soTienHienCo + soTienThayDoi);
        NganQuyTangThuong.setSoTienBanDau(NganQuyTangThuong.getSoTienBanDau() + soTienThayDoi);
        JOptionPane.showMessageDialog(this, "Thay đổi thành công");
        for (NganQuyTangThuong nganQuyTangThuong: listOfNganQuy.getNganQuyTangThuongList()) {
          nganQuyTangThuong.editRow();
        }
        this.dispose();
      }
    } else {
      JOptionPane.showMessageDialog(this, "Vui lòng điền đúng định dạng (số nguyên)");
    }

  }//GEN-LAST:event_btnLuuMouseClicked

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
      java.util.logging.Logger.getLogger(ThemDipThuongHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ThemDipThuongHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ThemDipThuongHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ThemDipThuongHocSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ThemTien(new ListOfNganQuy()).setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLuu;
  private javax.swing.JButton btnHuy;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lbSoTien;
  private javax.swing.JLabel lbThemThongTinHocKi;
  private javax.swing.JTextField tfSoTien;

  // End of variables declaration//GEN-END:variables
}
