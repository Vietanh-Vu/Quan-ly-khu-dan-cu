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
    private int idKhoanDongGop;
    private String soTien;
    private String ngayDong;
    private int idDongGop;

    public DongGop() {
    }

    public DongGop(String soHoKhau, int idKhoanDongGop, String soTien, String ngayDong, int idDongGop) {
        this.soHoKhau = soHoKhau;
        this.idKhoanDongGop = idKhoanDongGop;
        this.soTien = soTien;
        this.ngayDong = ngayDong;
        this.idDongGop = idDongGop;
    }

    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public int getIdKhoanDongGop() {
        return idKhoanDongGop;
    }

    public void setIdKhoanDongGop(int idKhoanDongGop) {
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

    public int getIdDongGop() {
        return idDongGop;
    }

    public void setIdDongGop(int idDongGop) {
        this.idDongGop = idDongGop;
    }

}
