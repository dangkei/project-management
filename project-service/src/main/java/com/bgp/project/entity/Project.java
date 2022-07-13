package com.bgp.project.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bgp.common.annotation.Table;
import com.bgp.common.entity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
@Table("tb_Project")
@TableName("tb_Project")
public class Project extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//@TableId(type = IdType.AUTO)
	//private Long id;
	
	@TableField("project_name")
	private String projectName;
	@TableField("construction_method")
	private String constructionMethod;
	@TableField("exploration_method")
	private String explorationMethod;
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
	private String keyProgram;
	@TableField("project_status")
	private String projectStatus;

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the constructionMethod
	 */
	public String getConstructionMethod() {
		return constructionMethod;
	}
	/**
	 * @param constructionMethod the constructionMethod to set
	 */
	public void setConstructionMethod(String constructionMethod) {
		this.constructionMethod = constructionMethod;
	}
	/**
	 * @return the explorationMethod
	 */
	public String getExplorationMethod() {
		return explorationMethod;
	}
	/**
	 * @param explorationMethod the explorationMethod to set
	 */
	public void setExplorationMethod(String explorationMethod) {
		this.explorationMethod = explorationMethod;
	}
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}
	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}
	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the dimension
	 */
	public double getDimension() {
		return dimension;
	}
	/**
	 * @param dimension the dimension to set
	 */
	public void setDimension(double dimension) {
		this.dimension = dimension;
	}
	/**
	 * @return the planedStartDate
	 */
	public String getPlanedStartDate() {
		return planedStartDate;
	}
	/**
	 * @param planedStartDate the planedStartDate to set
	 */
	public void setPlanedStartDate(String planedStartDate) {
		this.planedStartDate = planedStartDate;
	}
	/**
	 * @return the planedEndDate
	 */
	public String getPlanedEndDate() {
		return planedEndDate;
	}
	/**
	 * @param planedEndDate the planedEndDate to set
	 */
	public void setPlanedEndDate(String planedEndDate) {
		this.planedEndDate = planedEndDate;
	}

	/**
	 * @return the projectStatus
	 */
	public String getProjectStatus() {
		return projectStatus;
	}
	/**
	 * @param projectStatus the projectStatus to set
	 */
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	/**
	 * @return the keyProgram
	 */
	public String getKeyProgram() {
		return keyProgram;
	}
	/**
	 * @param keyProgram the keyProgram to set
	 */
	public void setKeyProgram(String keyProgram) {
		this.keyProgram = keyProgram;
	}

	
	
}
