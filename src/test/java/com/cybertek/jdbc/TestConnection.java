package com.cybertek.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    @Test
    public void connectionTest(){
        System.out.println("Testing connection");
        String connectionStr = "jdbc:oracle:thin:@54.236.43.105:1521:XE";
        String username = "hr";
        String password = "hr";

        // GETTING DATABASE CONNECTION TO THE SERVER
        //
        try {
            Connection conn = DriverManager.getConnection(connectionStr,username,password);
            System.out.println("CONNECTION Successful!!");
        } catch (SQLException throwables) {
            System.err.println("CONNECTION WAS NOT SUCCESSFUL \n" + throwables.getMessage());
        }
    }

}
