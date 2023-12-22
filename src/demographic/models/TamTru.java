/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demographic.models;

/**
 *
 * @author Nam
 */
public class TamTru {
    private int tamTruId;
    private String hoTen;
    private String ngaySinh;
    private String soCMND;
    private String ngayCap;
    private String noiCap;
    private String gioiTinh;
    private String diaChiThuongTru;
    private String choOHienTai;
    private String lyDo;
    private String ngayTamTru;
    private int deleted;

    // Constructors, getters, and setters

    public TamTru() {
    }

    public TamTru(int tamTruId, String hoTen, String ngaySinh, String soCMND, String ngayCap, String noiCap, String gioiTinh, String diaChiThuongTru, String choOHienTai, String lyDo, String ngayTamTru, int deleted) {
        this.tamTruId = tamTruId;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
        this.ngayCap = ngayCap;
        this.noiCap = noiCap;
        this.gioiTinh = gioiTinh;
        this.diaChiThuongTru = diaChiThuongTru;
        this.choOHienTai = choOHienTai;
        this.lyDo = lyDo;
        this.ngayTamTru = ngayTamTru;
        this.deleted = deleted;
    }

    public int getTamTruId() {
        return tamTruId;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public String getNgayCap() {
        return ngayCap;
    }

    public String getNoiCap() {
        return noiCap;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChiThuongTru() {
        return diaChiThuongTru;
    }

    public String getChoOHienTai() {
        return choOHienTai;
    }

    public String getLyDo() {
        return lyDo;
    }

    public String getNgayTamTru() {
        return ngayTamTru;
    }

    // Other methods
    public int getDeleted() {
        return deleted;
    }

    public void setTamTruId(int tamTruId) {
        this.tamTruId = tamTruId;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public void setNgayCap(String ngayCap) {
        this.ngayCap = ngayCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChiThuongTru(String diaChiThuongTru) {
        this.diaChiThuongTru = diaChiThuongTru;
    }

    public void setChoOHienTai(String choOHienTai) {
        this.choOHienTai = choOHienTai;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public void setNgayTamTru(String ngayTamTru) {
        this.ngayTamTru = ngayTamTru;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "TamTru{" +
                "tamTruId=" + tamTruId +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", soCMND='" + soCMND + '\'' +
                ", ngayCap='" + ngayCap + '\'' +
                ", noiCap='" + noiCap + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChiThuongTru='" + diaChiThuongTru + '\'' +
                ", choOHienTai='" + choOHienTai + '\'' +
                ", lyDo='" + lyDo + '\'' +
                ", ngayTamTru='" + ngayTamTru + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}

