/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class SinhVien {
      /**
     * Mã sinh viên = maSV;
     * Họ tên = hoTen;
     * Giới tính = gioiTinh;
     * Ngày sinh = ngaySinh;
     * Nơi sinh = noiSinh;
     * Mã lớp cố định = maLopCoDinh;
     * Mã khoa =  maKhoa;
     * Học bổng = hocBong;
     */
    
    //Property
    private String maSV;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String noiSinh;
    private String diaChi;
    private String maLopCoDinh;
    private String maKhoa;
    private String hocBong;

    //Constructor
    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String gioiTinh, Date ngaySinh, String noiSinh, String diaChi,String maLopCoDinh, String maKhoa, String hocBong) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.diaChi = diaChi;
        this.maLopCoDinh=maLopCoDinh;
        this.maKhoa = maKhoa;
        this.hocBong = hocBong;
    }
    
    //Getter and setter
    public String getMaLopCoDinh() {
        return maLopCoDinh;
    }

    public void setMaLopCoDinh(String maLopCoDinh) {
        this.maLopCoDinh = maLopCoDinh;
    }
    
    
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getHocBong() {
        return hocBong;
    }

    public void setHocBong(String hocBong) {
        this.hocBong = hocBong;
    }
}
