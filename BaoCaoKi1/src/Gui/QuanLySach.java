/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import ClassThuocTinh.Sach;
import Connect.DAOSach;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class QuanLySach extends javax.swing.JFrame {
private ArrayList<Sach> list;
    DefaultTableModel model;
    /**
     * Creates new form GiaoDien
     */
    int i = 1,k=1;
    
    public QuanLySach() {
        initComponents();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) tblQuanLySach.getModel();
       
         fillTableHienThi();
    }
    String strFind = "";
    DAOSach dao = new DAOSach();
    public void fillTable(){
        DefaultTableModel tbModel = (DefaultTableModel) tblQuanLySach.getModel();
          model.setColumnIdentifiers(new Object[]{
           "STT","MaSach","TenSach","MaTacGia","Gia","NgayPhatHanh","NhaPhatHanh","TinhTrang"
      });
        tbModel.setRowCount(0);//hien thi thong tin
        
        for(Sach sach : dao.findSachByMa(strFind)){
            Object dataRow[] = new Object[8];
             dataRow[0] = "...";
            dataRow[1] = sach.getMaSach();
             dataRow[2] = sach.getTenSach();
              dataRow[3] = sach.getMaTacGia();
               dataRow[4] = sach.getGia();
                dataRow[5] = sach.getNgayXuatBan();
                 dataRow[6] = sach.getNhaXuatBan();
                  dataRow[7] = sach.getTinhTrang();
                   tbModel.addRow(dataRow);
                   
        }
    }
     public void fillTableTimChinhXac(){
        DefaultTableModel tbModel = (DefaultTableModel) tblQuanLySach.getModel();
          model.setColumnIdentifiers(new Object[]{
           "STT","MaSach","TenSach","MaTacGia","Gia","NgayPhatHanh","NhaPhatHanh","TinhTrang"
      });
        tbModel.setRowCount(0);//hien thi thong tin
        
        for(Sach sach : dao.findSachByMaChinhXac(strFind)){
            Object dataRow[] = new Object[8];
             dataRow[0] = "...";
            dataRow[1] = sach.getMaSach();
             dataRow[2] = sach.getTenSach();
              dataRow[3] = sach.getMaTacGia();
               dataRow[4] = sach.getGia();
                dataRow[5] = sach.getNgayXuatBan();
                 dataRow[6] = sach.getNhaXuatBan();
                  dataRow[7] = sach.getTinhTrang();
                   tbModel.addRow(dataRow);
                   
        }
    }
    public void fillTableHienThi(){
        DefaultTableModel tbModel = (DefaultTableModel) tblQuanLySach.getModel();
          model.setColumnIdentifiers(new Object[]{
           "STT","MaSach","TenSach","MaTacGia","Gia","NgayPhatHanh","NhaPhatHanh","TinhTrang"
      });
        tbModel.setRowCount(0);//hien thi thong tin
        
        for(Sach sach : dao.getListSach()){
            Object dataRow[] = new Object[8];
             dataRow[0] = k++;
            dataRow[1] = sach.getMaSach();
             dataRow[2] = sach.getTenSach();
              dataRow[3] = sach.getMaTacGia();
               dataRow[4] = sach.getGia();
                dataRow[5] = sach.getNgayXuatBan();
                 dataRow[6] = sach.getNhaXuatBan();
                  dataRow[7] = sach.getTinhTrang();
                   tbModel.addRow(dataRow);
                   
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuanLySach = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tbnThem = new javax.swing.JButton();
        tbnXoa = new javax.swing.JButton();
        tbnSua = new javax.swing.JButton();
        tbnTaoMoi = new javax.swing.JButton();
        tbnThoat = new javax.swing.JButton();
        txtNgayXuatBan = new javax.swing.JTextField();
        txtNhaXuatBan = new javax.swing.JTextField();
        txtMaSach = new javax.swing.JTextField();
        txtTenSach = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        cbTinhTrang = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        txtTimKiem = new javax.swing.JTextField();
        tbnTimKiem = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtMaTacGia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản Lý Sách Thư Viện");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Sách");

        tblQuanLySach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblQuanLySach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLySachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuanLySach);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã Sách");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tên Sách");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Giá");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ngày Xuất Bản");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nhà Xuất Bản");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tình Trạng");

        tbnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbnThem.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\My PC (LAPTOP-M5BK8OUQ)\\Downloads\\add-file (2).png")); // NOI18N
        tbnThem.setText("Thêm");
        tbnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnThemActionPerformed(evt);
            }
        });

        tbnXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbnXoa.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\My PC (LAPTOP-M5BK8OUQ)\\Downloads\\delete (1).png")); // NOI18N
        tbnXoa.setText("Xóa");
        tbnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnXoaActionPerformed(evt);
            }
        });

        tbnSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbnSua.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\My PC (LAPTOP-M5BK8OUQ)\\Downloads\\recycle.png")); // NOI18N
        tbnSua.setText("Sửa");
        tbnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnSuaActionPerformed(evt);
            }
        });

        tbnTaoMoi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbnTaoMoi.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\My PC (LAPTOP-M5BK8OUQ)\\Downloads\\add-file (3).png")); // NOI18N
        tbnTaoMoi.setText("Tạo Mới");
        tbnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnTaoMoiActionPerformed(evt);
            }
        });

        tbnThoat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbnThoat.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\My PC (LAPTOP-M5BK8OUQ)\\Downloads\\power-button (3).png")); // NOI18N
        tbnThoat.setText("Thoát");
        tbnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnThoatActionPerformed(evt);
            }
        });

        txtMaSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMaSachMouseClicked(evt);
            }
        });

        cbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn", "Hết", "Đang Cập Nhật..", " " }));

        jTextField2.setForeground(new java.awt.Color(0, 102, 102));

        txtTimKiem.setFont(new java.awt.Font("Sitka Display", 3, 12)); // NOI18N
        txtTimKiem.setText("Nhập vào mã sách để tìm kiếm");
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
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        tbnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbnTimKiem.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Dropbox\\My PC (LAPTOP-M5BK8OUQ)\\Downloads\\book (2).png")); // NOI18N
        tbnTimKiem.setText("Tìm Kiếm");
        tbnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnTimKiemActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Mã Tác Giả");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaSach, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                    .addComponent(txtTenSach)
                                    .addComponent(txtGia))
                                .addGap(165, 165, 165)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNhaXuatBan)
                                    .addComponent(txtNgayXuatBan)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(209, 209, 209)
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(tbnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(tbnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addComponent(tbnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(93, 93, 93)
                                        .addComponent(tbnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90)
                                        .addComponent(tbnTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(105, 105, 105)
                                .addComponent(tbnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnTaoMoi)
                    .addComponent(tbnThoat)
                    .addComponent(tbnThem)
                    .addComponent(tbnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbnTimKiem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản Lý Sách", jPanel1);

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

    private void tbnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnSuaActionPerformed
        // TODO add your handling code here:
           
        Sach x = new Sach();
        x.setMaSach(txtMaSach.getText());
        x.setTenSach(txtTenSach.getText());
        x.setMaTacGia(txtMaTacGia.getText());
        x.setGia(txtGia.getText());
        x.setNgayXuatBan(txtNgayXuatBan.getText());
        x.setNhaXuatBan(txtNhaXuatBan.getText());
        x.setTinhTrang(cbTinhTrang.getItemAt(cbTinhTrang.getSelectedIndex()));
        
        try {
            if(new DAOSach().SuaSach(x)){
                JOptionPane.showMessageDialog(rootPane, "Sửa sách thành công ");
                int index = tblQuanLySach.getSelectedRow();
                model.setValueAt(x.getMaSach(),index,1);
                model.setValueAt(x.getTenSach(),index,2);
                model.setValueAt(x.getMaTacGia(),index,3);
                model.setValueAt(x.getGia(),index,4);
                model.setValueAt(x.getNgayXuatBan(),index,5);
                model.setValueAt(x.getNhaXuatBan(),index,6);
                model.setValueAt(x.getTinhTrang(), index, 7);
             
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

    private void tbnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnThemActionPerformed
        // TODO add your handling code here:
        list = new DAOSach().getListSach(); 

   //    showTable();
        
         Sach sach = new Sach();
       
        sach.setMaSach(txtMaSach.getText());
        sach.setTenSach(txtTenSach.getText());
        sach.setMaTacGia(txtMaTacGia.getText());
        sach.setGia(txtGia.getText());
        sach.setNgayXuatBan(txtNgayXuatBan.getText());
        sach.setNhaXuatBan(txtNhaXuatBan.getText());
        sach.setTinhTrang(cbTinhTrang.getItemAt(cbTinhTrang.getSelectedIndex()));
       if(new DAOSach().addSach(sach)){
            JOptionPane.showMessageDialog(rootPane, "Thêm Thành Công");
             list.add(sach);//add to sach
             showResult();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Thêm Thất Bại : \n Không có MÃ "+ sach.getMaTacGia()
                    +"\nVui lòng điền thông tin cho tác giả");
        }
        
    }//GEN-LAST:event_tbnThemActionPerformed
 public void showResult(){// hien thi
       
    Sach sach = list.get(list.size()-1);
        model.addRow(new Object[]{
           i++,
            sach.getMaSach(),
            sach.getTenSach(),
            sach.getMaTacGia(),
            sach.getGia(),
            sach.getNgayXuatBan(),
            sach.getNhaXuatBan(),
            sach.getTinhTrang()
           
        });
    }
    private void tbnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnXoaActionPerformed
        // TODO add your handling code here:
         int index = tblQuanLySach.getSelectedRow();
        try {
            if(new DAOSach().XoaSach(txtMaSach.getText())){
                JOptionPane.showMessageDialog(rootPane, "xóa sách thành công ");
                model.removeRow(index);  
            }else{
                JOptionPane.showMessageDialog(rootPane, "xóa sách thất bại");
            }
        } catch (Exception ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbnXoaActionPerformed

    private void txtMaSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaSachMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtMaSachMouseClicked

    private void tblQuanLySachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLySachMouseClicked
        // TODO add your handling code here:
        int index = tblQuanLySach.getSelectedRow();
        txtMaSach.setText(tblQuanLySach.getValueAt(index, 1)+"");
        txtTenSach.setText(tblQuanLySach.getValueAt(index, 2)+"");
        txtMaTacGia.setText(tblQuanLySach.getValueAt(index, 3)+"");
        txtGia.setText(tblQuanLySach.getValueAt(index, 4)+"");
        txtNgayXuatBan.setText(tblQuanLySach.getValueAt(index, 5)+"");
        txtNhaXuatBan.setText(tblQuanLySach.getValueAt(index, 6)+"");
       for(int i=0;i<cbTinhTrang.getItemCount();i++){
            if(cbTinhTrang.getItemAt(i).equals(tblQuanLySach.getValueAt(index, 7)+"")){
                cbTinhTrang.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_tblQuanLySachMouseClicked

    private void tbnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnTaoMoiActionPerformed
        // TODO add your handling code here:
        txtMaTacGia.setText("");
        cbTinhTrang.setSelectedIndex(2);
        txtTenSach.setText("");
        txtMaSach.setText("");
        txtGia.setText("");
        txtNgayXuatBan.setText("");
        txtNhaXuatBan.setText("");
    }//GEN-LAST:event_tbnTaoMoiActionPerformed

    private void txtTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMouseClicked
        // TODO add your handling code here:
         txtTimKiem.setText("");
    }//GEN-LAST:event_txtTimKiemMouseClicked

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
      
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void tbnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnTimKiemActionPerformed
        // TODO add your handling code here:
      strFind = txtTimKiem.getText();
        fillTableTimChinhXac();
        
    }//GEN-LAST:event_tbnTimKiemActionPerformed

    private void txtTimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemCaretUpdate
        // TODO add your handling code here:
        
         strFind = txtTimKiem.getText();
        fillTable();
        
    }//GEN-LAST:event_txtTimKiemCaretUpdate
    
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
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbTinhTrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblQuanLySach;
    private javax.swing.JButton tbnSua;
    private javax.swing.JButton tbnTaoMoi;
    private javax.swing.JButton tbnThem;
    private javax.swing.JButton tbnThoat;
    private javax.swing.JButton tbnTimKiem;
    private javax.swing.JButton tbnXoa;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtMaTacGia;
    private javax.swing.JTextField txtNgayXuatBan;
    private javax.swing.JTextField txtNhaXuatBan;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
