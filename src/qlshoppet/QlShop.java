/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlshoppet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author NGUYEN CHI HIEU
 */
public class QlShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello Tấn");
    }
    
 
public class jdbcHelpme {
    static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
    static String connectionUrl = 
            "jdbc:sqlserver://localhost:1433;databaseName=hieuncpc05888_DUMau;"
                    + "user=sa;"
                    + "password=098098;"
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
            PreparedStatement stmt=jdbcHelpme.getStmt(sql,args);
            return stmt.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
    //values
    public static Object value(String sql,Object...args){
        try {
            ResultSet rs=jdbcHelpme.query(sql, args);
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
            PreparedStatement stmt=jdbcHelpme.getStmt(sql, args);
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

}
