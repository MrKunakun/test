package cn.kunakun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.kunakun.common.Flexigrid;
import cn.kunakun.common.Result;
import cn.kunakun.domain.User;
import cn.kunakun.service.UserService;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author: 杨坤
 * @date: 2017年8月23日 下午9:06:21
 */
@RestController("user")
public class UserController
{
    @Autowired
    private UserService userService;
    
    @GetMapping("/")
    public Result page(Flexigrid flexigrid)
    {
        return userService.page(flexigrid);
    }
    
    @PostMapping
    public void add(@RequestBody User user)
    {
        userService.add(user);
    }
}
