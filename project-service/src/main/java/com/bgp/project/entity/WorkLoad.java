/**
 * 
 */
package com.bgp.project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
	
	private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.AUTO)
	private Long id;
	
	@TableField("project_id")
	private String project_id;
	
	@TableField("type")
	private String type;	//二维/三维
	
	@TableField("design_test_line_number")
	private long design_test_line_number;		//设计测线条数
	
	@TableField("design_full_coverage_workload")
	private long design_full_coverage_workload;	//设计满覆盖工作量
	
	@TableField("length_of_design_data")
	private String length_of_design_data;		//设计资料长度	
	
	@TableField("length_of_design_construction")
	private String length_of_design_construction;	//设计施工长度
	
	@TableField("design_detection_points")
	private String design_detection_points;		//设计检波点数
	
	@TableField("design_harness_numner")
	private String design_harness_numner;		//设计线束数
	
	@TableField("design_full_coverage_area")
	private String design_full_coverage_area;	//设计满覆盖工作面积
	
	@TableField("design_data_area")
	private String design_data_area;			//设计资料面积
	
	@TableField("design_construction_area")
	private String design_construction_area;	//设计施工面积
	
	@TableField("design_total_receiving_points")
	private String design_total_receiving_points;//设计接收点总数
	
	@TableField("total_desigin_total_shots")
	private long total_desigin_total_shots; //设计总炮术
	
	@TableField("total_air_gun_shots")
	private long total_air_gun_shots;  		//气枪炮术
	
	@TableField("total_doub_gun_shots")
	private long total_doub_gun_shots;		//并炮炮术
	
	@TableField("total_source_gun_shots")
	private long total_source_gun_shots;	//震源炮术

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the project_id
	 */
	public String getProject_id() {
		return project_id;
	}

	/**
	 * @param project_id the project_id to set
	 */
	public void setProject_id(String project_id) {
		this.project_id = project_id;
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
	 * @return the design_test_line_number
	 */
	public long getDesign_test_line_number() {
		return design_test_line_number;
	}

	/**
	 * @param design_test_line_number the design_test_line_number to set
	 */
	public void setDesign_test_line_number(long design_test_line_number) {
		this.design_test_line_number = design_test_line_number;
	}

	/**
	 * @return the design_full_coverage_workload
	 */
	public long getDesign_full_coverage_workload() {
		return design_full_coverage_workload;
	}

	/**
	 * @param design_full_coverage_workload the design_full_coverage_workload to set
	 */
	public void setDesign_full_coverage_workload(long design_full_coverage_workload) {
		this.design_full_coverage_workload = design_full_coverage_workload;
	}

	/**
	 * @return the length_of_design_data
	 */
	public String getLength_of_design_data() {
		return length_of_design_data;
	}

	/**
	 * @param length_of_design_data the length_of_design_data to set
	 */
	public void setLength_of_design_data(String length_of_design_data) {
		this.length_of_design_data = length_of_design_data;
	}

	/**
	 * @return the length_of_design_construction
	 */
	public String getLength_of_design_construction() {
		return length_of_design_construction;
	}

	/**
	 * @param length_of_design_construction the length_of_design_construction to set
	 */
	public void setLength_of_design_construction(String length_of_design_construction) {
		this.length_of_design_construction = length_of_design_construction;
	}

	/**
	 * @return the design_detection_points
	 */
	public String getDesign_detection_points() {
		return design_detection_points;
	}

	/**
	 * @param design_detection_points the design_detection_points to set
	 */
	public void setDesign_detection_points(String design_detection_points) {
		this.design_detection_points = design_detection_points;
	}

	/**
	 * @return the design_full_coverage_area
	 */
	public String getDesign_full_coverage_area() {
		return design_full_coverage_area;
	}

	/**
	 * @param design_full_coverage_area the design_full_coverage_area to set
	 */
	public void setDesign_full_coverage_area(String design_full_coverage_area) {
		this.design_full_coverage_area = design_full_coverage_area;
	}

	/**
	 * @return the design_harness_numner
	 */
	public String getDesign_harness_numner() {
		return design_harness_numner;
	}

	/**
	 * @param design_harness_numner the design_harness_numner to set
	 */
	public void setDesign_harness_numner(String design_harness_numner) {
		this.design_harness_numner = design_harness_numner;
	}

	/**
	 * @return the design_data_area
	 */
	public String getDesign_data_area() {
		return design_data_area;
	}

	/**
	 * @param design_data_area the design_data_area to set
	 */
	public void setDesign_data_area(String design_data_area) {
		this.design_data_area = design_data_area;
	}

	/**
	 * @return the design_construction_area
	 */
	public String getDesign_construction_area() {
		return design_construction_area;
	}

	/**
	 * @param design_construction_area the design_construction_area to set
	 */
	public void setDesign_construction_area(String design_construction_area) {
		this.design_construction_area = design_construction_area;
	}

	/**
	 * @return the design_total_receiving_points
	 */
	public String getDesign_total_receiving_points() {
		return design_total_receiving_points;
	}

	/**
	 * @param design_total_receiving_points the design_total_receiving_points to set
	 */
	public void setDesign_total_receiving_points(String design_total_receiving_points) {
		this.design_total_receiving_points = design_total_receiving_points;
	}

	/**
	 * @return the total_desigin_total_shots
	 */
	public long getTotal_desigin_total_shots() {
		return total_desigin_total_shots;
	}

	/**
	 * @param total_desigin_total_shots the total_desigin_total_shots to set
	 */
	public void setTotal_desigin_total_shots(long total_desigin_total_shots) {
		this.total_desigin_total_shots = total_desigin_total_shots;
	}

	/**
	 * @return the total_air_gun_shots
	 */
	public long getTotal_air_gun_shots() {
		return total_air_gun_shots;
	}

	/**
	 * @param total_air_gun_shots the total_air_gun_shots to set
	 */
	public void setTotal_air_gun_shots(long total_air_gun_shots) {
		this.total_air_gun_shots = total_air_gun_shots;
	}

	/**
	 * @return the total_doub_gun_shots
	 */
	public long getTotal_doub_gun_shots() {
		return total_doub_gun_shots;
	}

	/**
	 * @param total_doub_gun_shots the total_doub_gun_shots to set
	 */
	public void setTotal_doub_gun_shots(long total_doub_gun_shots) {
		this.total_doub_gun_shots = total_doub_gun_shots;
	}

	/**
	 * @return the total_source_gun_shots
	 */
	public long getTotal_source_gun_shots() {
		return total_source_gun_shots;
	}

	/**
	 * @param total_source_gun_shots the total_source_gun_shots to set
	 */
	public void setTotal_source_gun_shots(long total_source_gun_shots) {
		this.total_source_gun_shots = total_source_gun_shots;
	}
	
	
	
}
