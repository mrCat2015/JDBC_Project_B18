package com.cybertek.jdbc.day2;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Practice {
    public static void main(String[] args) {

        DB_Utility.createConnection();
        ResultSet rs  = DB_Utility.runQuery("SELECT * FROM REGIONS");




            try {
                while(rs.next()){
                System.out.println(rs.getString(1) + " "+ rs.getString(2));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }



    }
}
