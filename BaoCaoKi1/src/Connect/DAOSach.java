/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import ClassThuocTinh.Sach;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

/**
 *
 * @author ACER
 */
public class DAOSach {
      private Connection conn;
     
     
     public DAOSach(){
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename = DOANCUOIKI;"
            +"username=sa;password=261102");
         }catch(Exception e){
             e.printStackTrace();
         }
     } 
      public boolean addSach(Sach s){
         
          String sql = "INSERT INTO Sach (MaSach, TenSach, MaTacGia,Gia, NgayXuatBan,NhaXuatBan,TinhTrang)"+ 
               " VALUES(?,?,?,?,?,?,?)";
          
          try{
              PreparedStatement ps = conn.prepareStatement(sql);
              ps.setString(1 ,s.getMaSach());
              ps.setString(2, s.getTenSach());
              ps.setString(3, s.getMaTacGia());
              ps.setString(4, s.getGia());
              ps.setString(5, s.getNgayXuatBan());
              ps.setString(6, s.getNhaXuatBan());
              ps.setString(7, s.getTinhTrang());
            
              return ps.executeUpdate() > 0;
           
          }catch(Exception e){
              e.printStackTrace();
          }
         return false;
     }
     public ArrayList<Sach> getListSach(){
         ArrayList<Sach> list = new ArrayList<>();
         String sql = "SELECT * FROM Sach";
         try{
             
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 Sach s = new Sach();
                 s.setMaSach(rs.getString("MaSach"));
                 s.setTenSach(rs.getString("TenSach"));
                 s.setMaTacGia(rs.getString("MaTacGia"));
                 s.setGia(rs.getString("Gia"));
                 s.setNgayXuatBan(rs.getString("NgayXuatBan"));
                 s.setNhaXuatBan(rs.getString("NhaXuatBan"));
                 s.setTinhTrang(rs.getString("TinhTrang"));
                  
                 list.add(s);
                 
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return list;
     }
     
       public boolean XoaSach(String MaSach) throws Exception {
        String sql = "DELETE FROM Sach"
                + " WHERE ( MaSach = '"+MaSach+"' );";
        PreparedStatement ps = conn.prepareStatement(sql);  
        return ps.executeUpdate() > 0;
    }
    public boolean SuaSach(Sach tt) throws Exception{
        String sql = "UPDATE Sach SET  "
                + "MaSach = '"+tt.getMaSach()
                +"' , TenSach = '"+tt.getTenSach()
                +"', MaTacGia = '"+tt.getMaTacGia()
                +"' , Gia = '"+tt.getGia()
                +"' , NgayXuatBan = '"+tt.getNgayXuatBan()
                +"' ,NhaXuatBan = '"+tt.getNhaXuatBan()
                +"' ,TinhTrang = '"+tt.getTinhTrang()
                +"' WHERE MaSach = '"+tt.getMaSach()+ "' ;";
        PreparedStatement ps = conn.prepareStatement(sql);  
        return ps.executeUpdate() > 0;
    }
    public List<Sach> findSachByMa(String ma){
//          ResultSet rs = null;
//          Statement sttm = null;
    List<Sach> ls = new ArrayList<>();
        
         try{
             String sql = "SELECT * FROM Sach"
                + " WHERE  MaSach like '%"+ma+"%' ";
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 Sach s = new Sach();
                 s.setMaSach(rs.getString("MaSach"));
                 s.setTenSach(rs.getString("TenSach"));
                 s.setMaTacGia(rs.getString("MaTacGia"));
                 s.setGia(rs.getString("Gia"));
                 s.setNgayXuatBan(rs.getString("NgayXuatBan"));
                 s.setNhaXuatBan(rs.getString("NhaXuatBan"));
                 s.setTinhTrang(rs.getString("TinhTrang"));
                  
                 ls.add(s);
                 
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         return ls;
     }  
     public List<Sach> findSachByMaChinhXac(String ma){
//          ResultSet rs = null;
//          Statement sttm = null;
    List<Sach> ls = new ArrayList<>();
        
         try{
             String sql = "SELECT * FROM Sach"
                + " WHERE  MaSach like '"+ma+"' ";
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 Sach s = new Sach();
                 s.setMaSach(rs.getString("MaSach"));
                 s.setTenSach(rs.getString("TenSach"));
                 s.setMaTacGia(rs.getString("MaTacGia"));
                 s.setGia(rs.getString("Gia"));
                 s.setNgayXuatBan(rs.getString("NgayXuatBan"));
                 s.setNhaXuatBan(rs.getString("NhaXuatBan"));
                 s.setTinhTrang(rs.getString("TinhTrang"));
                  
                 ls.add(s);
                 
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         return ls;
     }  
}

   
    
