
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;
import Class.Khoa;
import kndatabase.ConnectDatabase;

public class ModelKhoa {
    
    //danh sach mảng của khoa
    public ArrayList <Khoa> dsKhoa(){
        ArrayList <Khoa> listKhoa =new ArrayList<>();
        try{
        ConnectDatabase.open();
        String sql="SELECT * FROM `khoa`";
        PreparedStatement ps=ConnectDatabase.connection.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            Khoa khoa= new Khoa(rs.getString("MaKhoa"),rs.getString("TenKhoa"));
            listKhoa.add(khoa);
        }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return listKhoa;
    }
    
    //Hàm thêm một khoa
    public void addKhoa(Khoa khoa){
        try{
            ConnectDatabase.open();
            String sql="INSERT INTO khoa(MaKhoa,TenKhoa) VALUES (?,?)";
            PreparedStatement ps =ConnectDatabase.connection.prepareStatement(sql);
            ps.setString(1,khoa.getMaKhoa());
            ps.setString(2,khoa.getTenKhoa());
            ps.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    //Hàm xóa một khoa
    public void deleteKhoa(String ma){
        String sql="DELETE FROM khoa WHERE MaKhoa=?";
        ConnectDatabase.deleteData(ma, sql);
    }
    
    //hàm cập nhật một khoa
    public void updateKhoa(Khoa khoa){
        try{
            ConnectDatabase.open();
            String sql="UPDATE khoa SET MaKhoa=?,TenKhoa=? WHERE MaKhoa=?";
            PreparedStatement ps =ConnectDatabase.connection.prepareStatement(sql);
            ps.setString(1,khoa.getMaKhoa());
            ps.setString(2,khoa.getTenKhoa());
            ps.setString(3,khoa.getMaKhoa());
            ps.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
