package com.bgp.common.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class BaseEntity implements Serializable,Cloneable{
	
	//private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.AUTO)
	protected Long id;                //id 唯一标识
	protected String creator;			//创建人的登录名
	protected String editor;			//最后修改人
	protected String createTime;        //创建时间
	protected String modifyTime;		//修改时间
	
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
}
