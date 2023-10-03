/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DV;

/**
 *
 * @author ADMIN
 */
public class DongVat {
    private String maID;
    private String ten;
    private String loai;
    private String gioiTinh;

    public DongVat() {
    }

    public DongVat(String maID, String ten, String loai, String gioiTinh) {
        this.maID = maID;
        this.ten = ten;
        this.loai = loai;
        this.gioiTinh = gioiTinh;
    }

    public String getMaID() {
        return maID;
    }

    public void setMaID(String maID) {
        this.maID = maID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
}
