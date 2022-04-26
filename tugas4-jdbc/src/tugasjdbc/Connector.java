/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjdbc;
import java.sql.DriverManager;

/**
 *
 * @author Lenovo
 */
public class Connector {
    private static java.sql.Connection connection;
    public static java.sql.Connection getKoneksi(){
        if (connection == null){
            try{
                String url = "jdbc:mysql://localhost:3306/tugasjdbc";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil");
            }catch (Exception e){
                System.out.println("Koneksi Gagal / Error");
            }
        }
        return connection;
    }
    
    public static void main(String args[]){
        getKoneksi();
    }
}