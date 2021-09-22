/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Admin
 */
public class LopHocPhan {
    /***
     * Mã lớp học phần = sMaLopHP;
     * Mã môn = sMaMon;
     * Năm học = sNamHoc;
     * Học kỳ = iHocKy;
     * Giáo viên = sGiaoVien;
     */
    
    //Property
    private String sMaLopHP="";
    private String sMaMon="";
    private String sNamHoc="";
    private int iHocKy=0;
    private String sGiaoVien="";

    //Constructor
    public LopHocPhan(){
        
    }
    
    public LopHocPhan(String sMaLopHP, String sMaMon, String sNamHoc, int iHocKy, String sGiaoVien){
       this.sMaLopHP=sMaLopHP;
       this.sMaMon=sMaMon;
       this.sNamHoc=sNamHoc;
       this.iHocKy=iHocKy;
       this.sGiaoVien=sGiaoVien;
    }
    
    //Getter and setter
    public void setsMaLopHocPhan(String sMaLopHP) {
        this.sMaLopHP = sMaLopHP;
    }

    public void setsMaMon(String sMaMon) {
        this.sMaMon = sMaMon;
    }

    public void setsNamHoc(String sNamHoc) {
        this.sNamHoc = sNamHoc;
    }

    public void setiHocKy(int iHocKy) {
        this.iHocKy = iHocKy;
    }

    public void setsGiaoVien(String sGiaoVien) {
        this.sGiaoVien = sGiaoVien;
    }
    
    //method get

    public String getsMaLopHocPhan() {
        return sMaLopHP;
    }

    public String getsMaMon() {
        return sMaMon;
    }

    public String getsNamHoc() {
        return sNamHoc;
    }

    public int getiHocKy() {
        return iHocKy;
    }

    public String getsGiaoVien() {
        return sGiaoVien;
    }
    
    //ToString
    public void ToString(){
        System.out.println("Ma LopHP: "+this.sMaLopHP  + "Ma Mon: "
                +this.sMaMon + "NamHoc: " +this.sNamHoc + "Hoc Ky: "+this.iHocKy + "Giao Vien: " + this.sGiaoVien);
    }
    
}
