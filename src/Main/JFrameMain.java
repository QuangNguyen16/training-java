package Main;

import Controller.ControllerSearchDiem;
import View.JFrameSearchDiemSV;
import View.JFrameLogin;
import Controller.ControllerSearch;
import View.JFrameSearchSinhVien;
import Controller.ControllerTaiKhoan;
import Controller.ControllerDiem;
import View.JFrameDiem;
import Controller.ControllerHocPhan;
import View.JFrameHocPhan;
import Model.ModelHocPhan;
import java.awt.Color;
import View.JFrameSinhVien;
import View.JFrameKhoa;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import Controller.ControllerKhoa;
import Model.ModelKhoa;
import Controller.ControllerLopCoDinh;
import Controller.ControllerRegister;
import View.JFrameLopCoDinh;
import Model.ModelLopCoDinh;
import Controller.ControllerSinhVien;
import Model.ModelSinhVien;
import View.JFrameRegister;

public class JFrameMain extends javax.swing.JFrame {

    JFrameSinhVien jframsinhvien;
    JFrameKhoa jframekhoa;
    JFrameSearchSinhVien jframeSearchSinhVien;
    JFrameLogin jframeLogin;
    JFrameHocPhan jframeHocPhan;
    JFrameLopCoDinh jframeLopCoDinh;
    JFrameDiem jframeDiem;
    JFrameSearchDiemSV jframeSearchDiem;
    JFrameRegister jframeRegister;
    
    public static boolean checkLogin = false;

    public JFrameMain() {
        initComponents();
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addIcon();
        if (checkLogin == true) {
            btnSearchSinhVien.setText("Đăng xuất");
        }

        final JFrameMain gui = this;
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int i = JOptionPane.showConfirmDialog(gui,
                        "Bạn có thật muốn thoát?", "Closing dialog",
                        JOptionPane.YES_NO_OPTION);
                if (i == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

    }

    void addIcon() {
        try {
            ImageIcon icon = new ImageIcon("image\\icons8-man-student-48.png");
            btnJFrameSinhVien.setIcon(icon);
            btnJFrameDiem.setIcon(new ImageIcon("image\\icons8-ball-point-pen-64.png"));
            btnJFrameKhoa.setIcon(new ImageIcon("image\\icons8-school-bell-64.png"));
            btnJFrameHocPhan.setIcon(new ImageIcon("image\\icons8-dictionary-64.png"));
            btnJFrameLogin.setIcon(new ImageIcon("image\\icons8-forgot-password-48.png"));
            btnExit.setIcon(new ImageIcon("image\\icons8-sign-out-48.png"));
            btnSearchSinhVien.setIcon(new ImageIcon("image\\icons8-search-48.png"));
            btnSearchDiem.setIcon(new ImageIcon("image\\icons8-search-48.png"));
            lbHe3.setIcon(new ImageIcon("image\\icons8-crazy-40.png"));
            pnlLayout1.setBackground(new Color(211, 211 , 211));
            
            //khoa khi chua dang nhap
            btnJFrameDiem.setVisible(false);
            btnJFrameHocPhan.setVisible(false);
            btnJFrameKhoa.setVisible(false);
            btnJFrameSinhVien.setVisible(false);
            btnSearchSinhVien.setVisible(false);
            btnJFrameLopCD.setVisible(false);
            btnSearchDiem.setVisible(false);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnJFrameSinhVien = new javax.swing.JButton();
        btnJFrameKhoa = new javax.swing.JButton();
        btnJFrameHocPhan = new javax.swing.JButton();
        btnJFrameDiem = new javax.swing.JButton();
        btnJFrameLopCD = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnSearchSinhVien = new javax.swing.JButton();
        lbHe3 = new javax.swing.JLabel();
        btnSearchDiem = new javax.swing.JButton();
        pnlLayout1 = new javax.swing.JPanel();
        lbqlsv = new javax.swing.JLabel();
        lbTDC = new javax.swing.JLabel();
        btnJFrameLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnJFrameRegister = new javax.swing.JButton();

        jPanel7.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDesktopPane1MouseExited(evt);
            }
        });
        jDesktopPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jDesktopPane1ComponentShown(evt);
            }
        });

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnJFrameSinhVien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnJFrameSinhVien.setText("Sinh Viên     ");
        btnJFrameSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJFrameSinhVienMouseClicked(evt);
            }
        });
        btnJFrameSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJFrameSinhVienActionPerformed(evt);
            }
        });

        btnJFrameKhoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnJFrameKhoa.setText("Khoa            ");
        btnJFrameKhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJFrameKhoaMouseClicked(evt);
            }
        });

        btnJFrameHocPhan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnJFrameHocPhan.setText("Học Phần      ");
        btnJFrameHocPhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJFrameHocPhanMouseClicked(evt);
            }
        });

        btnJFrameDiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnJFrameDiem.setText("Điểm             ");
        btnJFrameDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJFrameDiemMouseClicked(evt);
            }
        });

        btnJFrameLopCD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnJFrameLopCD.setText("    Lớp           ");
        btnJFrameLopCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJFrameLopCDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnJFrameLopCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJFrameDiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJFrameKhoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJFrameHocPhan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(btnJFrameSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnJFrameSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnJFrameLopCD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnJFrameKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnJFrameHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnJFrameDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Quản Lý", jPanel2);

        btnSearchSinhVien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearchSinhVien.setText("Tìm Kiếm Sinh Viên");
        btnSearchSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchSinhVienMouseClicked(evt);
            }
        });
        btnSearchSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSinhVienActionPerformed(evt);
            }
        });

        btnSearchDiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearchDiem.setText("Tìm Kiếm Điểm      ");
        btnSearchDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchDiemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbHe3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbHe3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnSearchSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnSearchDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tìm Kiếm", jPanel4);

        pnlLayout1.setBackground(new java.awt.Color(204, 204, 204));

        lbqlsv.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbqlsv.setText("QUẢN LÝ SINH VIÊN");

        javax.swing.GroupLayout pnlLayout1Layout = new javax.swing.GroupLayout(pnlLayout1);
        pnlLayout1.setLayout(pnlLayout1Layout);
        pnlLayout1Layout.setHorizontalGroup(
            pnlLayout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lbqlsv)
                .addGap(297, 297, 297)
                .addComponent(lbTDC, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLayout1Layout.setVerticalGroup(
            pnlLayout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(pnlLayout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbqlsv, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTDC, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnJFrameLogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnJFrameLogin.setText("Đăng Nhập");
        btnJFrameLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJFrameLoginMouseClicked(evt);
            }
        });
        btnJFrameLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJFrameLoginActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnExit.setText("Thoát             ");
        btnExit.setToolTipText("");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnJFrameRegister.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnJFrameRegister.setText("Đăng Ký");
        btnJFrameRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJFrameRegisterMouseClicked(evt);
            }
        });
        btnJFrameRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJFrameRegisterActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jTabbedPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(pnlLayout1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnJFrameLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnJFrameRegister, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnJFrameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnJFrameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnExit))
                    .addComponent(pnlLayout1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(945, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(pnlLayout1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJFrameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJFrameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(310, 310, 310))
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDesktopPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentShown


    }//GEN-LAST:event_jDesktopPane1ComponentShown

    void exit() {
        if (JOptionPane.showConfirmDialog(jDesktopPane1, "Bạn có chắc chắn muốn thoát", "lưu ý", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }


    /*
    private void btnSearchSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        
        
    }//GEN-LAST:event_btnSearchMouseClicked
*/
    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked

        exit();
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnJFrameLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJFrameLoginMouseClicked
        try {
            String name = btnJFrameLogin.getText();
            if (name.compareTo("Đăng Nhập") == 0) {
                jframeLogin = new JFrameLogin(this, true);
                jframeLogin.setSize(985, 550);
                jframeLogin.setLocation(285, 206);
                ControllerTaiKhoan taikhoan = new ControllerTaiKhoan(jframeLogin);
                jframeLogin.setVisible(true);
                btnJFrameDiem.setVisible(false);
                btnJFrameHocPhan.setVisible(false);
                btnJFrameKhoa.setVisible(false);
                btnJFrameSinhVien.setVisible(false);
                btnSearchSinhVien.setVisible(false);
                if (checkLogin == true) {
                    btnJFrameLogin.setText("Đăng xuất");
                    //mo khi dang nhap thành công
                    btnJFrameDiem.setVisible(true);
                    btnJFrameHocPhan.setVisible(true);
                    btnJFrameKhoa.setVisible(true);
                    btnJFrameSinhVien.setVisible(true);
                    btnSearchSinhVien.setVisible(true);
                    btnJFrameLopCD.setVisible(true);
                    btnSearchDiem.setVisible(true);
                }
            } else if (btnJFrameLogin.getText().equalsIgnoreCase("Đăng xuất")) {
                //khoa khi đăng nhập
                btnJFrameLogin.setText("Đăng Nhập");
                btnJFrameDiem.setVisible(false);
                btnJFrameHocPhan.setVisible(false);
                btnJFrameKhoa.setVisible(false);
                btnJFrameSinhVien.setVisible(false);
                btnSearchSinhVien.setVisible(false);
                btnSearchDiem.setVisible(false);
                btnJFrameLopCD.setVisible(false);
                
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnJFrameLoginMouseClicked

    private void jDesktopPane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jDesktopPane1MouseExited

    private void btnJFrameLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJFrameLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJFrameLoginActionPerformed

    private void btnSearchDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchDiemMouseClicked
        // TODO add your handling code here:
        if (jframeSearchDiem == null || jframeSearchDiem.isClosed()) {
            jframeSearchDiem = new JFrameSearchDiemSV();
            jDesktopPane1.add(jframeSearchDiem);
            jframeSearchDiem.setLocation(290, 150);
            jframeSearchDiem.setVisible(true);
            jframeSearchDiem.setSize(985, 550);
            try {
                ControllerSearchDiem searchDiem = new ControllerSearchDiem(jframeSearchDiem);
            } catch (Exception ex) {
                Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            jframeSearchDiem.setLocation(290, 150);
            jframeSearchDiem.setVisible(true);
        }
    }//GEN-LAST:event_btnSearchDiemMouseClicked

    private void btnSearchSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSinhVienActionPerformed

    }//GEN-LAST:event_btnSearchSinhVienActionPerformed

    private void btnSearchSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchSinhVienMouseClicked
        try {
            if (jframeSearchSinhVien == null || jframeSearchSinhVien.isClosed()) {
                jframeSearchSinhVien = new JFrameSearchSinhVien();
                jDesktopPane1.add(jframeSearchSinhVien);
                jframeSearchSinhVien.setLocation(290, 150);
                jframeSearchSinhVien.setVisible(true);
                jframeSearchSinhVien.setSize(985, 550);
                ModelSinhVien mdSV = new ModelSinhVien();
                ControllerSearch search = new ControllerSearch(jframeSearchSinhVien);

            } else {
                jframeSearchSinhVien.setLocation(290, 150);

            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnSearchSinhVienMouseClicked

    private void btnJFrameLopCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJFrameLopCDActionPerformed
        if (jframeLopCoDinh == null || jframeLopCoDinh.isClosed()) {
            jframeLopCoDinh = new JFrameLopCoDinh();
            jDesktopPane1.add(jframeLopCoDinh);
            jframeLopCoDinh.setLocation(290, 150);
            jframeLopCoDinh.setVisible(true);
            jframeLopCoDinh.setSize(985, 550);
            ModelLopCoDinh mdlop = new ModelLopCoDinh();
            try {
                ControllerLopCoDinh lop = new ControllerLopCoDinh(jframeLopCoDinh, mdlop);
            } catch (Exception ex) {
                Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            jframeLopCoDinh.setLocation(290, 150);
            jframeLopCoDinh.setVisible(true);
        }
    }//GEN-LAST:event_btnJFrameLopCDActionPerformed

    private void btnJFrameDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJFrameDiemMouseClicked
        // TODO add your handling code here:
        if (jframeDiem == null || jframeDiem.isClosed()) {
            jframeDiem = new JFrameDiem();
            jDesktopPane1.add(jframeDiem);
            jframeDiem.setLocation(290, 150);
            jframeDiem.setVisible(true);
            jframeDiem.setSize(985, 550);
            try {
                ControllerDiem lop = new ControllerDiem(jframeDiem);
            } catch (Exception ex) {
                Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            jframeDiem.setLocation(290, 150);
            jframeDiem.setVisible(true);
        }
    }//GEN-LAST:event_btnJFrameDiemMouseClicked

    private void btnJFrameHocPhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJFrameHocPhanMouseClicked
        if (jframeHocPhan == null || jframeHocPhan.isClosed()) {
            jframeHocPhan = new JFrameHocPhan();
            jDesktopPane1.add(jframeHocPhan);
            jframeHocPhan.setLocation(290, 150);
            jframeHocPhan.setVisible(true);
            jframeHocPhan.setSize(985, 550);
            ModelHocPhan mdhocphan = new ModelHocPhan();
            try {
                ControllerHocPhan hocphanler = new ControllerHocPhan(jframeHocPhan, mdhocphan);
            } catch (Exception ex) {
                Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            jframeHocPhan.setLocation(290, 150);
            jframeHocPhan.setVisible(true);
        }
    }//GEN-LAST:event_btnJFrameHocPhanMouseClicked

    private void btnJFrameKhoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJFrameKhoaMouseClicked

        try {
            if (jframekhoa == null || jframekhoa.isClosed()) {
                jframekhoa = new JFrameKhoa();
                jDesktopPane1.add(jframekhoa);
                jframekhoa.setLocation(290, 150);
                jframekhoa.setVisible(true);
                jframekhoa.setSize(985, 550);
                ModelKhoa mdKhoa = new ModelKhoa();
                ControllerKhoa controlerkhoa = new ControllerKhoa(jframekhoa);

            } else {
                jframekhoa.setLocation(290, 150);

            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnJFrameKhoaMouseClicked

    private void btnJFrameSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJFrameSinhVienMouseClicked

        try {
            if (jframsinhvien == null || jframsinhvien.isClosed()) {
                jframsinhvien = new JFrameSinhVien();
                jDesktopPane1.add(jframsinhvien);
                jframsinhvien.setLocation(290, 150);
                jframsinhvien.setVisible(true);
                jframsinhvien.setSize(985, 550);
                ModelSinhVien mdSV = new ModelSinhVien();
                ControllerSinhVien search = new ControllerSinhVien(jframsinhvien, mdSV);

            } else {
                jframsinhvien.setLocation(290, 150);

            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnJFrameSinhVienMouseClicked

    private void btnJFrameSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJFrameSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJFrameSinhVienActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnJFrameRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJFrameRegisterMouseClicked
        // TODO add your handling code here:
        
        try {
            String name = btnJFrameRegister.getText();
            if (name.compareTo("Đăng Ký") == 0) {
                jframeRegister = new JFrameRegister(this, true);
                jframeRegister.setSize(985, 550);
                jframeRegister.setLocation(285, 206);
                ControllerRegister register = new ControllerRegister(jframeRegister);
                jframeRegister.setVisible(true);
                btnJFrameDiem.setVisible(false);
                btnJFrameHocPhan.setVisible(false);
                btnJFrameKhoa.setVisible(false);
                btnJFrameSinhVien.setVisible(false);
                btnSearchSinhVien.setVisible(false);
//                if (checkLogin == true) {
//                    btnJFrameRegister.setText("Đăng ký");
//                    jLabel4.setText("Chúc mừng! Bạn đã dăng ký thành công");
//                    jLabel5.setText("Chúc bạn thành công ");
//                    //mo khi dang nhap thành công
//                    btnJFrameDiem.setVisible(true);
//                    btnJFrameHocPhan.setVisible(true);
//                    btnJFrameKhoa.setVisible(true);
//                    btnJFrameSinhVien.setVisible(true);
//                    btnSearchSinhVien.setVisible(true);
//                    btnLopCD.setVisible(true);
//                    btnSearchDiem.setVisible(true);
//                }
            } else if (btnJFrameRegister.getText().equalsIgnoreCase("Đăng xuất")) {
                //khoa khi đăng nhập
               
                btnJFrameRegister.setText("Đăng Ky");
                btnJFrameDiem.setVisible(false);
                btnJFrameHocPhan.setVisible(false);
                btnJFrameKhoa.setVisible(false);
                btnJFrameSinhVien.setVisible(false);
                btnSearchSinhVien.setVisible(false);
                btnJFrameLopCD.setVisible(false);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
                          
        
    }//GEN-LAST:event_btnJFrameRegisterMouseClicked

    private void btnJFrameRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJFrameRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJFrameRegisterActionPerformed

    public JFrameSinhVien getJframsinhvien() {
        return jframsinhvien;
    }

    public void setJframsinhvien(JFrameSinhVien jframsinhvien) {
        this.jframsinhvien = jframsinhvien;
    }

    public JFrameKhoa getJframekhoa() {
        return jframekhoa;
    }

    public void setJframekhoa(JFrameKhoa jframekhoa) {
        this.jframekhoa = jframekhoa;
    }

    public JButton getBtnJFrameDiem() {
        return btnJFrameDiem;
    }

    public void setBtnJFrameDiem(JButton btnJFrameDiem) {
        this.btnJFrameDiem = btnJFrameDiem;
    }

    public JButton getBtnJFrameHocPhan() {
        return btnJFrameHocPhan;
    }

    public void setBtnJFrameHocPhan(JButton btnJFrameHocPhan) {
        this.btnJFrameHocPhan = btnJFrameHocPhan;
    }

    public JButton getBtnJFrameKhoa() {
        return btnJFrameKhoa;
    }

    public void setBtnJFrameKhoa(JButton btnJFrameKhoa) {
        this.btnJFrameKhoa = btnJFrameKhoa;
    }

    public JButton getBtnJFrameSinhVien() {
        return btnJFrameSinhVien;
    }

    public void setBtnJFrameSinhVien(JButton btnJFrameSinhVien) {
        this.btnJFrameSinhVien = btnJFrameSinhVien;
    }

    public JButton getjButton2() {
        return btnSearchSinhVien;
    }

    public void setjButton2(JButton jButton2) {
        this.btnSearchSinhVien = jButton2;
    }

    public JButton getjButton3() {
        return btnJFrameLogin;
    }

    public void setjButton3(JButton jButton3) {
        this.btnJFrameLogin = jButton3;
    }

    public JButton getjButton4() {
        return btnExit;
    }

    public void setjButton4(JButton jButton4) {
        this.btnExit = jButton4;
    }

    public JDesktopPane getjDesktopPane1() {
        return jDesktopPane1;
    }

    public void setjDesktopPane1(JDesktopPane jDesktopPane1) {
        this.jDesktopPane1 = jDesktopPane1;
    }

    public JFrameRegister getJframeRegister() {
        return jframeRegister;
    }

    public void setJframeRegister(JFrameRegister jframeRegister) {
        this.jframeRegister = jframeRegister;
    }

    public JButton getBtnJFrameRegister() {
        return btnJFrameRegister;
    }

    public void setBtnJFrameRegister(JButton btnJFrameRegister) {
        this.btnJFrameRegister = btnJFrameRegister;
    }

    public JTabbedPane getjTabbedPane2() {
        return jTabbedPane2;
    }

    public void setjTabbedPane2(JTabbedPane jTabbedPane2) {
        this.jTabbedPane2 = jTabbedPane2;
    }

    public JButton getBtnExit() {
        return btnExit;
    }

    public void setBtnExit(JButton btnExit) {
        this.btnExit = btnExit;
    }
    

    public JButton getBtnJFrameLogin() {
        return btnJFrameLogin;
    }

    public void setBtnJFrameLogin(JButton btnJFrameLogin) {
        this.btnJFrameLogin = btnJFrameLogin;
    }

    public JButton getBtnSearchSinhVien() {
        return btnSearchSinhVien;
    }

    public void setBtnSearchSinhVien(JButton btnSearchSinhVien) {
        this.btnSearchSinhVien = btnSearchSinhVien;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnJFrameDiem;
    private javax.swing.JButton btnJFrameHocPhan;
    private javax.swing.JButton btnJFrameKhoa;
    private javax.swing.JButton btnJFrameLogin;
    private javax.swing.JButton btnJFrameLopCD;
    private javax.swing.JButton btnJFrameRegister;
    private javax.swing.JButton btnJFrameSinhVien;
    private javax.swing.JButton btnSearchDiem;
    private javax.swing.JButton btnSearchSinhVien;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lbHe3;
    private javax.swing.JLabel lbTDC;
    private javax.swing.JLabel lbqlsv;
    private javax.swing.JPanel pnlLayout1;
    // End of variables declaration//GEN-END:variables
}
