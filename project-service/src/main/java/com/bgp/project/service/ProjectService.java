/**
 * 
 */
package com.bgp.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bgp.common.page.DataTable;
import com.bgp.project.entity.Project;
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
		if(StringUtils.isBlank(ids)) {
			return -1;
		}
		List<String> list = new ArrayList<String>();
		list = JSONObject.parseArray(ids,String.class);
		return projectMapper.deleteBatchIds(list);
	}
	
	public int update(Project project) {
		return projectMapper.updateById(project);
	}
	
	public Project selectOne(String id) {
		return projectMapper.selectById(id);
	}
	
	public int deleteBatch1(String ids) {
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
		QueryWrapper<Project> wrapper = new QueryWrapper<>();
	    wrapper.isNotNull("id");
	    Page<Project> oPage = new Page<>(page,limit);
	    Page<Project> result = projectMapper.selectPage(oPage, wrapper);
		DataTable table = new DataTable();
		table.setCount(result.getTotal());
		Object[] data = result.getRecords().toArray();
		table.setData(data);
		return table;
	}
	
}
