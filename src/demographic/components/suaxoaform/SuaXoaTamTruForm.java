/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demographic.components.suaxoaform;

import demographic.components.themform.*;
import demographic.models.HoKhau;
import demographic.models.TamTru;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;


/**
 *
 * @author Nam
 */
public class SuaXoaTamTruForm extends javax.swing.JFrame {

    TamTru tamTru;
    
    /**
     * Creates new form Form
     */
    public SuaXoaTamTruForm() {
        initComponents();
    }
    
    public SuaXoaTamTruForm(TamTru tamTru) {
        initComponents();
        this.tamTru = tamTru;
        setTextFields();
        System.out.println(this.tamTru.toString());
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfSoCMND = new javax.swing.JTextField();
        tfHoTen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfNoiCap = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfNgayCap = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbGioiTinh = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        tfChoOHienTai = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tfLyDo = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tfDiaChiThuongTru = new javax.swing.JTextField();
        tfNgayTamTru = new javax.swing.JTextField();
        tfNgaySinh = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 5));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("THÔNG TIN TẠM TRÚ");

        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Số CMND");

        tfSoCMND.setForeground(new java.awt.Color(0, 102, 102));
        tfSoCMND.setCaretColor(new java.awt.Color(0, 102, 102));
        tfSoCMND.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfSoCMND.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfSoCMND.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfSoCMND.setSelectionColor(new java.awt.Color(0, 102, 102));

        tfHoTen.setForeground(new java.awt.Color(0, 102, 102));
        tfHoTen.setCaretColor(new java.awt.Color(0, 102, 102));
        tfHoTen.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfHoTen.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfHoTen.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfHoTen.setSelectionColor(new java.awt.Color(0, 102, 102));

        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Họ tên");

        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Giới tính");

        tfNoiCap.setForeground(new java.awt.Color(0, 102, 102));
        tfNoiCap.setCaretColor(new java.awt.Color(0, 102, 102));
        tfNoiCap.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfNoiCap.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfNoiCap.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfNoiCap.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfNoiCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNoiCapActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Nơi cấp");

        tfNgayCap.setForeground(new java.awt.Color(0, 102, 102));
        tfNgayCap.setText("yyyy-mm-dd");
        tfNgayCap.setCaretColor(new java.awt.Color(0, 102, 102));
        tfNgayCap.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfNgayCap.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfNgayCap.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfNgayCap.setSelectionColor(new java.awt.Color(0, 102, 102));

        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Ngày cấp");

        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác", " " }));

        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Chỗ ở hiện tại");

        tfChoOHienTai.setForeground(new java.awt.Color(0, 102, 102));
        tfChoOHienTai.setCaretColor(new java.awt.Color(0, 102, 102));
        tfChoOHienTai.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfChoOHienTai.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfChoOHienTai.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfChoOHienTai.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfChoOHienTai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfChoOHienTaiActionPerformed(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(0, 102, 102));
        jLabel20.setText("Lý do");

        tfLyDo.setForeground(new java.awt.Color(0, 102, 102));
        tfLyDo.setCaretColor(new java.awt.Color(0, 102, 102));
        tfLyDo.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfLyDo.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfLyDo.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfLyDo.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfLyDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLyDoActionPerformed(evt);
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

        jLabel25.setForeground(new java.awt.Color(0, 102, 102));
        jLabel25.setText("Ngày tạm trú");

        jLabel26.setForeground(new java.awt.Color(0, 102, 102));
        jLabel26.setText("Địa chỉ thường trú");

        tfDiaChiThuongTru.setForeground(new java.awt.Color(0, 102, 102));
        tfDiaChiThuongTru.setCaretColor(new java.awt.Color(0, 102, 102));
        tfDiaChiThuongTru.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfDiaChiThuongTru.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfDiaChiThuongTru.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfDiaChiThuongTru.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfDiaChiThuongTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiaChiThuongTruActionPerformed(evt);
            }
        });

        tfNgayTamTru.setForeground(new java.awt.Color(0, 102, 102));
        tfNgayTamTru.setText("yyyy-mm-dd");
        tfNgayTamTru.setCaretColor(new java.awt.Color(0, 102, 102));
        tfNgayTamTru.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfNgayTamTru.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfNgayTamTru.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfNgayTamTru.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfNgayTamTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNgayTamTruActionPerformed(evt);
            }
        });

        tfNgaySinh.setForeground(new java.awt.Color(0, 102, 102));
        tfNgaySinh.setText("yyyy-mm-dd");
        tfNgaySinh.setCaretColor(new java.awt.Color(0, 102, 102));
        tfNgaySinh.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfNgaySinh.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfNgaySinh.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfNgaySinh.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNgaySinhActionPerformed(evt);
            }
        });

        jLabel27.setForeground(new java.awt.Color(0, 102, 102));
        jLabel27.setText("Ngày sinh");

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
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnLuu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa)
                .addGap(58, 58, 58)
                .addComponent(btnHuy)
                .addGap(131, 131, 131))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDiaChiThuongTru, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                    .addComponent(tfNgayTamTru)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(43, 43, 43)
                                        .addComponent(tfHoTen))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel12))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfNgayCap, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfNoiCap, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addGap(26, 26, 26)
                                        .addComponent(tfNgaySinh))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfChoOHienTai, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                    .addComponent(tfLyDo))))
                        .addGap(70, 70, 70)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfNgayCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfNoiCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tfNgayTamTru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDiaChiThuongTru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tfChoOHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLyDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy)
                    .addComponent(btnLuu)
                    .addComponent(btnXoa))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void tfLyDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLyDoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLyDoActionPerformed

    private void tfChoOHienTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfChoOHienTaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfChoOHienTaiActionPerformed

    private void tfNoiCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNoiCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNoiCapActionPerformed

    private void btnLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseClicked
        // TODO add your handling code here:

        if (
                tfSoCMND.getText().isEmpty() ||
                tfHoTen.getText().isEmpty() ||
                tfChoOHienTai.getText().isEmpty() ||
                tfNgayTamTru.getText().isEmpty() ||
                tfDiaChiThuongTru.getText().isEmpty() ||
                tfLyDo.getText().isEmpty() ||
                tfNgayCap.getText().isEmpty()||
                tfNoiCap.getText().isEmpty() ||
                tfNgaySinh.getText().isEmpty() 
                )  {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đủ các trường thông tin");
        }
        else {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
                                
                String sql = "UPDATE tam_tru " +
                "SET ho_ten = '" + tfHoTen.getText() + "', " +
                "    ngay_sinh = '" + tfNgaySinh.getText() + "', " +
                "    so_CMND = '" + tfSoCMND.getText() + "', " +
                "    ngay_cap = '" + tfNgayCap.getText() + "', " +
                "    noi_cap = '" + tfNoiCap.getText() + "', " +
                "    gioi_tinh = '" + cbGioiTinh.getSelectedItem() + "', " +
                "    dia_chi_thuong_tru = '" + tfDiaChiThuongTru.getText() + "', " +
                "    cho_o_hien_tai = '" + tfChoOHienTai.getText() + "', " +
                "    ly_do = '" + tfLyDo.getText() + "', " +
                "    ngay_tam_tru = '" + tfNgayTamTru.getText() + "' " +
                "WHERE tam_tru_id = " + this.tamTru.getTamTruId() + ";";

                
                System.out.println(sql);
                PreparedStatement add = conn.prepareStatement(sql);
                
                int row = add.executeUpdate(); 
                JOptionPane.showMessageDialog(this, "Lưu thành công");
                this.dispose();
            } catch(Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi\n"
                        + "Vui lòng kiểm tra lại trường thông tin ngày tháng theo định dạng yyyy-mm-dd\n"
                        + "Hoặc điền đủ các trường thông tin cần thiết");
            }
       }
    }//GEN-LAST:event_btnLuuMouseClicked

    private void btnHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHuyMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnHuyMouseClicked

    private void tfDiaChiThuongTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiaChiThuongTruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDiaChiThuongTruActionPerformed

    private void tfNgayTamTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNgayTamTruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgayTamTruActionPerformed

    private void tfNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgaySinhActionPerformed

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa giấy đăng ký tạm vắng này?\n"
                , "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION){
            try{
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
                String sql = "UPDATE tam_tru "
                        + "SET deleted = 1\n "
                        + "WHERE tam_tru_id = " + tamTru.getTamTruId()+ ";"; 
                PreparedStatement add = conn.prepareStatement(sql);
                System.out.println(sql);
                int row = add.executeUpdate();
                
                
                JOptionPane.showMessageDialog(this, "Đã xóa thành công");
                conn.close();
                this.dispose();
            } catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu.");
            }
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void setTextFields(){
       
        tfSoCMND.setText(tamTru.getSoCMND());
        tfHoTen.setText(tamTru.getHoTen());
        tfNgaySinh.setText(tamTru.getNgaySinh());
        tfNgayCap.setText(tamTru.getNgayCap());
        tfNoiCap.setText(tamTru.getNoiCap());
        cbGioiTinh.setSelectedItem(tamTru.getGioiTinh());
        tfDiaChiThuongTru.setText(tamTru.getDiaChiThuongTru());
        tfChoOHienTai.setText(tamTru.getChoOHienTai());
        tfLyDo.setText(tamTru.getLyDo());
        tfNgayTamTru.setText(tamTru.getNgayTamTru());
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
            java.util.logging.Logger.getLogger(SuaXoaTamTruForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaXoaTamTruForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaXoaTamTruForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaXoaTamTruForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SuaXoaTamTruForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfChoOHienTai;
    private javax.swing.JTextField tfDiaChiThuongTru;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfLyDo;
    private javax.swing.JTextField tfNgayCap;
    private javax.swing.JTextField tfNgaySinh;
    private javax.swing.JTextField tfNgayTamTru;
    private javax.swing.JTextField tfNoiCap;
    private javax.swing.JTextField tfSoCMND;
    // End of variables declaration//GEN-END:variables
}
