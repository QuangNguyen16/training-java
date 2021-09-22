
package Model;

import Class.LopCoDinh;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import kndatabase.ConnectDatabase;
import Class.SinhVien;

public class ModelLopCoDinh {
   
    //Danh sách mảng lớp cố định
    public ArrayList<LopCoDinh> listLopCoDinh()throws Exception{
        ArrayList<LopCoDinh> listLopCoDinh= new ArrayList<>();
        ConnectDatabase.open();
        String sql="SELECT * FROM lopcodinh";
        PreparedStatement ps=ConnectDatabase.connection.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            LopCoDinh lop=new LopCoDinh(rs.getString("MaLopCD"),rs.getString("NamHoc"),rs.getString("MaKhoa"));
            listLopCoDinh.add(lop);
        }
        return listLopCoDinh;
    }
    
    //Danh sách  mảng lớp cố đinh lấy ra mã khoa
    public ArrayList<LopCoDinh> getMaKhoa()throws Exception{
        ArrayList<LopCoDinh> listLopCoDinh= new ArrayList<>();
        ConnectDatabase.open();
        String sql="SELECT MaKhoa FROM khoa";
        PreparedStatement ps=ConnectDatabase.connection.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            LopCoDinh lop=new LopCoDinh();
            lop.setMaKhoa(rs.getString("MaKhoa"));
            listLopCoDinh.add(lop);
        }
        return listLopCoDinh;
    } 
    
     //Danh sách  mảng lớp cố đinh lấy ra lớp
    public ArrayList<LopCoDinh> getLop()throws Exception{
        ArrayList<LopCoDinh> listLopCoDinh= new ArrayList<>();
        ConnectDatabase.open();
        String sql="SELECT MaLopCD FROM lopcodinh";
        PreparedStatement ps=ConnectDatabase.connection.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            LopCoDinh lop=new LopCoDinh();
            lop.setMaLopCD(rs.getString("MaLopCD"));
            listLopCoDinh.add(lop);
        }
        return listLopCoDinh;
    } 
    
    //Hàm thêm một lớp học
    public boolean insertLopCoDinh(LopCoDinh lcd){
        try {
            ConnectDatabase.open();
                String sql="INSERT INTO `lopcodinh`(`MaLopCD`, `NamHoc`, `MaKhoa`) values(?,?,?) ";
            PreparedStatement ps = ConnectDatabase.connection.prepareStatement(sql);
            ps.setString(1,lcd.getMaLopCD());
            ps.setString(2,lcd.getNamHoc());
            ps.setString(3,lcd.getMaKhoa());
            ps.executeUpdate();
            
        }catch(Exception ex){
             System.out.println(ex.getMessage());
        }
        return true;
    }
    
    //Hàm xóa một lớp 
    public boolean deleteLopCoDinh(String maLop) throws Exception{
        ConnectDatabase.open();
        String sql="DELETE FROM lopcodinh WHERE MaLopCD=?";
        PreparedStatement ps =ConnectDatabase.connection.prepareStatement(sql);
        ps.setString(1,maLop);
        ps.executeUpdate();
        
        return true;
    }
    
    //Hàm cập nhật một lớp
    public boolean updateLopCoDinh(LopCoDinh lcd){
        try{
            ConnectDatabase.open();
            String sql="UPDATE `lopcodinh` SET `MaLopCD`=?, `NamHoc`=?, `MaKhoa`=? WHERE MaLopCD=?";
            PreparedStatement ps = ConnectDatabase.connection.prepareStatement(sql); 
            ps.setString(1,lcd.getMaLopCD());
            ps.setString(2,lcd.getNamHoc());
            ps.setString(3,lcd.getMaKhoa());
            ps.setString(4,lcd.getMaLopCD());
            ps.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return true;
    }
    
    
    //Danh sách mảng sinh viên lấy ra một sinh viên
    public ArrayList<SinhVien> getSinhVien(String search) throws Exception{
        ArrayList<SinhVien> listsv=new ArrayList<>();
        ConnectDatabase.open();
        String sql="SELECT * FROM sinhvien WHERE MaLopCD=?";
        PreparedStatement ps=ConnectDatabase.connection.prepareStatement(sql);
        ps.setString(1, search);
        ResultSet rs=ps.executeQuery();
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
                listsv.add(sv);
            }
        
        return listsv;
    }
    
    //Danh sách mảng sinh viên lấy ra tất cả sinh viên
    public ArrayList<SinhVien> getAllSinhVien() throws Exception{
        ArrayList<SinhVien> listsv=new ArrayList<>();
        ConnectDatabase.open();
        String sql="SELECT * FROM sinhvien";
        PreparedStatement ps=ConnectDatabase.connection.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
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
                listsv.add(sv);
            }
        return listsv;
    }
}
