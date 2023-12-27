package demographic.models;

import demographic.dbConnector.Connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListOfHocSinh {
    // Attribute
    private List<HocSinh> hocSinhList = new ArrayList<>();

    // Constructor
    public ListOfHocSinh() {
        try {
            Connection connection = Connector.getConnection();

            String selectQuery = "SELECT * FROM hoc_sinh;";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                HocSinh hocSinh = new HocSinh(resultSet.getInt("nhan_khau_id"),
                        resultSet.getString("dip_thuong"), resultSet.getString("ho_ten"), resultSet.getString("so_ho_khau"),
                        resultSet.getString("truong"), resultSet.getString("lop"), resultSet.getString("thanh_tich"),
                        resultSet.getBoolean("isDeleted"));
                hocSinhList.add(hocSinh);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to add a new list of Hoc Sinh base on hoc ky
    public boolean addNewDipThuong(String DipThuong) {
        if (Character.isDigit(DipThuong.charAt(0))) {
            int year = Integer.parseInt(DipThuong.substring(0, 4));

            try {
                Connection connection = Connector.getConnection();

                String selectQuery = "SELECT\n" +
                        "  `nhan_khau_id`,\n" +
                        "  `ho_ten`,\n" +
                        "  `so_ho_khau`\n" +
                        "  FROM nhan_khau WHERE YEAR(ngay_sinh) > "
                        + (year - 17) + " AND YEAR(ngay_sinh) < "+ (year - 6) + ";";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(selectQuery);
                while (resultSet.next()) {
                    HocSinh hocSinh = new HocSinh(resultSet.getInt("nhan_khau_id"),
                            DipThuong, resultSet.getString("ho_ten"), resultSet.getString("so_ho_khau"));
                    hocSinh.addNewRow();
                    hocSinhList.add(hocSinh);
                    System.out.println(hocSinh.getNhanKhauId());
                }
                connection.close();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        } else {
            int year = Integer.parseInt(DipThuong.substring(DipThuong.length() - 4));

            try {
                Connection connection = Connector.getConnection();

                String selectQuery = "SELECT\n" +
                        "  `nhan_khau_id`,\n" +
                        "  `ho_ten`,\n" +
                        "  `so_ho_khau`\n" +
                        "  FROM nhan_khau WHERE YEAR(ngay_sinh) >= "
                        + (year - 18) + " AND YEAR(ngay_sinh) <= "+ (year - 1) + ";";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(selectQuery);
                while (resultSet.next()) {
                    HocSinh hocSinh = new HocSinh(resultSet.getInt("nhan_khau_id"),
                            DipThuong, resultSet.getString("ho_ten"), resultSet.getString("so_ho_khau"));
                    hocSinh.addNewRow();
                    hocSinhList.add(hocSinh);
                    System.out.println(hocSinh.getNhanKhauId());
                }
                connection.close();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    // Method to get list of HocSinh base on DipThuong
    public List<HocSinh> getListOfHocSinhByDipThuong(String DipThuong) {
        List<HocSinh> filteredList = new ArrayList<>();
        for (HocSinh hocSinh: hocSinhList) {
            if (hocSinh.getDipThuong().contains(DipThuong)) {
                filteredList.add(hocSinh);
            }
        }
        return filteredList;
    }

    // Method to get list of HocSinh base on DipThuong and thanhTich
    public List<HocSinh> getListOfHocSinhByDipThuongAndThanhTich(String DipThuong, String thanhTich) {
        List<HocSinh> filteredList = new ArrayList<>();
        for (HocSinh hocSinh: hocSinhList) {
            if (hocSinh.getDipThuong().equals(DipThuong) && hocSinh.getThanhTich().equals(thanhTich)) {
                filteredList.add(hocSinh);
            }
        }
        return filteredList;
    }

    // Method to get HocSinh by hoTen, soHoKhau and DipThuong
    public HocSinh getHocSinhByHoTenSoHoKhauDipThuong(String hoTen, String soHoKhau, String DipThuong) {
        for (HocSinh hocSinh: hocSinhList) {
            if (hocSinh.getHoTen().equals(hoTen)
                    && hocSinh.getSoHoKhau().equals(soHoKhau)
                    && hocSinh.getDipThuong().equals(DipThuong)) {
                return hocSinh;
            }
        }
        return null;
    }

    // Get not deleted hocSinh
    public List<HocSinh> getNotDeletedHocSinh() {
        List<HocSinh> filteredList = new ArrayList<>();
        for (HocSinh hocSinh: hocSinhList) {
            if (!hocSinh.isDeleted()) {
                filteredList.add(hocSinh);
            }
        }
        return filteredList;
    }

    // Method to get HocSinh by nhanKhauId and DipThuong
    public HocSinh getHocSinhByNhanKhauIdDipThuong(int nhanKhauId, String DipThuong) {
        for (HocSinh hocSinh: hocSinhList) {
            if (hocSinh.getNhanKhauId() == nhanKhauId
                && hocSinh.getDipThuong().equals(DipThuong)) {
                return hocSinh;
            }
        }
        return null;
    }

    // Getter and Setter
    public List<HocSinh> getHocSinhList() {
        return hocSinhList;
    }

    public void setHocSinhList(List<HocSinh> hocSinhList) {
        this.hocSinhList = hocSinhList;
    }
}
