package cn.kunakun.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: User
 * @Description: TODO
 * @author: 杨坤
 * @date: 2017年8月23日 下午9:02:24
 */
public class User implements Serializable
{
    private String id;
    
    private String username;
    
    private String password;
    
    public User()
    {
        super();
    }
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
}
