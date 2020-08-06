package com.cybertek.jdbc.day1;

import java.io.EOFException;
import java.sql.*;

public class IteratingPractice {

    public static void main(String[] args) throws SQLException {
        /*
        // TASK 1 :
        //  CREATE A NEW CLASS , ADD CONNECTION , STATEMENT , RESULTSET
        // AND TRY TO PRINT OUT EACH AND EVERYTHING UNDER COUNTRIES TABLE
         */

        String connectionStr = "jdbc:oracle:thin:@54.236.43.105:1521:XE";
        String username = "hr";
        String password = "hr";
        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmt = conn.createStatement();
       // ResultSet rs = stmt.executeQuery("SELECT * FROM COUNTRIES WHERE REGION_ID = 1");
        ResultSet rs = stmt.executeQuery("SELECT * FROM COUNTRIES");
        // as long as rs.next() return true I know I have next row to print the data
        // we will keep looping as long as rs.next() return true

        while(rs.next()== true){
            System.out.println(rs.getString("COUNTRY_ID") +" "
                    + rs.getString("COUNTRY_NAME") +" "
                    + rs.getString("REGION_ID")); // this is getting region_id as number instead of String
        }

        rs.previous();

        rs.close();
        stmt.close();
        conn.close();

    }


}
