package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import View.JFrameKhoa;
import Class.Khoa;
import Model.ModelKhoa;

public final class ControllerKhoa {

    JFrameKhoa frmkhoa;
    ModelKhoa mdkhoa;

    public ControllerKhoa(JFrameKhoa frmkhoa) throws Exception {
        this.frmkhoa = frmkhoa;
        this.mdkhoa = new ModelKhoa();
        showTableKhoa(mdkhoa.dsKhoa());
        frmkhoa.getLbExit().addMouseListener(lbExit());
        frmkhoa.getBtnThem().addActionListener(addKhoa());
        frmkhoa.getTbKhoa().addMouseListener(ClickTableKhoa());
        frmkhoa.getBtnXoa().addActionListener(deleteKhoa());
        frmkhoa.getBtnSua().addActionListener(updateKhoa());
        frmkhoa.getBtnDong().addActionListener(btnExit());
        frmkhoa.getBtnHuy().addActionListener(huy());
        frmkhoa.getBtnThemMoi().addActionListener(themMoi());
    }

    public void showTableKhoa(ArrayList<Khoa> listKhoa) {
        DefaultTableModel tableModel = (DefaultTableModel) frmkhoa.getTbKhoa().getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        tableModel.addColumn("Mã Khoa");
        tableModel.addColumn("Tên Khoa");
        for (Khoa khoa : listKhoa) {
            tableModel.addRow(new Object[]{khoa.getMaKhoa(), khoa.getTenKhoa()});
        }
        frmkhoa.getTbKhoa().setModel(tableModel);
    }
    
    void exit(){
        if(JOptionPane.showConfirmDialog(frmkhoa,"Bạn có muốn thoát","lưu ý",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            frmkhoa.dispose();
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
    
    private MouseListener ClickTableKhoa() {
        return new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    moKhoaControls("sua");
                    frmkhoa.getBtnXoa().setEnabled(true);
                    int r = frmkhoa.getTbKhoa().getSelectedRow();
                    String ma = frmkhoa.getTbKhoa().getModel().getValueAt(r, 0).toString();
                    String ten = frmkhoa.getTbKhoa().getModel().getValueAt(r, 1).toString();
                    frmkhoa.getTxtMaKhoa().setText(ma);
                    frmkhoa.getTxtTenKhoa().setText(ten);
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

    private ActionListener addKhoa() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    moKhoaControls("them");
                    String ma = frmkhoa.getTxtMaKhoa().getText();
                    String ten = frmkhoa.getTxtTenKhoa().getText();
                    Khoa khoa = new Khoa(ma, ten);
                    mdkhoa.addKhoa(khoa);
                    showTableKhoa(mdkhoa.dsKhoa());
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
    }

    private ActionListener deleteKhoa() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    moKhoaControls("xoa");
                    int r = frmkhoa.getTbKhoa().getSelectedRow();
                    String ma = frmkhoa.getTbKhoa().getModel().getValueAt(r, 0).toString();
                    if (JOptionPane.showConfirmDialog(frmkhoa, "Bạn có muốn xóa không?", "lưu ý", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        mdkhoa.deleteKhoa(ma);
                        showTableKhoa(mdkhoa.dsKhoa());
                        JOptionPane.showMessageDialog(null, "xóa thành công");
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        };
    }

    private ActionListener updateKhoa() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moKhoaControls("sua");
                try {
                    String ma = frmkhoa.getTxtMaKhoa().getText();
                    String ten = frmkhoa.getTxtTenKhoa().getText();
                    if (JOptionPane.showConfirmDialog(frmkhoa, "Bạn có muốn sửa không?", "lưu ý", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        Khoa khoa = new Khoa(ma, ten);
                        mdkhoa.updateKhoa(khoa);
                        showTableKhoa(mdkhoa.dsKhoa());
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

            }
        };
    }

    private ActionListener huy() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moKhoaControls("huy");
            }
        };
    }

    private ActionListener themMoi() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moKhoaControls("themmoi");
            }
        };
    }

    void moKhoaControls(String str) {
        if (str.equalsIgnoreCase("huy")) {
            frmkhoa.getTxtMaKhoa().setText("");
            frmkhoa.getTxtTenKhoa().setText("");
            frmkhoa.getTxtMaKhoa().requestFocus();
            frmkhoa.getBtnThem().setEnabled(true);
            frmkhoa.getBtnThemMoi().setEnabled(true);
            frmkhoa.getBtnXoa().setEnabled(true);
            frmkhoa.getTxtMaKhoa().setEnabled(true);
            frmkhoa.getBtnSua().setEnabled(true);
            frmkhoa.getTxtTenKhoa().setEnabled(true);
            frmkhoa.getTxtTenKhoa().setEnabled(true);
        } else if (str.equalsIgnoreCase("sua")) {
            frmkhoa.getTxtMaKhoa().setEnabled(false);
            frmkhoa.getBtnThem().setEnabled(false);
            frmkhoa.getBtnThemMoi().setEnabled(false);
            frmkhoa.getBtnXoa().setEnabled(false);
            frmkhoa.getTxtTenKhoa().requestFocus();
        } else if (str.equalsIgnoreCase("themmoi")) {
            frmkhoa.getTxtMaKhoa().setText("");
            frmkhoa.getTxtTenKhoa().setText("");
            frmkhoa.getTxtMaKhoa().requestFocus();
        } else if (str.equalsIgnoreCase("xoa")) {
            frmkhoa.getBtnThem().setEnabled(false);
            frmkhoa.getTxtMaKhoa().setEnabled(false);
            frmkhoa.getBtnThem().setEnabled(false);
            frmkhoa.getBtnThemMoi().setEnabled(false);
            frmkhoa.getTxtTenKhoa().setEnabled(false);
            frmkhoa.getTxtTenKhoa().setEditable(false);
        }
    }

}
