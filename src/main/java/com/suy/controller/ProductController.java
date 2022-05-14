package com.suy.controller;

import com.suy.entity.Product;
import com.suy.entity.User;
import com.suy.service.ProductService;
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
@Api(tags = "产品信息管理")
@RestController
@RequestMapping("/api")
@Slf4j
public class ProductController {

    @Resource
    private ProductService productService;




    @ApiOperation("保存产品信息")
    @PostMapping("/saveProduct")
    public Map<String,Object> saveProduct(
            @ApiParam(value = "商品信息",required = true)
            @RequestBody Product product
    ){


        Product p = productService.save(product);
        HashMap<String, Object> resultMap = new HashMap<>();
        if(p != null){
            resultMap.put("添加成功",p);
        }



        return resultMap;
    }

}
