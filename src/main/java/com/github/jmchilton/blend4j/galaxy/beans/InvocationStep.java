package com.github.jmchilton.blend4j.galaxy.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The container for fields included in an invocation step as part of the returned info upon workflow invocation.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class InvocationStep {
	private String workflowStepUuid;
	private String updateTime;
	private String jobId;
	private String orderIndex;
	// we omit the output_collection, since we don't use collection
	private String workflowStepLabel;	
	private String state;
	private String action;
	private String modelClass;
	private String workflowStepId;
	private String id;
	
	public String getWorkflowStepUuid() {
		return workflowStepUuid;
	}
	
	public void setWorkflowStepUuid(String workflowStepUuid) {
		this.workflowStepUuid = workflowStepUuid;
	}
	
	public String getUpdateTime() {
		return updateTime;
	}
	
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getOrderIndex() {
		return orderIndex;
	}
	
	public void setOrderIndex(String orderIndex) {
		this.orderIndex = orderIndex;
	}
	
	public String getWorkflowStepLabel() {
		return workflowStepLabel;
	}
	
	public void setWorkflowStepLabel(String workflowStepLabel) {
		this.workflowStepLabel = workflowStepLabel;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String getModelClass() {
		return modelClass;
	}
	
	public void setModelClass(String modelClass) {
		this.modelClass = modelClass;
	}
	
	public String getWorkflowStepId() {
		return workflowStepId;
	}
	
	public void setWorkflowStepId(String workflowStepId) {
		this.workflowStepId = workflowStepId;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}		
	
}
