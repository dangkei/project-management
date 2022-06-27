package com.bgp.project.bean;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bgp.common.annotation.Table;
import com.bgp.project.enums.ConstructionEnum;
import com.bgp.project.enums.ExplorationEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
@Table("tb_Project")
@TableName("tb_Project")
public class Project implements Serializable {
	@TableId(type = IdType.AUTO)
	private Long id;
	
	@TableField("project_name")
	private String projectName;
	@TableField("construction_method")
	private ConstructionEnum constructionMethod;
	@TableField("exploration_method")
	private ExplorationEnum explorationMethod;
	@TableField("team_name")
	private String teamName;
	@TableField("country")
	private String country;
	@TableField("country_code")
	private String countryCode;
	@TableField("client_name")
	private String clientName;
	@TableField("longitude")
	private double longitude;
	@TableField("dimension")
	private double dimension;	
	@TableField("planed_start_date")
	private String planedStartDate;
	@TableField("planed_end_date")
	private String planedEndDate;
	@TableField("iskey_program")
	private boolean iskeyProgram;
	@TableField("project_status")
	private String projectStatus;
	
}
