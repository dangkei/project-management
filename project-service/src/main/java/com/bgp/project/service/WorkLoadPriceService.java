/**
 * 
 */
package com.bgp.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bgp.project.entity.WorkLoad;
import com.bgp.project.entity.WorkLoadPrice;
import com.bgp.project.mapper.WorkLoadMapper;
import com.bgp.project.mapper.WorkLoadPriceMapper;

/**
 * @author Administrator
 *
 */
@Service
public class WorkLoadPriceService extends ServiceImpl<WorkLoadPriceMapper, WorkLoadPrice> {
		
	public WorkLoadPrice getOneByProjectId(long projectId) {
		QueryWrapper<WorkLoadPrice> wraper = new QueryWrapper<>();
		wraper.eq("project_id", projectId);
		WorkLoadPrice workload = getBaseMapper().selectOne(wraper);
		//System.out.println(workload.getDesignDataArea());
		return workload;
	}

}
