package com.github.jmchilton.blend4j.galaxy.beans;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * AMPPD extension
 * Bean for fields included in an invocation step, without job/outputs details.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class InvocationStep extends GalaxyObject {
	
	@JsonProperty("workflow_step_id")
	private String workflowStepId;
	
	@JsonProperty("workflow_step_uuid")
	private String workflowStepUuid;
	
	@JsonProperty("workflow_step_label")
	private String workflowStepLabel;	

	@JsonProperty("job_id")
	private String jobId;
	
	@JsonProperty("update_time")
	private Date updateTime;
	
	@JsonProperty("order_index")
	private Integer orderIndex;
	
	private String state;
	private String action;
		
	// below fields are omitted since there is no use case in AMP for them:
	// subworkflow_invocation_id, implicit_collection_jobs_id

	public String getWorkflowStepUuid() {
		return workflowStepUuid;
	}
	
	public void setWorkflowStepUuid(String workflowStepUuid) {
		this.workflowStepUuid = workflowStepUuid;
	}
	
	public Date getUpdateTime() {
		return updateTime;
	}
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Integer getOrderIndex() {
		return orderIndex;
	}
	
	public void setOrderIndex(Integer orderIndex) {
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
	
	public String getWorkflowStepId() {
		return workflowStepId;
	}
	
	public void setWorkflowStepId(String workflowStepId) {
		this.workflowStepId = workflowStepId;
	}	
	
}
