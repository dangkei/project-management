/**
 * 
 */
package com.bgp.project.entity;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class ProjectForm implements Serializable{
	Project project;
	WorkLoad workLoad;
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
	
	
}
