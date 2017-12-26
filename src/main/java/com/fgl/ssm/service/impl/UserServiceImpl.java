package com.fgl.ssm.service.impl;

import com.fgl.ssm.dao.UserDao;
import com.fgl.ssm.model.User;
import com.fgl.ssm.service.UserService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(rollbackFor = Exception.class)

public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }

    @Override
    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone, state);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }
}
