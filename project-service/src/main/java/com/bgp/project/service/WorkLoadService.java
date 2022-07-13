package com.bgp.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bgp.project.entity.WorkLoad;
import com.bgp.project.mapper.WorkLoadMapper;
/*
 * 操作工作量服务
 * */
@Service
public class WorkLoadService extends ServiceImpl<WorkLoadMapper,WorkLoad>{

	
	@Autowired
	WorkLoadMapper workLoadMapper;

	public int insert(WorkLoad workLoad) {
		return workLoadMapper.insert(workLoad);
	}
	
	public int updateOne(WorkLoad workLoad) {
		return workLoadMapper.updateById(workLoad);
	}

	public WorkLoad selectOne(long id) {
		return workLoadMapper.selectById(id);
	}
	
	public WorkLoad getOneByProjectId(long projectId) {
		QueryWrapper<WorkLoad> wraper = new QueryWrapper<>();
		wraper.eq("project_id", projectId);
		WorkLoad workload = workLoadMapper.selectOne(wraper);
		//System.out.println(workload.getDesignDataArea());
		return workload;
	}
}
