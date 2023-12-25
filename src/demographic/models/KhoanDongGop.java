/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demographic.models;

/**
 *
 * @author vietanhvu
 */
public class KhoanDongGop {

    private int IDKhoanDongGop;
    private String tenKhoanDongGop;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String chiTiet;

    public KhoanDongGop() {
    }

    public KhoanDongGop(int IDKhoanDongGop, String tenKhoanDongGop, String ngayBatDau, String ngayKetThuc, String chiTiet) {
        this.IDKhoanDongGop = IDKhoanDongGop;
        this.tenKhoanDongGop = tenKhoanDongGop;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.chiTiet = chiTiet;
    }

    public int getIDKhoanDongGop() {
        return IDKhoanDongGop;
    }

    public void setIDKhoanDongGop(int IDKhoanDongGop) {
        this.IDKhoanDongGop = IDKhoanDongGop;
    }

    public String getTenKhoanDongGop() {
        return tenKhoanDongGop;
    }

    public void setTenKhoanDongGop(String tenKhoanDongGop) {
        this.tenKhoanDongGop = tenKhoanDongGop;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }

    @Override
    public String toString() {
        return "KhoanDongGop{" + "IDKhoanDongGop=" + IDKhoanDongGop + ", tenKhoanDongGop=" + tenKhoanDongGop + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", chiTiet=" + chiTiet + '}';
    }

}
