package demographic.models;

import demographic.dbConnector.Connector;
import demographic.textHandle.ReadFromJson;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListOfTangThuong {
    // Attribute
    private List<TangThuong> tangThuongList = new ArrayList<>();

    // Constructor
    public ListOfTangThuong() {
        try {
            Connection connection = Connector.getConnection();

            String selectQuery = "SELECT * FROM tang_thuong;";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                TangThuong tangThuong = new TangThuong(
                        resultSet.getInt("id_dip_tang_thuong"),
                        resultSet.getString("so_ho_khau"),
                        resultSet.getString("dip_thuong"),
                        ReadFromJson.jsonToMap(resultSet.getString("chi_tiet_phan_qua")),
                        resultSet.getBoolean("isDeleted")
                );
                tangThuongList.add(tangThuong);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Search by so ho khau and hoc ky
    public List<TangThuong> searchBySoHoKhauAndDipThuong(String soHoKhau, String DipThuong) {
        List<TangThuong> filteredList = new ArrayList<>();
        for (TangThuong tangThuong: tangThuongList) {
            if (tangThuong.getSoHoKhau().toLowerCase().contains(soHoKhau.toLowerCase())
                    && tangThuong.getDipThuong().toLowerCase().contains(DipThuong.toLowerCase())) {
                filteredList.add(tangThuong);
            }
        }
        return filteredList;
    }

    // Search by idDipTangThuong
    public List<TangThuong> searchByIdDipTangThuong(int idDipTangThuong) {
        List<TangThuong> filteredList = new ArrayList<>();
        for (TangThuong tangThuong: tangThuongList) {
            if (tangThuong.getIdDipTangThuong() == idDipTangThuong) {
                filteredList.add(tangThuong);
            }
        }
        return filteredList;
    }

    // Getter and Setter
    public List<TangThuong> getTangThuongList() {
        return tangThuongList;
    }

    public void setTangThuongList(List<TangThuong> tangThuongList) {
        this.tangThuongList = tangThuongList;
    }
}
