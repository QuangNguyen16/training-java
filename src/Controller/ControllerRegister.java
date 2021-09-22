/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Class.TaiKhoan;
import Model.ModelTaiKhoan;
import View.JFrameLogin;
import View.JFrameRegister;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import kndatabase.ConnectDatabase;

/**
 *
 * @author Quang
 */
public class ControllerRegister {

    JFrameRegister jframeRegister;
    ModelTaiKhoan mdTK;

    public ControllerRegister(JFrameRegister jframeRegister) {
        this.jframeRegister = jframeRegister;
        mdTK = new ModelTaiKhoan();
        jframeRegister.getBtnDangKy();
        jframeRegister.getBtnExit().addActionListener(btnExit());

    }

    void exit() {
        if (JOptionPane.showConfirmDialog(jframeRegister, "Bạn có muốn thoát", "lưu ý", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            jframeRegister.dispose();
        }
    }

//    private ActionListener btnDangKy() {
//        return new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ArrayList<TaiKhoan> listTK = new ArrayList<>();
//                KetNoiDatabase.open();
//                String sql = "INSERT INTO taikhoan(User,Pass) values (?,?)";
//                PreparedStatement ps = KetNoiDatabase.connection.prepareStatement(sql);
//
//                ps.setString(1, user);
//                ps.setString(2, pass);
//                ps.executeUpdate();
//
//                if (ps.executeUpdate() > 0) {
//                    JOptionPane.showMessageDialog(null, "New Account");
//                }
//                return listTK;
//            }
//        };
//    }

    private ActionListener btnExit() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        };
    }
}
