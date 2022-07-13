/**
 * 
 */
package com.bgp.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.bgp.common.vo.DataTable;
import com.bgp.project.entity.Project;
import com.bgp.project.entity.ProjectForm;
import com.bgp.project.entity.WorkLoad;
import com.bgp.project.entity.WorkLoadPrice;
import com.bgp.project.service.ProjectService;
import com.bgp.project.service.WorkLoadPriceService;
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
	@Autowired 
	WorkLoadPriceService workLoadPriceService;
	
	@RequestMapping("/create")
	public String create(String strProject,String strWorkLoad,String strWorkLoadPrice) {
		
		Project project = new Project();
		project = JSONObject.parseObject(strProject,project.getClass());
		
		projectService.insert(project); //先保存project 保存成功后才会生成projectId
		
		WorkLoad workLoad = new WorkLoad();
		workLoad = JSONObject.parseObject(strWorkLoad,workLoad.getClass());
		workLoad.setProjectId(project.getId());
		WorkLoadPrice workLoadPrice = new WorkLoadPrice();
		workLoadPrice = JSONObject.parseObject(strWorkLoadPrice,workLoadPrice.getClass());
		workLoadPrice.setProjectId(project.getId());
		
		workLoadService.save(workLoad);
		workLoadPriceService.save(workLoadPrice);
		return "ok";
	}
	
	
	@RequestMapping("/selectOne")
	public Project selectOne(String id) {	
		
		return projectService.selectOne(id);
	}
	
	@RequestMapping("/projectDetail")
	public ProjectForm getFormData(String id) {	
		ProjectForm form = new ProjectForm();
		Project project = projectService.selectOne(id);
		form.setProject(project);
		form.setWorkLoad(workLoadService.getOneByProjectId(project.getId()));
		form.setWorkLoadPrice(workLoadPriceService.getOneByProjectId(project.getId()));
		return form ;
	}
	
	@RequestMapping("/update")
	public String update(String strProject,String strWorkLoad,String strWorkLoadPrice) {
		
		Project project = new Project();
		project = JSONObject.parseObject(strProject,project.getClass());
		WorkLoad workload = new WorkLoad();
		workload = JSONObject.parseObject(strWorkLoad,workload.getClass());
		WorkLoadPrice workloadPrice = new WorkLoadPrice();
		workloadPrice = JSONObject.parseObject(strWorkLoadPrice,workloadPrice.getClass());
		workloadPrice.setProjectId(project.getId());
		projectService.update(project);
		workLoadService.updateById(workload);
		workLoadPriceService.updateById(workloadPrice);
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
