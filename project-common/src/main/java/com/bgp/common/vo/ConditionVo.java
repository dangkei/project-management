package com.bgp.common.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class ConditionVo implements Serializable {

	private static long serialVersionUID = -5099378457111419832L;
	  /**
	   * 数据库字段名
	   */
	  private String column;
	  /**
	   * 字段值
	   */
	  private String value;
	  /**
	   * 连接类型，如llike,equals,gt,ge,lt,le
	   */
	  private String type;
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @param serialversionuid the serialversionuid to set
	 */
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}
	/**
	 * @return the column
	 */
	public String getColumn() {
		return column;
	}
	/**
	 * @param column the column to set
	 */
	public void setColumn(String column) {
		this.column = column;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
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
	  
	  

}
