package com.fgl.ssm.dao;

import com.fgl.ssm.model.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017\12\13 0013.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:mybatis/spring-mybatis.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;


    @Test
    public void selectUserById() throws Exception {

        long id = 1;
        User user = userDao.selectUserById(id);
        System.out.println(user);
    }

}