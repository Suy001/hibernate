package com.suy.repository;

import com.suy.entity.Product;
import com.suy.entity.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author suy
 */

public interface UserRepository extends JpaRepository<User,Serializable> {

    @Query(value = "SELECT user_info.user_name  FROM `user_info` where user_id > ?1", nativeQuery = true)
    List<Object[]> findUserInfoById(String  id);

    @Modifying
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Query(value = "UPDATE user_info SET user_name = ?3, user_age = ?2 WHERE user_id = ?1" , nativeQuery = true)
    Integer updateUserInfoByUserId(String userId, String userAge,
                                        String userName);


    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    User save(User entity) ;

    @Modifying
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Query(value = "DELETE FROM user_info WHERE user_id= ?1", nativeQuery = true)
    Integer deleteUserInfoById(String userId);


}
