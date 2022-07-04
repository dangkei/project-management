package com.bgp.report.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bgp.report.entity.DailyReport;

@Repository
public interface DailyReportMapper extends BaseMapper<DailyReport>{

	 int insert(DailyReport report);
	 
	 int deleteBatch(String ids);
	 
	 int updateOne(DailyReport report);
	 
	 DailyReport selectOne(int id);
	
	 Integer count(DailyReport report);
	 
	 List<DailyReport>  getReportList();
	
	 List<DailyReport>  getReportListByPage(int page, int limit);
	 
	 
}
