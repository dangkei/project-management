package com.bgp.project;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bgp.project.bean.Project;
import com.bgp.project.mapper.ProjectMapper;

@SpringBootTest
class ProjectServiceApplicationTests {
	
	@Autowired
	ProjectMapper projectMapper;

    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test 测试查询所有用户方法 ------"));
        //selectList 的参数wrapper 是条件构造器，可以先写null
        List<Project> userList = projectMapper.selectList(null);
        //forEach 的参数是 Consumer类型的 语法糖
        userList.forEach(System.out::println);

    }

}
