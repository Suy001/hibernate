package com.suy;

import com.sun.org.apache.bcel.internal.generic.IFNULL;
import com.suy.entity.User;
import com.suy.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;

import javax.annotation.Resource;
import java.util.Optional;

@SpringBootTest
class Hibernate051118ApplicationTests {

    @Resource
    private UserRepository userRepository;

    @Test
    void contextLoads() {

//        Iterable<User> all = userRepository.findAll();
//        User user = new User();
//        Example<User> example = Example.of(user);
//        Optional<User> one = userRepository.findOne(example);

//        for (User user : all) {
//            System.out.println(user);
//        }
        if (userRepository != null) {
            
        }

    }

}
