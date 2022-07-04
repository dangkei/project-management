package com.bgp.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.bgp.common.page.DataTable;
import com.bgp.report.entity.DailyReport;
import com.bgp.report.service.DailyReportService;

@RestController
public class ReportController {

	@Autowired
	DailyReportService reportService;
	
	/*
	 * 增加日报
	 * */
	@RequestMapping("/report/create")
	public String createReport(String obj) {
		DailyReport report = new DailyReport();
		report = JSONObject.parseObject(obj,report.getClass());
		reportService.insert(report);
		return "ok";
	}
	/*
	 * 删除日报
	 * */
	@RequestMapping("/report/deleteBatch")
	public int deleteReportBatch(String ids) {		
		return reportService.deleteBatch(ids);
	}
	@RequestMapping("/report/updateOne")
	public String updateReport(String obj) {
		DailyReport report = new DailyReport();
		report = JSONObject.parseObject(obj,report.getClass());
		reportService.updateOne(report);
		return "ok";
	}
	@RequestMapping("/report/selectOne")
	public DailyReport selectOne(int id) {
		//String[] arrIds = ids.split(",");
		DailyReport data = reportService.selectOne(id);
		return data;
	}
	
	@RequestMapping("/report/getReportListByPage")
	public DataTable getReportListByPage(@RequestParam int page,@RequestParam int limit){
		return reportService.getReportListByPage(page, limit);
	}
}
