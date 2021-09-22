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
public class MonHoc {
    
    /***
     * Mã môn = sMaMon;
     * Tên môn = sTenMon;
     * Số tín chỉ = iSoTinhChi;
     */
    //Property
    private String sMaMon="";
    private String sTenMon="";
    private int iSoTinChi=0;
    
    //Constructor
    public MonHoc(){
        
    }
    
    public MonHoc(String sMaMon, String sTenMon, int iSoTinChi){
        this.sMaMon=sMaMon;
        this.sTenMon=sTenMon;
        this.iSoTinChi=iSoTinChi;
    }
    
    //Getter and setter
    public void setsMaMon(String sMaMon) {
        this.sMaMon = sMaMon;
    }

    public void setsTenMon(String sTenMon) {
        this.sTenMon = sTenMon;
    }

    public void setsSoTinChi(int sSoTinChi) {
        this.iSoTinChi = iSoTinChi;
    }
    
    public String getsMaMon() {
        return sMaMon;
    }

    public String getsTenMon() {
        return sTenMon;
    }

    public int getsSoTinChi() {
        return iSoTinChi;
    }
    
   //ToString
     public void ToString(){
        System.out.println("Ma Mon: "+this.sMaMon  + "Ten Mon: "
                +this.sTenMon + "So Tin Chi: " +this.iSoTinChi);
    }
    
}
