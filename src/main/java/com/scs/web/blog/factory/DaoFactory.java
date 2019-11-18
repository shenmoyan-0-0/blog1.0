package com.scs.web.blog.factory;

import com.scs.web.blog.dao.ArticleDao;
import com.scs.web.blog.dao.StudentDao;

import com.scs.web.blog.dao.impl.ArticleDaoImpl;
import com.scs.web.blog.dao.impl.StudentDaoImpl;
import com.scs.web.blog.dao.impl.UserDao;
import com.scs.web.blog.dao.impl.UserDaoImpl;

public class DaoFactory {
    public static StudentDao getStudentDaoInstance(){ return new StudentDaoImpl(); }

    public static UserDao getUserDaoInstance(){return new UserDaoImpl() ;}

   public static ArticleDao getArticleDaoInstance(){return new ArticleDaoImpl();}

}
