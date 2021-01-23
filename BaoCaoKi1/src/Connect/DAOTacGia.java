/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import ClassThuocTinh.Sach;
import ClassThuocTinh.TacGia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class DAOTacGia {

/**
 *
 * @author ACER
 */
    private Connection conn;
     
     public DAOTacGia(){
         try{
            Class.forName(
                    
                    "com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename = DOANCUOIKI;"
            +"username=sa;password=261102");
         }catch(Exception e){
             e.printStackTrace();
         }
     } 
        // them thong tin
     public boolean addTacGia(TacGia tg){
         
          String sql = "INSERT INTO TacGia (MaTacGia, TenTacGia,GioiTinh, NgaySinh,DiaChi)"+ 
               " VALUES(?,?,?,?,?)";
          
          try{
              PreparedStatement ps = conn.prepareStatement(sql);
              ps.setString(1 ,tg.getMaTacGia());
              ps.setString(2, tg.getTenTacGia());
              ps.setString(3, tg.getGioiTinh());
              ps.setString(4, tg.getNgaySinh());
              ps.setString(5, tg.getDiachi());
            
              return ps.executeUpdate() > 0;
           
          }catch(Exception e){
              e.printStackTrace();
          }
         return false;
     }
     // hien thi thong tin
     public ArrayList<TacGia> getListTacGia(){
         ArrayList<TacGia> list = new ArrayList<>();
         String sql = "SELECT * FROM TacGia";
         try{
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                TacGia s = new TacGia();
                 s.setMaTacGia(rs.getString("MaTacGia"));
                 s.setTenTacGia(rs.getString("TenTacGia"));
                 s.setGioiTinh(rs.getString("GioiTinh"));
                 s.setNgaySinh(rs.getString("NgaySinh"));
                 s.setDiachi(rs.getString("DiaChi"));
                  
                 list.add(s);// them thong tin vao tacGia
       
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return list;
     }
     public boolean XoaTg(String MaTacGia) throws Exception {
        String sql = "DELETE FROM TacGia"
                + " WHERE ( MaTacGia = '"+MaTacGia+"' );";
        PreparedStatement ps = conn.prepareStatement(sql);  
        return ps.executeUpdate() > 0;
    }
    public boolean SuaTg(TacGia tt) throws Exception{
        String sql = "UPDATE TacGia SET  "
                + "MaTacGia = '"+tt.getMaTacGia()
                +"' , TenTacGia = '"+tt.getTenTacGia()
                +"', GioiTinh = '"+tt.getGioiTinh()
                +"' , NgaySinh = '"+tt.getNgaySinh()
                +"' , DiaChi = '"+tt.getDiachi()
             
                +"' WHERE MaTacGia = '"+tt.getMaTacGia()+ "' ;";
        PreparedStatement ps = conn.prepareStatement(sql);  
        return ps.executeUpdate() > 0;
    }
    
    public List<TacGia> findSachByMa(String ma){
//          ResultSet rs = null;
//          Statement sttm = null;
    List<TacGia> ls = new ArrayList<>();
        
         try{
             String sql = "SELECT * FROM TacGia"
                + " WHERE  MaTacGia like '%"+ma+"%' ";
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 TacGia s = new TacGia();
                 s.setMaTacGia(rs.getString("MaTacGia"));
                 s.setTenTacGia(rs.getString("TenTacGia"));
                 s.setNgaySinh(rs.getString("NgaySinh"));
                 s.setGioiTinh(rs.getString("GioiTinh"));
                 s.setDiachi(rs.getString("DiaChi"));
               
                 ls.add(s);
                 
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         return ls;
     }  
    
     public List<TacGia> findSachByMaChinhXac(String ma){
//          ResultSet rs = null;
//          Statement sttm = null;
    List<TacGia> ls = new ArrayList<>();
        
         try{
             String sql = "SELECT * FROM TacGia"
                + " WHERE  MaTacGia like '"+ma+"' ";
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 TacGia s = new TacGia();
                 s.setMaTacGia(rs.getString("MaTacGia"));
                 s.setTenTacGia(rs.getString("TenTacGia"));
                 s.setNgaySinh(rs.getString("NgaySinh"));
                 s.setGioiTinh(rs.getString("GioiTinh"));
                 s.setDiachi(rs.getString("DiaChi"));
               
                 ls.add(s);
                 
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         return ls;
     }  
}

