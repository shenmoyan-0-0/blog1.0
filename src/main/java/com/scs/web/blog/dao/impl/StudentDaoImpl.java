package com.scs.web.blog.dao.impl;


import com.scs.web.blog.dao.StudentDao;
import com.scs.web.blog.entity.Student;
import com.scs.web.blog.util.DBUtil;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class StudentDaoImpl implements StudentDao {
    @Override
    public int insert(Student student) throws SQLException {
        Connection connection = DBUtil.getConnection();
        connection.setAutoCommit(false);
        String sql = "INSERT INTO t_student VALUES (NULL,?,?,?) ";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, student.getUsername());
        pstmt.setString(2, student.getAvatar());
        pstmt.setTimestamp(3, Timestamp.valueOf(student.getCreateTime()));
        //pstmt.setString(4,student.getIntroduce());
        int n = pstmt.executeUpdate();
        connection.commit();
        pstmt.close();
        connection.close();
        return n;
    }



    @Override
    public int[] batchInsert(List<Student> studentList) throws SQLException{
        Connection connection = DBUtil.getConnection();
        String sql = "INSERT INTO t_student VALUES (NULL,?,?,?,?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        connection.setAutoCommit(false);
        studentList.forEach(student ->{
            try {
                pstmt.setString(1,student.getUsername());
                pstmt.setString(2,student.getAvatar());
                pstmt.setTimestamp(3,Timestamp.valueOf(student.getCreateTime()));
                pstmt.setString(4,student.getIntroduce());
                //预处理事务集添加批处理
                pstmt.addBatch();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

        //执行批处理操作
        int[] result = pstmt.executeBatch();
        //提交
        connection.commit();
        //关闭操作
        pstmt.close();
        connection.close();
        return result;
    }
    @Override

    public List<Student> selectAll() throws SQLException{
       List<Student>studentList = new ArrayList<>();
        Connection connection = DBUtil.getConnection();
         String sql = "SELECT * FROM t student QRDER BY id DESC";
         PreparedStatement psmt = connection.prepareStatement(sql);
         ResultSet rs = psmt.executeQuery();
         while (rs.next()){
             Student student = new Student();
             student.setId(rs.getInt("id"));
             student.setUsername(rs.getString("username"));
             student.setAvatar(rs.getString("avatar"));
             Timestamp timestamp = new Timestamp((System.currentTimeMillis()));
             LocalDateTime localDateTime = timestamp.toLocalDateTime();
             studentList.add(student);
         }
         return studentList;
    }
}