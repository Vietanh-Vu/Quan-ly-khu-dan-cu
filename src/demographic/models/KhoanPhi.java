/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demographic.models;

/**
 *
 * @author vietanhvu
 */
public class KhoanPhi {
    private String idKhoanPhi;
    private String tenKhoanPhi;
    private int tienPhi;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String chiTiet;

    public KhoanPhi() {
    }

    public KhoanPhi(String idKhoanPhi, String tenKhoanPhi, int tienPhi, String ngayBatDau, String ngayKetThuc, String chiTiet) {
        this.idKhoanPhi = idKhoanPhi;
        this.tenKhoanPhi = tenKhoanPhi;
        this.tienPhi = tienPhi;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.chiTiet = chiTiet;
    }

    public String getIdKhoanPhi() {
        return idKhoanPhi;
    }

    public void setIdKhoanPhi(String idKhoanPhi) {
        this.idKhoanPhi = idKhoanPhi;
    }

    public String getTenKhoanPhi() {
        return tenKhoanPhi;
    }

    public void setTenKhoanPhi(String tenKhoanPhi) {
        this.tenKhoanPhi = tenKhoanPhi;
    }

    public int getTienPhi() {
        return tienPhi;
    }

    public void setTienPhi(int tienPhi) {
        this.tienPhi = tienPhi;
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
}
