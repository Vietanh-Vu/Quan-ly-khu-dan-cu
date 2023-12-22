/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demographic.models;

/**
 *
 * @author Nam
 */
public class KhaiTu {
    private int nhanKhauId;
    private int khaiTuId;
    private String thoiGian;
    private String lyDo;
    private String soGiayKhaiTu;
    private int deleted;

    public int getNhanKhauId() {
        return nhanKhauId;
    }

    public void setNhanKhauId(int nhanKhauId) {
        this.nhanKhauId = nhanKhauId;
    }

    public int getKhaiTuId() {
        return khaiTuId;
    }

    public void setKhaiTuId(int khaiTuId) {
        this.khaiTuId = khaiTuId;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getSoGiayKhaiTu() {
        return soGiayKhaiTu;
    }

    public void setSoGiayKhaiTu(String soGiayKhaiTu) {
        this.soGiayKhaiTu = soGiayKhaiTu;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }
    
    @Override
    public String toString() {
        return "KhaiTu{" +
                "nhanKhauId=" + nhanKhauId +
                ", khaiTuId=" + khaiTuId +
                ", thoiGian='" + thoiGian + '\'' +
                ", lyDo='" + lyDo + '\'' +
                ", soGiayKhaiTu='" + soGiayKhaiTu + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
