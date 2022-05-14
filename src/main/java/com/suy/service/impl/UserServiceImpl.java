package com.suy.service.impl;

import com.suy.entity.Product;
import com.suy.entity.User;
import com.suy.repository.UserRepository;
import com.suy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author suy
 */
@Service
public class UserServiceImpl implements UserService {


    @Resource
    private UserRepository userRepository;



    @Override
    public List<Object[]> findUserInfoById(String id) {
        return userRepository.findUserInfoById(id);
    }

    @Override
    public Integer updateUserInfoByUserId(String userId, String userAge, String userName) {
        return userRepository.updateUserInfoByUserId(userId,userAge,userName);
    }

    @Override
    public User save(User entity) {
        return userRepository.save(entity);
    }


    @Override
    public Integer deleteUserInfoById(String userId) {
        return userRepository.deleteUserInfoById(userId);
    }
}
