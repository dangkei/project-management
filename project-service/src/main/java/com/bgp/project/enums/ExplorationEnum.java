package com.bgp.project.enums;

import com.baomidou.mybatisplus.annotation.IEnum;

import lombok.Getter;
/*
 * 勘探方法
 * */
@Getter
public enum ExplorationEnum implements IEnum<Integer>{
	
	TwoDimensional(0,"二维"),
	ThreeDimensional(1,"三维"),
	FourDimensional(2,"四维");

	private Integer value;
    private String message;
    
	ExplorationEnum(int value, String message) {
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
