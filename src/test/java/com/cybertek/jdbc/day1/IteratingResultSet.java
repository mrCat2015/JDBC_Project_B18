package com.cybertek.jdbc.day1;

import java.sql.*;

public class IteratingResultSet {

    public static void main(String[] args) throws SQLException {

        String connectionStr = "jdbc:oracle:thin:@54.236.43.105:1521:XE";
        String username = "hr" ;
        String password = "hr" ;
        Connection conn = DriverManager.getConnection(connectionStr,username,password) ;
        Statement stmnt = conn.createStatement();
        ResultSet rs   =   stmnt.executeQuery("SELECT * FROM REGIONS") ;

        // as long as rs.next() return true I know I have next row to print the data
        // we will keep looping as long as rs.next() return true

        while(rs.next()){
            System.out.println(rs.getString("REGION_ID") + " "+ rs.getString("REGION_NAME"));
        }

     /*   rs.next(); // currently we are at the first row


        rs.next();// currently we are at the second row
        System.out.println(rs.getString(1) + " "+ rs.getString(2));

        rs.next(); // currently we are at the 3td row
        System.out.println(rs.getString("REGION_ID") + " "+ rs.getString("REGION_NAME"));

        rs.next();// currently we are at the 4rd row
        System.out.println(rs.getString(1) + " "+ rs.getString(2));

        System.out.println("rs.next() = " + rs.next());

      */



           //while ( rs.next() ){

        rs.close();
        stmnt.close();
        conn.close();








    }

}
