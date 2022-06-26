package com.bgp.project.bean;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bgp.common.annotation.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
@Table("tb_Project")
@TableName("tb_Project")
public class Project {
	@TableId(type = IdType.AUTO)
	private long id;
	
	private String project_name;
	private String construction_method;
	private String exploration_method;
	private String team_name;
	private String country;
	private String country_code;
	private String client_name;
	private double longitude;
	private double dimension;	
	private Date planed_start_date;
	private Date planed_end_date;
	private boolean iskey_program;
	
}
