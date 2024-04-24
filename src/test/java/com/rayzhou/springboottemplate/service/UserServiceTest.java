package com.rayzhou.springboottemplate.service;

import com.rayzhou.springboottemplate.model.dto.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import javax.annotation.Resource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUserAccount("123456");
        user.setUserPassword("1234");
        user.setUnionId("asdasdad");
        user.setMpOpenId("0");
        user.setUserName("rayzhou");
        user.setUserAvatar("asdasdad");
        user.setUserProfile("asdasdad");
        user.setUserRole("admin");
        boolean result = userService.save(user);
        Assertions.assertTrue(result);

    }
}
