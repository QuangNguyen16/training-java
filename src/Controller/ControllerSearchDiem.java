package Controller;

import View.JFrameSearchDiemSV;
import Class.Diem;
import Model.ModelDiem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class ControllerSearchDiem {

    JFrameSearchDiemSV jfsearchDiem;
    ModelDiem mdDiem;

    public ControllerSearchDiem(JFrameSearchDiemSV jfamesearch) throws Exception {
        mdDiem = new ModelDiem();
        this.jfsearchDiem = jfamesearch;
        warnn();
        jfamesearch.getTxtSearch().getDocument().addDocumentListener(searchDiem());
    }

    void warnn() throws Exception {
        DefaultTableModel model = (DefaultTableModel) jfsearchDiem.getGetTbSearchSV().getModel();
        String search = jfsearchDiem.getTxtSearch().getText();
        model.setColumnCount(0);
        model.setRowCount(0);
        ArrayList<Diem> listDiem = mdDiem.listDiem();
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
        jfsearchDiem.getGetTbSearchSV().setModel(model);
    }
    
    void exit() {
        if (JOptionPane.showConfirmDialog(jfsearchDiem, "Bạn có muốn thoát", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            jfsearchDiem.dispose();
        }
    }
    
      //click button đóng
    private ActionListener lbExit() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        };
    }

    private DocumentListener searchDiem() {
        return new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    warn();
                } catch (Exception ex) {
                    Logger.getLogger(ControllerSearchDiem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                try {
                    warn();
                } catch (Exception ex) {
                    Logger.getLogger(ControllerSearchDiem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                try {
                    warn();
                } catch (Exception ex) {
                    Logger.getLogger(ControllerSearchDiem.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            void warn() throws Exception {
                DefaultTableModel model = (DefaultTableModel) jfsearchDiem.getGetTbSearchSV().getModel();
                String search = jfsearchDiem.getTxtSearch().getText();
                model.setColumnCount(0);
                model.setRowCount(0);
                ArrayList<Diem> listDiem = mdDiem.searchDiem(search);
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
                jfsearchDiem.getGetTbSearchSV().setModel(model);
            }
        };
    }
}
