/**
 * 
 */
package com.bgp.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.bgp.common.page.DataTable;
import com.bgp.project.bean.Project;
import com.bgp.project.service.ProjectService;

/**
 * @author Administrator

 */
@RestController
@RequestMapping("/project")
public class ProjectController {
		
	@Autowired 
	ProjectService projectService;
	
	@RequestMapping("/create")
	public String create(String info) {
		
		Project entity = new Project();
		entity = JSONObject.parseObject(info,entity.getClass());
		projectService.insert(entity);
		return "ok";
	}
	
	@RequestMapping("/list")
	public List<Project> listAll(){
		return projectService.list();
	}
	
	@RequestMapping("/getProjectListByPage")
	public DataTable getProjectListByPage(int page,int limit) {
		return projectService.getProjectListByPage(page, limit);
	}
}
