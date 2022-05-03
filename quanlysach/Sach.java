/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

/**
 *
 * @author s
 */
public class Sach {
    private String MaSach;
    private String TenSach;
    private int Gia;
    private String Tacgia;
    private String Nhaxuatban;

    public Sach ()
    {
        
    }
    public Sach (String MaSach)
    {
        
    }
    public Sach(String MaSach, String TenSach, int Gia, String Tacgia, String Nhaxuatban) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.Gia = Gia;
        this.Tacgia = Tacgia;
        this.Nhaxuatban = Nhaxuatban;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public String getTacgia() {
        return Tacgia;
    }

    public void setTacgia(String Tacgia) {
        this.Tacgia = Tacgia;
    }

    public String getNhaxuatban() {
        return Nhaxuatban;
    }

    public void setNhaxuatban(String Nhaxuatban) {
        this.Nhaxuatban = Nhaxuatban;
    }
    
    
}
