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
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
@Table("tb_WorkloadPrice")
@TableName("tb_WorkloadPrice")
public class WorkLoadPrice extends BaseEntity{

	private static final long serialVersionUID = 1L;

	//@TableId(type = IdType.AUTO)
	//private Long id;
	
	@TableField("project_id")
	private Long projectId;
	
	@TableField("workload_type")
	private String workLoadType;
	
	@TableField("price_per_kilometer_price")
	private long pricePerKilometerPrice;  //每公里（二维）
	
	@TableField("per_square_kilometer_price")
	private long perSquareKilometerPrice;  //每平方公里（三维）
	
	@TableField("arrange_and_lay_price")
	private long arrangeAndLayPrice;  //排列布放
		
	@TableField("daily_unit_price")
	private long dailyUnitPrice;  //日费制单价
	
	@TableField("waiting_unit_price")
	private long waitingUnitPrice;  //待工单价
	
	@TableField("other_price")
	private long otherPrice;

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
	 * @return the workLoadType
	 */
	public String getWorkLoadType() {
		return workLoadType;
	}

	/**
	 * @param workLoadType the workLoadType to set
	 */
	public void setWorkLoadType(String workLoadType) {
		this.workLoadType = workLoadType;
	}

	/**
	 * @return the pricePerKilometerPrice
	 */
	public long getPricePerKilometerPrice() {
		return pricePerKilometerPrice;
	}

	/**
	 * @param pricePerKilometerPrice the pricePerKilometerPrice to set
	 */
	public void setPricePerKilometerPrice(long pricePerKilometerPrice) {
		this.pricePerKilometerPrice = pricePerKilometerPrice;
	}

	/**
	 * @return the perSquareKilometerPrice
	 */
	public long getPerSquareKilometerPrice() {
		return perSquareKilometerPrice;
	}

	/**
	 * @param perSquareKilometerPrice the perSquareKilometerPrice to set
	 */
	public void setPerSquareKilometerPrice(long perSquareKilometerPrice) {
		this.perSquareKilometerPrice = perSquareKilometerPrice;
	}

	/**
	 * @return the arrangeAndLayPrice
	 */
	public long getArrangeAndLayPrice() {
		return arrangeAndLayPrice;
	}

	/**
	 * @param arrangeAndLayPrice the arrangeAndLayPrice to set
	 */
	public void setArrangeAndLayPrice(long arrangeAndLayPrice) {
		this.arrangeAndLayPrice = arrangeAndLayPrice;
	}

	/**
	 * @return the dailyUnitPrice
	 */
	public long getDailyUnitPrice() {
		return dailyUnitPrice;
	}

	/**
	 * @param dailyUnitPrice the dailyUnitPrice to set
	 */
	public void setDailyUnitPrice(long dailyUnitPrice) {
		this.dailyUnitPrice = dailyUnitPrice;
	}

	/**
	 * @return the waitingUnitPrice
	 */
	public long getWaitingUnitPrice() {
		return waitingUnitPrice;
	}

	/**
	 * @param waitingUnitPrice the waitingUnitPrice to set
	 */
	public void setWaitingUnitPrice(long waitingUnitPrice) {
		this.waitingUnitPrice = waitingUnitPrice;
	}

	/**
	 * @return the otherPrice
	 */
	public long getOtherPrice() {
		return otherPrice;
	}

	/**
	 * @param otherPrice the otherPrice to set
	 */
	public void setOtherPrice(long otherPrice) {
		this.otherPrice = otherPrice;
	}
	
	
}
