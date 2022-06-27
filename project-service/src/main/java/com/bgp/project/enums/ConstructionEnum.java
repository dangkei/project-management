package com.bgp.project.enums;

import com.baomidou.mybatisplus.annotation.IEnum;

import lombok.Getter;
/*
 * 施工方式
 * */
@Getter
public enum ConstructionEnum implements IEnum<Integer>{

	LAND(0,"陆地"),
	TZ(1,"TZ"),
	OBS(2,"陆地"),
	TOW(3,"拖缆");
	
	private Integer value;
    private String message;
    
	ConstructionEnum(int value, String message) {
		// TODO Auto-generated constructor stub
		this.value = value;
		this.message = message;
	}

	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}

}
