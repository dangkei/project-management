package com.bgp.report.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bgp.common.page.DataTable;
import com.bgp.report.entity.DailyReport;
import com.bgp.report.mapper.DailyReportMapper;

@Service
public class DailyReportService extends ServiceImpl<DailyReportMapper,DailyReport>{
	@Autowired
	DailyReportMapper reportMapper;
	
	public int insert(DailyReport report) {
		return reportMapper.insert(report);
	}
	
	public int deleteBatch(String ids) {
		StringBuilder sb = new StringBuilder(ids);
		sb.deleteCharAt(0).deleteCharAt(sb.length()-1);
		return reportMapper.deleteBatch(sb.toString());
	}
	
	public int updateOne(DailyReport report) {
		return reportMapper.updateOne(report);
	}
	
	public DailyReport selectOne(int id) {
		return reportMapper.selectOne(id);
	}
	
	public List<DailyReport> getReportList(int page,int limit){
		return reportMapper.getReportList();
	}
	
	public DataTable getReportListByPage(int page,int limit){
		DataTable table = new DataTable();
		//table.setCount(reportMapper.count(null));
		//Object[] data = reportMapper.getReportListByPage(page, limit).toArray();
		//table.setData(data);
		QueryWrapper<DailyReport> wrapper = new QueryWrapper<>();
	    wrapper.isNotNull("id");
	    Page<DailyReport> oPage = new Page<>(page,limit);
	    Page<DailyReport> result = reportMapper.selectPage(oPage, wrapper);
		table.setCount(result.getTotal());
		Object[] data = result.getRecords().toArray();
		table.setData(data);
		return table;
	}
}
