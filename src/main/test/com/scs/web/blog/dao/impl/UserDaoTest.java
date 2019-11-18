package com.scs.web.blog.dao.impl;

import com.scs.web.blog.dao.ArticleDao;
import com.scs.web.blog.factory.DaoFactory;
import com.scs.web.blog.util.JSoupSpider;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

public class UserDaoTest {

    private UserDao userDao = DaoFactory.getUserDaoInstance();
    private Logger logger = LoggerFactory.getLogger(UserDaoTest.class);
    @Test

        public void batchInsert () throws SQLException {
            int[] i = userDao.batchInsert(JSoupSpider.getUsers());
            if (i.length != 0) {
                System.out.println(i.length);
                logger.info("数据添加成功");
            } else {
                logger.error("用户数据添加失败");
            }

        }


    }