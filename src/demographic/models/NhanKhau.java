/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demographic.models;

/**
 *
 * @author Nam
 */

public class NhanKhau {
    private int nhanKhauId;
    private String hoTen;
    private String bietDanh;
    private String gioiTinh;
    private String ngaySinh;
    private String soCMND;
    private String ngayCapCMND;
    private String noiCapCMND;
    private String noiSinh;
    private String nguyenQuan;
    private String danToc;
    private String ngheNghiep;
    private String noiLamViec;
    private String quanHeVoiChuHo;
    private String ngayDangKyThuongTru;
    private String diaChiTruocKhiChuyen;
    private String chuyenDi;
    private int deleted;
    private String soHoKhau;
    private String quaDoi;

    // Constructors, getters, setters, and other methods can be added as needed

    // Ví dụ về constructor không tham số
    public NhanKhau() {
    }

    // Ví dụ về constructor đầy đủ tham số
    public NhanKhau(int nhanKhauId, String hoTen, String bietDanh, String gioiTinh, String ngaySinh,
                    String soCMND, String ngayCapCMND, String noiCapCMND, String noiSinh, String nguyenQuan,
                    String danToc, String ngheNghiep, String noiLamViec, String quanHeVoiChuHo,
                    String ngayDangKyThuongTru, String diaChiTruocKhiChuyen, String chuyenDi, int deleted,
                    String soHoKhau, String quaDoi) {
        this.nhanKhauId = nhanKhauId;
        this.hoTen = hoTen;
        this.bietDanh = bietDanh;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
        this.ngayCapCMND = ngayCapCMND;
        this.noiCapCMND = noiCapCMND;
        this.noiSinh = noiSinh;
        this.nguyenQuan = nguyenQuan;
        this.danToc = danToc;
        this.ngheNghiep = ngheNghiep;
        this.noiLamViec = noiLamViec;
        this.quanHeVoiChuHo = quanHeVoiChuHo;
        this.ngayDangKyThuongTru = ngayDangKyThuongTru;
        this.diaChiTruocKhiChuyen = diaChiTruocKhiChuyen;
        this.chuyenDi = chuyenDi;
        this.deleted = deleted;
        this.soHoKhau = soHoKhau;
        this.quaDoi = quaDoi;
    }
    
    // GETTER and SETTER

    public int getNhanKhauId() {
        return nhanKhauId;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getBietDanh() {
        return bietDanh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public String getNgayCapCMND() {
        return ngayCapCMND;
    }

    public String getNoiCapCMND() {
        return noiCapCMND;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public String getNguyenQuan() {
        return nguyenQuan;
    }

    public String getDanToc() {
        return danToc;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public String getNoiLamViec() {
        return noiLamViec;
    }

    public String getQuanHeVoiChuHo() {
        return quanHeVoiChuHo;
    }

    public String getNgayDangKyThuongTru() {
        return ngayDangKyThuongTru;
    }

    public String getDiaChiTruocKhiChuyen() {
        return diaChiTruocKhiChuyen;
    }

    public String getChuyenDi() {
        return chuyenDi;
    }

    public int getDeleted() {
        return deleted;
    }

    public String getSoHoKhau() {
        return soHoKhau;
    }

    public String getQuaDoi() {
        return quaDoi;
    }

    public void setNhanKhauId(int nhanKhauId) {
        this.nhanKhauId = nhanKhauId;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setBietDanh(String bietDanh) {
        this.bietDanh = bietDanh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public void setNgayCapCMND(String ngayCapCMND) {
        this.ngayCapCMND = ngayCapCMND;
    }

    public void setNoiCapCMND(String noiCapCMND) {
        this.noiCapCMND = noiCapCMND;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public void setNguyenQuan(String nguyenQuan) {
        this.nguyenQuan = nguyenQuan;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public void setNoiLamViec(String noiLamViec) {
        this.noiLamViec = noiLamViec;
    }

    public void setQuanHeVoiChuHo(String quanHeVoiChuHo) {
        this.quanHeVoiChuHo = quanHeVoiChuHo;
    }

    public void setNgayDangKyThuongTru(String ngayDangKyThuongTru) {
        this.ngayDangKyThuongTru = ngayDangKyThuongTru;
    }

    public void setDiaChiTruocKhiChuyen(String diaChiTruocKhiChuyen) {
        this.diaChiTruocKhiChuyen = diaChiTruocKhiChuyen;
    }

    public void setChuyenDi(String chuyenDi) {
        this.chuyenDi = chuyenDi;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public void setQuaDoi(String quaDoi) {
        this.quaDoi = quaDoi;
    }
    
    @Override
    public String toString() {

        return "NhanKhau{" +
                "nhanKhauId=" + nhanKhauId +
                ", hoTen='" + hoTen + '\'' +
                ", bietDanh='" + bietDanh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ngaySinh=" + ngaySinh + '\'' +
                ", soCMND='" + soCMND + '\'' +
                ", ngayCapCMND=" + ngayCapCMND+ '\'' +
                ", noiCapCMND='" + noiCapCMND + '\'' +
                ", noiSinh='" + noiSinh + '\'' +
                ", nguyenQuan='" + nguyenQuan + '\'' +
                ", danToc='" + danToc + '\'' +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                ", noiLamViec='" + noiLamViec + '\'' +
                ", quanHeVoiChuHo='" + quanHeVoiChuHo + '\'' +
                ", ngayDangKyThuongTru=" + ngayDangKyThuongTru + '\'' +
                ", diaChiTruocKhiChuyen='" + diaChiTruocKhiChuyen + '\'' +
                ", chuyenDi='" + chuyenDi + '\'' +
                ", deleted=" + deleted +
                ", soHoKhau='" + soHoKhau + '\'' +
                ", quaDoi='" + quaDoi + '\'' +
                '}';
    }
}

