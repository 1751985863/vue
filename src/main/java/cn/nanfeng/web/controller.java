package cn.nanfeng.web;

import cn.nanfeng.domain.User;
import cn.nanfeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/vuejsDemo/user")
public class controller {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll.do")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/findById.do")
    public User findId(Integer id){
        return  userService.findById(id);
    }
    @RequestMapping("/update.do")
    public void update(@RequestBody User user){
        userService.update(user);
    }



}
