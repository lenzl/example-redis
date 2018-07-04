import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * <p></p>
 *
 * @author zl
 * @version 1.0.0
 * @date 2017-10-26 15:02
 * <p>
 * Copyright (c) 2017, www.isuperu.com All Rights Reserved.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-redis.xml")
public class RedisTest {
    
    @Resource(name="redisTemplate")
    private RedisTemplate<String, String> template;

    @Resource(name="stringRedisTemplate")
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void StringSetTest(){

        template.opsForValue().set("age","20");

    }

    @Test
    public void testSaveAndGet(){
        ValueOperations<String, String> valueOperation = template.opsForValue();
        valueOperation.set("user", "admin");

        String result = (String) valueOperation.get("user" );
        System.out.println("name: " + result);

    }

    @Test
    public void StringGetTest(){

        String value =  template.opsForValue().get("age");

//        String value = stringRedisTemplate.opsForValue().get("city");
        System.out.println(value);

    }
}
