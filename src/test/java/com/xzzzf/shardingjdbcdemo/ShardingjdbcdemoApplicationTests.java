package com.xzzzf.shardingjdbcdemo;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xzzzf.shardingjdbcdemo.entity.Course;
import com.xzzzf.shardingjdbcdemo.entity.Udict;
import com.xzzzf.shardingjdbcdemo.entity.User;
import com.xzzzf.shardingjdbcdemo.mapper.CourseMapper;
import com.xzzzf.shardingjdbcdemo.mapper.UdictMapper;
import com.xzzzf.shardingjdbcdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;
import java.util.Random;

@SpringBootTest
public class ShardingjdbcdemoApplicationTests {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UdictMapper udictMapper;

    @Test
    public void addCourse(){
        for (int i = 0; i <= 50;i ++) {
            Course course = new Course();
            course.setCname("java" + i);
            course.setUserId(100L);
            course.setCstatus("Normal" + i);
            courseMapper.insert(course);
        }
    }

    @Test
    public void findCourse(){
        LambdaQueryWrapper<Course> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Course::getCid,861369090822897664L);
        Course course = courseMapper.selectOne(wrapper);
        System.out.println(course);
    }

    @Test void addCourse2(){
        for (int i = 0; i <= 50;i ++) {
            Course course = new Course();
            course.setCname("java" + i);

            Random random = new Random();
            long randomLong = random.nextLong();

            course.setUserId(Math.abs(randomLong));
            course.setCstatus("Normal" + i);

            courseMapper.insert(course);
        }
    }

    @Test
    public void findCourse2(){
        LambdaQueryWrapper<Course> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Course::getCid,861403227466235905L).eq(Course::getUserId, 7717159271687556051L);
        Course course = courseMapper.selectOne(wrapper);
        System.out.println(course);
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setUsername("lucy");
        user.setUstatus("a");
        userMapper.insert(user);
    }

    @Test
    public void findUser(){
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUserId, 861432886434201601L);
        User user = userMapper.selectOne(wrapper);
        System.out.println(user);
    }

    // 测试公共表
    @Test
    public void addDict(){
        Udict udict = new Udict();
        udict.setUstatus("a");
        udict.setUvalue("已启用");
        udictMapper.insert(udict);
    }

}
