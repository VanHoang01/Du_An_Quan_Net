/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

/**
 *
 * @author FancaoFaker
 */
public class khachclass {
    int id ;
    String Ngay , timestart ,timestop , muavatpham , thanhtien ; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public String getTimestart() {
        return timestart;
    }

    public void setTimestart(String timestart) {
        this.timestart = timestart;
    }

    public String getTimestop() {
        return timestop;
    }

    public void setTimestop(String timestop) {
        this.timestop = timestop;
    }

    public String getMuavatpham() {
        return muavatpham;
    }

    public void setMuavatpham(String muavatpham) {
        this.muavatpham = muavatpham;
    }

    public String getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(String thanhtien) {
        this.thanhtien = thanhtien;
    }

    public khachclass(int id, String Ngay, String timestart, String timestop, String muavatpham, String thanhtien) {
        this.id = id;
        this.Ngay = Ngay;
        this.timestart = timestart;
        this.timestop = timestop;
        this.muavatpham = muavatpham;
        this.thanhtien = thanhtien;
    }

    public khachclass() {
    }
    
    
    
    
    
}
