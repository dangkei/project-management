/**
 * 
 */
package com.bgp.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bgp.common.page.DataTable;
import com.bgp.project.bean.Project;
import com.bgp.project.mapper.ProjectMapper;

/**
 * @author Administrator
 *
 */
@Service
public class ProjectService extends ServiceImpl<ProjectMapper,Project>{
	@Autowired
	ProjectMapper projectMapper;
	
	public int insert(Project project) {
		return projectMapper.insert(project);
	}
	
	public int deleteBatch(String ids) {
		StringBuilder sb = new StringBuilder(ids);
		sb.deleteCharAt(0).deleteCharAt(sb.length()-1);
		return projectMapper.deleteBatchIds(null); //projectMapper.deleteBatch(sb.toString());
	}
	
	public int updateOne(Project report) {
		return projectMapper.updateById(report);
	}
	
	public Project selectOne(int id) {
		return  projectMapper.selectById(id);
	}
	
	public List<Project> getProjectList(int page,int limit){
		return projectMapper.selectList(null);
	}
	
	public DataTable getProjectListByPage(int page,int limit){
		DataTable table = new DataTable();
		//table.setCount(projectMapper.count(null));
		//Object[] data = projectMapper.getReportListByPage(page, limit).toArray();
		//table.setData(data);
		return table;
	}
	
}
