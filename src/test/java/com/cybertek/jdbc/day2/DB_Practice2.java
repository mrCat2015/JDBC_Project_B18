package com.cybertek.jdbc.day2;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Practice2 {
    public static void main(String[] args) throws SQLException {

        DB_Utility.createConnection();
        ResultSet rs = DB_Utility.runQuery("SELECT * FROM REGIONS");


        DB_Utility.displayAllData();

        //rs.absolute(2);
        DB_Utility.displayAllData();







    }
}
