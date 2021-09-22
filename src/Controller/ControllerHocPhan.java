package Controller;

import Class.HocPhan;
import View.JFrameHocPhan;
import Model.ModelHocPhan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerHocPhan {

    JFrameHocPhan jframehocphan;
    ModelHocPhan mdhocphan;

    //contructor
    public ControllerHocPhan(JFrameHocPhan jframehocphan, ModelHocPhan mdhocphan) throws Exception {
        this.jframehocphan = jframehocphan;
        this.mdhocphan = mdhocphan;
        showHocPhan(mdhocphan.listHocPhan());
        this.jframehocphan.getBtnThem().addActionListener(insertHocPhan());
        this.jframehocphan.getBtnXoa().addActionListener(deleteHocPhan());
        this.jframehocphan.getLbExit().addMouseListener(lbExit());
        this.jframehocphan.getBtnDong().addActionListener(btnExit());
        this.jframehocphan.getBtnSua().addActionListener(updateHocPhan());
        this.jframehocphan.getTbHocPhan().addMouseListener(tbClick());
        this.jframehocphan.getBtnHuy().addActionListener(btnHuy_ThemMoi("huy"));
        this.jframehocphan.getBtnThemMoi().addActionListener(btnHuy_ThemMoi("themmoi"));
    }

    //display dữ liệu học phần lên table
    public void showHocPhan(ArrayList<HocPhan> listHocPhan) throws Exception {

        DefaultTableModel model = (DefaultTableModel) jframehocphan.getTbHocPhan().getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã Học Phần");
        model.addColumn("Tên Học Phần");
        model.addColumn("Số Tiết");
        model.addColumn("Số Tín Chỉ");
        for (HocPhan hp : listHocPhan) {
            model.addRow(new Object[]{hp.getMaHocPhan(), hp.getTenHocPhan(), hp.getSoTiet(), hp.getSoTinChi()});
        }
        jframehocphan.getTbHocPhan().setModel(model);
    }

    //method thoát chương trình
    void exit() {
        if (JOptionPane.showConfirmDialog(jframehocphan, "Bạn có muốn thoát", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            jframehocphan.dispose();
        }
    }

    //click thêm học phần
    private ActionListener insertHocPhan() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                khoaMoControl("them");
                try {
                    if (JOptionPane.showConfirmDialog(jframehocphan, "Bạn có muốn thêm không", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        String maHP = jframehocphan.getTxtMaHocPhan().getText();
                        String tenHP = jframehocphan.getTxtTenHocPhan().getText();
                        int soTiet = Integer.parseInt(jframehocphan.getTxtSoTiet().getText());
                        int soTinChi = Integer.parseInt(jframehocphan.getTxtSoTC().getText());

                        HocPhan hp = new HocPhan(maHP, tenHP, soTiet, soTinChi);
                        if (mdhocphan.insertHocPhan(hp)) {
                            JOptionPane.showMessageDialog(null, "Thêm thành công");
                            showHocPhan(mdhocphan.listHocPhan());
                        } else {
                            JOptionPane.showMessageDialog(null, "Thêm thất bại");
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
    }

    //click xóa học phần
        private ActionListener deleteHocPhan() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                khoaMoControl("xoa");
                try {
                    int i = jframehocphan.getTbHocPhan().getSelectedRow();
                    String maHP = jframehocphan.getTbHocPhan().getModel().getValueAt(i, 0).toString();
                    if (JOptionPane.showConfirmDialog(jframehocphan, "Bạn có muốn xóa không", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        if (mdhocphan.deleteHocPhan(maHP)) {
                            showHocPhan(mdhocphan.listHocPhan());
                            JOptionPane.showMessageDialog(null, "Xóa thành công");
                        } else {
                            JOptionPane.showMessageDialog(null, "Xóa thất bại");
                        }
                    }

                } catch (Exception ex) {

                }
            }
        };
    }

    //lable exit
    private MouseListener lbExit() {
        return new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exit();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    //click button đóng
    private ActionListener btnExit() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        };
    }

    private MouseListener tbClick() {
        return new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                khoaMoControl("tbclick");
                try {
                    int r = jframehocphan.getTbHocPhan().getSelectedRow();
                    String maHP = jframehocphan.getTbHocPhan().getModel().getValueAt(r, 0).toString();
                    String tenHP = jframehocphan.getTbHocPhan().getModel().getValueAt(r, 1).toString();
                    String soTiet = jframehocphan.getTbHocPhan().getModel().getValueAt(r, 2).toString();
                    String soTinChi = jframehocphan.getTbHocPhan().getModel().getValueAt(r, 3).toString();
                    jframehocphan.getTxtMaHocPhan().setText(maHP);
                    jframehocphan.getTxtTenHocPhan().setText(tenHP);
                    jframehocphan.getTxtSoTiet().setText(soTiet);
                    jframehocphan.getTxtSoTC().setText(soTinChi);
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
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
    }

    //click update học phần
    private ActionListener updateHocPhan() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                khoaMoControl("sua");
                try {
                    String maHP = jframehocphan.getTxtMaHocPhan().getText();
                    String tenHP = jframehocphan.getTxtTenHocPhan().getText();
                    int soTiet = Integer.parseInt(jframehocphan.getTxtSoTiet().getText());
                    int soTinChi = Integer.parseInt(jframehocphan.getTxtSoTC().getText());

                    HocPhan hp = new HocPhan(maHP, tenHP, soTiet, soTinChi);
                    if (JOptionPane.showConfirmDialog(jframehocphan, "Bạn có muốn sửa không", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        if (mdhocphan.updateHocPhan(hp)) {
                            showHocPhan(mdhocphan.listHocPhan());
                            JOptionPane.showMessageDialog(null, "Sửa Thành công");
                        }
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
    }

    private ActionListener btnHuy_ThemMoi(String name) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name == "huy") {
                    khoaMoControl("huy");
                }else if(name=="themmoi"){
                    khoaMoControl("themmoi");
                }
            }
        };
    }

    void khoaMoControl(String name) {
        if (name == "huy") {
            jframehocphan.getBtnThem().setEnabled(true);
            jframehocphan.getBtnThemMoi().setEnabled(true);
            jframehocphan.getTxtMaHocPhan().setEnabled(true);
            jframehocphan.getTxtMaHocPhan().setText("");
            jframehocphan.getTxtMaHocPhan().requestFocus();
            jframehocphan.getTxtTenHocPhan().setText("");
            jframehocphan.getTxtSoTiet().setText("");
            jframehocphan.getTxtSoTC().setText("");

            jframehocphan.getBtnSua().setEnabled(true);
            jframehocphan.getBtnXoa().setEnabled(true);
        }

        if (name == "tbclick") {
            jframehocphan.getTxtMaHocPhan().setEnabled(false);
            jframehocphan.getBtnThem().setEnabled(false);
            jframehocphan.getBtnThemMoi().setEnabled(false);
        }

        if (name == "them") {
            jframehocphan.getBtnSua().setEnabled(false);
            jframehocphan.getBtnXoa().setEnabled(false);
        }

        if (name == "themmoi") {
            jframehocphan.getBtnSua().setEnabled(false);
            jframehocphan.getBtnXoa().setEnabled(false);
            jframehocphan.getTxtMaHocPhan().setText("");
            jframehocphan.getTxtMaHocPhan().requestFocus();
            jframehocphan.getTxtTenHocPhan().setText("");
            jframehocphan.getTxtSoTiet().setText("");
            jframehocphan.getTxtSoTC().setText("");
        }

        if (name == "xoa") {
            jframehocphan.getBtnThem().setEnabled(false);
            jframehocphan.getBtnThemMoi().setEnabled(false);
            jframehocphan.getTxtMaHocPhan().setEnabled(false);
            jframehocphan.getBtnSua().setEnabled(false);
        }

        if (name == "sua") {
            jframehocphan.getBtnThem().setEnabled(false);
            jframehocphan.getBtnThemMoi().setEnabled(false);
            jframehocphan.getTxtMaHocPhan().setEnabled(false);
            jframehocphan.getBtnXoa().setEnabled(false);
        }
    }
}
