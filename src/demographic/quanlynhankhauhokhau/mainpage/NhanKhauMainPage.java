/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demographic.quanlynhankhauhokhau.mainpage;

//import com.sun.jdi.connect.spi.Connection;
import demographic.quanlynhankhauhokhau.suaxoaform.SuaXoaNhanKhauForm;
import demographic.quanlynhankhauhokhau.themform.ThemNhanKhauForm;
import demographic.models.User;
import demographic.login.MainFormForAdmin;
import demographic.login.MainFormForUser;
import demographic.models.NhanKhau;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import javax.swing.JFileChooser;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Nam
 */
public class NhanKhauMainPage extends javax.swing.JFrame {

    NhanKhau nhanKhau = null;
    
    /**
     * Creates new form NhanKhauMainPage
     */
    public NhanKhauMainPage() {
        initComponents();
        displayNhanKhau();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nhanKhauPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbNhanKhau = new javax.swing.JLabel();
        lbHoKhau = new javax.swing.JLabel();
        lbTamVang = new javax.swing.JLabel();
        lbTamTru = new javax.swing.JLabel();
        lbKhaiTu = new javax.swing.JLabel();
        lbThoat = new javax.swing.JLabel();
        lbThongKe = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tNhanKhau = new javax.swing.JTable();
        btnTrinhBanGhi = new javax.swing.JButton();
        In = new javax.swing.JButton();
        tfTim = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nhanKhauPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        lbNhanKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNhanKhau.setForeground(new java.awt.Color(255, 255, 255));
        lbNhanKhau.setText("Nhân khẩu");
        lbNhanKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNhanKhauMouseClicked(evt);
            }
        });

        lbHoKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbHoKhau.setForeground(new java.awt.Color(255, 255, 255));
        lbHoKhau.setText("Hộ khẩu");
        lbHoKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHoKhauMouseClicked(evt);
            }
        });

        lbTamVang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTamVang.setForeground(new java.awt.Color(255, 255, 255));
        lbTamVang.setText("Tạm vắng");
        lbTamVang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTamVangMouseClicked(evt);
            }
        });

        lbTamTru.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTamTru.setForeground(new java.awt.Color(255, 255, 255));
        lbTamTru.setText("Tạm trú");
        lbTamTru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTamTruMouseClicked(evt);
            }
        });

        lbKhaiTu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbKhaiTu.setForeground(new java.awt.Color(255, 255, 255));
        lbKhaiTu.setText("Khai tử");
        lbKhaiTu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbKhaiTuMouseClicked(evt);
            }
        });

        lbThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbThoat.setForeground(new java.awt.Color(255, 255, 255));
        lbThoat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThoat.setText("Thoát    ");
        lbThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThoatMouseClicked(evt);
            }
        });

        lbThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lbThongKe.setText("Thống kê");
        lbThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThongKeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbKhaiTu)
                    .addComponent(lbTamVang)
                    .addComponent(lbHoKhau)
                    .addComponent(lbNhanKhau)
                    .addComponent(lbThongKe)
                    .addComponent(lbTamTru))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lbHoKhau)
                .addGap(18, 18, 18)
                .addComponent(lbNhanKhau)
                .addGap(18, 18, 18)
                .addComponent(lbTamVang)
                .addGap(18, 18, 18)
                .addComponent(lbTamTru)
                .addGap(18, 18, 18)
                .addComponent(lbKhaiTu)
                .addGap(18, 18, 18)
                .addComponent(lbThongKe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbThoat)
                .addGap(33, 33, 33))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("QUẢN LÝ NHÂN KHẨU");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnTim.setBackground(new java.awt.Color(0, 51, 51));
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setText("Tìm theo họ tên");
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

        btnSua.setBackground(new java.awt.Color(0, 51, 51));
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa/Xóa");
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

        tNhanKhau.setForeground(new java.awt.Color(0, 102, 102));
        tNhanKhau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tNhanKhau.setGridColor(new java.awt.Color(188, 206, 206));
        tNhanKhau.setRowHeight(26);
        tNhanKhau.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tNhanKhau.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tNhanKhau.setShowGrid(true);
        tNhanKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tNhanKhauMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tNhanKhau);

        btnTrinhBanGhi.setBackground(new java.awt.Color(0, 51, 51));
        btnTrinhBanGhi.setForeground(new java.awt.Color(255, 255, 255));
        btnTrinhBanGhi.setText("Trình bản ghi");
        btnTrinhBanGhi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrinhBanGhiMouseClicked(evt);
            }
        });
        btnTrinhBanGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrinhBanGhiActionPerformed(evt);
            }
        });

        In.setBackground(new java.awt.Color(0, 51, 51));
        In.setForeground(new java.awt.Color(255, 255, 255));
        In.setText("Xuất file");
        In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InMouseClicked(evt);
            }
        });
        In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InActionPerformed(evt);
            }
        });

        tfTim.setForeground(new java.awt.Color(0, 102, 102));
        tfTim.setText("Nhập họ tên");
        tfTim.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tfTim.setSelectedTextColor(new java.awt.Color(102, 102, 102));

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

        javax.swing.GroupLayout nhanKhauPanelLayout = new javax.swing.GroupLayout(nhanKhauPanel);
        nhanKhauPanel.setLayout(nhanKhauPanelLayout);
        nhanKhauPanelLayout.setHorizontalGroup(
            nhanKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nhanKhauPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nhanKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nhanKhauPanelLayout.createSequentialGroup()
                        .addGroup(nhanKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(nhanKhauPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnTrinhBanGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(In, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfTim, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        nhanKhauPanelLayout.setVerticalGroup(
            nhanKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(nhanKhauPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(nhanKhauPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrinhBanGhi)
                    .addComponent(btnSua)
                    .addComponent(In)
                    .addComponent(btnTim)
                    .addComponent(tfTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nhanKhauPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nhanKhauPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InActionPerformed
        // TODO add your handling code here:
        try {
            // ----- set table ----
             try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
                st = conn.createStatement();
                String sql ="SELECT \n" +
                    "  nhan_khau_id AS 'Nhân khẩu ID',\n" +
                    "  CONVERT(ho_ten USING utf8) AS 'Họ tên',\n" +
                    "  CONVERT(biet_danh USING utf8) AS 'Biệt danh',\n" +
                    "  gioi_tinh AS 'Giới tính',\n" +
                    "  ngay_sinh AS 'Ngày sinh',\n" +
                    "  so_CMND AS 'Số CMND',\n" +
                    "  ngay_cap_CMND AS 'Ngày cấp CMND',\n" +
                    "  CONVERT(noi_cap_CMND USING utf8) AS 'Nơi cấp CMND',\n" +
                    "  CONVERT(noi_sinh USING utf8) AS 'Nơi sinh',\n" +
                    "  CONVERT(nguyen_quan USING utf8) AS 'Nguyên quán',\n" +
                    "  CONVERT(dan_toc USING utf8) AS 'Dân tộc',\n" +
                    "  CONVERT(nghe_nghiep USING utf8) AS 'Nghề nghiệp',\n" +
                    "  CONVERT(noi_lam_viec USING utf8) AS 'Nơi làm việc',\n" +
                    "  quan_he_voi_chu_ho AS 'Quan hệ với chủ hộ',\n" +
                    "  ngay_dang_ky_thuong_tru AS 'Ngày đăng ký thường trú',\n" +
                    "  CONVERT(dia_chi_truoc_khi_chuyen USING utf8) AS 'Địa chỉ trước khi chuyển',\n" +
                    "  chuyen_di AS 'Chuyển đi',\n" +
                    "  deleted AS 'Đã xóa',\n" +
                    "  so_ho_khau AS 'Số hộ khẩu',\n" +
                    "  qua_doi AS 'Qua đời'\n" +
                    "FROM nhan_khau\n" +
                    "ORDER BY so_ho_khau;";
                rs = st.executeQuery(sql);
                tNhanKhau.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu");
                displayNhanKhau();

            }
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();

            if (saveFile != null) {
                saveFile = new File(saveFile.toString()+".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("hoKhau");

                Row rowCol = sheet.createRow(0);
                for(int i = 0; i < tNhanKhau.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tNhanKhau.getColumnName(i));
                }

                for(int i = 0; i < tNhanKhau.getRowCount(); i++) {
                    Row row = sheet.createRow(i+1);
                    for (int j = 0; j < tNhanKhau.getColumnCount(); j++){
                        Cell cell = row.createCell(j);
                        if(tNhanKhau.getValueAt(i,j) != null){
                            cell.setCellValue(tNhanKhau.getValueAt(i, j).toString());
                        }
                    }
                }
                
                displayNhanKhau();

                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                conn.close();
                openFile(saveFile.toString());
            }
            else {
                JOptionPane.showMessageDialog(null, "Lỗi kết nối");
                displayNhanKhau();

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_InActionPerformed

    // ----------------- EXCEL EXTRACTION -------------------------------
    private void InMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InMouseClicked

    private void btnTrinhBanGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrinhBanGhiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrinhBanGhiActionPerformed

    private void btnTrinhBanGhiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrinhBanGhiMouseClicked
        // TODO add your handling code here:
        displayNhanKhau();
    }//GEN-LAST:event_btnTrinhBanGhiMouseClicked

    private void tNhanKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tNhanKhauMouseClicked
        DefaultTableModel model = (DefaultTableModel)tNhanKhau.getModel();
        int indexRow = tNhanKhau.getSelectedRow();
        key = String.valueOf(model.getValueAt(indexRow, 0).toString());
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
            String query = "SELECT * FROM nhan_khau where nhan_khau_id = " + key + ";";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            NhanKhau nhanKhauMoi = new NhanKhau();
            while (resultSet.next()) {
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
                nhanKhauMoi.setQuanHeVoiChuHo(resultSet.getString("quan_he_voi_chu_ho"));
                nhanKhauMoi.setNgayDangKyThuongTru(resultSet.getString("ngay_dang_ky_thuong_tru"));
                nhanKhauMoi.setDiaChiTruocKhiChuyen(resultSet.getString("dia_chi_truoc_khi_chuyen"));
                nhanKhauMoi.setChuyenDi(resultSet.getString("chuyen_di"));
                nhanKhauMoi.setDeleted(resultSet.getInt("deleted"));
                nhanKhauMoi.setSoHoKhau(resultSet.getString("so_ho_khau"));
                nhanKhauMoi.setQuaDoi(resultSet.getString("qua_doi"));
            }
            nhanKhau = nhanKhauMoi;
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu");
        }
    }//GEN-LAST:event_tNhanKhauMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

    }//GEN-LAST:event_btnSuaActionPerformed

    // -------------------------- EDIT DATA --------------------------------
    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
                // ------ kiểm tra xem đã chọn hộ khẩu chưa
        if (key.equals("") || nhanKhau == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một nhân khẩu trong bảng\n"
                    + "để theo dõi thêm thông tin về nhân khẩu đó.");
            return;
        }
        // ------ truyền vào form sửa hộ khẩu khẩu
        SuaXoaNhanKhauForm newForm =  new SuaXoaNhanKhauForm(nhanKhau);
        newForm.setVisible(true);
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        // TODO add your handling code here:
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
            st = conn.createStatement();
            String thongTin = tfTim.getText();
            String sql = "SELECT \n" +
                    "  nhan_khau_id AS 'Nhân khẩu ID',\n" +
                    "  CONVERT(ho_ten USING utf8) AS 'Họ tên',\n" +
    //                "  CONVERT(biet_danh USING utf8) AS 'Biệt danh',\n" +
                    "  gioi_tinh AS 'Giới tính',\n" +
                    "  ngay_sinh AS 'Ngày sinh',\n" +
                    "  so_CMND AS 'Số CMND',\n" +
    //                "  ngay_cap_CMND AS 'Ngày cấp CMND',\n" +
    //                "  CONVERT(noi_cap_CMND USING utf8) AS 'Nơi cấp CMND',\n" +
                    "  CONVERT(noi_sinh USING utf8) AS 'Nơi sinh',\n" +
                    "  CONVERT(nguyen_quan USING utf8) AS 'Nguyên quán',\n" +
                    "  CONVERT(dan_toc USING utf8) AS 'Dân tộc',\n" +
                    "  CONVERT(nghe_nghiep USING utf8) AS 'Nghề nghiệp',\n" +
                    "  CONVERT(noi_lam_viec USING utf8) AS 'Nơi làm việc',\n" +
                    "  quan_he_voi_chu_ho AS 'Quan hệ với chủ hộ',\n" +
    //                "  ngay_dang_ky_thuong_tru AS 'Ngày đăng ký thường trú',\n" +
    //                "  CONVERT(dia_chi_truoc_khi_chuyen USING utf8) AS 'Địa chỉ trước khi chuyển',\n" +
                    "  chuyen_di AS 'Chuyển đi',\n" +
    //                "  deleted AS 'Đã xóa',\n" +
                    "  so_ho_khau AS 'Số hộ khẩu',\n" +
                    "  qua_doi AS 'Qua đời'\n" +
                    "FROM nhan_khau\n" +
                    "WHERE nhan_khau.ho_ten = '" + thongTin + "' " +
                    "AND deleted = 0\n" +
                    "ORDER BY so_ho_khau;";
            
            rs = st.executeQuery(sql) ;
            tNhanKhau.setModel(DbUtils.resultSetToTableModel(rs));
            tfTim.setText("Nhập họ tên");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu.");
        }
    }//GEN-LAST:event_btnTimMouseClicked

    // -------------------- BACK TO MAIN FORM ----------------------------
    private void lbThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThoatMouseClicked
        // TODO add your handling code here:
        if(user.isAdmin == 1){
            MainFormForAdmin mainForm = new MainFormForAdmin();
            mainForm.setVisible(true);
            mainForm.user = user;
            this.dispose();
        }
        else if (user.isAdmin == 0) {
            MainFormForUser mainForm = new MainFormForUser();
            mainForm.setVisible(true);
            mainForm.user = user;
            this.dispose();
        }
        else {
            MainFormForUser mainForm = new MainFormForUser();
            mainForm.setVisible(true);
            this.dispose();
        }
        this.dispose();
    }//GEN-LAST:event_lbThoatMouseClicked


    private void lbKhaiTuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbKhaiTuMouseClicked
        // TODO add your handling code here:
        KhaiTuMainPage newFrame = new KhaiTuMainPage();
        newFrame.setVisible(true);
        newFrame.user = user;
        this.dispose();
    }//GEN-LAST:event_lbKhaiTuMouseClicked

    private void lbTamTruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTamTruMouseClicked
        // TODO add your handling code here:
        TamTruMainPage newFrame = new TamTruMainPage();
        newFrame.setVisible(true);
        newFrame.user = user;
        this.dispose();
    }//GEN-LAST:event_lbTamTruMouseClicked

    private void lbTamVangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTamVangMouseClicked
        // TODO add your handling code here:
        TamVangMainPage newFrame = new TamVangMainPage();
        newFrame.setVisible(true);
        newFrame.user = user;
        this.dispose();
    }//GEN-LAST:event_lbTamVangMouseClicked

    private void lbHoKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        // TODO add your handling code here:
        HoKhauMainPage newFrame = new HoKhauMainPage();
        newFrame.setVisible(true);
        newFrame.user = user;
        this.dispose();
    }//GEN-LAST:event_lbHoKhauMouseClicked

    private void lbNhanKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNhanKhauMouseClicked
        // TODO add your handling code here:
        NhanKhauMainPage newFrame = new NhanKhauMainPage();
        newFrame.setVisible(true);
        newFrame.user = user;
        this.dispose();
    }//GEN-LAST:event_lbNhanKhauMouseClicked

    private void lbThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThongKeMouseClicked
        // TODO add your handling code here:
        ThongKeMainPage newFrame = new ThongKeMainPage();
        newFrame.setVisible(true);
        newFrame.user = user;
        this.dispose();
    }//GEN-LAST:event_lbThongKeMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        ThemNhanKhauForm newForm = new ThemNhanKhauForm();
        newForm.setVisible(true);
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    // ------------ START TO CODE HERE -----------------
    // ------------- User parameter --------------------
    public User user;
    // ------------- CONNECTION SQL PARAMETER---------------
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    
    // ----------------- EXTRACT DATA FROM CLICK ON TABLE -----------------
    String key = "";
    
    // -------------- display Nhân khẩu -----------------
    private void displayNhanKhau(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
            st = conn.createStatement();
            String sql ="SELECT \n" +
                        "  nhan_khau_id AS 'Nhân khẩu ID',\n" +
                        "  CONVERT(ho_ten USING utf8) AS 'Họ tên',\n" +
        //                "  CONVERT(biet_danh USING utf8) AS 'Biệt danh',\n" +
                        "  gioi_tinh AS 'Giới tính',\n" +
                        "  ngay_sinh AS 'Ngày sinh',\n" +
                        "  so_CMND AS 'Số CMND',\n" +
        //                "  ngay_cap_CMND AS 'Ngày cấp CMND',\n" +
        //                "  CONVERT(noi_cap_CMND USING utf8) AS 'Nơi cấp CMND',\n" +
                        "  CONVERT(noi_sinh USING utf8) AS 'Nơi sinh',\n" +
                        "  CONVERT(nguyen_quan USING utf8) AS 'Nguyên quán',\n" +
                        "  CONVERT(dan_toc USING utf8) AS 'Dân tộc',\n" +
                        "  CONVERT(nghe_nghiep USING utf8) AS 'Nghề nghiệp',\n" +
                        "  CONVERT(noi_lam_viec USING utf8) AS 'Nơi làm việc',\n" +
                        "  quan_he_voi_chu_ho AS 'Quan hệ với chủ hộ',\n" +
        //                "  ngay_dang_ky_thuong_tru AS 'Ngày đăng ký thường trú',\n" +
        //                "  CONVERT(dia_chi_truoc_khi_chuyen USING utf8) AS 'Địa chỉ trước khi chuyển',\n" +
                        "  chuyen_di AS 'Chuyển đi',\n" +
        //                "  deleted AS 'Đã xóa',\n" +
                        "  so_ho_khau AS 'Số hộ khẩu',\n" +
                        "  qua_doi AS 'Qua đời'\n" +
                        "FROM nhan_khau\n" +
                        "WHERE deleted = 0\n" +
                        "ORDER BY so_ho_khau;";
            rs = st.executeQuery(sql);
            tNhanKhau.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu");

        }
    }
    
    public void openFile(String file){
        try{
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (Exception e) {            
        }
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
            java.util.logging.Logger.getLogger(NhanKhauMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanKhauMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanKhauMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanKhauMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanKhauMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton In;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTrinhBanGhi;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHoKhau;
    private javax.swing.JLabel lbKhaiTu;
    private javax.swing.JLabel lbNhanKhau;
    private javax.swing.JLabel lbTamTru;
    private javax.swing.JLabel lbTamVang;
    private javax.swing.JLabel lbThoat;
    private javax.swing.JLabel lbThongKe;
    private javax.swing.JPanel nhanKhauPanel;
    private javax.swing.JTable tNhanKhau;
    private javax.swing.JTextField tfTim;
    // End of variables declaration//GEN-END:variables
}