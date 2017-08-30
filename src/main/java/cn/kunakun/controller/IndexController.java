package cn.kunakun.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * @ClassName: IndexController 
 * @Description: TODO
 * @author: 杨坤
 * @date: 2017年8月23日 下午4:29:52  
 */
@Controller("index")
public class IndexController
{
    @RequestMapping(method=RequestMethod.GET)
    public String index(Map<String, Object> map){
        map.put("username", "杨坤");
        return "user-list";
        
    }
}
