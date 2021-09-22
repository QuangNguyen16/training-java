
package Model;

import Class.TaiKhoan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import kndatabase.ConnectDatabase;

public class ModelTaiKhoan {
   
    public ArrayList<TaiKhoan> getTaiKhoan(String pass,String user) throws Exception{
        ArrayList<TaiKhoan> listTK= new ArrayList<>();
        ConnectDatabase.open();
        String sql="SELECT * FROM taikhoan WHERE User=? AND Pass=?";
        PreparedStatement ps =ConnectDatabase.connection.prepareStatement(sql);
        ps.setString(1,user);
        ps.setString(2,pass);
        ResultSet rs =ps.executeQuery();
        while(rs.next()){
            TaiKhoan taikhoan =new TaiKhoan(rs.getString("User"),rs.getString("Pass"));
            listTK.add(taikhoan);
        }
        return listTK;
    }
     
}
