/**
 * 
 */
package com.bgp.project.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bgp.common.annotation.Table;
import com.bgp.common.entity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Feng Huang
 *
 */
@Data
@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
@Table("tb_Workload")
@TableName("tb_Workload")
public class WorkLoad extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	//@TableId(type = IdType.AUTO)
	//private long id;
	
	@TableField("project_id")
	private Long projectId;
	
	@TableField("type")
	private String type;	//二维/三维
	
	@TableField("design_test_line_number")
	private long designTestLineNumber;		//设计测线条数
	
	@TableField("design_full_coverage_workload")
	private float designFullCoverageWorkload;	//设计满覆盖工作量
	
	@TableField("length_of_design_data")
	private float lengthOfDesignData;		//设计资料长度	
	
	@TableField("length_of_design_construction")
	private float lengthOfDesignConstruction;	//设计施工长度
	
	@TableField("design_detection_points")
	private long designDetectionPoints;		//设计检波点数
	
	@TableField("design_harness_number")
	private long designHarnessNumber;		//设计线束数
	
	@TableField("design_full_coverage_area")
	private float designFullCoverageArea;	//设计满覆盖工作面积
	
	@TableField("design_data_area")
	private float designDataArea;			//设计资料面积
	
	@TableField("design_construction_area")
	private float designConstructionArea;	//设计施工面积
	
	@TableField("design_total_receiving_points")
	private long designTotalReceivingPoints;//设计接收点总数
	
	@TableField("total_desigin_total_shots")
	private long totalDesiginTotalShots; //设计总炮术
	
	@TableField("total_air_gun_shots")
	private long totalAirGunShots;  		//气枪炮术
	
	@TableField("total_doub_gun_shots")
	private long totalDoubGunShots;		//并炮炮术
	
	@TableField("total_source_gun_shots")
	private long totalSourceGunShots;	//震源炮术

	/**
	 * @return the projectId
	 */
	public Long getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the designTestLineNumber
	 */
	public long getDesignTestLineNumber() {
		return designTestLineNumber;
	}

	/**
	 * @param designTestLineNumber the designTestLineNumber to set
	 */
	public void setDesignTestLineNumber(long designTestLineNumber) {
		this.designTestLineNumber = designTestLineNumber;
	}

	/**
	 * @param designFullCoverageWorkload the designFullCoverageWorkload to set
	 */
	public void setDesignFullCoverageWorkload(long designFullCoverageWorkload) {
		this.designFullCoverageWorkload = designFullCoverageWorkload;
	}

	/**
	 * @param lengthOfDesignData the lengthOfDesignData to set
	 */
	public void setLengthOfDesignData(long lengthOfDesignData) {
		this.lengthOfDesignData = lengthOfDesignData;
	}



	/**
	 * @param lengthOfDesignConstruction the lengthOfDesignConstruction to set
	 */
	public void setLengthOfDesignConstruction(long lengthOfDesignConstruction) {
		this.lengthOfDesignConstruction = lengthOfDesignConstruction;
	}

	/**
	 * @return the designDetectionPoints
	 */
	public long getDesignDetectionPoints() {
		return designDetectionPoints;
	}

	/**
	 * @param designDetectionPoints the designDetectionPoints to set
	 */
	public void setDesignDetectionPoints(long designDetectionPoints) {
		this.designDetectionPoints = designDetectionPoints;
	}

	/**
	 * @return the designHarnessNumber
	 */
	public long getDesignHarnessNumber() {
		return designHarnessNumber;
	}

	/**
	 * @param designHarnessNumber the designHarnessNumber to set
	 */
	public void setDesignHarnessNumber(long designHarnessNumber) {
		this.designHarnessNumber = designHarnessNumber;
	}

	/**
	 * @param designFullCoverageArea the designFullCoverageArea to set
	 */
	public void setDesignFullCoverageArea(long designFullCoverageArea) {
		this.designFullCoverageArea = designFullCoverageArea;
	}

	/**
	 * @param designDataArea the designDataArea to set
	 */
	public void setDesignDataArea(long designDataArea) {
		this.designDataArea = designDataArea;
	}

	/**
	 * @param designConstructionArea the designConstructionArea to set
	 */
	public void setDesignConstructionArea(long designConstructionArea) {
		this.designConstructionArea = designConstructionArea;
	}

	/**
	 * @return the designTotalReceivingPoints
	 */
	public long getDesignTotalReceivingPoints() {
		return designTotalReceivingPoints;
	}

	/**
	 * @param designTotalReceivingPoints the designTotalReceivingPoints to set
	 */
	public void setDesignTotalReceivingPoints(long designTotalReceivingPoints) {
		this.designTotalReceivingPoints = designTotalReceivingPoints;
	}

	/**
	 * @return the totalDesiginTotalShots
	 */
	public long getTotalDesiginTotalShots() {
		return totalDesiginTotalShots;
	}

	/**
	 * @param totalDesiginTotalShots the totalDesiginTotalShots to set
	 */
	public void setTotalDesiginTotalShots(long totalDesiginTotalShots) {
		this.totalDesiginTotalShots = totalDesiginTotalShots;
	}

	/**
	 * @return the totalAirGunShots
	 */
	public long getTotalAirGunShots() {
		return totalAirGunShots;
	}

	/**
	 * @param totalAirGunShots the totalAirGunShots to set
	 */
	public void setTotalAirGunShots(long totalAirGunShots) {
		this.totalAirGunShots = totalAirGunShots;
	}

	/**
	 * @return the totalDoubGunShots
	 */
	public long getTotalDoubGunShots() {
		return totalDoubGunShots;
	}

	/**
	 * @param totalDoubGunShots the totalDoubGunShots to set
	 */
	public void setTotalDoubGunShots(long totalDoubGunShots) {
		this.totalDoubGunShots = totalDoubGunShots;
	}

	/**
	 * @return the totalSourceGunShots
	 */
	public long getTotalSourceGunShots() {
		return totalSourceGunShots;
	}

	/**
	 * @param totalSourceGunShots the totalSourceGunShots to set
	 */
	public void setTotalSourceGunShots(long totalSourceGunShots) {
		this.totalSourceGunShots = totalSourceGunShots;
	}

	/**
	 * @param designFullCoverageWorkload the designFullCoverageWorkload to set
	 */
	public void setDesignFullCoverageWorkload(float designFullCoverageWorkload) {
		this.designFullCoverageWorkload = designFullCoverageWorkload;
	}

	/**
	 * @param lengthOfDesignData the lengthOfDesignData to set
	 */
	public void setLengthOfDesignData(float lengthOfDesignData) {
		this.lengthOfDesignData = lengthOfDesignData;
	}

	/**
	 * @param lengthOfDesignConstruction the lengthOfDesignConstruction to set
	 */
	public void setLengthOfDesignConstruction(float lengthOfDesignConstruction) {
		this.lengthOfDesignConstruction = lengthOfDesignConstruction;
	}

	/**
	 * @param designFullCoverageArea the designFullCoverageArea to set
	 */
	public void setDesignFullCoverageArea(float designFullCoverageArea) {
		this.designFullCoverageArea = designFullCoverageArea;
	}

	/**
	 * @param designDataArea the designDataArea to set
	 */
	public void setDesignDataArea(float designDataArea) {
		this.designDataArea = designDataArea;
	}

	/**
	 * @param designConstructionArea the designConstructionArea to set
	 */
	public void setDesignConstructionArea(float designConstructionArea) {
		this.designConstructionArea = designConstructionArea;
	}

	
	
}
