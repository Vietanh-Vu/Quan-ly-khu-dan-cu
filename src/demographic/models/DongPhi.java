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

    private int idDongPhi;
    private int idKhoanThuPhi;
    private String soHoKhau;
    private String soTien;
    private int daDong;
    private String ngayDong;
    private int phiChungCu;

    public DongPhi() {
    }

    public DongPhi(int idDongPhi, int idKhoanThuPhi, String soHoKhau, String soTien, int daDong, String ngayDong, int phiChungCu) {
        this.idDongPhi = idDongPhi;
        this.idKhoanThuPhi = idKhoanThuPhi;
        this.soHoKhau = soHoKhau;
        this.soTien = soTien;
        this.daDong = daDong;
        this.ngayDong = ngayDong;
        this.phiChungCu = phiChungCu;
    }

    public int getIdDongPhi() {
        return idDongPhi;
    }

    public void setIdDongPhi(int idDongPhi) {
        this.idDongPhi = idDongPhi;
    }

    public int getIdKhoanThuPhi() {
        return idKhoanThuPhi;
    }

    public void setIdKhoanThuPhi(int idKhoanThuPhi) {
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

    public int getDaDong() {
        return daDong;
    }

    public void setDaDong(int daDong) {
        this.daDong = daDong;
    }

    public String getNgayDong() {
        return ngayDong;
    }

    public void setNgayDong(String ngayDong) {
        this.ngayDong = ngayDong;
    }

    public int getPhiChungCu() {
        return phiChungCu;
    }

    public void setPhiChungCu(int phiChungCu) {
        this.phiChungCu = phiChungCu;
    }

    @Override
    public String toString() {
        return "DongPhi{" + "idDongPhi=" + idDongPhi + ", idKhoanThuPhi=" + idKhoanThuPhi + ", soHoKhau=" + soHoKhau + ", soTien=" + soTien + ", daDong=" + daDong + ", ngayDong=" + ngayDong + ", phiChungCu=" + phiChungCu + '}';
    }

}
