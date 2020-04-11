package cn.nanfeng.test;


import cn.nanfeng.domain.User;
import cn.nanfeng.service.UserService;
import cn.nanfeng.startapplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = startapplication.class)
public class UserTest {
    @Autowired
    UserService userService;
    @Test
    public void test(){
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }
    @Test
    public void test1(){
        User byId = userService.findById(2);
        System.out.println(byId);
    }
    @Test
    public void test2(){
        User byId = userService.findById(2);
        byId.setUsername("王天霸");
        userService.update(byId);
    }
}
