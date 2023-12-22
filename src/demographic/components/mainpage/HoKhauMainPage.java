/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demographic.components.mainpage;

//import com.sun.jdi.connect.spi.Connection;
import demographic.components.suaxoaform.SuaXoaHoKhauForm;
import demographic.components.themform.ThemHoKhauForm;
import demographic.quanlynhankhau.*;
import demographic.models.User;
import demographic.login.MainFormForAdmin;
import demographic.login.MainFormForUser;
import demographic.models.HoKhau;
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
public class HoKhauMainPage extends javax.swing.JFrame {

    /**
     * Creates new form NhanKhauMainPage
     */
    public HoKhauMainPage() {
        initComponents();
        displayHoKhau();
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
        lbHoKhau = new javax.swing.JLabel();
        lbNhanKhau = new javax.swing.JLabel();
        lbTamVang = new javax.swing.JLabel();
        lbTamTru = new javax.swing.JLabel();
        lbKhaiTu = new javax.swing.JLabel();
        lbThoat = new javax.swing.JLabel();
        lbKhaiTu1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTim = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tHoKhau = new javax.swing.JTable();
        btnTrinhBanGhi = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();
        tfTim = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nhanKhauPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        lbHoKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbHoKhau.setForeground(new java.awt.Color(255, 255, 255));
        lbHoKhau.setText("Nhân khẩu");
        lbHoKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHoKhauMouseClicked(evt);
            }
        });

        lbNhanKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNhanKhau.setForeground(new java.awt.Color(255, 255, 255));
        lbNhanKhau.setText("Hộ khẩu");
        lbNhanKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNhanKhauMouseClicked(evt);
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

        lbKhaiTu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbKhaiTu1.setForeground(new java.awt.Color(255, 255, 255));
        lbKhaiTu1.setText("Thống kê");
        lbKhaiTu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbKhaiTu1MouseClicked(evt);
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
                    .addComponent(lbNhanKhau)
                    .addComponent(lbHoKhau)
                    .addComponent(lbKhaiTu1)
                    .addComponent(lbTamTru))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lbNhanKhau)
                .addGap(18, 18, 18)
                .addComponent(lbHoKhau)
                .addGap(18, 18, 18)
                .addComponent(lbTamVang)
                .addGap(18, 18, 18)
                .addComponent(lbTamTru)
                .addGap(18, 18, 18)
                .addComponent(lbKhaiTu)
                .addGap(18, 18, 18)
                .addComponent(lbKhaiTu1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbThoat)
                .addGap(33, 33, 33))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("QUẢN LÝ HỘ KHẨU");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnTim.setBackground(new java.awt.Color(0, 51, 51));
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setText("Tìm");
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

        tHoKhau.setForeground(new java.awt.Color(0, 102, 102));
        tHoKhau.setModel(new javax.swing.table.DefaultTableModel(
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
        tHoKhau.setGridColor(new java.awt.Color(188, 206, 206));
        tHoKhau.setRowHeight(26);
        tHoKhau.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tHoKhau.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tHoKhau.setShowGrid(true);
        tHoKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tHoKhauMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tHoKhau);

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
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXuatFile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
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
                    .addComponent(btnThem)
                    .addComponent(btnXuatFile)
                    .addComponent(btnTim)
                    .addComponent(tfTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua))
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
                Sheet sheet = wb.createSheet("hoKhau");

                Row rowCol = sheet.createRow(0);
                for(int i = 0; i < tHoKhau.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tHoKhau.getColumnName(i));
                }

                for(int i = 0; i < tHoKhau.getRowCount(); i++) {
                    Row row = sheet.createRow(i+1);
                    for (int j = 0; j < tHoKhau.getColumnCount(); j++){
                        Cell cell = row.createCell(j);
                        if(tHoKhau.getValueAt(i,j) != null){
                            cell.setCellValue(tHoKhau.getValueAt(i, j).toString());
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
        displayHoKhau();
        hoKhau = null;
    }//GEN-LAST:event_btnTrinhBanGhiMouseClicked

    private void tHoKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tHoKhauMouseClicked
        // ------ lấy tham số từ cái click vào bảng -----
        // ------ sau đó tạo một đối tượng nhan khau với tham số đó
        DefaultTableModel model = (DefaultTableModel)tHoKhau.getModel();
        int indexRow = tHoKhau.getSelectedRow();
        key = String.valueOf(model.getValueAt(indexRow, 0).toString());
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
            String query = "SELECT * FROM ho_khau where so_ho_khau = \"" + key + "\"";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            HoKhau hoKhauMoi = new HoKhau();
            
            while (resultSet.next()) {
                hoKhauMoi.setHoKhauId(resultSet.getInt("ho_khau_id"));
                hoKhauMoi.setSoHoKhau(resultSet.getString("so_ho_khau"));
                hoKhauMoi.setChuHoId(resultSet.getInt("chu_ho_id"));
                hoKhauMoi.setChuHoCMND(resultSet.getString("chu_ho_CMND"));
                hoKhauMoi.setDiaChi(resultSet.getString("dia_chi"));
                hoKhauMoi.setLaChungCu(resultSet.getString("la_chung_cu"));
                hoKhauMoi.setNgayLap(resultSet.getString("ngay_lap"));
                hoKhauMoi.setDeleted(resultSet.getInt("deleted"));
            }
            hoKhau = hoKhauMoi;
//            System.out.println(hoKhau.toString());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_tHoKhauMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    // -------------------------- EDIT DATA --------------------------------
    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        ThemHoKhauForm newForm = new ThemHoKhauForm();
        newForm.setVisible(true);
        displayHoKhau();
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        // TODO add your handling code here:
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
            st = conn.createStatement();
            String thongTin = tfTim.getText();
            String sql = "SELECT " +
                  "    ho_khau.so_ho_khau AS 'Số hộ khẩu', " +
                  "    ho_khau.dia_chi AS 'Địa chỉ', " +
                  "    ho_khau.ngay_lap AS 'Ngày lập', " +
                  "    nhan_khau.ho_ten AS 'Họ tên chủ hộ', " +
                  "    ho_khau.chu_ho_CMND AS 'CMND của Chủ hộ' " +
                  "FROM ho_khau " +
                  "JOIN nhan_khau ON ho_khau.chu_ho_id = nhan_khau.nhan_khau_id " +
                  "WHERE (ho_khau.so_ho_khau = '" + thongTin + "' OR " +
                  "      ho_khau.dia_chi = '" + thongTin + "' OR " +
                  "      ho_khau.ngay_lap = '" + thongTin + "' OR " +
                  "      nhan_khau.ho_ten = '" + thongTin + "' OR " +
                  "      ho_khau.chu_ho_CMND = '" + thongTin + "') " +
                  "      AND ho_khau.deleted = 0;";
            
            rs = st.executeQuery(sql) ;
            tHoKhau.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối cơ sở dữ liệu.");
        }
    }//GEN-LAST:event_btnTimMouseClicked

    // -------------------- BACK TO MAIN FORM ----------------------------
    private void lbThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThoatMouseClicked
        // TODO add your handling code here:
        if(user.isAdmin.equals("Yes")){
            MainFormForAdmin mainForm = new MainFormForAdmin();
            mainForm.setVisible(true);
            mainForm.user = user;
            this.dispose();
        }
        else if (user.isAdmin.equals("No")) {
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

    private void lbNhanKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNhanKhauMouseClicked
        // TODO add your handling code here:
        NhanKhauMainPage newFrame = new NhanKhauMainPage();
        newFrame.setVisible(true);
        newFrame.user = user;
        this.dispose();
    }//GEN-LAST:event_lbNhanKhauMouseClicked

    private void lbHoKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHoKhauMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbHoKhauMouseClicked

    private void lbKhaiTu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbKhaiTu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbKhaiTu1MouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:

        // ------ kiểm tra xem đã chọn hộ khẩu chưa
        if (key.equals("") || hoKhau == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hộ khẩu trong bảng\n"
                    + "để theo dõi thêm thông tin về hộ đó.");
            return;
        }
        // ------ truyền vào form sửa hộ khẩu khẩu
        SuaXoaHoKhauForm newForm =  new SuaXoaHoKhauForm(hoKhau);
        newForm.setVisible(true);
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    // ------------ START TO CODE HERE -----------------
    // ------------- User parameter --------------------
    public User user;
    // ------------- CONNECTION SQL PARAMETER---------------
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    
    HoKhau hoKhau;
    
    // ------------- DISPLAY PEOPLE ---------------------
    private void displayHoKhau(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_khu_dan_cu","root","");
            st = conn.createStatement();
            String sql = "SELECT " +
                  "    ho_khau.so_ho_khau AS 'Số hộ khẩu', " +
                  "    ho_khau.dia_chi AS 'Địa chỉ', " +
                  "    ho_khau.ngay_lap AS 'Ngày lập', " +
                  "    nhan_khau.ho_ten AS 'Họ tên chủ hộ', " +
                  "    ho_khau.chu_ho_CMND AS 'CMND của Chủ hộ' " +
                  "FROM ho_khau " +
                  "JOIN nhan_khau ON ho_khau.chu_ho_id = nhan_khau.nhan_khau_id\n"
                    + "WHERE ho_khau.deleted = 0;";

            rs = st.executeQuery(sql);
            tHoKhau.setModel(DbUtils.resultSetToTableModel(rs));
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
            java.util.logging.Logger.getLogger(HoKhauMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoKhauMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoKhauMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoKhauMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new HoKhauMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTrinhBanGhi;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHoKhau;
    private javax.swing.JLabel lbKhaiTu;
    private javax.swing.JLabel lbKhaiTu1;
    private javax.swing.JLabel lbNhanKhau;
    private javax.swing.JLabel lbTamTru;
    private javax.swing.JLabel lbTamVang;
    private javax.swing.JLabel lbThoat;
    private javax.swing.JPanel nhanKhauPanel;
    private javax.swing.JTable tHoKhau;
    private javax.swing.JTextField tfTim;
    // End of variables declaration//GEN-END:variables
}
