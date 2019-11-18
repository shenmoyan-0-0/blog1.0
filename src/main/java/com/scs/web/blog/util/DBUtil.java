package com.scs.web.blog.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
/**
 * 数据库操作工具类
 */
public class DBUtil {

    public static String URL;
    public static String USERNAME;
    public static String PASSWORD;
    private static Connection conn = null;
    private static final Logger logger = LoggerFactory.getLogger(DBUtil.class);

    private static ResourceBundle rb = ResourceBundle.getBundle("db-config");

    private DBUtil() {
    }

    // 使用静态块加载驱动程序，只执行一次
    static {
        URL = rb.getString("jdbc.url");
        USERNAME = rb.getString("jdbc.username");
        PASSWORD = rb.getString("jdbc.password");
        String driver = rb.getString("jdbc.driver");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 定义一个获取数据库连接的方法
    public static Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                logger.error(LocalDateTime.now() + "获取失败");
            }
        }
        return conn;
    }

    // 关闭数据库连接
    public static void close(ResultSet rs, Statement stat, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stat != null) {
                stat.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connection connection = null;
        for (int i = 0; i < 3; i++) {
            connection = DBUtil.getConnection();
        }
    }
}