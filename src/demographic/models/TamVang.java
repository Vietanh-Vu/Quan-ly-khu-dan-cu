/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demographic.models;

/**
 *
 * @author Nam
 */

public class TamVang {
    private int tamVangId;
    private int nhanKhauId;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String lyDo;
    private String soCMND;
    private String diaChiNoiDen;

    // Constructors, getters, and setters

    public TamVang() {
    }

    public TamVang(int tamVangId, int nhanKhauId, String ngayBatDau, String ngayKetThuc, String lyDo, String soCMND, String diaChiNoiDen) {
        this.tamVangId = tamVangId;
        this.nhanKhauId = nhanKhauId;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.lyDo = lyDo;
        this.soCMND = soCMND;
        this.diaChiNoiDen = diaChiNoiDen;
    }

    public int getTamVangId() {
        return tamVangId;
    }

    public void setTamVangId(int tamVangId) {
        this.tamVangId = tamVangId;
    }

    public int getNhanKhauId() {
        return nhanKhauId;
    }

    public void setNhanKhauId(int nhanKhauId) {
        this.nhanKhauId = nhanKhauId;
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

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getDiaChiNoiDen() {
        return diaChiNoiDen;
    }

    public void setDiaChiNoiDen(String diaChiNoiDen) {
        this.diaChiNoiDen = diaChiNoiDen;
    }
    
    @Override
    public String toString() {
        return "TamVang{" +
                "tamVangId=" + tamVangId +
                ", nhanKhauId=" + nhanKhauId +
                ", ngayBatDau='" + ngayBatDau + '\'' +
                ", ngayKetThuc='" + ngayKetThuc + '\'' +
                ", lyDo='" + lyDo + '\'' +
                ", soCMND='" + soCMND + '\'' +
                ", diaChiNoiDen='" + diaChiNoiDen + '\'' +
                '}';
}
    
}
