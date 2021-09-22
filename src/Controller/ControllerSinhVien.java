package Controller;

import Class.SinhVien;
import Model.ModelSinhVien;
import Main.JFrameMain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kndatabase.ConnectDatabase;
import Class.LopCoDinh;
import View.JFrameSinhVien;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

/**
 *
 * @author Admin
 */
public class ControllerSinhVien {

    JFrameSinhVien frSV;
    ModelSinhVien mdSV;

    //contruct 
    public ControllerSinhVien(JFrameSinhVien frSV, ModelSinhVien mdSV) throws Exception {

        this.frSV = frSV;
        this.mdSV = mdSV;
        java.util.Date date = new java.util.Date();
        frSV.getTimeNgaySinh().setDate(date);

        //thực thi event
        showTableSinhVien(mdSV.dsSinhVien());
        showComboboxMaKhoa(mdSV.getMaKhoa());
        showComboboxMaLopCD(mdSV.getMaLop());
        frSV.getBtnThem().addActionListener(addSinhVien());
        frSV.getBtnXoa().addActionListener(xoaSinhVien());
        frSV.getTbSinhVien().addMouseListener(getTable());
        frSV.getBtnSua().addActionListener(updateSinhVien());
        frSV.getBtnDong().addActionListener(btnDong());
        frSV.getLbExit().addMouseListener(frExit());
        frSV.getBtnHuy().addActionListener(NodeHuy_ThemMoi("huy"));
    }

    public void showTableSinhVien(ArrayList<SinhVien> listSinhVien) {
        DefaultTableModel tableModel = (DefaultTableModel) frSV.getTbSinhVien().getModel();

        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("Mã SV");
        tableModel.addColumn("Họ Tên SV");
        tableModel.addColumn("Giới Tính");
        tableModel.addColumn("Ngày Sinh");
        tableModel.addColumn("Nơi Sinh");
        tableModel.addColumn("Địa Chỉ");
        tableModel.addColumn("Mã Lớp CD");
        tableModel.addColumn("Mã Khoa");
        tableModel.addColumn("Học Bổng");

        for (SinhVien sv : listSinhVien) {
            tableModel.addRow(new Object[]{sv.getMaSV(), sv.getHoTen(), sv.getGioiTinh(), sv.getNgaySinh(),
                sv.getNoiSinh(), sv.getDiaChi(), sv.getMaLopCoDinh(), sv.getMaKhoa(), sv.getHocBong()});
        }
        frSV.getTbSinhVien().setModel(tableModel);
    }

    public void showComboboxMaKhoa(ArrayList<SinhVien> listMaKhoa) {
        for (SinhVien sv : listMaKhoa) {
            frSV.getCbMaKhoa().addItem(sv.getMaLopCoDinh());
        }
    }

    public void showComboboxMaLopCD(ArrayList<SinhVien> listMaLopCD) {
        for (SinhVien lcd : listMaLopCD) {
            frSV.getCbMaLopCD().addItem(lcd.getMaLopCoDinh());
        }
    }

    private ActionListener addSinhVien() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SinhVien sv = new SinhVien();
                moKhoaControls("them");
                try {
                    sv.setMaSV(frSV.getTxtMa().getText());
                    sv.setHoTen(frSV.getTxtHoTen().getText());
                    sv.setGioiTinh(frSV.getCbGioiTinh().getSelectedItem().toString());
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String date = df.format(frSV.getTimeNgaySinh().getDate());
                    Date ngaySinh = Date.valueOf(date);
                    sv.setNgaySinh(ngaySinh);
                    sv.setNoiSinh(frSV.getTxtNoiSinh().getText());
                    sv.setDiaChi(frSV.getTxtDiaChi().getText());
                    sv.setMaLopCoDinh(frSV.getCbMaLopCD().getSelectedItem().toString());
                    sv.setMaKhoa(frSV.getCbMaKhoa().getSelectedItem().toString());
                    sv.setHocBong(frSV.getCbHocBong().getSelectedItem().toString());
                    mdSV.addSinhVien(sv);
                    showTableSinhVien(mdSV.dsSinhVien());
                    JOptionPane.showMessageDialog(null, "thêm thành công");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
    }

    //method xoa sinh viên
    private ActionListener xoaSinhVien() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    moKhoaControls("xoa");
                    int i = frSV.getTbSinhVien().getSelectedRow();
                    String ma = frSV.getTbSinhVien().getModel().getValueAt(i, 0).toString();
                    if (JOptionPane.showConfirmDialog(frSV, "Bạn có muốn xóa", "lưu ý", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        mdSV.xoaSinhVien(ma);
                        showTableSinhVien(mdSV.dsSinhVien());
                        JOptionPane.showMessageDialog(null, "Xóa thành công");
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
    }

    //method get data table sinh viên
    private MouseListener getTable() {
        return new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    moKhoaControls("sua");
                    frSV.getBtnXoa().setEnabled(true);
                    int r = frSV.getTbSinhVien().getSelectedRow();
                    String ma = frSV.getTbSinhVien().getModel().getValueAt(r, 0).toString();
                    String hoten = frSV.getTbSinhVien().getModel().getValueAt(r, 1).toString();
                    String gioitinh = frSV.getTbSinhVien().getModel().getValueAt(r, 2).toString();

                    DateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
                    String date3 = date1.format(frSV.getTbSinhVien().getModel().getValueAt(r, 3));
                    Date date = Date.valueOf(date3);

                    String noisinh = frSV.getTbSinhVien().getModel().getValueAt(r, 4).toString();
                    String diachi = frSV.getTbSinhVien().getModel().getValueAt(r, 5).toString();
                    String lopcd = frSV.getTbSinhVien().getModel().getValueAt(r, 6).toString();
                    String makhoa = frSV.getTbSinhVien().getModel().getValueAt(r, 7).toString();
                    String hocbong = frSV.getTbSinhVien().getModel().getValueAt(r, 8).toString();

                    frSV.getTxtMa().setText(ma);
                    frSV.getTxtHoTen().setText(hoten);
                    frSV.getCbGioiTinh().setSelectedItem(gioitinh);

                    frSV.getTimeNgaySinh().setDate(date);

                    frSV.getTxtNoiSinh().setText(noisinh);
                    frSV.getTxtDiaChi().setText(diachi);
                    frSV.getCbMaLopCD().setSelectedItem(lopcd);
                    frSV.getCbMaKhoa().setSelectedItem(makhoa);
                    frSV.getCbHocBong().setSelectedItem(hocbong);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
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

    //method sửa sinh viên
    private ActionListener updateSinhVien() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 moKhoaControls("sua");
                try {
                    if (JOptionPane.showConfirmDialog(frSV, "Bạn có muốn Sửa không", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        String maSV = frSV.getTxtMa().getText();
                        String hoTen = frSV.getTxtHoTen().getText();
                        String gioiTinh = frSV.getCbGioiTinh().getSelectedItem().toString();
                        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                        String ngaySinh = df.format(frSV.getTimeNgaySinh().getDate());
                        String diaChi = frSV.getTxtDiaChi().getText();
                        String noiSinh = frSV.getTxtNoiSinh().getText();
                        String maKhoa = frSV.getCbMaKhoa().getSelectedItem().toString();
                        String hocBong = frSV.getCbHocBong().getSelectedItem().toString();
                        String lopCoDinh = frSV.getCbMaLopCD().getSelectedItem().toString();
                        

                        SinhVien sv = new SinhVien();
//                        Date ngaySinh = Date.valueOf();
//                        sv.setNgaySinh(ngaySinh);
                        sv.setNoiSinh(frSV.getTxtNoiSinh().getText());
                        sv.setDiaChi(frSV.getTxtDiaChi().getText());
                        sv.setDiaChi(frSV.getCbMaLopCD().getSelectedItem().toString());
                        sv.setMaKhoa(frSV.getCbMaKhoa().getSelectedItem().toString());
                        sv.setHocBong(frSV.getCbHocBong().getSelectedItem().toString());

                        if (JOptionPane.showConfirmDialog(frSV, "Bạn có muốn sửa", "lưu ý", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            mdSV.updateSinhVien(sv);
                            showTableSinhVien(mdSV.dsSinhVien());
                            JOptionPane.showMessageDialog(null, "Sửa thành công");
                        } else {
                            JOptionPane.showMessageDialog(null, "Sửa thất bại");
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
        
       
    }

    JFrameMain frm = new JFrameMain();

    void exit() {
        try {
            if (JOptionPane.showConfirmDialog(frSV, "Bạn có muốn thoát không?", "Chú ý",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                frSV.dispose();
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

    public ActionListener btnDong() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();

            }
        };
    }

    private MouseListener frExit() {
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

    private ActionListener NodeHuy_ThemMoi(String name) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name == "huy") {
                    moKhoaControls("huy");
                } else if (name == "themmoi") {
                    moKhoaControls("themmoi");
                }

            }
        };
    }

    void moKhoaControls(String str) {
        if (str.equalsIgnoreCase("huy")) {
            frSV.getTxtMa().setText("");
            frSV.getCbMaKhoa().setSelectedItem("");
            frSV.getTxtHoTen().setText("");
            frSV.getTxtDiaChi().setText("");
            frSV.getTxtNoiSinh().setText("");
            frSV.getCbGioiTinh().setSelectedItem("Nam");
            frSV.getCbHocBong().setSelectedItem("K");
            java.util.Date date = new java.util.Date();
            frSV.getTimeNgaySinh().setDate(date);
            frSV.getTxtMa().requestFocus();
            frSV.getBtnThem().setEnabled(true);
            frSV.getBtnXoa().setEnabled(true);
            frSV.getCbMaKhoa().setEnabled(true);
            frSV.getBtnSua().setEnabled(true);
            frSV.getTxtMa().setEnabled(true);
            frSV.getTxtHoTen().setEnabled(true);
            frSV.getTxtNoiSinh().setEnabled(true);
            frSV.getTxtDiaChi().setEnabled(true);
            frSV.getCbGioiTinh().setEnabled(true);
            frSV.getCbHocBong().setEnabled(true);
            frSV.getTimeNgaySinh().setEnabled(true);
        } else if (str.equalsIgnoreCase("sua")) {
            frSV.getTxtMa().setEnabled(false);
            frSV.getBtnThem().setEnabled(false);
            frSV.getBtnXoa().setEnabled(false);
            frSV.getTxtMa().requestFocus();
        } else if (str.equalsIgnoreCase("themmoi")) {
            frSV.getTxtMa().setText("");
            frSV.getTxtDiaChi().setText("");
            frSV.getTxtHoTen().setText("");
            frSV.getTxtNoiSinh().setText("");
            frSV.getCbGioiTinh().setSelectedItem("Nam");
            frSV.getCbHocBong().setSelectedItem("K");
            frSV.getCbMaKhoa().setSelectedItem("");
            frSV.getCbMaLopCD().setSelectedItem("");
            java.util.Date date = new java.util.Date();
            frSV.getTimeNgaySinh().setDate(date);
            frSV.getTxtMa().requestFocus();
        } else if (str.equalsIgnoreCase("xoa")) {
            frSV.getBtnThem().setEnabled(false);
            frSV.getBtnThem().setEnabled(false);
            frSV.getCbMaKhoa().setEnabled(false);
            frSV.getTxtMa().setEnabled(false);
            frSV.getTxtHoTen().setEnabled(false);
            frSV.getTxtNoiSinh().setEnabled(false);
            frSV.getTxtDiaChi().setEnabled(false);
            frSV.getCbGioiTinh().setEnabled(false);
            frSV.getCbHocBong().setEnabled(false);
            frSV.getTimeNgaySinh().setEnabled(false);

        }
    }
}
