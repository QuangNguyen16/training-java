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
public class DiemHocPhan {
    /**
     * Mã sinh viên = sMaSV;
     * Mã lớp học phần = sMaLopHP;
     * Điểm quá trình = sDiemQT;
     * Điểm thi = iDiemThi;
     */
    
    //Property
    private String sMaSV="";
    private String sMaLopHP="";
    private int iDiemQT=0;
    private int iDiemThi=0;
    
    //Constructor
    public DiemHocPhan(){
        
    }
    
    public DiemHocPhan(String sMaSV, String sMaLopHP, int iDiemQT, int iDiemThi){
        this.sMaSV=sMaSV;
        this.sMaLopHP=sMaLopHP;
        this.iDiemQT=iDiemQT;
        this.iDiemThi=iDiemThi;
    }
    
    //Getter and setter
    public void setsMaSV(String sMaSV) {
        this.sMaSV = sMaSV;
    }

    public void setsMaLopHP(String sMaLopHP) {
        this.sMaLopHP = sMaLopHP;
    }

    public void setiDiemQT(int iDiemQT) {
        this.iDiemQT = iDiemQT;
    }

    public void setiDiemThi(int iDiemThi) {
        this.iDiemThi = iDiemThi;
    }
    
    public String getsMaSV() {
        return sMaSV;
    }

    public String getsMaLopHP() {
        return sMaLopHP;
    }

    public int getiDiemQT() {
        return iDiemQT;
    }

    public int getiDiemThi() {
        return iDiemThi;
    }
    
    //ToString
    public void ToString(){
        System.out.println("MaSV: "+this.sMaSV  + "MaLopHP: "
                +this.sMaLopHP + "DiemQT: " +this.iDiemQT + "Diem Thi: "+this.iDiemThi);
    }
}
