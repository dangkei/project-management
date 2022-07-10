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

	@TableId(type = IdType.AUTO)
	private Long id;
	
	@TableField("project_id")
	private Long project_id;
}
