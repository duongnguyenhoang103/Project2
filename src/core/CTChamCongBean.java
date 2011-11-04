/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import java.util.List;

/**
 *
 * @author duong
 */
@Entity
public class CTChamCongBean {
    //Filed

    @Id
    private String MaCC;
    private String MaNV;
    private String Ngay;
    private String Buoi;
    private String GioLamCty;
    private String GioLamViec;

    /**
     * @return the MaCC
     */
    public String getMaCC() {
        return MaCC;
    }

    /**
     * @param MaCC the MaCC to set
     */
    public void setMaCC(String MaCC) {
        this.MaCC = MaCC;
    }

    /**
     * @return the MaNV
     */
    public String getMaNV() {
        return MaNV;
    }

    /**
     * @param MaNV the MaNV to set
     */
    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    /**
     * @return the Ngay
     */
    public String getNgay() {
        return Ngay;
    }

    /**
     * @param Ngay the Ngay to set
     */
    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    /**
     * @return the Buoi
     */
    public String getBuoi() {
        return Buoi;
    }

    /**
     * @param Buoi the Buoi to set
     */
    public void setBuoi(String Buoi) {
        this.Buoi = Buoi;
    }

    /**
     * @return the GioLamCty
     */
    public String getGioLamCty() {
        return GioLamCty;
    }

    /**
     * @param GioLamCty the GioLamCty to set
     */
    public void setGioLamCty(String GioLamCty) {
        this.GioLamCty = GioLamCty;
    }

    /**
     * @return the GioLamViec
     */
    public String getGioLamViec() {
        return GioLamViec;
    }

    /**
     * @param GioLamViec the GioLamViec to set
     */
    public void setGioLamViec(String GioLamViec) {
        this.GioLamViec = GioLamViec;
    }
    //Contructor

    public CTChamCongBean(String MaCC, String MaNV, String Ngay, String Buoi, String GioLamCty, String GioLamViec) {
        this.MaCC = MaCC;
        this.MaNV = MaNV;
        this.Ngay = Ngay;
        this.Buoi = Buoi;
        this.GioLamCty = GioLamCty;
        this.GioLamViec = GioLamViec;
    }
    public CTChamCongBean() {
    }
  
}
