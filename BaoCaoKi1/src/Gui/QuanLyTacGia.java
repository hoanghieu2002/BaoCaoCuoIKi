/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import ClassThuocTinh.Sach;
import ClassThuocTinh.TacGia;
import Connect.DAOSach;
import Connect.DAOTacGia;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class QuanLyTacGia extends javax.swing.JFrame {
private ArrayList<TacGia> list;
    DefaultTableModel model;
    /**
     * Creates new form QuanLYTacGia
     */ int i = 1;
    public QuanLyTacGia() {
        initComponents();
        this.setLocationRelativeTo(null);
       model = (DefaultTableModel) tblQuanLyTacGia.getModel();
              fillTableHienThi();// hien thi thong tin trong danh sach
    }
   String strFind = "";
    DAOTacGia dao = new DAOTacGia();
    public void fillTable(){
        
     DefaultTableModel tbModel = (DefaultTableModel) tblQuanLyTacGia.getModel();
       
       model.setColumnIdentifiers(new Object[]{
           "STT","MaTacGia","TenTacGia","NgaySinh","GioiTinh","DiaChi"
       });

        tbModel.setRowCount(0);//hien thi thong tin
        
        for(TacGia sach : dao.findSachByMa(strFind)){
            Object dataRow[] = new Object[6];
             dataRow[0] = "...";
            dataRow[1] = sach.getMaTacGia();
             dataRow[2] = sach.getTenTacGia();
              dataRow[3] = sach.getNgaySinh();
               dataRow[4] = sach.getGioiTinh();
                dataRow[5] = sach.getDiachi();
                   tbModel.addRow(dataRow);
                   
        }
    }
    
    public void fillTableChinhXac(){
        
     DefaultTableModel tbModel = (DefaultTableModel) tblQuanLyTacGia.getModel();
       
       model.setColumnIdentifiers(new Object[]{
           "STT","MaTacGia","TenTacGia","NgaySinh","GioiTinh","DiaChi"
       });

        tbModel.setRowCount(0);//hien thi thong tin
        
        for(TacGia sach : dao.findSachByMaChinhXac(strFind)){
            Object dataRow[] = new Object[6];
             dataRow[0] = "...";
            dataRow[1] = sach.getMaTacGia();
             dataRow[2] = sach.getTenTacGia();
              dataRow[3] = sach.getNgaySinh();
               dataRow[4] = sach.getGioiTinh();
                dataRow[5] = sach.getDiachi();
                   tbModel.addRow(dataRow);
                   
        }
    }
  public void fillTableHienThi(){
        
     DefaultTableModel tbModel = (DefaultTableModel) tblQuanLyTacGia.getModel();
       
       model.setColumnIdentifiers(new Object[]{
           "STT","MaTacGia","TenTacGia","NgaySinh","GioiTinh","DiaChi"
       });

        tbModel.setRowCount(0);//hien thi thong tin
        
        for(TacGia sach : dao.getListTacGia()){
            Object dataRow[] = new Object[6];
             dataRow[0] = i++;
            dataRow[1] = sach.getMaTacGia();
             dataRow[2] = sach.getTenTacGia();
              dataRow[3] = sach.getNgaySinh();
               dataRow[4] = sach.getGioiTinh();
                dataRow[5] = sach.getDiachi();
                   tbModel.addRow(dataRow);
                   
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuanLyTacGia = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaTacGia = new javax.swing.JTextField();
        txtTenTacGia = new javax.swing.JTextField();
        cbGioiTinh = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        tbnThem = new javax.swing.JButton();
        tbnXoa = new javax.swing.JButton();
        tbnSua = new javax.swing.JButton();
        tbnTaoMoi = new javax.swing.JButton();
        tbnThoat = new javax.swing.JButton();
        tbnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản Lý Tác Giả");

        tblQuanLyTacGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblQuanLyTacGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLyTacGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuanLyTacGia);

        jTextField1.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tác Giả");

        jTextField2.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã Tác Giả");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tên Tác Giả");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Giới Tính");

        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "........." }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ngày Sinh");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Địa Chỉ");

        jTextField5.setEnabled(false);

        txtNgaySinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNgaySinhMouseClicked(evt);
            }
        });

        tbnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbnThem.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\My PC (LAPTOP-M5BK8OUQ)\\Downloads\\add-file.png")); // NOI18N
        tbnThem.setText("Thêm");
        tbnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnThemActionPerformed(evt);
            }
        });

        tbnXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbnXoa.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\My PC (LAPTOP-M5BK8OUQ)\\Downloads\\delete.png")); // NOI18N
        tbnXoa.setText("Xóa");
        tbnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnXoaActionPerformed(evt);
            }
        });

        tbnSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbnSua.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\My PC (LAPTOP-M5BK8OUQ)\\Downloads\\captcha (1).png")); // NOI18N
        tbnSua.setText("Sửa");
        tbnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnSuaActionPerformed(evt);
            }
        });

        tbnTaoMoi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbnTaoMoi.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\My PC (LAPTOP-M5BK8OUQ)\\Downloads\\add-file (4).png")); // NOI18N
        tbnTaoMoi.setText("Tạo Mới");
        tbnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnTaoMoiActionPerformed(evt);
            }
        });

        tbnThoat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbnThoat.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\My PC (LAPTOP-M5BK8OUQ)\\Downloads\\power.png")); // NOI18N
        tbnThoat.setText("Thoát");
        tbnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnThoatActionPerformed(evt);
            }
        });

        tbnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbnTimKiem.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\My PC (LAPTOP-M5BK8OUQ)\\Downloads\\searching.png")); // NOI18N
        tbnTimKiem.setText("Tìm kiếm");
        tbnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnTimKiemActionPerformed(evt);
            }
        });

        txtTimKiem.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        txtTimKiem.setForeground(new java.awt.Color(0, 153, 153));
        txtTimKiem.setText("Nhập mã tác giả để tìm kiếm tác giả");
        txtTimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemCaretUpdate(evt);
            }
        });
        txtTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimKiemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jTextField1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(txtTenTacGia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtDiaChi))
                        .addGap(26, 26, 26))
                    .addComponent(jTextField5))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(tbnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tbnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tbnTaoMoi)
                        .addGap(92, 92, 92)
                        .addComponent(tbnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tbnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(tbnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tbnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbnTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 82, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản Lý Tác Giả", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnThemActionPerformed
        // TODO add your handling code here:
        list = new DAOTacGia().getListTacGia();
        TacGia tg = new TacGia();
       
        tg.setMaTacGia(txtMaTacGia.getText());
        tg.setTenTacGia(txtTenTacGia.getText());
        tg.setGioiTinh(cbGioiTinh.getItemAt(cbGioiTinh.getSelectedIndex()));
        tg.setNgaySinh(txtNgaySinh.getText());
        tg.setDiachi(txtDiaChi.getText());
        
       if(new DAOTacGia().addTacGia(tg)){
            JOptionPane.showMessageDialog(rootPane, "Thêm Thành Công!");
             list.add(tg);//add to student
              showResult();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Thêm Thất Bại > Xem lại Mã Sách (Mã Sách Không Trùng Nhau)!");
        }
       
    }//GEN-LAST:event_tbnThemActionPerformed

    private void tblQuanLyTacGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLyTacGiaMouseClicked
        // TODO add your handling code here:
        int index = tblQuanLyTacGia.getSelectedRow();
        txtMaTacGia.setText(tblQuanLyTacGia.getValueAt(index, 1)+"");
        txtTenTacGia.setText(tblQuanLyTacGia.getValueAt(index, 2)+"");
        txtNgaySinh.setText(tblQuanLyTacGia.getValueAt(index, 3)+"");
        txtDiaChi.setText(tblQuanLyTacGia.getValueAt(index, 5)+"");
       
       for(int i=0;i<cbGioiTinh.getItemCount();i++){
            if(cbGioiTinh.getItemAt(i).equals(tblQuanLyTacGia.getValueAt(index, 4)+"")){
                cbGioiTinh.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_tblQuanLyTacGiaMouseClicked

    private void tbnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnTaoMoiActionPerformed
        // TODO add your handling code here:
        txtMaTacGia.setText("");
        cbGioiTinh.setSelectedIndex(2);
        txtTenTacGia.setText("");
        txtDiaChi.setText("");
        txtNgaySinh.setText("--/--/----");
       
    }//GEN-LAST:event_tbnTaoMoiActionPerformed

    private void txtNgaySinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgaySinhMouseClicked
        // TODO add your handling code here:
        txtNgaySinh.setText("");
    }//GEN-LAST:event_txtNgaySinhMouseClicked

    private void txtTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMouseClicked
        // TODO add your handling code here:
        txtTimKiem.setText("");
    }//GEN-LAST:event_txtTimKiemMouseClicked

    private void tbnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnXoaActionPerformed
        // TODO add your handling code here:
        
         int index = tblQuanLyTacGia.getSelectedRow();
        try {
            if(new DAOTacGia().XoaTg(txtMaTacGia.getText())){
                JOptionPane.showMessageDialog(rootPane, "xóa sách thành công ");
                model.removeRow(index);  
            }else{
                JOptionPane.showMessageDialog(rootPane, "xóa sách thất bại ");
            }
        } catch (Exception ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Mã Tác Giả "+txtMaTacGia.getText()
                        + " Đang Được Dùng \n\n"
                                + "< vui lòng xóa sách có Mã Tác Giả "+ txtMaTacGia.getText()+" >");
        }
    }//GEN-LAST:event_tbnXoaActionPerformed

    private void tbnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnSuaActionPerformed
        // TODO add your handling code here:
        TacGia x = new TacGia();
        x.setMaTacGia(txtMaTacGia.getText());
        x.setTenTacGia(txtTenTacGia.getText());
        x.setGioiTinh(cbGioiTinh.getItemAt(cbGioiTinh.getSelectedIndex()));
        x.setNgaySinh(txtNgaySinh.getText());
        x.setDiachi(txtDiaChi.getText());
       
        try {
            if(new DAOTacGia().SuaTg(x)){
                JOptionPane.showMessageDialog(rootPane, "Sửa sách thành công ");
                int index = tblQuanLyTacGia.getSelectedRow();
                model.setValueAt(x.getMaTacGia(),index,1);
                model.setValueAt(x.getTenTacGia(),index,2);
                model.setValueAt(x.getNgaySinh(),index,3);
                model.setValueAt(x.getGioiTinh(),index,4);
                model.setValueAt(x.getDiachi(),index,5);
             
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Sửa sách thất bại ");
            Logger.getLogger(Sach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbnSuaActionPerformed

    private void tbnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnThoatActionPerformed
        // TODO add your handling code here:
        int t = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không","Tap",JOptionPane.YES_NO_OPTION);
        if(t != JOptionPane.YES_OPTION){
            return;
        }else{
            dispose();
        }
    }//GEN-LAST:event_tbnThoatActionPerformed

    private void tbnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnTimKiemActionPerformed
        // TODO add your handling code here:
        strFind = txtTimKiem.getText();
        
        fillTableChinhXac();
        
    }//GEN-LAST:event_tbnTimKiemActionPerformed

    private void txtTimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemCaretUpdate
        // TODO add your handling code here:
         strFind = txtTimKiem.getText();
        
        fillTable();
        
    }//GEN-LAST:event_txtTimKiemCaretUpdate
public void showResult(){// hien thi
      
    TacGia tg = list.get(list.size()-1);
        model.addRow(new Object[]{
            i++,
            tg.getMaTacGia(),
            tg.getTenTacGia(),
            tg.getGioiTinh(),
            tg.getNgaySinh(),
            tg.getDiachi(),
           
        });
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyTacGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyTacGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyTacGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyTacGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyTacGia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tblQuanLyTacGia;
    private javax.swing.JButton tbnSua;
    private javax.swing.JButton tbnTaoMoi;
    private javax.swing.JButton tbnThem;
    private javax.swing.JButton tbnThoat;
    private javax.swing.JButton tbnTimKiem;
    private javax.swing.JButton tbnXoa;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaTacGia;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTenTacGia;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
