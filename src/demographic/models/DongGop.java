/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demographic.models;

/**
 *
 * @author vietanhvu
 */
public class DongGop {

    private String soHoKhau;
    private String idKhoanDongGop;
    private String soTien;
    private String ngayDong;

    public DongGop() {
    }

    public DongGop(String soHoKhau, String idKhoanDongGop, String soTien, String ngayDong) {
        this.soHoKhau = soHoKhau;
        this.idKhoanDongGop = idKhoanDongGop;
        this.soTien = soTien;
        this.ngayDong = ngayDong;
    }

    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public String getIdKhoanDongGop() {
        return idKhoanDongGop;
    }

    public void setIdKhoanDongGop(String idKhoanDongGop) {
        this.idKhoanDongGop = idKhoanDongGop;
    }

    public String getSoTien() {
        return soTien;
    }

    public void setSoTien(String soTien) {
        this.soTien = soTien;
    }

    public String getNgayDong() {
        return ngayDong;
    }

    public void setNgayDong(String ngayDong) {
        this.ngayDong = ngayDong;
    }

}
