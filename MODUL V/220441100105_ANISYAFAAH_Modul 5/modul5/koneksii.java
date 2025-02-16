package modul5;

import java.sql.Connection;
import java.sql.DriverManager;


public class koneksii {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL      = "jdbc:mysql://localhost/pemvis5";
    private static final String USER        = "root";
    private static final String PASS        = "";
    
    private Connection conn                 = null;
    
    public koneksii(){
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Succes");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal");
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
}
