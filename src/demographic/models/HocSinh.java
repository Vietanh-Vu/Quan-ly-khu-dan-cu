package demographic.models;

import demographic.dbConnector.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class HocSinh implements DBActing {
    // Attribute
    private int nhanKhauId;
    private String truong = " ";
    private String lop = " ";
    private String thanhTich = " ";
    private String dipThuong;
    private String hoTen;
    private String soHoKhau;
    private boolean isDeleted;

    // Constructor
    public HocSinh(int nhanKhauId, String dipThuong, String hoTen, String soHoKhau) {
        this.nhanKhauId = nhanKhauId;
        this.dipThuong = dipThuong;
        this.hoTen = hoTen;
        this.soHoKhau = soHoKhau;
    }

    public HocSinh(int nhanKhauId, String dipThuong, String hoTen, String soHoKhau, String truong, String lop, String thanhTich, boolean isDeleted) {
        this(nhanKhauId, dipThuong, hoTen, soHoKhau);
        this.truong = truong;
        this.lop = lop;
        this.thanhTich = thanhTich;
        this.isDeleted = isDeleted;
    }

    // Phuong thuc de them mot dong vao csdl
    @Override
    public boolean addNewRow() {
        try {
            Connection connection = Connector.getConnection();

            String insertQuery = "INSERT INTO hoc_sinh (\n" +
                    "  `nhan_khau_id`,\n" +
                    "  `truong`,\n" +
                    "  `lop`,\n" +
                    "  `thanh_tich`,\n" +
                    "  `dip_thuong`,\n" +
                    "  `ho_ten`,\n" +
                    "  `so_ho_khau`\n" +
                    ") VALUES (\n" +
                    "  '" + nhanKhauId +
                    "', '" + truong +
                    "', '" + lop +
                    "', '" + thanhTich +
                    "', '" + dipThuong +
                    "', '" + hoTen +
                    "', '" + soHoKhau +
                    "');\n";

            PreparedStatement add = connection.prepareStatement(insertQuery);
            int row = add.executeUpdate();

            // --- thêm một đoạn dialog báo thêm thành công ở đây

            add.close();
            connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phuong thuc de sua mot dip tang thuong
    @Override
    public boolean editRow() {
        try {
            Connection connection = Connector.getConnection();

            String updateQuery = "UPDATE `hoc_sinh`\n" +
                    "SET\n" +
                    "`truong` = '" + truong +
                    "', `lop` = '" + lop +
                    "', `thanh_tich` = '" + thanhTich +
                    "'WHERE\n" +
                    "`nhan_khau_id` = " + nhanKhauId +
                    " AND `dip_thuong` = '" + dipThuong + "';";

            PreparedStatement edit = connection.prepareStatement(updateQuery);
            int row = edit.executeUpdate();

            // --- thêm một đoạn dialog báo sửa thành công

            edit.close();
            connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phuong thuc de xoa mot dip tang thuong
    @Override
    public boolean deleteRow() {
        try {
            Connection connection = Connector.getConnection();

            isDeleted = true;

            String updateQuery = "UPDATE `hoc_sinh`\n" +
                    "SET\n" +
                    "`isDeleted` = " + (isDeleted ? 1 : 0) +
                    " WHERE\n" +
                    "`nhan_khau_id` = " + nhanKhauId +
                    " AND `dip_thuong` = '" + dipThuong + "';";

            PreparedStatement edit = connection.prepareStatement(updateQuery);
            int row = edit.executeUpdate();

            // --- thêm một đoạn dialog báo sửa thành công

            edit.close();
            connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Getter and Setter
    public int getNhanKhauId() {
        return nhanKhauId;
    }

    public void setNhanKhauId(int nhanKhauId) {
        this.nhanKhauId = nhanKhauId;
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getThanhTich() {
        return thanhTich;
    }

    public void setThanhTich(String thanhTich) {
        this.thanhTich = thanhTich;
    }

    public String getDipThuong() {
        return dipThuong;
    }

    public void setDipThuong(String dipThuong) {
        this.dipThuong = dipThuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
