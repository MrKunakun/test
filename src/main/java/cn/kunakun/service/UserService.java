package cn.kunakun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kunakun.common.Flexigrid;
import cn.kunakun.common.Result;
import cn.kunakun.domain.User;
import cn.kunakun.mapper.BaseMapper;

/** 
 * @ClassName: UserService 
 * @Description: TODO
 * @author: 杨坤
 * @date: 2017年8月29日 下午3:32:46  
 */
@Service
public class UserService
{
    @Autowired
    private BaseMapper baseMapper;

     /**
         * 用户分页
         * 
         * @author 杨坤 2017年8月29日
         * @return
         */
    public Result page(Flexigrid flexigrid)
    {
        Result result = new Result();
        List list = baseMapper.getList("cn.kunakun.service.UserService.page", flexigrid);
        flexigrid.setTotal(list.size());
        flexigrid.setRows(list);
        result.setResultCode(1);
        result.setMsg("success");
        result.setRecord(flexigrid);
        return result;
    }

     /**
         * 添加用户 
         * 
         * @author 杨坤 2017年8月29日
         * @param user
         */
    public void add(User user)
    {
        
    }
    
}
