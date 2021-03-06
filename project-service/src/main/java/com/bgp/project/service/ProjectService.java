/**
 * 
 */
package com.bgp.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bgp.common.vo.DataTable;
import com.bgp.project.entity.Project;
import com.bgp.project.mapper.ProjectMapper;

/**
 * @author Administrator
 *
 */
@Service
public class ProjectService extends ServiceImpl<ProjectMapper, Project> {

	public int insert(Project project) {
		return getBaseMapper().insert(project);
	}

	public int deleteBatch(String ids) {
		if (StringUtils.isBlank(ids)) {
			return -1;
		}
		List<String> list = new ArrayList<String>();
		list = JSONObject.parseArray(ids, String.class);
		return getBaseMapper().deleteBatchIds(list);
	}

	public int update(Project project) {
		return getBaseMapper().updateById(project);
	}

	public Project selectOne(String id) {
		return getBaseMapper().selectById(id);
	}

	public int deleteBatch1(String ids) {
		StringBuilder sb = new StringBuilder(ids);
		sb.deleteCharAt(0).deleteCharAt(sb.length() - 1);
		return getBaseMapper().deleteBatchIds(null); // projectMapper.deleteBatch(sb.toString());
	}

	public int updateOne(Project report) {
		return getBaseMapper().updateById(report);
	}

	public Project selectOne(int id) {
		return getBaseMapper().selectById(id);
	}

	public List<Project> getProjectList(int page, int limit) {
		return getBaseMapper().selectList(null);
	}

	public DataTable getProjectListByPage(int page, int limit) {
		// EntityWrapper<Project> wrapper1 = new EntityWrapper<Project>;
		QueryWrapper<Project> wrapper = new QueryWrapper<>();
		wrapper.orderByDesc("create_time");
		wrapper.isNotNull("id");
		Page<Project> oPage = new Page<>(page, limit);
		Page<Project> result = getBaseMapper().selectPage(oPage, wrapper);
		DataTable table = new DataTable();
		table.setCount(result.getTotal());
		Object[] data = result.getRecords().toArray();
		table.setData(data);
		return table;
	}

	public DataTable getProjectApplyByPage(int page, int limit) {
		// EntityWrapper<Project> wrapper1 = new EntityWrapper<Project>;
		QueryWrapper<Project> wrapper = new QueryWrapper<>();
		wrapper.orderByDesc("create_time");
		wrapper.isNotNull("id");
		Page<Project> oPage = new Page<>(page, limit);
		Page<Project> result = getBaseMapper().selectPage(oPage, wrapper);
		DataTable table = new DataTable();
		table.setCount(result.getTotal());
		Object[] data = result.getRecords().toArray();
		table.setData(data);
		return table;
	}
}
