package com.dreamcraft.events;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnection() {

        System.out.println("👉 getConnection() called");

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ JDBC Driver loaded");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/dreamcraftdb",
                "root",
                "Sql@_muskan_@7797"
            );

            System.out.println("✅ Database connected successfully!");

        } catch (Exception e) {
            System.out.println("❌ Database connection error:");
            e.printStackTrace();
        }

        return con;
    }
}
