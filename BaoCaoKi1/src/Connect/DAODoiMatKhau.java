/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import ClassThuocTinh.DoiMatKhauThongTin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author ACER
 */
public class DAODoiMatKhau {
     private Connection conn;
     
     
     public DAODoiMatKhau(){
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename = DOANCUOIKI;"
            +"username=sa;password=261102");
         }catch(Exception e){
             e.printStackTrace();
         }
     } 
     
      public boolean SuaMK(DoiMatKhauThongTin tt) throws Exception{
        String sql = "UPDATE DangNhap SET  "
                + "MatKhau = '"+tt.getMatKhauMoi()
               
                +"' WHERE TaiKhoan = '"+tt.getTaiKhoan()+ "' and MatKhau = '"+tt.getMatKhauCu()+"';";
        PreparedStatement ps = conn.prepareStatement(sql);  
        return ps.executeUpdate() > 0;
    }
}
