/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demographic.quanlythuphi.suaxoaform;

import demographic.models.HoKhau;
import demographic.models.KhoanPhi;
import demographic.models.NhanKhau;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author vietanh
 */
public class SuaXoaKhoanPhiForm extends javax.swing.JFrame {

    private KhoanPhi khoanPhi;

    /**
     * Creates new form Form
     */
    public SuaXoaKhoanPhiForm() {
        initComponents();
    }

    public SuaXoaKhoanPhiForm(KhoanPhi khoanPhi) {
        initComponents();
        this.khoanPhi = khoanPhi;
        System.out.println(this.khoanPhi.toString());
        displayTextField();
    }

    public void displayTextField() {
        tfTenKhoanPhi.setText(khoanPhi.getTenKhoanPhi());
        tfTienPhi.setText(khoanPhi.getTienPhi());
        tfNgayBatDau.setText(khoanPhi.getNgayBatDau());
        tfNgayKetThuc.setText(khoanPhi.getNgayKetThuc());
        tfChiTiet.setText(khoanPhi.getChiTiet());
        cbLoaiPhi.setSelectedItem(khoanPhi.getLoaiPhi());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnHuy = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfTenKhoanPhi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfTienPhi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfNgayBatDau = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfNgayKetThuc = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfChiTiet = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cbLoaiPhi = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnHuy.setBackground(new java.awt.Color(102, 0, 0));
        btnHuy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy");
        btnHuy.setMargin(new java.awt.Insets(6, 14, 6, 14));
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

        btnLuu.setBackground(new java.awt.Color(0, 51, 51));
        btnLuu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu.setText("Lưu");
        btnLuu.setMargin(new java.awt.Insets(6, 14, 6, 14));
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuMouseClicked(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(102, 0, 0));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.setMargin(new java.awt.Insets(6, 14, 6, 14));
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("THÔNG TIN KHOẢN PHÍ");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Tên Khoản Phí");

        tfTenKhoanPhi.setForeground(new java.awt.Color(0, 102, 102));
        tfTenKhoanPhi.setCaretColor(new java.awt.Color(0, 102, 102));
        tfTenKhoanPhi.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfTenKhoanPhi.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfTenKhoanPhi.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfTenKhoanPhi.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfTenKhoanPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTenKhoanPhiActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Tiền Phí");

        tfTienPhi.setForeground(new java.awt.Color(0, 102, 102));
        tfTienPhi.setCaretColor(new java.awt.Color(0, 102, 102));
        tfTienPhi.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfTienPhi.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfTienPhi.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfTienPhi.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfTienPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTienPhiActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Ngày Bắt Đầu");

        tfNgayBatDau.setForeground(new java.awt.Color(0, 102, 102));
        tfNgayBatDau.setCaretColor(new java.awt.Color(0, 102, 102));
        tfNgayBatDau.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfNgayBatDau.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfNgayBatDau.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfNgayBatDau.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfNgayBatDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNgayBatDautfNgayBatDauActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Ngày Kết Thúc");

        tfNgayKetThuc.setForeground(new java.awt.Color(0, 102, 102));
        tfNgayKetThuc.setCaretColor(new java.awt.Color(0, 102, 102));
        tfNgayKetThuc.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfNgayKetThuc.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfNgayKetThuc.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfNgayKetThuc.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfNgayKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNgayKetThucActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setText("Chi Tiết ");

        tfChiTiet.setForeground(new java.awt.Color(0, 102, 102));
        tfChiTiet.setCaretColor(new java.awt.Color(0, 102, 102));
        tfChiTiet.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfChiTiet.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfChiTiet.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfChiTiet.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfChiTietActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Loại phí");

        cbLoaiPhi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "phí theo diện tích", "phí theo đầu người", "phí theo hộ" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnLuu)
                .addGap(101, 101, 101)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHuy)
                .addGap(91, 91, 91))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTenKhoanPhi, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(tfTienPhi)
                            .addComponent(tfNgayBatDau)
                            .addComponent(tfNgayKetThuc)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfChiTiet)
                            .addComponent(cbLoaiPhi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(157, 157, 157))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfTenKhoanPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfTienPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(tfChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cbLoaiPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy)
                    .addComponent(btnXoa)
                    .addComponent(btnLuu))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuyMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnHuyMouseClicked

    private void btnLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseClicked
        // TODO add your handling code here:
        if (tfNgayBatDau.getText().isEmpty()
                || tfNgayKetThuc.getText().isEmpty()
                || tfTenKhoanPhi.getText().isEmpty()
                || tfTienPhi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đủ các trường thông tin");
        } else {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu", "root", "");
                String sqlQuery = "UPDATE khoan_thu_phi\n"
                        + "SET ten_khoan_thu_phi = ? , \n"
                        + "    ngay_bat_dau = ?, \n"
                        + "    ngay_ket_thuc = ?, \n"
                        + "    tien_phi = ?,\n"
                        + "    chi_tiet = ?,\n"
                        + "    loai_phi = ?\n"
                        + "WHERE id_khoan_thu_phi = ?";
                System.out.println(sqlQuery);
                PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery);
                preparedStatement.setString(1, tfTenKhoanPhi.getText());
                preparedStatement.setString(2, tfNgayBatDau.getText());
                preparedStatement.setString(3, tfNgayKetThuc.getText());
                preparedStatement.setString(4, tfTienPhi.getText());
                preparedStatement.setString(5, tfChiTiet.getText());
                preparedStatement.setString(6, cbLoaiPhi.getSelectedItem().toString());
                preparedStatement.setInt(7, khoanPhi.getIdKhoanPhi());
                int row = preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                this.dispose();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi\n"
                        + "Vui lòng kiểm tra lại trường thông tin ngày tháng theo định dạng yyyy-mm-dd\n"
                        + "Hoặc điền đủ các trường thông tin cần thiết");
            }
        }
    }//GEN-LAST:event_btnLuuMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?\n",
                "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu", "root", "");
                String sqlQuery = "DELETE FROM khoan_thu_phi\n"
                        + "WHERE id_khoan_thu_phi = ?;";
                PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery);
                preparedStatement.setInt(1, khoanPhi.getIdKhoanPhi());
                System.out.println(sqlQuery);
                int row = preparedStatement.executeUpdate();

                JOptionPane.showMessageDialog(this, "Đã xóa thành công");
                conn.close();
                this.dispose();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu.");
            }
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void tfTenKhoanPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTenKhoanPhiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTenKhoanPhiActionPerformed

    private void tfTienPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTienPhiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTienPhiActionPerformed

    private void tfNgayBatDautfNgayBatDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNgayBatDautfNgayBatDauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgayBatDautfNgayBatDauActionPerformed

    private void tfNgayKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNgayKetThucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgayKetThucActionPerformed

    private void tfChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfChiTietActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfChiTietActionPerformed

    // --------------- display TextFields --------------------
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
            java.util.logging.Logger.getLogger(SuaXoaKhoanPhiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaXoaKhoanPhiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaXoaKhoanPhiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaXoaKhoanPhiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaXoaKhoanPhiForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbLoaiPhi;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfChiTiet;
    private javax.swing.JTextField tfNgayBatDau;
    private javax.swing.JTextField tfNgayKetThuc;
    private javax.swing.JTextField tfTenKhoanPhi;
    private javax.swing.JTextField tfTienPhi;
    // End of variables declaration//GEN-END:variables
}