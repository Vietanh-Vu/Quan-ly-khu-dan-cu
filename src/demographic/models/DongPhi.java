/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demographic.models;

/**
 *
 * @author vietanhvu
 */
public class DongPhi {

    private String idDongPhi;
    private String idKhoanThuPhi;
    private String soHoKhau;
    private String soTien;
    private String daDong;
    private String ngayDong;

    public DongPhi() {
    }

    public DongPhi(String idDongPhi, String idKhoanThuPhi, String soHoKhau, String soTien, String daDong, String ngayDong) {
        this.idDongPhi = idDongPhi;
        this.idKhoanThuPhi = idKhoanThuPhi;
        this.soHoKhau = soHoKhau;
        this.soTien = soTien;
        this.daDong = daDong;
        this.ngayDong = ngayDong;
    }

    public String getIdDongPhi() {
        return idDongPhi;
    }

    public void setIdDongPhi(String idDongPhi) {
        this.idDongPhi = idDongPhi;
    }

    public String getIdKhoanThuPhi() {
        return idKhoanThuPhi;
    }

    public void setIdKhoanThuPhi(String idKhoanThuPhi) {
        this.idKhoanThuPhi = idKhoanThuPhi;
    }

    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public String getSoTien() {
        return soTien;
    }

    public void setSoTien(String soTien) {
        this.soTien = soTien;
    }

    public String getDaDong() {
        return daDong;
    }

    public void setDaDong(String daDong) {
        this.daDong = daDong;
    }

    public String getNgayDong() {
        return ngayDong;
    }

    public void setNgayDong(String ngayDong) {
        this.ngayDong = ngayDong;
    }

}
