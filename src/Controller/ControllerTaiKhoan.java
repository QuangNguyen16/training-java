package Controller;

import Main.JFrameMain;
import View.JFrameLogin;
import Model.ModelTaiKhoan;
import Class.TaiKhoan;
import View.JFrameRegister;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControllerTaiKhoan {

    JFrameLogin jframeDN;
    JFrameRegister jframeRegister;
    ModelTaiKhoan mdTK;

    public ControllerTaiKhoan(JFrameLogin jframeDN) {
        this.jframeDN = jframeDN;
        mdTK = new ModelTaiKhoan();
        jframeDN.getBtnLogin().addActionListener(checkLogin());
        jframeDN.getBtnExit().addActionListener(btnExit());
        
    }
    
    private ActionListener checkLogin() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<TaiKhoan> listTK = new ArrayList<>();
                try {
                    String user = jframeDN.getTxtUser().getText();
                    String pass = jframeDN.getTxtPass().getText();
                    listTK = mdTK.getTaiKhoan(pass, user);
                  
                    if(listTK.size()<=0){
                        JOptionPane.showMessageDialog(null,"Tài Khoản hoặc Mật Khẩu không đúng! xin thử lại");
                        jframeDN.getTxtPass().setText("");
                        jframeDN.getTxtPass().requestFocus();
                    }else {
                        JOptionPane.showMessageDialog(null,"Login thành công"); 
                       jframeDN.dispose();
                       JFrameMain main =new JFrameMain();
                     JFrameMain.checkLogin=true;
                    }
                    
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        };
    }
    
    void exit(){
        if(JOptionPane.showConfirmDialog(jframeDN,"Bạn có muốn thoát?","lưu ý",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            jframeDN.dispose();
        }
    }
    
    private ActionListener btnExit(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        };
    }
    
    private MouseListener lbExit(){
        return new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exit();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }

            @Override
            public void mouseEntered(MouseEvent e) {
                }

            @Override
            public void mouseExited(MouseEvent e) {
                }
        };
    }
}
