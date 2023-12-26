/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demographic.quanlyphanthuong.mainpage;

import demographic.login.MainFormForAdmin;
import demographic.models.ListOfNganQuy;
import demographic.models.NganQuyTangThuong;
import demographic.models.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIXI_COMPUTER
 */
public class DanhSachQuy extends javax.swing.JFrame {
    private ListOfNganQuy listOfNganQuy = new ListOfNganQuy();
    public User user;

    /**
     * Creates new form Danh_sach_quy
     */
    public DanhSachQuy() {
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
        Danh_sach_quy_title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tQuy = new javax.swing.JTable();
        lbTongTien = new javax.swing.JLabel();
        tfTongTien = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(828, 449));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

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
        btnQuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuyMouseClicked(evt);
            }
        });

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

        Danh_sach_quy_title.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Danh_sach_quy_title.setForeground(new java.awt.Color(0, 102, 102));
        Danh_sach_quy_title.setText("Danh sách quỹ");

        tQuy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Ngân Quỹ ID", "Số tiền thay đổi", "Chi Tiết", "Ngày Thay Đổi"
            }
        ));
        jScrollPane2.setViewportView(tQuy);
        tfTongTien.setEditable(false);
        lbTongTien.setText("Tổng số tiền:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 275, Short.MAX_VALUE)
                                .addComponent(Danh_sach_quy_title)
                                .addGap(306, 306, 306)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(Quan_ly_cap_phan_thuong)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTongTien)
                        .addGap(18, 18, 18)
                        .addComponent(tfTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Quan_ly_cap_phan_thuong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Danh_sach_quy_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongTien)
                    .addComponent(tfTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnTangThuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTangThuongMouseClicked
        // TODO add your handling code here:
         DanhSachTangThuong newFrame = new DanhSachTangThuong();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTangThuongMouseClicked

    private void btnDipThuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDipThuongMouseClicked
        // TODO add your handling code here:
        DanhSachDipThuong newFrame = new DanhSachDipThuong();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDipThuongMouseClicked

    private void btnQuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuyMouseClicked
        // TODO add your handling code here:
        DanhSachQuy newFrame = new DanhSachQuy();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuyMouseClicked

    private void btnHocSinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHocSinhMouseClicked
        // TODO add your handling code here:
        DanhSachHocSinh newFrame = new DanhSachHocSinh();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHocSinhMouseClicked

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        MainFormForAdmin newForm = new MainFormForAdmin();
        newForm.user = user;
        newForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatMouseClicked
    private void display() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tQuy.getModel();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();

        for(NganQuyTangThuong nganQuyTangThuong: listOfNganQuy.getNotDeletedNganQuy()){
            String data[] = {Integer.toString(nganQuyTangThuong.getIdNganQuyTangThuong()),
                nganQuyTangThuong.getSoTienThayDoi() + " VND",
                nganQuyTangThuong.getChiTiet(),
                nganQuyTangThuong.getNgayThayDoi()};
            defaultTableModel.addRow(data);
        }
        listOfNganQuy = new ListOfNganQuy();
        tfTongTien.setText(NganQuyTangThuong.getTongSoTien() + " VND");
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
            java.util.logging.Logger.getLogger(DanhSachQuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachQuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachQuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachQuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachQuy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Danh_sach_quy_title;
    private javax.swing.JLabel Quan_ly_cap_phan_thuong;
    private javax.swing.JLabel btnDipThuong;
    private javax.swing.JLabel btnHocSinh;
    private javax.swing.JLabel btnTangThuong;
    private javax.swing.JLabel btnQuy;
    private javax.swing.JLabel btnThoat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTongTien;
    private javax.swing.JTable tQuy;
    private javax.swing.JTextField tfTongTien;
    // End of variables declaration//GEN-END:variables
}
