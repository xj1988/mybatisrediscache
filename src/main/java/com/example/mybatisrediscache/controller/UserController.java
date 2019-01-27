package com.example.mybatisrediscache.controller;

import com.example.mybatisrediscache.pojo.User;
import com.example.mybatisrediscache.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Api(value = "/user", description = "对user的操作")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "查询用户",notes = "根据ID查询用户")
    @ApiImplicitParam(name="id", value ="编号", required = true, paramType = "path")
    @GetMapping("/getUser/{id}")
    public Object getUser(@PathVariable String id){
        return userService.selectByPrimaryKey(id);
    }

    @ApiOperation(value = "删除用户",notes = "根据ID删除用户")
    @ApiImplicitParam(name="id", value ="编号", required = true, paramType = "path")
    @DeleteMapping("/deleteUser/{id}")
    public Object deleteUser(@PathVariable String id){
        return userService.deleteByPrimaryKey(id);
    }

    @ApiOperation(value = "插入用户",notes = "根据信息更插入用户")
    @ApiImplicitParam(name="user", value ="用户实体", required = true, dataType = "User")
    @PutMapping("/createUser")
    public Object createUser(@RequestBody User user){
        return userService.insertSelective(user);
    }

    @ApiOperation(value = "更新用户",notes = "根据信息更更新用户")
    @ApiImplicitParam(name="user", value ="用户实体", required = true, dataType = "User")
    @PostMapping("/updateUser")
    public Object updateUser(@RequestBody User user){
        return userService.updateByPrimaryKeySelective(user);
    }

}
