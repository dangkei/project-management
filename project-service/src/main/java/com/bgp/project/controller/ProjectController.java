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
import com.bgp.project.entity.Project;
import com.bgp.project.entity.WorkLoad;
import com.bgp.project.service.ProjectService;
import com.bgp.project.service.WorkLoadService;

/**
 * @author Administrator

 */
@RestController
@RequestMapping("/project")
public class ProjectController {
		
	@Autowired 
	ProjectService projectService;
	@Autowired 
	WorkLoadService workLoadService;
	
	@RequestMapping("/create")
	public String create(String strProject,String strWorkLoad) {
		
		Project project = new Project();
		project = JSONObject.parseObject(strProject,project.getClass());
		WorkLoad workLoad = new WorkLoad();
		workLoad = JSONObject.parseObject(strWorkLoad,workLoad.getClass());
		int id = projectService.insert(project);
		//workLoadService
		return "ok";
	}
	
	
	@RequestMapping("/selectOne")
	public Project selectOne(String id) {	
		
		return projectService.selectOne(id);
	}
	
	@RequestMapping("/update")
	public String update(String project,String workLoad) {
		
		Project entity = new Project();
		entity = JSONObject.parseObject(project,entity.getClass());
		WorkLoad workload = new WorkLoad();
		workload = JSONObject.parseObject(workLoad,workload.getClass());
		projectService.update(entity);
		return "ok";
	}
	
	@RequestMapping("/deleteBatch")
	public int deleteBatch(String ids) {	
		;
		return projectService.deleteBatch(ids);
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
