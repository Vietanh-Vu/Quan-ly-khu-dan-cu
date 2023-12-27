/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demographic.quanlynhankhauhokhau.mainpage;

//import com.sun.jdi.connect.spi.Connection;
import demographic.dbConnector.Connector;
import demographic.quanlynhankhauhokhau.suaxoaform.SuaXoaKhaiTuForm;
import demographic.quanlynhankhauhokhau.suaxoaform.SuaXoaTamTruForm;
import demographic.quanlynhankhauhokhau.suaxoaform.SuaXoaTamVangForm;
import demographic.quanlynhankhauhokhau.themform.ThemTamVangForm;
import demographic.models.User;
import demographic.login.MainFormForAdmin;
import demographic.login.MainFormForUser;
import demographic.models.HoKhau;
import demographic.models.KhaiTu;
import demographic.models.TamTru;
import demographic.models.TamVang;
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
public class KhaiTuMainPage extends javax.swing.JFrame {

    /**
     * Creates new form NhanKhauMainPage
     */
    public KhaiTuMainPage() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tTamTru = new javax.swing.JTable();
        btnTrinhBanGhi = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();
        tfTim = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();

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
        jLabel6.setText("QUẢN LÝ HỒ SƠ KHAI TỬ");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnTim.setBackground(new java.awt.Color(0, 51, 51));
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setText("Tìm theo tên");
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

        tTamTru.setForeground(new java.awt.Color(0, 102, 102));
        tTamTru.setModel(new javax.swing.table.DefaultTableModel(
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
        tTamTru.setGridColor(new java.awt.Color(188, 206, 206));
        tTamTru.setRowHeight(26);
        tTamTru.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tTamTru.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tTamTru.setShowGrid(true);
        tTamTru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tTamTruMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tTamTru);

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

        btnXuatFile.setBackground(new java.awt.Color(0, 51, 51));
        btnXuatFile.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatFile.setText("Xuất file");
        btnXuatFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXuatFileMouseClicked(evt);
            }
        });
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });

        tfTim.setForeground(new java.awt.Color(0, 102, 102));
        tfTim.setText("Nhập thông tin");
        tfTim.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tfTim.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        tfTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfTimMouseClicked(evt);
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
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnXuatFile)
                    .addComponent(tfTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua)
                    .addComponent(btnTim))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();

            if (saveFile != null) {
                saveFile = new File(saveFile.toString()+".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("tamVang");

                Row rowCol = sheet.createRow(0);
                for(int i = 0; i < tTamTru.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tTamTru.getColumnName(i));
                }

                for(int i = 0; i < tTamTru.getRowCount(); i++) {
                    Row row = sheet.createRow(i+1);
                    for (int j = 0; j < tTamTru.getColumnCount(); j++){
                        Cell cell = row.createCell(j);
                        if(tTamTru.getValueAt(i,j) != null){
                            cell.setCellValue(tTamTru.getValueAt(i, j).toString());
                        }
                    }
                }

                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                openFile(saveFile.toString());
            }
            else {
                JOptionPane.showMessageDialog(null, "Xảy ra lỗi");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xảy ra lỗi");
        }
    }//GEN-LAST:event_btnXuatFileActionPerformed

    // ----------------- EXCEL EXTRACTION -------------------------------
    //-------------------------------------------------------------------
    
    private void btnXuatFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatFileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuatFileMouseClicked

    private void btnTrinhBanGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrinhBanGhiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrinhBanGhiActionPerformed

    private void btnTrinhBanGhiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrinhBanGhiMouseClicked
        // TODO add your handling code here:
        display();
        this.khaiTu = null;
    }//GEN-LAST:event_btnTrinhBanGhiMouseClicked

    private void tTamTruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tTamTruMouseClicked
        // ------ lấy tham số từ cái click vào bảng -----
        // ------ sau đó tạo một đối tượng nhan khau với tham số đó
        DefaultTableModel model = (DefaultTableModel)tTamTru.getModel();
        int indexRow = tTamTru.getSelectedRow();
        key = String.valueOf(model.getValueAt(indexRow, 0).toString());
        try {
            conn = Connector.getConnection();
            String query = "SELECT * FROM khai_tu where khai_tu_id = " + key + "";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            KhaiTu khaiTuMoi = new KhaiTu();
            
            while (resultSet.next()) {
                khaiTuMoi.setKhaiTuId(resultSet.getInt("khai_tu_id"));
                khaiTuMoi.setNhanKhauId(resultSet.getInt("nhan_khau_id"));
                khaiTuMoi.setLyDo(resultSet.getString("ly_do"));
                khaiTuMoi.setThoiGian(resultSet.getString("thoi_gian"));
                khaiTuMoi.setSoGiayKhaiTu(resultSet.getString("so_giay_khai_tu"));
                khaiTuMoi.setDeleted(resultSet.getInt("deleted"));

            }
            this.khaiTu = khaiTuMoi;
//            System.out.println(hoKhau.toString());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_tTamTruMouseClicked

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        // TODO add your handling code here:
        try {
            conn = Connector.getConnection();
            st = conn.createStatement();
            String thongTin = tfTim.getText();
            String sql = "SELECT \n" +
                        "    kt.khai_tu_id AS 'Khai tử ID',\n" +
                        "    nk.ho_ten AS 'Họ tên',\n" +
                        "    nk.ngay_sinh AS 'Ngày sinh',\n" +
                        "    nk.so_ho_khau AS 'Số hộ khẩu',\n" +
                        "    kt.thoi_gian AS 'Thời gian',\n" +
                        "    kt.ly_do AS 'Lý do',\n" +
                        "    kt.so_giay_khai_tu AS 'Số giấy khai tử'\n" +
                        "FROM khai_tu kt\n" +
                        "JOIN nhan_khau nk ON kt.nhan_khau_id = nk.nhan_khau_id\n" +
                        "WHERE kt.deleted = 0\n" +
                        "AND nk.ho_ten = '" + thongTin + "';\n";
            System.out.println(sql);
            rs = st.executeQuery(sql) ;
            tTamTru.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
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

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:

        // ------ kiểm tra xem đã chọn hộ khẩu chưa
        if (key.equals("") || this.khaiTu == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn bản ghi trong bảng.");
            return;
        }
        // ------ truyền vào form sửa hộ khẩu khẩu
        SuaXoaKhaiTuForm newForm =  new SuaXoaKhaiTuForm(this.khaiTu);
        newForm.setVisible(true);
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tfTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfTimMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTimMouseClicked

    // ------------ START TO CODE HERE -----------------
    // ------------- User parameter --------------------
    public User user;
    // ------------- CONNECTION SQL PARAMETER---------------
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    
    KhaiTu khaiTu;
    
    // ------------- DISPLAY PEOPLE ---------------------
    private void display(){
        try {
            conn = Connector.getConnection();
            st = conn.createStatement();
            String sql = "SELECT \n" +
                        "    kt.khai_tu_id AS 'Khai tử ID',\n" +
                        "    nk.ho_ten AS 'Họ tên',\n" +
                        "    nk.ngay_sinh AS 'Ngày sinh',\n" +
                        "    nk.so_ho_khau AS 'Số hộ khẩu',\n" +
                        "    kt.thoi_gian AS 'Thời gian',\n" +
                        "    kt.ly_do AS 'Lý do',\n" +
                        "    kt.so_giay_khai_tu AS 'Số giấy khai tử'\n" +
                        "FROM khai_tu kt\n" +
                        "JOIN nhan_khau nk ON kt.nhan_khau_id = nk.nhan_khau_id\n" +
                        "WHERE kt.deleted = 0;";
//            System.out.println(sql);
            rs = st.executeQuery(sql);
            tTamTru.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu");
        }
    }    
    
    // ----------------- EXTRACT DATA FROM CLICK ON TABLE -----------------
    String key = "";
    
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
            java.util.logging.Logger.getLogger(KhaiTuMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhaiTuMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhaiTuMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhaiTuMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhaiTuMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTrinhBanGhi;
    private javax.swing.JButton btnXuatFile;
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
    private javax.swing.JTable tTamTru;
    private javax.swing.JTextField tfTim;
    // End of variables declaration//GEN-END:variables
}
