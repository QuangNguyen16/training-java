
package Model;

import Class.HocPhan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import kndatabase.ConnectDatabase;


public class ModelHocPhan {
    
    //Mảng học phần
    public ArrayList <HocPhan> listHocPhan() throws Exception{
        ArrayList<HocPhan> listHocPhan=new ArrayList<>();
        ConnectDatabase.open();
        String sql="SELECT * FROM hocphan";
        PreparedStatement ps =ConnectDatabase.connection.prepareStatement(sql);
        ResultSet rs= ps.executeQuery();
        while (rs.next()){
            HocPhan hocphan=new HocPhan(rs.getString("MaHP"),rs.getString("TenHP"),rs.getInt("SoTiet"),rs.getInt("SoTinChi"));
            listHocPhan.add(hocphan);
        }
        
        return listHocPhan;
    }
    
    //Hàm thêm 1 học phần
    public boolean insertHocPhan(HocPhan hp){
        try{
            ConnectDatabase.open();
            String sql="INSERT INTO hocphan(MaHP,TenHP,SoTiet,SoTinChi) values (?,?,?,?)";
            PreparedStatement ps =ConnectDatabase.connection.prepareStatement(sql);
            ps.setString(1,hp.getMaHocPhan());
            ps.setString(2,hp.getTenHocPhan());
            ps.setInt(3, hp.getSoTiet());
            ps.setInt(4,hp.getSoTinChi());
            ps.executeUpdate();
            
        }catch(Exception ex){
            
        }
        return true;
    }
    
    //Hàm xóa 1 học phần
    public boolean deleteHocPhan(String maHP){
        try{
            ConnectDatabase.open();
            String sql="DELETE FROM hocphan WHERE MaHP=?";
            PreparedStatement ps= ConnectDatabase.connection.prepareStatement(sql);
            ps.setString(1,maHP);
            ps.executeUpdate();
        }catch(Exception ex){
            
        }
        return true;
    }
    
    //Hàm cập nhật 
    public boolean updateHocPhan(HocPhan hp) throws Exception{
        ConnectDatabase.open();
        String sql="UPDATE hocphan SET MaHP=?,TenHP=?,SoTiet=?, SoTinChi=? where MaHP=?";
        PreparedStatement ps=ConnectDatabase.connection.prepareStatement(sql);
        ps.setString(1, hp.getMaHocPhan());
        ps.setString(2,hp.getTenHocPhan());
        ps.setInt(3,hp.getSoTiet());
        ps.setInt(4,hp.getSoTinChi());
        ps.executeUpdate();
        return true;
    }
}
