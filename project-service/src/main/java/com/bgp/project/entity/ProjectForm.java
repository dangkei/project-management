/**
 * 
 */
package com.bgp.project.entity;

import java.io.Serializable;

/**
 * @author Administrator
 * 
 * 封装Project页面数据
 *
 */
public class ProjectForm implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Project project;
	WorkLoad workLoad;
	WorkLoadPrice workLoadPrice;
	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}
	/**
	 * @param project the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}
	/**
	 * @return the workLoad
	 */
	public WorkLoad getWorkLoad() {
		return workLoad;
	}
	/**
	 * @param workLoad the workLoad to set
	 */
	public void setWorkLoad(WorkLoad workLoad) {
		this.workLoad = workLoad;
	}
	/**
	 * @return the workLoadPrice
	 */
	public WorkLoadPrice getWorkLoadPrice() {
		return workLoadPrice;
	}
	/**
	 * @param workLoadPrice the workLoadPrice to set
	 */
	public void setWorkLoadPrice(WorkLoadPrice workLoadPrice) {
		this.workLoadPrice = workLoadPrice;
	}
	
	
	
	
}
