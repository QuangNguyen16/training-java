package Controller;

import Class.Diem;
import View.JFrameDiem;
import Model.ModelDiem;
import Class.HocPhan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kndatabase.ConnectDatabase;

public class ControllerDiem {

    JFrameDiem jframeDiem;
    ModelDiem mdDiem;

    public ControllerDiem(JFrameDiem jframeDiem) throws Exception {
        this.jframeDiem = jframeDiem;
        jframeDiem.getTxtSTT().setEnabled(false);
        mdDiem = new ModelDiem();
        showDiem(mdDiem.listDiem());
        jframeDiem.getBtnThem().addActionListener(insertHocPhan());
        jframeDiem.getBtnXoa().addActionListener(deleteDiem());
        jframeDiem.getBtnSua().addActionListener(updateDiem());
        jframeDiem.getBtnHuy().addActionListener(btnHuy());

    }

    //get diem
    public void showDiem(ArrayList<Diem> listDiem) throws Exception {

        DefaultTableModel model = (DefaultTableModel) jframeDiem.getTbDiem().getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("STT");
        model.addColumn("Mã SV");
        model.addColumn("Mã HP");
        model.addColumn("Tên HP");
        model.addColumn("Điểm Thi");
        model.addColumn("Điểm TB");
        model.addColumn("Kết Qủa");
        for (Diem d : listDiem) {
            model.addRow(new Object[]{d.getSTT(), d.getMaSV(), d.getMaHP(), d.getTenHP(), d.getDiem(), d.getDiemTB(), d.getKetQua()});
        }
        jframeDiem.getTbDiem().setModel(model);
    }

    private ActionListener deleteDiem() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                khoaMoControl("xoa");
                try {
                    int i = jframeDiem.getTbDiem().getSelectedRow();
                    int STT = Integer.parseInt(jframeDiem.getTbDiem().getModel().getValueAt(i, 0).toString());
                    if (JOptionPane.showConfirmDialog(jframeDiem, "Bạn có muốn xóa không?", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        if (mdDiem.deleteDiem(STT)) {
                            showDiem(mdDiem.listDiem());
                            JOptionPane.showMessageDialog(null, "Xóa thành công");
                        } else {
                            JOptionPane.showMessageDialog(null, "Xóa thất bại");
                        }
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
    }

    // thêm học phần
    private ActionListener insertHocPhan() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                khoaMoControl("them");
                try {
                    if (JOptionPane.showConfirmDialog(jframeDiem, "Bạn có muốn thêm không?", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        String maSV = jframeDiem.getTxtMasv().getText();
                        String maHP = jframeDiem.getTxtMaHP().getText();
                        String tenHP = jframeDiem.getTxtTenHP().getText();
                        Double diem = Double.parseDouble(jframeDiem.getTxtDiem().getText());
                        Double diemTB = Double.parseDouble(jframeDiem.getTxtDTB().getText());
                        String ketQua = jframeDiem.getTxtKQ().getText();

                        Diem d = new Diem();
                        d.setMaSV(maSV);
                        d.setMaHP(maHP);
                        d.setTenHP(tenHP);
                        d.setDiem(diem);
                        d.setDiemTB(diemTB);
                        d.setKetQua(ketQua);

                        if (mdDiem.insertDiem(d)) {
                            JOptionPane.showMessageDialog(null, "Thêm thành công!");
                            showDiem(mdDiem.listDiem());
                        } else {
                            JOptionPane.showMessageDialog(null, "Thêm thất bại!");
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
    }

    //click update học phần
    private ActionListener updateDiem() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                khoaMoControl("sua");
                try {
                    if (JOptionPane.showConfirmDialog(jframeDiem, "Bạn có muốn sửa không?", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        String maSV = jframeDiem.getTxtMasv().getText();
                        String maHP = jframeDiem.getTxtMaHP().getText();
                        String tenHP = jframeDiem.getTxtTenHP().getText();
                        Double diem = Double.parseDouble(jframeDiem.getTxtDiem().getText());
                        Double diemTB = Double.parseDouble(jframeDiem.getTxtDTB().getText());
                        String ketQua = jframeDiem.getTxtKQ().getText();
                        int stt = Integer.parseInt(jframeDiem.getTxtSTT().getText());

                        Diem d = new Diem();
                        d.setMaSV(maSV);
                        d.setMaHP(maHP);
                        d.setTenHP(tenHP);
                        d.setDiem(diem);
                        d.setDiemTB(diemTB);
                        d.setKetQua(ketQua);
                        d.setSTT(stt);

                        if (mdDiem.updateDiem(d)) {
                            JOptionPane.showMessageDialog(null, "Sửa thành công!");
                            showDiem(mdDiem.listDiem());
                        } else {
                            JOptionPane.showMessageDialog(null, "Sửa thất bại!");
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
    }
    
    private ActionListener btnHuy(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                khoaMoControl("huy");
            }
        };
    }
    void exit() {
        if (JOptionPane.showConfirmDialog(jframeDiem, "Bạn có muốn thoát không?", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            jframeDiem.dispose();
        }
    }
    
      //click button đóng
    private ActionListener btnExit() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        };
    }
    

    void khoaMoControl(String name) {
        if (name == "huy") {
            jframeDiem.getTxtSTT().setText("");
            jframeDiem.getTxtMasv().setText("");
            jframeDiem.getTxtMaHP().setText("");
            jframeDiem.getTxtTenHP().setText("");
            jframeDiem.getTxtDiem().setText("");
            jframeDiem.getTxtDTB().setText("");
            jframeDiem.getTxtKQ().setText("");
            jframeDiem.getTxtMasv().requestFocus();
             jframeDiem.getBtnXoa().setEnabled(true);
            jframeDiem.getBtnSua().setEnabled(true);
            jframeDiem.getBtnThem().setEnabled(true);
        }else if(name=="them"){
            jframeDiem.getBtnXoa().setEnabled(false);
            jframeDiem.getBtnSua().setEnabled(false);
        }else if(name=="xoa"){
            jframeDiem.getBtnThem().setEnabled(false);
            jframeDiem.getBtnSua().setEnabled(false);
        }else if(name=="sua"){
            jframeDiem.getBtnXoa().setEnabled(false);
            jframeDiem.getBtnThem().setEnabled(false);
        }
    }
}
