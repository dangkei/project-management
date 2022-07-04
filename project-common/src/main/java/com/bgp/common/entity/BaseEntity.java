package com.bgp.common.entity;

import java.io.Serializable;

public class BaseEntity implements Serializable,Cloneable{
	
	private static final long serialVersionUID = 1L;
	
	protected String id;                //id 唯一标识
	protected String creator;			//创建人的登录名
	protected String editor;			//最后修改人
	protected String createTime;        //创建时间
	protected String modifyTime;		//修改时间
}
