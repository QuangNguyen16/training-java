
package View;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;


public class JFrameLopCoDinh extends javax.swing.JInternalFrame {

   
    public JFrameLopCoDinh() {
        initComponents();
        icon();
    }

    
    @SuppressWarnings("unchecked")
    void icon(){
        lbExit.setIcon(new ImageIcon("image\\icons8-close-window-26.png"));
        btnThem.setIcon(new ImageIcon("image\\icons8-plus-26.png"));
        btnXoa.setIcon(new ImageIcon("image\\icons8-delete-bin-24.png"));
        btnHuy.setIcon(new ImageIcon("image\\icons8-cancel-last-digit-24.png"));
        btnDong.setIcon(new ImageIcon("image\\icons8-smart-home-remove-24.png"));
        btnSua.setIcon(new ImageIcon("image\\icons8-edit-image-24.png"));
        lbExit.setIcon(new ImageIcon("image\\icons8-close-window-26.png"));
        pnlTTSV.setBackground(new Color(211,211,211));
        pnlLop.setBackground(new Color(211,211,211));
        btnXemSV.setIcon(new ImageIcon("image\\icons8-view-24.png"));
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbLopCD = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbLopCD = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaLop = new javax.swing.JTextField();
        txtKhoaHoc = new javax.swing.JTextField();
        btnDong = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        cbMaKhoa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnXemSV = new javax.swing.JButton();
        pnlTTSV = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbExit = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSinhVienTheoLop = new javax.swing.JTable();
        pnlLop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        cbLopCD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));
        cbLopCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLopCDActionPerformed(evt);
            }
        });

        tbLopCD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbLopCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbLopCD);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Mã Lớp:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Khóa Học:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Mã Khoa:");

        txtMaLop.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtKhoaHoc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        btnDong.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDong.setText("Đóng");

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setPreferredSize(new java.awt.Dimension(63, 23));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnThem.setText("Thêm");

        btnHuy.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        cbMaKhoa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Danh Sách Các Lớp:");

        btnXemSV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXemSV.setText("Xem");
        btnXemSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemSVActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("THÔNG TIN SINH VIÊN");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout pnlTTSVLayout = new javax.swing.GroupLayout(pnlTTSV);
        pnlTTSV.setLayout(pnlTTSVLayout);
        pnlTTSVLayout.setHorizontalGroup(
            pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTSVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTTSVLayout.setVerticalGroup(
            pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTTSVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tbSinhVienTheoLop.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbSinhVienTheoLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbSinhVienTheoLop);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("THÔNG TIN LỚP HỌC");

        javax.swing.GroupLayout pnlLopLayout = new javax.swing.GroupLayout(pnlLop);
        pnlLop.setLayout(pnlLopLayout);
        pnlLopLayout.setHorizontalGroup(
            pnlLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLopLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(58, 58, 58))
        );
        pnlLopLayout.setVerticalGroup(
            pnlLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(pnlTTSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbLopCD, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXemSV))
                            .addComponent(jLabel3))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pnlLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cbMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtKhoaHoc))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(30, 30, 30)
                                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlTTSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXemSV, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbLopCD, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnXemSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXemSVActionPerformed

    private void cbLopCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLopCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLopCDActionPerformed

    public JLabel getLbExit() {
        return lbExit;
    }

    public void setLbExit(JLabel lbExit) {
        this.lbExit = lbExit;
    }

    
    
    public JButton getBtnDong() {
        return btnDong;
    }

    public void setBtnDong(JButton btnDong) {
        this.btnDong = btnDong;
    }

    public JButton getBtnHuy() {
        return btnHuy;
    }

    public void setBtnHuy(JButton btnHuy) {
        this.btnHuy = btnHuy;
    }

    public JButton getBtnSua() {
        return btnSua;
    }

    public void setBtnSua(JButton btnSua) {
        this.btnSua = btnSua;
    }

    public JButton getBtnThem() {
        return btnThem;
    }

    public void setBtnThem(JButton btnThem) {
        this.btnThem = btnThem;
    }

    public JButton getBtnXemSV() {
        return btnXemSV;
    }

    public void setBtnXemSV(JButton btnXemSV) {
        this.btnXemSV = btnXemSV;
    }

    public JButton getBtnXoa() {
        return btnXoa;
    }

    public void setBtnXoa(JButton btnXoa) {
        this.btnXoa = btnXoa;
    }

    public JComboBox<String> getCbLopCD() {
        return cbLopCD;
    }

    public void setCbLopCD(JComboBox<String> cbLopCD) {
        this.cbLopCD = cbLopCD;
    }

    public JComboBox<String> getCbMaKhoa() {
        return cbMaKhoa;
    }

    public void setCbMaKhoa(JComboBox<String> cbMaKhoa) {
        this.cbMaKhoa = cbMaKhoa;
    }

    public JTable getTbLopCD() {
        return tbLopCD;
    }

    public void setTbLopCD(JTable tbLopCD) {
        this.tbLopCD = tbLopCD;
    }

    public JTable getTbSinhVienTheoLop() {
        return tbSinhVienTheoLop;
    }

    public void setTbSinhVienTheoLop(JTable tbSinhVienTheoLop) {
        this.tbSinhVienTheoLop = tbSinhVienTheoLop;
    }

    public JTextField getTxtMaLop() {
        return txtMaLop;
    }

    public void setTxtMaLop(JTextField txtMaLop) {
        this.txtMaLop = txtMaLop;
    }

    public JTextField getTxtKhoaHoc() {
        return txtKhoaHoc;
    }

    public void setTxtKhoaHoc(JTextField txtKhoaHoc) {
        this.txtKhoaHoc = txtKhoaHoc;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXemSV;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbLopCD;
    private javax.swing.JComboBox<String> cbMaKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbExit;
    private javax.swing.JPanel pnlLop;
    private javax.swing.JPanel pnlTTSV;
    private javax.swing.JTable tbLopCD;
    private javax.swing.JTable tbSinhVienTheoLop;
    private javax.swing.JTextField txtKhoaHoc;
    private javax.swing.JTextField txtMaLop;
    // End of variables declaration//GEN-END:variables
}
