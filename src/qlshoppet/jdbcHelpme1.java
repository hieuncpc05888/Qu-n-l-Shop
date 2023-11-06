/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlshoppet;
import java.sql.*;

/**
 *
 * @author NGUYEN CHI HIEU
 */

public class jdbcHelpme1 {
    public static void main(String[] args) {
        try {
        ResultSet rs=(ResultSet) jdbcHelpme1.query("{call  getAll()}");
            while (rs.next()) {                
                System.out.println(rs.getString("manv"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
    static String connectionUrl = "jdbc:sqlserver://0.tcp.ap.ngrok.io:10857;databaseName=duanmau_fall23;"
                    + "user=sa;"
                    + "password=1234@Spdf;"
                    + "encrypt=true;"
                    + "trustServerCertificate=true;";
    static{
        try {
            Class.forName(driver);
        } catch (Exception e) {
            System.out.println("jdbc helper:"+e);
        }
    }
    public static PreparedStatement getStmt(String sql,Object...args){
            PreparedStatement stmt = null;
        try {
            Connection conn=DriverManager.getConnection(connectionUrl);
            if(sql.trim().startsWith("{")){
                stmt=conn.prepareCall(sql);
            }else{
                stmt=conn.prepareStatement(sql);
            }
            for (int i= 0;i<args.length; i++) {
                stmt.setObject(i+1,args[i]);
            }
        } catch (Exception e) {
            return null;
        }
        return stmt;
    }
    
    // query -> resultset
    public static ResultSet query(String sql,Object...args){
        try {
            PreparedStatement stmt=jdbcHelpme1.getStmt(sql,args);
            return stmt.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
    //values
    public static Object value(String sql,Object...args){
        try {
            ResultSet rs=jdbcHelpme1.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    // update
    public static int update(String sql,Object...args){
        try {
            PreparedStatement stmt=jdbcHelpme1.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            System.out.println("jdbc helper "+e);
            return -1;
        }
    }
}
