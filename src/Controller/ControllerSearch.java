package Controller;

import View.JFrameSearchSinhVien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import Model.ModelSinhVien;
import Class.SinhVien;

public class ControllerSearch {
    JFrameSearchSinhVien jfrSearchSV;
    ModelSinhVien mdSV;

    public ControllerSearch(JFrameSearchSinhVien jfrSearchSV) throws Exception {
        this.jfrSearchSV = jfrSearchSV;
        this.mdSV = new ModelSinhVien();
        jfrSearchSV.getLbExit().addMouseListener(lbExit());

        showTableSinhVien();
        jfrSearchSV.getBtnSearch().addActionListener(btnSearchSinhVien());
       jfrSearchSV.getTxtSearch().getDocument().addDocumentListener(txtSearchSinhVien());

    }

    public void showTableSinhVien() {
        try {
            ArrayList<SinhVien> listSinhVien = mdSV.dsSinhVien();
            DefaultTableModel tableModel = (DefaultTableModel) jfrSearchSV.getGetTbSearchSV().getModel();

            tableModel.setRowCount(0);
            tableModel.setColumnCount(0);
            tableModel.addColumn("Mã SV");
            tableModel.addColumn("Họ Tên SV");
            tableModel.addColumn("Giới Tính");
            tableModel.addColumn("Ngày Sinh");
            tableModel.addColumn("Nơi Sinh");
            tableModel.addColumn("Địa Chỉ");
            tableModel.addColumn("Mã Khoa");
            tableModel.addColumn("Học Bổng");

            for (SinhVien sv : listSinhVien) {
                tableModel.addRow(new Object[]{sv.getMaSV(), sv.getHoTen(), sv.getGioiTinh(), sv.getNgaySinh(),
                    sv.getNoiSinh(), sv.getDiaChi(), sv.getMaKhoa(), sv.getHocBong()});
            }
            jfrSearchSV.getGetTbSearchSV().setModel(tableModel);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private MouseListener lbExit() {
        return new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (JOptionPane.showConfirmDialog(jfrSearchSV, "Bạn có muốn thoát", "lưu ý", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    jfrSearchSV.dispose();
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

    private ActionListener btnSearchSinhVien() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String search = jfrSearchSV.getTxtSearch().getText();
                    ArrayList<SinhVien> listSV = new ArrayList<>();
                    listSV = mdSV.searchSinhVien(search);
                    DefaultTableModel tableModel = (DefaultTableModel) jfrSearchSV.getGetTbSearchSV().getModel();
                    tableModel.setRowCount(0);
                    tableModel.setColumnCount(0);
                    tableModel.addColumn("Mã SV");
                    tableModel.addColumn("Họ Tên SV");
                    tableModel.addColumn("Giới Tính");
                    tableModel.addColumn("Ngày Sinh");
                    tableModel.addColumn("Nơi Sinh");
                    tableModel.addColumn("Địa Chỉ");
                    tableModel.addColumn("Mã Khoa");
                    tableModel.addColumn("Học Bổng");

                    for (SinhVien sv : listSV) {
                        tableModel.addRow(new Object[]{sv.getMaSV(), sv.getHoTen(), sv.getGioiTinh(), sv.getNgaySinh(),
                            sv.getNoiSinh(), sv.getDiaChi(), sv.getMaKhoa(), sv.getHocBong()});
                    }
                    jfrSearchSV.getGetTbSearchSV().setModel(tableModel);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
    }
    
    private DocumentListener txtSearchSinhVien(){
        return new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                warn();
                }

            @Override
            public void removeUpdate(DocumentEvent e) {
                warn();
                }

            @Override
            public void changedUpdate(DocumentEvent e) {
                warn();
            }
            
            public void warn(){
                try {
                    String search = jfrSearchSV.getTxtSearch().getText();
                    ArrayList<SinhVien> listSV = new ArrayList<>();
                    listSV = mdSV.searchSinhVien(search);
                    DefaultTableModel tableModel = (DefaultTableModel) jfrSearchSV.getGetTbSearchSV().getModel();
                    tableModel.setRowCount(0);
                    tableModel.setColumnCount(0);
                    tableModel.addColumn("Mã SV");
                    tableModel.addColumn("Họ Tên SV");
                    tableModel.addColumn("Giới Tính");
                    tableModel.addColumn("Ngày Sinh");
                    tableModel.addColumn("Nơi Sinh");
                    tableModel.addColumn("Địa Chỉ");
                    tableModel.addColumn("Mã Khoa");
                    tableModel.addColumn("Học Bổng");

                    for (SinhVien sv : listSV) {
                        tableModel.addRow(new Object[]{sv.getMaSV(), sv.getHoTen(), sv.getGioiTinh(), sv.getNgaySinh(),
                            sv.getNoiSinh(), sv.getDiaChi(), sv.getMaKhoa(), sv.getHocBong()});
                    }
                    jfrSearchSV.getGetTbSearchSV().setModel(tableModel);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
    }
}
