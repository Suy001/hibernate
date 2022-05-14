package com.suy.controller;

import com.suy.entity.Product;
import com.suy.entity.User;
import com.suy.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author suy
 */
@Api(tags = "用户信息管理")
@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;


    @ApiOperation("根据userId获取用户信息")
    @GetMapping("/getUser/{userId}")
    public Map<String,Object> getUser(
            @ApiParam(value = "用户id",required = true)
            @PathVariable String userId
    ){
       log.info("userId: " + userId);

        List<Object[]> userInfos = userService.findUserInfoById("1");
        for (Object[] userInfo : userInfos) {
            System.out.println(userInfo);
        }
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("userInfo",userInfos);

        return resultMap;
    }

    @ApiOperation("根据userId更改用户信息")
    @PutMapping("/updateUser")
    public Map<String,Object> updateUser(
            @ApiParam(value = "用户实体类",required = true)
            @RequestBody User user
    ){
        log.info("userId: " + user);

        Integer result = userService.updateUserInfoByUserId(user.getId(), user.getAge(), user.getName());
        HashMap<String, Object> resultMap = new HashMap<>();
        if(result > 0){
            resultMap.put("更改成功",result);
        }



        return resultMap;
    }

    @ApiOperation("保存用户信息")
    @PostMapping("/saveUser")
    public Map<String,Object> saveUser(
            @ApiParam(value = "用户实体类",required = true)
            @RequestBody User user
    ){
        log.info("userId: " + user);

        User user1 = userService.save(user);
        HashMap<String, Object> resultMap = new HashMap<>();
        if(user1 != null){
            resultMap.put("添加成功",user1);
        }



        return resultMap;
    }

    @ApiOperation("根据userId删除用户信息")
    @DeleteMapping("/deleteUser/{userId}")
    public Map<String,Object> deleteUser(
            @ApiParam(value = "用户Id",required = true)
            @PathVariable String userId
    ){

        Integer result = userService.deleteUserInfoById(userId);
        HashMap<String, Object> resultMap = new HashMap<>();
        if(result > 0){
            resultMap.put("删除成功",result);
        }



        return resultMap;
    }



}
