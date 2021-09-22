/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class JFrameDiem extends javax.swing.JInternalFrame {

    /**
     * Creates new form JFrameDiem
     */
    public JFrameDiem() {
        initComponents();
        icon();
    }
    
     void icon(){
        btnThem.setIcon(new ImageIcon("image\\icons8-plus-26.png"));
        btnXoa.setIcon(new ImageIcon("image\\icons8-delete-bin-24.png"));
        btnHuy.setIcon(new ImageIcon("image\\icons8-cancel-last-digit-24.png"));
        btnThoat.setIcon(new ImageIcon("image\\icons8-smart-home-remove-24.png"));
        btnSua.setIcon(new ImageIcon("image\\icons8-edit-image-24.png"));
        lbExit.setIcon(new ImageIcon("image\\icons8-close-window-26.png"));
        pnlDiem.setBackground(new Color(211,211,211));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMasv = new javax.swing.JTextField();
        txtMaHP = new javax.swing.JTextField();
        txtTenHP = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        txtDTB = new javax.swing.JTextField();
        txtKQ = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDiem = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSTT = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        lbExit = new javax.swing.JLabel();
        pnlDiem = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDong = new javax.swing.JButton();

        txtMasv.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtMaHP.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtMaHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHPActionPerformed(evt);
            }
        });

        txtTenHP.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTenHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenHPActionPerformed(evt);
            }
        });

        txtDiem.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtDTB.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtKQ.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        tbDiem.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbDiem.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDiem);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("STT");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Mã Sinh Viên");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Mã Học Phần");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Tên Học Phần");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Điểm Thi");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("ĐTB");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Kết Qủa");

        txtSTT.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnHuy.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnHuy.setText("Hủy");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ ĐIỂM SINH VIÊN");

        javax.swing.GroupLayout pnlDiemLayout = new javax.swing.GroupLayout(pnlDiem);
        pnlDiem.setLayout(pnlDiemLayout);
        pnlDiemLayout.setHorizontalGroup(
            pnlDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDiemLayout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        pnlDiemLayout.setVerticalGroup(
            pnlDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDong.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDong.setText("Đóng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSTT)
                    .addComponent(txtMasv)
                    .addComponent(txtMaHP)
                    .addComponent(txtTenHP)
                    .addComponent(txtDiem)
                    .addComponent(txtDTB)
                    .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(pnlDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(pnlDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHPActionPerformed

    private void txtTenHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenHPActionPerformed

    private void tbDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDiemMouseClicked

        if (tbDiem.getSelectedRow() >= 0) {
            txtSTT.setText(tbDiem.getValueAt(tbDiem.getSelectedRow(), 0) + "");
            txtMasv.setText(tbDiem.getValueAt(tbDiem.getSelectedRow(), 1) + "");
            txtMaHP.setText(tbDiem.getValueAt(tbDiem.getSelectedRow(), 2) + "");
            txtTenHP.setText(tbDiem.getValueAt(tbDiem.getSelectedRow(), 3) + "");
            txtDiem.setText(tbDiem.getValueAt(tbDiem.getSelectedRow(), 4) + "");
            txtDTB.setText(tbDiem.getValueAt(tbDiem.getSelectedRow(), 5) + "");
            txtKQ.setText(tbDiem.getValueAt(tbDiem.getSelectedRow(), 6) + "");
        }
    }//GEN-LAST:event_tbDiemMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        
    }//GEN-LAST:event_btnXoaActionPerformed

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

    public JButton getBtnThoat() {
        return btnThoat;
    }

    public void setBtnThoat(JButton btnThoat) {
        this.btnThoat = btnThoat;
    }

    public JButton getBtnXoa() {
        return btnXoa;
    }

    public void setBtnXoa(JButton btnXoa) {
        this.btnXoa = btnXoa;
    }

    
    
    public JTextField getTxtDTB() {
        return txtDTB;
    }

    public void setTxtDTB(JTextField txtDTB) {
        this.txtDTB = txtDTB;
    }

    public JTextField getTxtDiem() {
        return txtDiem;
    }

    public void setTxtDiem(JTextField txtDiem) {
        this.txtDiem = txtDiem;
    }

    public JTextField getTxtKQ() {
        return txtKQ;
    }

    public void setTxtKQ(JTextField txtKQ) {
        this.txtKQ = txtKQ;
    }

    public JTextField getTxtMaHP() {
        return txtMaHP;
    }

    public void setTxtMaHP(JTextField txtMaHP) {
        this.txtMaHP = txtMaHP;
    }

    public JTextField getTxtMasv() {
        return txtMasv;
    }

    public void setTxtMasv(JTextField txtMasv) {
        this.txtMasv = txtMasv;
    }

    public JTextField getTxtSTT() {
        return txtSTT;
    }

    public void setTxtSTT(JTextField txtSTT) {
        this.txtSTT = txtSTT;
    }

    public JTextField getTxtTenHP() {
        return txtTenHP;
    }

    public void setTxtTenHP(JTextField txtTenHP) {
        this.txtTenHP = txtTenHP;
    }

    public JTable getTbDiem() {
        return tbDiem;
    }

    public void setTbDiem(JTable tbDiem) {
        this.tbDiem = tbDiem;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbExit;
    private javax.swing.JPanel pnlDiem;
    private javax.swing.JTable tbDiem;
    private javax.swing.JTextField txtDTB;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtKQ;
    private javax.swing.JTextField txtMaHP;
    private javax.swing.JTextField txtMasv;
    private javax.swing.JTextField txtSTT;
    private javax.swing.JTextField txtTenHP;
    // End of variables declaration//GEN-END:variables
}
