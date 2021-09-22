/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Class.Khoa;
import kndatabase.ConnectDatabase;
import Class.LopCoDinh;
import Class.SinhVien;

/**
 *
 * @author Admin
 */
public class ModelSinhVien {
    
    //get danh sách sinh viên
    public ArrayList<SinhVien> dsSinhVien() throws Exception{
        ArrayList <SinhVien> listSinhVien =new ArrayList<SinhVien>();
        try {
        ConnectDatabase.open();
        String sql="select * from sinhvien";
        PreparedStatement ps = ConnectDatabase.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
               SinhVien sv=new SinhVien(rs.getString("MaSV"),
                                        rs.getString("HoTenSV"),
                                        rs.getString("GioiTinh"),
                                        rs.getDate("NgaySinh"),
                                        rs.getString("NoiSinh"),
                                        rs.getString("DiaChi"),
                                        rs.getString("MaLopCD"),
                                        rs.getString("MaKhoa"),
                                        rs.getString("HocBong"));  
               listSinhVien.add(sv);
        }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return listSinhVien;
    }
    
    //method thêm sinh viên
    public void addSinhVien(SinhVien sv){
        try {
            ConnectDatabase.open();
            String sql="INSERT INTO `sinhvien`(`MaSV`, `HoTenSV`, `GioiTinh`, `NgaySinh`, `NoiSinh`, `DiaChi`, `MaLopCD`, `MaKhoa`, `HocBong`) values(?,?,?,?,?,?,?,?,?) ";
            PreparedStatement ps = ConnectDatabase.connection.prepareStatement(sql);
            ps.setString(1,sv.getMaSV());
            ps.setString(2,sv.getHoTen());
            ps.setString(3,sv.getGioiTinh());
            ps.setDate(4,sv.getNgaySinh());
            ps.setString(5,sv.getNoiSinh());
            ps.setString(6,sv.getDiaChi());
            ps.setString(7, sv.getMaLopCoDinh());
            ps.setString(8,sv.getMaKhoa());
            ps.setString(9,sv.getHocBong());
            ps.executeUpdate();
            
        }catch(Exception ex){
             System.out.println(ex.getMessage());
        }
    }
    
    //Hàm xóa sinh viên
    public void xoaSinhVien(String ma){
        try{
            ConnectDatabase.deleteData(ma,"DELETE FROM sinhvien WHERE MaSV=?");
        }catch(Exception ex){
            System.out.print(ex.getMessage());
        }
    }
    
    //Hàm cập nhật sinh viên
    public void updateSinhVien(SinhVien sv){
        try{
            ConnectDatabase.open();
            String sql="UPDATE `sinhvien` SET `MaSV`=?, `HoTenSV`=?, `GioiTinh`=?, `NgaySinh`=?, `NoiSinh`=?, `DiaChi`=?,MaLopCD=?,`MaKhoa`=?, `HocBong`=? WHERE MaSV=? ";
            PreparedStatement ps = ConnectDatabase.connection.prepareStatement(sql); 
            ps.setString(1,sv.getMaSV());
            ps.setString(2,sv.getHoTen());
            ps.setString(3,sv.getGioiTinh());
            ps.setDate(4,sv.getNgaySinh());
            ps.setString(5,sv.getNoiSinh());
            ps.setString(6,sv.getDiaChi());
            ps.setString(7,sv.getMaLopCoDinh());
            ps.setString(8,sv.getMaKhoa());
            ps.setString(9,sv.getHocBong());
            ps.setString(10,sv.getMaSV());
            ps.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    //tìm kiếm sinh viên
    public ArrayList<SinhVien> searchSinhVien(String search){
        ArrayList <SinhVien> listSinhVien=new ArrayList<>();
        try {
            ConnectDatabase.open();
            String sql="SELECT * FROM sinhvien WHERE MaSV like '%"+search+"%' or HoTenSV like N'%"+search+"%' or GioiTinh like N'%"+search+"%'";
            PreparedStatement ps =ConnectDatabase.connection.prepareCall(sql);
            
            ResultSet rs =ps.executeQuery();
            while(rs.next()){
                SinhVien sv =new SinhVien(rs.getString("MaSV"),
                                        rs.getString("HoTenSV"),
                                        rs.getString("GioiTinh"),
                                        rs.getDate("NgaySinh"),
                                        rs.getString("NoiSinh"),
                                        rs.getString("DiaChi"),
                                        rs.getString("MaLopCD"),
                                        rs.getString("MaKhoa"),
                                        rs.getString("HocBong"));  
                listSinhVien.add(sv);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ModelSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listSinhVien;
    }
    
    //Hàm lấy mã khoa
    public ArrayList<SinhVien> getMaKhoa(){
        ArrayList <SinhVien> listMaKhoa=new ArrayList<SinhVien> ();
        try {
        ConnectDatabase.open();
        String sql="select  MaKhoa from khoa";
        PreparedStatement ps = ConnectDatabase.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
               SinhVien sv=new SinhVien();
               sv.setMaLopCoDinh(rs.getString("MaKhoa"));
               listMaKhoa.add(sv);
        }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return listMaKhoa;
    }
    
    //Hàm lấy mã lớp
    public ArrayList<SinhVien> getMaLop()throws Exception{
        ArrayList<SinhVien> listLopCD=new ArrayList<SinhVien>();
        ConnectDatabase.open();
        String sql="SELECT MaLopCD FROM lopcodinh";
        PreparedStatement ps =ConnectDatabase.connection.prepareStatement(sql);
        ResultSet rs =ps.executeQuery();
        while(rs.next()){
            SinhVien lcd =new SinhVien();
            lcd.setMaLopCoDinh(rs.getString("MaLopCD"));
            listLopCD.add(lcd);
        }
        
        return listLopCD;
    }
}
