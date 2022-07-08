package com.bgp.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bgp.project.entity.WorkLoad;
import com.bgp.project.mapper.WorkLoadMapper;

@Service
public class WorkLoadService extends ServiceImpl<WorkLoadMapper,WorkLoad>{

	@Autowired
	WorkLoadMapper workLoadMapper;

	public int insert(WorkLoad workLoad) {
		return workLoadMapper.insert(workLoad);
	}

}
