package com.scs.web.blog.dao.impl;

import com.scs.web.blog.factory.DaoFactory;
import com.scs.web.blog.dao.StudentDao;
import com.scs.web.blog.entity.Student;
import com.scs.web.blog.service.StudentService;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = DaoFactory.getStudentDaoInstance();
    @Override
    public List<Student> listStudents(){
        List<Student> studentList = null;
        try {
            studentList = studentDao.selectAll();
        }catch (SQLException e){
            System.err.println("查询所有学生出现的异常");
        }
        return studentList;
    }
}
