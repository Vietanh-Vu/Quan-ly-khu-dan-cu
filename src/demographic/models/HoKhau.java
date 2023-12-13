/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demographic.models;

/**
 *
 * @author Nam
 */
import java.util.Date;

public class HoKhau {
    private int hoKhauId;
    private String soHoKhau;
    private int chuHoId;
    private String chuHoCMND;
    private String diaChi;
    private String laChungCu;
    private String ngayLap;
    private int deleted;

    // Constructors, getters, setters, and other methods...
    public HoKhau(String soHoKhau, String chuHoCMND, String diaChi, String laChungCu, String ngayLap) {
        this.soHoKhau = soHoKhau;
        this.chuHoCMND = chuHoCMND;
        this.diaChi = diaChi;
        this.laChungCu = laChungCu;
        this.ngayLap = ngayLap;
    }

    public int getHoKhauId() {
        return hoKhauId;
    }

    public String getSoHoKhau() {
        return soHoKhau;
    }

    public int getChuHoId() {
        return chuHoId;
    }

    public String getChuHoCMND() {
        return chuHoCMND;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getLaChungCu() {
        return laChungCu;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setHoKhauId(int hoKhauId) {
        this.hoKhauId = hoKhauId;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public void setChuHoId(int chuHoId) {
        this.chuHoId = chuHoId;
    }

    public void setChuHoCMND(String chuHoCMND) {
        this.chuHoCMND = chuHoCMND;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLaChungCu(String laChungCu) {
        this.laChungCu = laChungCu;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    
    // Example constructor (you may have other constructors as needed)
    public HoKhau(int hoKhauId, String soHoKhau, int chuHoId, String chuHoCMND, String diaChi, String laChungCu, String ngayLap, int deleted) {
        this.hoKhauId = hoKhauId;
        this.soHoKhau = soHoKhau;
        this.chuHoId = chuHoId;
        this.chuHoCMND = chuHoCMND;
        this.diaChi = diaChi;
        this.laChungCu = laChungCu;
        this.ngayLap = ngayLap;
        this.deleted = deleted;
    }

    public HoKhau() {
    }
    
// Getters and setters...
    // Other methods...
    
        @Override
    public String toString() {
        return "HoKhau{" +
                "hoKhauId=" + hoKhauId +
                ", soHoKhau='" + soHoKhau + '\'' +
                ", chuHoId=" + chuHoId +
                ", chuHoCMND='" + chuHoCMND + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", laChungCu='" + laChungCu + '\'' +
                ", ngayLap=" + ngayLap +
                ", deleted=" + deleted +
                '}';
    }
}

