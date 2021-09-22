package Model;

import Class.Diem;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import kndatabase.ConnectDatabase;

public class ModelDiem {

    public ModelDiem() {
    }
    
    //Danh sách mảng điểm
    public ArrayList<Diem> listDiem() throws Exception {
        ArrayList<Diem> listDiem = new ArrayList<>();
        ConnectDatabase.open();
        String sql = "SELECT * FROM diem";
        PreparedStatement ps = ConnectDatabase.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Diem diem = new Diem(rs.getInt("STT"), rs.getString("MaSV"), rs.getString("MaHP"), rs.getString("TenHP"), rs.getDouble("DiemThi"), rs.getDouble("DiemTB"), rs.getString("KetQua"));
            listDiem.add(diem);
        }

        return listDiem;
    }

    //Hàm insert điểm của ModelDieem
    public boolean insertDiem(Diem d) {
        try {
            ConnectDatabase.open();
            String sql = "INSERT INTO diem(MaSV,MaHP,TenHP,DiemThi,DiemTB,KetQua) values (?,?,?,?,?,?)";
            PreparedStatement ps = ConnectDatabase.connection.prepareStatement(sql);
            ps.setString(1, d.getMaSV());
            ps.setString(2, d.getMaHP());
            ps.setString(3, d.getTenHP());
            ps.setDouble(4, d.getDiem());
            ps.setDouble(5, d.getDiemTB());
            ps.setString(6, d.getKetQua());
            ps.executeUpdate();

        } catch (Exception ex) {

        }
        return true;
    }

    //Hàm xóa điểm 
    public boolean deleteDiem(int STT) {
        try {
            ConnectDatabase.open();
            String sql = "DELETE FROM diem WHERE STT=?";
            PreparedStatement ps = ConnectDatabase.connection.prepareStatement(sql);
            ps.setInt(1, STT);
            ps.executeUpdate();
        } catch (Exception ex) {

        }
        return true;
    }

    // Hàm update điểm 
    public boolean updateDiem(Diem d) throws Exception {
        ConnectDatabase.open();
        String sql = "UPDATE diem SET MaSV=?,MaHP=?,TenHP=?, DiemThi=?, DiemTB=?,KetQua=? where STT=?";
        PreparedStatement ps = ConnectDatabase.connection.prepareStatement(sql);
        ps.setString(1, d.getMaSV());
        ps.setString(2, d.getMaHP());
        ps.setString(3, d.getTenHP());
        ps.setDouble(4, d.getDiem());
        ps.setDouble(5, d.getDiemTB());
        ps.setString(6, d.getKetQua());
        ps.setInt(7, d.getSTT());
        ps.executeUpdate();
        return true;
    }

    //Hàm tìm kiếm điểm 
    public ArrayList<Diem> searchDiem(String search) throws SQLException, Exception {
        ArrayList<Diem> listDiem = new ArrayList<>();
        ConnectDatabase.open();
        String sql = "SELECT * FROM diem WHERE MaSV like '%" + search + "%'";
        PreparedStatement ps = ConnectDatabase.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Diem diem = new Diem(rs.getInt("STT"), rs.getString("MaSV"), rs.getString("MaHP"), rs.getString("TenHP"), rs.getDouble("DiemThi"), rs.getDouble("DiemTB"), rs.getString("KetQua"));
            listDiem.add(diem);
        }
        return listDiem;

    }
}
