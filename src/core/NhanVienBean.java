/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import persistence.NhanVienDAO;
/**
 *
 * @author duong
 */
@Entity
public class NhanVienBean {

    @Id
    private String MaNV;
    private String HoTenNV;

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
     * @return the HoTenNV
     */
    public String getHoTenNV() {
        return HoTenNV;
    }

    /**
     * @param HoTenNV the HoTenNV to set
     */
    public void setHoTenNV(String HoTenNV) {
        this.HoTenNV = HoTenNV;
    }
    //Contructor

    public NhanVienBean() {
    }

    public NhanVienBean(String MaNV, String HoTenNV) {
        this.MaNV = MaNV;
        this.HoTenNV = HoTenNV;
    }
    //Method
    
}
