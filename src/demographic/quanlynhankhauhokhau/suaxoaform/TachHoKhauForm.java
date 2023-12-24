/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demographic.quanlynhankhauhokhau.suaxoaform;

import demographic.models.HoKhau;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import demographic.quanlynhankhauhokhau.themform.ThemNhanKhauForm;
import demographic.quanlynhankhauhokhau.themform.ThemNhanKhauForm;
import demographic.models.NhanKhau;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Nam
 */
public class TachHoKhauForm extends javax.swing.JFrame {
    
    HoKhau hoKhau;
    
//    NhanKhau nhanKhau;
    
    static List<NhanKhau> listOfNhanKhau = new ArrayList();
    
    String key = "";

    /**
     * Creates new form Form
     */
    public TachHoKhauForm() {
        initComponents();
    }
    
    public TachHoKhauForm(HoKhau hoKhau){
        initComponents();
        this.hoKhau = hoKhau;
//        displayTextFields();
        System.out.println(this.hoKhau.toString());
        getNhanKhau();
//        displayNhanKhau();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSuaXoaHoKhau = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfSoHoKhau = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNgayLap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbTenChuHo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tNhanKhauMoi = new javax.swing.JTable();
        btnLuu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfSoCMND = new javax.swing.JTextField();
        btnXoaNhanKhau = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        cbLaChungCu = new javax.swing.JComboBox<>();
        cbNhanKhau = new javax.swing.JComboBox<>();
        btnThemNhanKhau = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelSuaXoaHoKhau.setBackground(new java.awt.Color(255, 255, 255));
        PanelSuaXoaHoKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 5));
        PanelSuaXoaHoKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelSuaXoaHoKhauMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN HỘ KHẨU MỚI");

        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Số hộ khẩu");

        tfSoHoKhau.setForeground(new java.awt.Color(0, 102, 102));
        tfSoHoKhau.setCaretColor(new java.awt.Color(0, 102, 102));
        tfSoHoKhau.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfSoHoKhau.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfSoHoKhau.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfSoHoKhau.setSelectionColor(new java.awt.Color(0, 102, 102));

        tfDiaChi.setForeground(new java.awt.Color(0, 102, 102));
        tfDiaChi.setCaretColor(new java.awt.Color(0, 102, 102));
        tfDiaChi.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfDiaChi.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfDiaChi.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfDiaChi.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiaChiActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Địa chỉ");

        tfNgayLap.setForeground(new java.awt.Color(0, 102, 102));
        tfNgayLap.setCaretColor(new java.awt.Color(0, 102, 102));
        tfNgayLap.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfNgayLap.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfNgayLap.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfNgayLap.setSelectionColor(new java.awt.Color(0, 102, 102));

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Ngày lập");

        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Là chung cư");

        cbTenChuHo.setForeground(new java.awt.Color(0, 102, 102));
        cbTenChuHo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTenChuHoMouseClicked(evt);
            }
        });
        cbTenChuHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTenChuHoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel21.setBackground(new java.awt.Color(0, 102, 102));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Thông tin nhân khẩu mới của hộ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        tNhanKhauMoi.setForeground(new java.awt.Color(0, 102, 102));
        tNhanKhauMoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Số CMND", "Họ tên", "Giới tính", "Ngày Sinh", "Nghề nghiệp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tNhanKhauMoi.setGridColor(new java.awt.Color(188, 206, 206));
        tNhanKhauMoi.setRowHeight(26);
        tNhanKhauMoi.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tNhanKhauMoi.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tNhanKhauMoi.setShowGrid(true);
        tNhanKhauMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tNhanKhauMoiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tNhanKhauMoi);

        btnLuu.setBackground(new java.awt.Color(0, 51, 51));
        btnLuu.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu.setText("Lưu hộ khẩu mới");
        btnLuu.setMargin(new java.awt.Insets(4, 10, 4, 10));
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuMouseClicked(evt);
            }
        });
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Chủ hộ mới");

        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Số CMND");

        tfSoCMND.setEditable(false);
        tfSoCMND.setForeground(new java.awt.Color(0, 102, 102));
        tfSoCMND.setCaretColor(new java.awt.Color(0, 102, 102));
        tfSoCMND.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfSoCMND.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfSoCMND.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfSoCMND.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfSoCMND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfSoCMNDMouseClicked(evt);
            }
        });
        tfSoCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSoCMNDActionPerformed(evt);
            }
        });

        btnXoaNhanKhau.setBackground(new java.awt.Color(102, 0, 0));
        btnXoaNhanKhau.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaNhanKhau.setText("Xóa nhân khẩu");
        btnXoaNhanKhau.setMargin(new java.awt.Insets(4, 10, 4, 10));
        btnXoaNhanKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaNhanKhauMouseClicked(evt);
            }
        });
        btnXoaNhanKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNhanKhauActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(102, 0, 0));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("THOÁT");
        btnThoat.setBorderPainted(false);
        btnThoat.setMargin(new java.awt.Insets(4, 10, 4, 10));
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        cbLaChungCu.setForeground(new java.awt.Color(0, 102, 102));
        cbLaChungCu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Không", "Có" }));

        cbNhanKhau.setForeground(new java.awt.Color(0, 102, 102));

        btnThemNhanKhau.setBackground(new java.awt.Color(0, 51, 51));
        btnThemNhanKhau.setForeground(new java.awt.Color(255, 255, 255));
        btnThemNhanKhau.setText("Thêm nhân khẩu");
        btnThemNhanKhau.setMargin(new java.awt.Insets(4, 10, 4, 10));
        btnThemNhanKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemNhanKhauMouseClicked(evt);
            }
        });
        btnThemNhanKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNhanKhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSuaXoaHoKhauLayout = new javax.swing.GroupLayout(PanelSuaXoaHoKhau);
        PanelSuaXoaHoKhau.setLayout(PanelSuaXoaHoKhauLayout);
        PanelSuaXoaHoKhauLayout.setHorizontalGroup(
            PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelSuaXoaHoKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuaXoaHoKhauLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuaXoaHoKhauLayout.createSequentialGroup()
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuaXoaHoKhauLayout.createSequentialGroup()
                                .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuaXoaHoKhauLayout.createSequentialGroup()
                                        .addComponent(btnThemNhanKhau)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbNhanKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelSuaXoaHoKhauLayout.createSequentialGroup()
                                        .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfSoHoKhau)
                                            .addComponent(tfDiaChi)
                                            .addComponent(tfNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PanelSuaXoaHoKhauLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(33, 33, 33)
                                        .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbLaChungCu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfSoCMND, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                            .addComponent(cbTenChuHo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(PanelSuaXoaHoKhauLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnXoaNhanKhau)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(119, 119, 119))))
                    .addGroup(PanelSuaXoaHoKhauLayout.createSequentialGroup()
                        .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1119, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        PanelSuaXoaHoKhauLayout.setVerticalGroup(
            PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuaXoaHoKhauLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnThoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSuaXoaHoKhauLayout.createSequentialGroup()
                        .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(tfSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cbLaChungCu)))
                    .addGroup(PanelSuaXoaHoKhauLayout.createSequentialGroup()
                        .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(65, 65, 65)
                .addGroup(PanelSuaXoaHoKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnXoaNhanKhau)
                    .addComponent(cbNhanKhau)
                    .addComponent(btnThemNhanKhau))
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1141, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelSuaXoaHoKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelSuaXoaHoKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDiaChiActionPerformed

    private void tNhanKhauMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tNhanKhauMoiMouseClicked
        
    }//GEN-LAST:event_tNhanKhauMoiMouseClicked

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuActionPerformed

    private void tfSoCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSoCMNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSoCMNDActionPerformed

    private void btnLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseClicked
        if (
                tfSoHoKhau.getText().isEmpty() ||
                tfDiaChi.getText().isEmpty() ||
                tfNgayLap.getText().isEmpty() ||
                tfSoCMND.getText().isEmpty()
                )  {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đủ các trường thông tin");
        }
        else {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
                
                // ----- thêm chủ hộ vào nhân khẩu -----
                
                // ----- thêm hộ khẩu ------
                String sql = "INSERT INTO ho_khau (so_ho_khau, chu_ho_id ,chu_ho_CMND, dia_chi, la_chung_cu, ngay_lap)"
                        + " SELECT ?,nhan_khau_id,?,?,?,?\n"
                        + " FROM nhan_khau"
                        + " WHERE so_CMND = ?;"
                         ;
                PreparedStatement add = conn.prepareStatement(sql);
                add.setString(1, tfSoHoKhau.getText());
                add.setString(2,tfSoCMND.getText());
                add.setString(3, tfDiaChi.getText());
                add.setString(4, cbLaChungCu.getSelectedItem().toString());
                add.setString(5, tfNgayLap.getText());
                add.setString(6, tfSoCMND.getText());

                int row = add.executeUpdate();
                
                // ----- update hộ khẩu mới và cũ ------

                for (NhanKhau nhanKhau : listOfNhanKhau) {
                    sql = "UPDATE nhan_khau\n" +
                    "SET quan_he_voi_chu_ho = NULL,\n" +
                    "so_ho_khau = '" + tfSoHoKhau.getText() + "'\n" +
                    "WHERE nhan_khau_id = " + nhanKhau.getNhanKhauId() + ";";
                
                    if (nhanKhau.getSoCMND().equals(tfSoCMND.getText())) {
                        sql = "UPDATE nhan_khau\n" +
                        "SET quan_he_voi_chu_ho = 'Chủ hộ',\n" +
                        "so_ho_khau = '" + tfSoHoKhau.getText() + "'\n" +
                        "WHERE nhan_khau_id = " + nhanKhau.getNhanKhauId() + ";";
                    }
                    System.out.println(sql);
                    
                    add = conn.prepareStatement(sql);
                    row = add.executeUpdate();
                }
                
                JOptionPane.showMessageDialog(this, "Đã thêm hộ khẩu." );
                conn.close();
                this.dispose();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(this, "Bạn vui lòng kiểm tra lại các trường thông tin.\n"
                        + "Lỗi này xảy ra khi bạn nhập sai cú pháp ngày tháng, sai số CMND hoặc hộ đã tồn tại trong cơ sở dữ liệu.");
            }
        }        
    }//GEN-LAST:event_btnLuuMouseClicked

    private void btnXoaNhanKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNhanKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaNhanKhauActionPerformed

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXoaNhanKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaNhanKhauMouseClicked
        // TODO add your handling code here:
        String hoTen = cbNhanKhau.getSelectedItem().toString();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
            st = conn.createStatement();
            String sql ="SELECT * FROM nhan_khau\n"
                    + " WHERE so_ho_khau = \'" + hoKhau.getSoHoKhau() + "\'\n"
                    + " AND ho_ten = '" + hoTen +"';";
            ResultSet resultSet = st.executeQuery(sql);
            System.out.println(sql);
            
            int nhanKhauId = 0;
            if(resultSet.next()){
                nhanKhauId = resultSet.getInt("nhan_khau_id");
            }
            
            for (NhanKhau nhanKhau: listOfNhanKhau) {
                if(nhanKhauId == nhanKhau.getNhanKhauId()){
                    listOfNhanKhau.remove(nhanKhau);
                    JOptionPane.showMessageDialog(this, "Đã xóa thành công");
                    
                    DefaultTableModel defaultTableModel = (DefaultTableModel) tNhanKhauMoi.getModel();
                    defaultTableModel.getDataVector().removeAllElements();
                    defaultTableModel.fireTableDataChanged();

                    for (NhanKhau nhanKhauElement: listOfNhanKhau) {
                        String data[] = {String.valueOf(nhanKhauElement.getNhanKhauId()), nhanKhauElement.getSoCMND(), nhanKhauElement.getHoTen(), nhanKhauElement.getGioiTinh(), nhanKhauElement.getNgaySinh(), nhanKhauElement.getNgheNghiep()};
                        defaultTableModel = (DefaultTableModel) tNhanKhauMoi.getModel();
                        defaultTableModel.addRow(data);
                    }
            
                    return;
                }
            }
            
            JOptionPane.showMessageDialog(this, "Nhân khẩu không tồn tại trong bảng");
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu");
        }
    }//GEN-LAST:event_btnXoaNhanKhauMouseClicked

    private void PanelSuaXoaHoKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSuaXoaHoKhauMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelSuaXoaHoKhauMouseClicked

    private void btnThemNhanKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemNhanKhauMouseClicked
        // TODO add your handling code here:
        String hoTen = cbNhanKhau.getSelectedItem().toString();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
            st = conn.createStatement();
            String sql ="SELECT * FROM nhan_khau\n"
                    + " WHERE so_ho_khau = \'" + hoKhau.getSoHoKhau() + "\'\n"
                    + " AND ho_ten = '" + hoTen +"';";
            ResultSet resultSet = st.executeQuery(sql);
            System.out.println(sql);
            NhanKhau nhanKhauMoi = new NhanKhau();
            if (resultSet.next()) {
                nhanKhauMoi.setNhanKhauId(resultSet.getInt("nhan_khau_id"));
                nhanKhauMoi.setHoTen(resultSet.getString("ho_ten"));
                nhanKhauMoi.setBietDanh(resultSet.getString("biet_danh"));
                nhanKhauMoi.setGioiTinh(resultSet.getString("gioi_tinh"));
                nhanKhauMoi.setNgaySinh(resultSet.getString("ngay_sinh"));
                nhanKhauMoi.setSoCMND(resultSet.getString("so_CMND"));
                nhanKhauMoi.setNgayCapCMND(resultSet.getString("ngay_cap_CMND"));
                nhanKhauMoi.setNoiCapCMND(resultSet.getString("noi_cap_CMND"));
                nhanKhauMoi.setNoiSinh(resultSet.getString("noi_sinh"));
                nhanKhauMoi.setNguyenQuan(resultSet.getString("nguyen_quan"));
                nhanKhauMoi.setDanToc(resultSet.getString("dan_toc"));
                nhanKhauMoi.setNgheNghiep(resultSet.getString("nghe_nghiep"));
                nhanKhauMoi.setNoiLamViec(resultSet.getString("noi_lam_viec"));
                nhanKhauMoi.setQuanHeVoiChuHo(null);
                nhanKhauMoi.setNgayDangKyThuongTru(resultSet.getString("ngay_dang_ky_thuong_tru"));
                nhanKhauMoi.setDiaChiTruocKhiChuyen(resultSet.getString("dia_chi_truoc_khi_chuyen"));
                nhanKhauMoi.setChuyenDi(resultSet.getString("chuyen_di"));
                nhanKhauMoi.setDeleted(resultSet.getInt("deleted"));
                nhanKhauMoi.setSoHoKhau(tfSoHoKhau.getText());
                nhanKhauMoi.setQuaDoi(resultSet.getString("qua_doi"));
            }
            
            for (NhanKhau nhanKhau: listOfNhanKhau) {
                if(nhanKhauMoi.getNhanKhauId() == nhanKhau.getNhanKhauId()){
                    JOptionPane.showMessageDialog(this, "Nhân khẩu đã tồn tại trong bảng");
                    return;
                }
            }
            
            listOfNhanKhau.add(nhanKhauMoi);
            
            DefaultTableModel defaultTableModel = (DefaultTableModel) tNhanKhauMoi.getModel();
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            
            for (NhanKhau nhanKhau: listOfNhanKhau) {
                String data[] = {String.valueOf(nhanKhau.getNhanKhauId()), nhanKhau.getSoCMND(), nhanKhau.getHoTen(), nhanKhau.getGioiTinh(), nhanKhau.getNgaySinh(), nhanKhau.getNgheNghiep()};
                defaultTableModel = (DefaultTableModel) tNhanKhauMoi.getModel();
                defaultTableModel.addRow(data);
            }
            
            JOptionPane.showMessageDialog(this, "Thêm nhân khẩu thành công");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu");
        }
    }//GEN-LAST:event_btnThemNhanKhauMouseClicked

    private void btnThemNhanKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNhanKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemNhanKhauActionPerformed

    private void cbTenChuHoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTenChuHoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbTenChuHoMouseClicked

    private void cbTenChuHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTenChuHoActionPerformed
        // TODO add your handling code here:
        tfSoCMND.setText("");
    }//GEN-LAST:event_cbTenChuHoActionPerformed

    private void tfSoCMNDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSoCMNDMouseClicked
        // TODO add your handling code here:
        getNhanKhauCMND();
        
    }//GEN-LAST:event_tfSoCMNDMouseClicked

        // ------------- CONNECTION SQL PARAMETER---------------
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Statement st = null;
    
    // ----------------- display bản ghi ----------------------
    private void displayTextFields() {
        
    }
    
    private void getNhanKhau() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
            st = conn.createStatement();
            String sql ="SELECT * FROM nhan_khau\n"
                    + " WHERE so_ho_khau = \'" + hoKhau.getSoHoKhau() + "\'\n"
                    + "AND quan_he_voi_chu_ho != 'Chủ hộ';";
            rs = st.executeQuery(sql);
            System.out.println(sql);
            while (rs.next()) {
                String hoTen = rs.getString("ho_ten");
                cbTenChuHo.addItem(hoTen);
                cbNhanKhau.addItem(hoTen);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu");
        }
    }
    
    private void getNhanKhauCMND() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
            st = conn.createStatement();
            String sql ="SELECT * FROM nhan_khau\n"
                    + " WHERE so_ho_khau = \'" + hoKhau.getSoHoKhau() + "\'\n"
                    + " AND ho_ten = '" + cbTenChuHo.getSelectedItem() +"';";
            rs = st.executeQuery(sql);
            System.out.println(sql);
            while (rs.next()) {
                String soCMND = rs.getString("so_CMND");
                tfSoCMND.setText(soCMND);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu");
        }
    }
    // ---------------- display thông tin nhân khẩu của hộ --------

        
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
            java.util.logging.Logger.getLogger(TachHoKhauForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TachHoKhauForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TachHoKhauForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TachHoKhauForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TachHoKhauForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelSuaXoaHoKhau;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThemNhanKhau;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoaNhanKhau;
    private javax.swing.JComboBox<String> cbLaChungCu;
    private javax.swing.JComboBox<String> cbNhanKhau;
    private javax.swing.JComboBox<String> cbTenChuHo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tNhanKhauMoi;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfNgayLap;
    private javax.swing.JTextField tfSoCMND;
    private javax.swing.JTextField tfSoHoKhau;
    // End of variables declaration//GEN-END:variables
}