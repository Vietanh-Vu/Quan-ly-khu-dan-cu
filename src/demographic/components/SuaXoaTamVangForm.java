/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demographic.components;

import demographic.models.HoKhau;
import demographic.models.TamVang;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;


/**
 *
 * @author Nam
 */
public class SuaXoaTamVangForm extends javax.swing.JFrame {

    TamVang tamVang;
    
    /**
     * Creates new form Form
     */
    public SuaXoaTamVangForm() {
        initComponents();
    }
    
    public SuaXoaTamVangForm(TamVang tamVang) {
        initComponents();
        this.tamVang = tamVang;
        System.out.println(this.tamVang.toString());
        setTextFields();
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
        tfSoHoKhau = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfNgaySinh = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbGioiTinh = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        tfLyDo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tfDiaChiTamTru = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tfNgayKetThuc = new javax.swing.JTextField();
        tfNgayBatDau = new javax.swing.JTextField();
        btnHoanTac = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 5));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("THÔNG TIN TẠM VẮNG");

        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Số CMND");

        tfSoCMND.setEditable(false);
        tfSoCMND.setForeground(new java.awt.Color(0, 102, 102));
        tfSoCMND.setCaretColor(new java.awt.Color(0, 102, 102));
        tfSoCMND.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfSoCMND.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfSoCMND.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfSoCMND.setSelectionColor(new java.awt.Color(0, 102, 102));

        tfHoTen.setEditable(false);
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

        tfSoHoKhau.setEditable(false);
        tfSoHoKhau.setForeground(new java.awt.Color(0, 102, 102));
        tfSoHoKhau.setCaretColor(new java.awt.Color(0, 102, 102));
        tfSoHoKhau.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfSoHoKhau.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfSoHoKhau.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfSoHoKhau.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfSoHoKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSoHoKhauActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Số hộ khẩu");

        tfNgaySinh.setEditable(false);
        tfNgaySinh.setForeground(new java.awt.Color(0, 102, 102));
        tfNgaySinh.setText("yyyy-mm-dd");
        tfNgaySinh.setCaretColor(new java.awt.Color(0, 102, 102));
        tfNgaySinh.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfNgaySinh.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfNgaySinh.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfNgaySinh.setSelectionColor(new java.awt.Color(0, 102, 102));

        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Ngày sinh");

        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác", " " }));

        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Lý do");

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

        jLabel20.setForeground(new java.awt.Color(0, 102, 102));
        jLabel20.setText("Địa chỉ tạm trú");

        tfDiaChiTamTru.setForeground(new java.awt.Color(0, 102, 102));
        tfDiaChiTamTru.setCaretColor(new java.awt.Color(0, 102, 102));
        tfDiaChiTamTru.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfDiaChiTamTru.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfDiaChiTamTru.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfDiaChiTamTru.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfDiaChiTamTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiaChiTamTruActionPerformed(evt);
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
        jLabel25.setText("Ngày bắt đầu");

        jLabel26.setForeground(new java.awt.Color(0, 102, 102));
        jLabel26.setText("Ngày kết thúc");

        tfNgayKetThuc.setForeground(new java.awt.Color(0, 102, 102));
        tfNgayKetThuc.setText("yyyy-mm-dd");
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

        tfNgayBatDau.setForeground(new java.awt.Color(0, 102, 102));
        tfNgayBatDau.setText("yyyy-mm-dd");
        tfNgayBatDau.setCaretColor(new java.awt.Color(0, 102, 102));
        tfNgayBatDau.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        tfNgayBatDau.setMargin(new java.awt.Insets(4, 6, 4, 6));
        tfNgayBatDau.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        tfNgayBatDau.setSelectionColor(new java.awt.Color(0, 102, 102));
        tfNgayBatDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNgayBatDauActionPerformed(evt);
            }
        });

        btnHoanTac.setBackground(new java.awt.Color(0, 51, 51));
        btnHoanTac.setForeground(new java.awt.Color(255, 255, 255));
        btnHoanTac.setText("Hoàn tác thao tác nhập liệu");
        btnHoanTac.setMargin(new java.awt.Insets(5, 0, 5, 0));
        btnHoanTac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHoanTacMouseClicked(evt);
            }
        });
        btnHoanTac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoanTacActionPerformed(evt);
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
                .addGap(60, 60, 60)
                .addComponent(btnHuy)
                .addGap(131, 131, 131))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNgayBatDau)
                                    .addComponent(tfNgayKetThuc)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfLyDo)
                                    .addComponent(tfDiaChiTamTru)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(43, 43, 43)
                                        .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHoanTac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(27, 27, 27)
                                .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(72, 72, 72)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnHoanTac, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tfNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tfLyDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDiaChiTamTru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void tfDiaChiTamTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiaChiTamTruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDiaChiTamTruActionPerformed

    private void tfLyDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLyDoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLyDoActionPerformed

    private void tfSoHoKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSoHoKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSoHoKhauActionPerformed

    private void btnLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseClicked
        // TODO add your handling code here:

        if (
                tfSoCMND.getText().isEmpty() ||
                tfHoTen.getText().isEmpty() ||
                tfLyDo.getText().isEmpty() ||
                tfNgayBatDau.getText().isEmpty() ||
                tfNgayKetThuc.getText().isEmpty() ||
                tfDiaChiTamTru.getText().isEmpty() ||
                tfNgaySinh.getText().isEmpty()||
                tfSoHoKhau.getText().isEmpty()
                )  {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đủ các trường thông tin");
        }
        else {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_nhan_khau","root","");
                                
                String sql = "UPDATE tam_vang\n" +
                    "SET ngay_bat_dau = '" + tfNgayBatDau.getText() + "',\n" +
                    "    ngay_ket_thuc = '" + tfNgayKetThuc.getText() + "',\n" +
                    "    ly_do = '" + tfLyDo.getText() + "',\n" +
                    "    dia_chi_noi_den = '" + tfDiaChiTamTru.getText() +"'\n" +
                    "WHERE tam_vang_id = " + tamVang.getTamVangId() +" ;";
                
                System.out.println(sql);
                PreparedStatement add = conn.prepareStatement(sql);
                
                int row = add.executeUpdate(); 
                JOptionPane.showMessageDialog(this, "Sửa thành công");
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

    private void tfNgayKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNgayKetThucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgayKetThucActionPerformed

    private void tfNgayBatDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNgayBatDauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgayBatDauActionPerformed

    private void btnHoanTacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoanTacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHoanTacActionPerformed

    private void btnHoanTacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHoanTacMouseClicked
        // TODO add your handling code here:
        setTextFields();
    }//GEN-LAST:event_btnHoanTacMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    
    // -------------- set Text Fields ------------------
    private void setTextFields(){
        String hoTen = "";
        String ngaySinh = "";
        String gioiTinh = "";
        String soHoKhau = "";
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_nhan_khau","root","");            
            Statement st = conn.createStatement();
            
            String soCMND = tamVang.getSoCMND();
            String sql = "SELECT * FROM nhan_khau WHERE so_CMND = '" + soCMND + "';";
            
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                hoTen = rs.getString("ho_ten");
                ngaySinh = rs.getString("ngay_sinh");
                gioiTinh = rs.getString("gioi_tinh");
                soHoKhau = rs.getString("so_ho_khau");
            }
            conn.close();
            st.close();
            rs.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu\n");
        }
        tfSoCMND.setText(tamVang.getSoCMND());
        tfHoTen.setText(hoTen);
        tfNgaySinh.setText(ngaySinh);
        cbGioiTinh.setSelectedItem(gioiTinh);
        tfSoHoKhau.setText(soHoKhau);
        tfNgayBatDau.setText(tamVang.getNgayBatDau());
        tfNgayKetThuc.setText(tamVang.getNgayKetThuc());
        tfLyDo.setText(tamVang.getLyDo());
        tfDiaChiTamTru.setText(tamVang.getDiaChiNoiDen());
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
            java.util.logging.Logger.getLogger(SuaXoaTamVangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaXoaTamVangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaXoaTamVangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaXoaTamVangForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SuaXoaTamVangForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHoanTac;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfDiaChiTamTru;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfLyDo;
    private javax.swing.JTextField tfNgayBatDau;
    private javax.swing.JTextField tfNgayKetThuc;
    private javax.swing.JTextField tfNgaySinh;
    private javax.swing.JTextField tfSoCMND;
    private javax.swing.JTextField tfSoHoKhau;
    // End of variables declaration//GEN-END:variables
}
