package com.bgp.project;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bgp.project.bean.Project;
import com.bgp.project.mapper.ProjectMapper;

//@RunWith(SpringRunner.class)
@SpringBootTest
class ProjectServiceApplicationTests {
	
	@Autowired
	ProjectMapper projectMapper;

    @Test
    void contextLoads() {
    	QueryWrapper<Project> condition = new QueryWrapper<>();
    	condition.isNotNull("id");//设置一个查询条件，如果不设置返回all
    	
    	//1.返回一个Map类型
    	Page<Map<String,Object>> page = new Page<>(1, 4);
    	projectMapper.selectMapsPage(page, condition);
    	projectMapper.selectMapsPage(page, null);

    	//2. 返回一个Page封装的实体类列表
    	Page<Project> page2 = new Page<>(1, 4);
    	Page<Project> result = projectMapper.selectPage(page2, condition);

    }

}
