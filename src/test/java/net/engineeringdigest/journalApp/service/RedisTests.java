package net.engineeringdigest.journalApp.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@SpringBootTest
public class RedisTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisConnectionFactory connectionFactory;

    // Keeping this mock so your application context loads successfully
    @MockitoBean
    private JavaMailSender javaMailSender;

    @Disabled
    @Test
    void testCliConnection(){

        redisTemplate.opsForValue().set("email", "t2@gmail.com");

        Object salary = redisTemplate.opsForValue().get("salary");

//        System.out.println("JAVA IS CONNECTED TO: " + connectionFactory.toString());

        System.out.println("====== FRESH FETCH: " + salary + " ======");

    }
}