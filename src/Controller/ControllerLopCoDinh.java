package Controller;

import View.JFrameLopCoDinh;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Class.LopCoDinh;
import Model.ModelLopCoDinh;
import Class.SinhVien;

public class ControllerLopCoDinh {

    JFrameLopCoDinh jframelop;
    ModelLopCoDinh mdlop;

    //contruct
    public ControllerLopCoDinh(JFrameLopCoDinh jframelop, ModelLopCoDinh mdlop) throws Exception {
        this.jframelop = jframelop;
        this.mdlop = mdlop;
        showTableLopCoDinh(mdlop.listLopCoDinh());
        showComboboxMaKhoa(mdlop.getMaKhoa());
        showComboboxLop(mdlop.getLop());
        jframelop.getBtnXemSV().addActionListener(showActionTableLopSinhVien());
        jframelop.getBtnDong().addActionListener(btnExit());
        jframelop.getLbExit().addMouseListener(lbExit());
        jframelop.getBtnThem().addActionListener(insertLopCD());
        jframelop.getBtnSua().addActionListener(updateLopCoDinh());
        jframelop.getBtnXoa().addActionListener(deleteLop());
        jframelop.getTbLopCD().addMouseListener(getTable());
        jframelop.getBtnHuy().addActionListener(btnHuy());
    }

    //show Table Lớp Cố Định
    public void showTableLopCoDinh(ArrayList<LopCoDinh> listlcd) {
        try {
            DefaultTableModel model = (DefaultTableModel) jframelop.getTbLopCD().getModel();
            model.setColumnCount(0);
            model.setRowCount(0);
            model.addColumn("Mã Lớp");
            model.addColumn("Khóa");
            model.addColumn("Mã Khoa");

            for (LopCoDinh lcd : listlcd) {
                model.addRow(new Object[]{lcd.getMaLopCD(), lcd.getNamHoc(), lcd.getMaKhoa()});
            }
            jframelop.getTbLopCD().setModel(model);

        } catch (Exception ex) {

        }
    }

    private MouseListener getTable() {
        return new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                khoaMoControls("clicktable");
                try {
                    int r = jframelop.getTbLopCD().getSelectedRow();
                    jframelop.getTxtMaLop().setText(jframelop.getTbLopCD().getModel().getValueAt(r, 0).toString());
                    jframelop.getTxtKhoaHoc().setText(jframelop.getTbLopCD().getModel().getValueAt(r, 1).toString());
                    jframelop.getCbMaKhoa().setSelectedItem(jframelop.getTbLopCD().getModel().getValueAt(r, 2).toString());

                } catch (Exception ex) {

                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

    //show combobox Ma Khoa
    public void showComboboxMaKhoa(ArrayList<LopCoDinh> listMaKhoa) {
        try {
            for (LopCoDinh lcd : listMaKhoa) {
                jframelop.getCbMaKhoa().addItem(lcd.getMaKhoa());
            }
        } catch (Exception ex) {

        }
    }

    //show combobox Lop sinh viên
    public void showComboboxLop(ArrayList<LopCoDinh> listLop) {
        try {
            for (LopCoDinh lcd : listLop) {
                jframelop.getCbLopCD().addItem(lcd.getMaLopCD());
            }
        } catch (Exception ex) {

        }
    }

    //show table sinh viên theo lớp
    private ActionListener showActionTableLopSinhVien() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String search = jframelop.getCbLopCD().getSelectedItem().toString();
                    ArrayList<SinhVien> listSVMaLop = mdlop.getSinhVien(search);
                    ArrayList<SinhVien> listAllSV = mdlop.getAllSinhVien();

                    DefaultTableModel model = (DefaultTableModel) jframelop.getTbSinhVienTheoLop().getModel();
                    model.setColumnCount(0);
                    model.setRowCount(0);
                    model.addColumn("Mã SV");
                    model.addColumn("Họ Tên SV");
                    model.addColumn("Giới Tính");
                    model.addColumn("Ngày Sinh");
                    model.addColumn("Nơi Sinh");
                    model.addColumn("Địa Chỉ");
                    model.addColumn("Mã Lớp CD");
                    model.addColumn("Mã Khoa");
                    model.addColumn("Học Bổng");
                    if (search.equalsIgnoreCase("Tất cả")) {
                        for (SinhVien sv : listAllSV) {
                            model.addRow(new Object[]{sv.getMaSV(), sv.getHoTen(), sv.getGioiTinh(), sv.getNgaySinh(),
                                sv.getNoiSinh(), sv.getDiaChi(), sv.getMaLopCoDinh(), sv.getMaKhoa(), sv.getHocBong()});
                        }
                        jframelop.getTbSinhVienTheoLop().setModel(model);
                    } else {
                        for (SinhVien sv : listSVMaLop) {
                            model.addRow(new Object[]{sv.getMaSV(), sv.getHoTen(), sv.getGioiTinh(), sv.getNgaySinh(),
                                sv.getNoiSinh(), sv.getDiaChi(), sv.getMaLopCoDinh(), sv.getMaKhoa(), sv.getHocBong()});
                        }
                        jframelop.getTbSinhVienTheoLop().setModel(model);
                    }
                } catch (Exception ex) {

                }
            }
        };
    }

    void exit() {
        try {
            if (JOptionPane.showConfirmDialog(jframelop, "Bạn có muốn thoát không?", "Chu ý",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                jframelop.dispose();
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

    private ActionListener btnExit() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        };
    }

    private MouseListener lbExit() {
        return new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exit();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

    //thêm Lớp 
    private ActionListener insertLopCD() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                khoaMoControls("them");
                try {
                    String maLop = jframelop.getTxtMaLop().getText();
                    String khoaHoc = jframelop.getTxtKhoaHoc().getText();
                    String maKhoa = jframelop.getCbMaKhoa().getSelectedItem().toString();
                    LopCoDinh lcd = new LopCoDinh(maLop, khoaHoc, maKhoa);
                    if (mdlop.insertLopCoDinh(lcd)) {
                        showTableLopCoDinh(mdlop.listLopCoDinh());
                        JOptionPane.showMessageDialog(null, "Thêm thành công");
                    }
                } catch (Exception ex) {

                }
            }
        };
    }

    //xóa Lớp
    private ActionListener deleteLop() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                khoaMoControls("xoa");
                try {
                    int r = jframelop.getTbLopCD().getSelectedRow();
                    String maLop = jframelop.getTbLopCD().getModel().getValueAt(r, 0).toString();
                    if (JOptionPane.showConfirmDialog(jframelop, "Bạn có muốn xóa không", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        if (mdlop.deleteLopCoDinh(maLop)) {
                            showTableLopCoDinh(mdlop.listLopCoDinh());
                            JOptionPane.showMessageDialog(null, "Xóa thành công");
                        }
                    }

                } catch (Exception ex) {

                }
            }
        };
    }

    //sửa lớp cố định
    private ActionListener updateLopCoDinh() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                khoaMoControls("sua");
                try {
                    //jframelop.getTxtMaLop().setEnabled(false);
                    String maLop = jframelop.getTxtMaLop().getText();
                    String khoaHoc = jframelop.getTxtKhoaHoc().getText();
                    String maKhoa = jframelop.getCbMaKhoa().getSelectedItem().toString();
                    LopCoDinh lcd = new LopCoDinh(maLop, khoaHoc, maKhoa);

                    if (JOptionPane.showConfirmDialog(jframelop, "Bạn có muốn sửa không", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        if (mdlop.updateLopCoDinh(lcd)) {
                            showTableLopCoDinh(mdlop.listLopCoDinh());
                            JOptionPane.showMessageDialog(null, "Sửa thành công");
                        }
                    }

                } catch (Exception ex) {

                }
            }
        };
    }

    void khoaMoControls(String name) {
        if (name == "clicktable") {
            jframelop.getBtnThem().setEnabled(false);
            jframelop.getTxtMaLop().setEnabled(false);
        } else if (name == "huy") {
            jframelop.getBtnThem().setEnabled(true);
            jframelop.getTxtMaLop().setEnabled(true);
            jframelop.getBtnSua().setEnabled(true);
            jframelop.getBtnXoa().setEnabled(true);
            jframelop.getTxtMaLop().setText("");
            jframelop.getTxtKhoaHoc().setText("");
            jframelop.getCbMaKhoa().addItem("");
            jframelop.getTxtMaLop().requestFocus();
        } else if (name == "xoa") {
            jframelop.getBtnSua().setEnabled(false);
            jframelop.getBtnThem().setEnabled(false);
        } else if (name == "sua") {
            jframelop.getBtnXoa().setEnabled(false);
            jframelop.getBtnThem().setEnabled(false);
        } else if (name == "them") {
            jframelop.getBtnSua().setEnabled(false);
            jframelop.getBtnXoa().setEnabled(false);
        }
    }

    private ActionListener btnHuy() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                khoaMoControls("huy");
            }
        };
    }
}
