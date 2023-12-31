/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demographic.quanlyphanthuong.mainpage;

/**
 *
 * @author MIXI_COMPUTER
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import demographic.login.MainFormForAdmin;
import demographic.models.DipTangThuong;
import demographic.models.ListOfDipTangThuong;
import demographic.models.User;
import demographic.quanlyphanthuong.suaForm.SuaDipThuong;
import demographic.quanlyphanthuong.themform.ThemDipThuong;
import demographic.textHandle.WriteMapToText;

public class DanhSachDipThuong extends javax.swing.JFrame {
    private ListOfDipTangThuong listOfDipTangThuong = new ListOfDipTangThuong();
    private DipTangThuong dipTangThuong = null;
    private int dipThuongID = -1;
    private String dipThuong = "";
    private String thanhTich = "";
    public User user;
    /**
     * Creates new form Danh_sach_dip_thuong
     */
    public DanhSachDipThuong() {
        initComponents();
        display();
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
        jPanel2 = new javax.swing.JPanel();
        btnTangThuong = new javax.swing.JLabel();
        btnDipThuong = new javax.swing.JLabel();
        btnQuy = new javax.swing.JLabel();
        btnHocSinh = new javax.swing.JLabel();
        btnThoat = new javax.swing.JLabel();
        Quan_ly_cap_phan_thuong = new javax.swing.JLabel();
        Dip_thuong_title = new javax.swing.JLabel();
        tfDipThuong = new javax.swing.JTextField();
        DipThuong = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tDipThuong = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new JButton();
        btnSua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(828, 449));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        btnTangThuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTangThuong.setForeground(new java.awt.Color(255, 255, 255));
        btnTangThuong.setText("Tặng thưởng");
        btnTangThuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTangThuongMouseClicked(evt);
            }
        });

        btnDipThuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDipThuong.setForeground(new java.awt.Color(255, 255, 255));
        btnDipThuong.setText("Dịp thưởng");
        btnDipThuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDipThuongMouseClicked(evt);
            }
        });

        btnQuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuy.setForeground(new java.awt.Color(255, 255, 255));
        btnQuy.setText("Ngân Quỹ");

        btnHocSinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHocSinh.setForeground(new java.awt.Color(255, 255, 255));
        btnHocSinh.setText("Học sinh");
        btnHocSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHocSinhMouseClicked(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(btnThoat)
                        .addComponent(btnQuy)
                        .addComponent(btnTangThuong)
                        .addComponent(btnDipThuong)
                        .addComponent(btnHocSinh))
                    .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(btnHocSinh)
                    .addGap(18, 18, 18)
                    .addComponent(btnDipThuong)
                    .addGap(18, 18, 18)
                    .addComponent(btnTangThuong)
                    .addGap(18, 18, 18)
                    .addComponent(btnQuy)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                    .addComponent(btnThoat)
                    .addGap(35, 35, 35))
        );

        Quan_ly_cap_phan_thuong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Quan_ly_cap_phan_thuong.setForeground(new java.awt.Color(0, 102, 102));
        Quan_ly_cap_phan_thuong.setText("Quản lý cấp phát phần thưởng");

        Dip_thuong_title.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Dip_thuong_title.setForeground(new java.awt.Color(0, 102, 102));
        Dip_thuong_title.setText("Dịp thưởng");

        tfDipThuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDipThuongActionPerformed(evt);
            }
        });

        DipThuong.setForeground(new java.awt.Color(0, 102, 102));
        DipThuong.setText("Dịp thưởng");

        btnTim.setBackground(new java.awt.Color(0, 51, 51));
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setText("Lọc");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        tDipThuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Dịp Thưởng ID", "Dịp thưởng", "Ngày Tặng Thưởng", "Thành Tích", "Chi tiết", "Số phần quà", "Tổng số tiền"
            }
        ));
        tDipThuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDipThuongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tDipThuong);

        btnThem.setBackground(new java.awt.Color(0, 51, 51));
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(0, 51, 51));
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xoá");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(0, 51, 51));
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(222, 222, 222)
                                    .addComponent(Quan_ly_cap_phan_thuong))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(275, 275, 275)
                                    .addComponent(Dip_thuong_title))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(38, 38, 38)
                                            .addComponent(DipThuong)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfDipThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)))
                                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(Quan_ly_cap_phan_thuong)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Dip_thuong_title)
                    .addGap(1, 1, 1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DipThuong)
                        .addComponent(tfDipThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTim)
                        .addComponent(btnThem)
                        .addComponent(btnSua)
                        .addComponent(btnXoa))
                    .addGap(37, 37, 37)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tDipThuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tDipThuong.getModel();
        int indexRow = tDipThuong.getSelectedRow();
        dipThuongID = Integer.parseInt(model.getValueAt(indexRow, 0).toString());
        dipThuong = String.valueOf(model.getValueAt(indexRow, 1).toString());
        thanhTich = String.valueOf(model.getValueAt(indexRow, 3).toString());
        dipTangThuong = listOfDipTangThuong.getListOfDipTangThuongByDipThuongAndThanhTich(dipThuong, thanhTich);
    }

    private void tfDipThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDipThuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDipThuongActionPerformed

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        // TODO add your handling code here:
        String dipThuong = tfDipThuong.getText();
        listOfDipTangThuong.setDipTangThuongList(listOfDipTangThuong.searchByDipThuong(dipThuong));
        display();
    }//GEN-LAST:event_btnTimMouseClicked

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnTimActionPerformed

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
        //kiểm tra xem chọn dịp thưởng chưa
        if(dipThuongID == -1 || dipTangThuong == null || DipThuong.equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dịp thưởng trong bảng\n"
                + "để xoá.");
            return;
        }
        int option = JOptionPane.showConfirmDialog(this, "Xoá dịp thưởng");
        if (option == 0) {
            boolean status = dipTangThuong.deleteRow();
            if (status) {
                JOptionPane.showMessageDialog(this, "Xoá thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Xoá không thành công");
            }
        }
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        ThemDipThuong newForm = new ThemDipThuong();
        newForm.setVisible(true);
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
        //kiểm tra xem chọn dịp thưởng chưa
        if(dipThuongID == -1 || dipTangThuong == null || DipThuong.equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dịp thưởng trong bảng\n"
                + "để sửa thông tin về dịp thưởng đó.");
            return;
        }
        SuaDipThuong newForm = new SuaDipThuong(dipTangThuong);
        newForm.setVisible(true);
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTangThuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTangThuongMouseClicked
        // TODO add your handling code here:
        DanhSachTangThuong newFrame = new DanhSachTangThuong();
        newFrame.user = user;
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTangThuongMouseClicked

    private void btnDipThuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDipThuongMouseClicked
        // TODO add your handling code here:
        DanhSachDipThuong newFrame = new DanhSachDipThuong();
        newFrame.user = user;
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDipThuongMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        DanhSachQuy newFrame = new DanhSachQuy();
        newFrame.user = user;
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void btnHocSinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHocSinhMouseClicked
        // TODO add your handling code here:
        DanhSachHocSinh newFrame = new DanhSachHocSinh();
        newFrame.user = user;
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHocSinhMouseClicked

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        // TODO add your handling code here:
        MainFormForAdmin newForm = new MainFormForAdmin();
        newForm.user = user;
        newForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void display() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tDipThuong.getModel();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();

        for(DipTangThuong dipTangThuong: listOfDipTangThuong.getNotDeletedDipTangThuong()){
            String data[] = {Integer.toString(dipTangThuong.getIdDipTangTuong()),
                dipTangThuong.getDipThuong(), dipTangThuong.getNgayTangThuong(),
                dipTangThuong.getThanhTich(), WriteMapToText.writeMapToText(dipTangThuong.getChiTiet()),
                Integer.toString(dipTangThuong.getTongSoPhanQua()),
                dipTangThuong.getTongSoTien() + " VND"
            };
            defaultTableModel.addRow(data);
        }
        listOfDipTangThuong = new ListOfDipTangThuong();
    }

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
            java.util.logging.Logger.getLogger(DanhSachDipThuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachDipThuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachDipThuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachDipThuong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachDipThuong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DipThuong;
    private javax.swing.JLabel Dip_thuong_title;
    private javax.swing.JLabel Quan_ly_cap_phan_thuong;
    private javax.swing.JLabel btnDipThuong;
    private javax.swing.JLabel btnHocSinh;
    private javax.swing.JLabel btnTangThuong;
    private javax.swing.JLabel btnQuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tDipThuong;
    private javax.swing.JTextField tfDipThuong;
    private JButton btnXoa;
    // End of variables declaration//GEN-END:variables
}
