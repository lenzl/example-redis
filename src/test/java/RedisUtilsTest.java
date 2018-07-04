import com.example.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p></p>
 *
 * @author zl
 * @version 1.0.0
 * @date 2017-12-15 22:15
 * <p>
 * Copyright (c) 2017, www.isuperu.com All Rights Reserved.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-redis.xml")
public class RedisUtilsTest {

    @Autowired
    private RedisUtils redisUtils;

    @Test
    public void set(){

        redisUtils.set("city","上海");

//        redisUtils.set("code","123456",10);
        
    }

    @Test
    public void get(){
        
        System.out.println(redisUtils.exists("code"));

    }


    
}
