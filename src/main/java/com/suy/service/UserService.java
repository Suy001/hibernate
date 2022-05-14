package com.suy.service;


import com.suy.entity.Product;
import com.suy.entity.User;

import java.util.List;

/**
 * @author suy
 */

public interface UserService {
    List<Object[]> findUserInfoById(String  id);
    Integer updateUserInfoByUserId(String userId, String userAge,
                                   String userName);
    User save(User entity);
    Integer deleteUserInfoById(String userId);
}
