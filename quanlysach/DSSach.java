/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author s
 */
public class DSSach extends Sach {

    private ArrayList<Sach> ds;

    public DSSach() {
        ds = new ArrayList< Sach>();
    }

    public DSSach(String MaSach, String TenSach, int Gia, String Tacgia, String Nhaxuatban) {
        super(MaSach, TenSach, Gia, Tacgia, Nhaxuatban);
    }

    public void Inthongtin() {
        System.out.println(ds.size());
    }

    public boolean themSach(Sach S) {
        if (ds.contains(S)) {
            return false;
        }
        ds.add(S);
        return true;
    }

    public Sach getSach(int i) {
        if (i >= 0 && i < ds.size()) {
            return ds.get(i);
        }
        return null;
    }

    public void xoaSach(int index) {
        ds.remove(index);
    }

    public Sach timKiem(String MaSach) {
        Sach S = new Sach(MaSach);
        if (ds.contains(S)) {
            return ds.get(ds.indexOf(S));
        }
        return null;
    }

    public boolean capNhat(String MaSach, String TenSach, int Gia, String Tacgia, String Nhaxuatban) {
        Sach S = new Sach(MaSach);
        if (ds.contains(S)) {
            S = ds.get(ds.indexOf(S));
            S.setTenSach(TenSach);
            S.setGia(Gia);
            S.setTacgia(Tacgia);
            S.setNhaxuatban(Nhaxuatban);
            return true;
        }
        return false;
    }

    public ArrayList<Sach> getDs() {
        return ds;
    }
    public boolean checkID(String id){
        for (int i=0; i<ds.size();i++){
            if (ds.get(i).getMaSach().equals(id))
                return false;
        }
        return true;
    }
    public Sach timsach(String a){
        for (int i=0; i<ds.size();i++){
            if (ds.get(i).getMaSach().equals(a))
                return ds.get(i);
        }
        return null;
    }
}
