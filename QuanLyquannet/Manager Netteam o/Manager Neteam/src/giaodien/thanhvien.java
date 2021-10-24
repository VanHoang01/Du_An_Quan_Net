/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;
        
/**
 *
 * @author Administrator
 */
public class thanhvien {
    private int ID_user;
    private String name;
    private int hesotien;
    private String naptien;
    private String thucpham;
    private String no ;

    public thanhvien() {
    }

    public thanhvien(int ID_user, String name, int hesotien, String naptien, String thucpham, String no) {
        this.ID_user = ID_user;
        this.name = name;
        this.hesotien = hesotien;
        this.naptien = naptien;
        this.thucpham = thucpham;
        this.no = no;
    }
    

    public int getID_user() {
        return ID_user;
    }

    public void setID_user(int ID_user) {
        this.ID_user = ID_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHesotien() {
        return hesotien;
    }

    public void setHesotien(int hesotien) {
        this.hesotien = hesotien;
    }

    public String getNaptien() {
        return naptien;
    }

    public void setNaptien(String naptien) {
        this.naptien = naptien;
    }

    public String getThucpham() {
        return thucpham;
    }

    public void setThucpham(String thucpham) {
        this.thucpham = thucpham;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
    
    
}
