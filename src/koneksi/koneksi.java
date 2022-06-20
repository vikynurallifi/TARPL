package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    
    public static Connection cn;
    
    public static Connection getKoneksi(){
        if(cn == null ){
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            cn = DriverManager.getConnection("jdbc:mysql://localhost/db_booking", "root", "");
            System.out.println("Berhasil");
        }catch(SQLException e){
            e.getStackTrace();
        }
        }
        return cn;
    }
}
