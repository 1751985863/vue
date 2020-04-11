package cn.nanfeng.dao;

import cn.nanfeng.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select * from user")
    List<User> findAll();
    @Select("select * from user where id=#{userId}")
    User findById(Integer userId);
    @Update("update user set username=#{username},password=#{password},age=#{age},username=#{username},email=#{email},sex=#{sex} where id=#{id}")
    void update(User user);
}
