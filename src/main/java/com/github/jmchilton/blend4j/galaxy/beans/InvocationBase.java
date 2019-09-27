package com.github.jmchilton.blend4j.galaxy.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.github.jmchilton.blend4j.galaxy.beans.WorkflowInputs.WorkflowInput;

/**
 * AMPPD extension
 * Base class for workflow invocation related fields shared by workflow outputs and invocation detail query results.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class InvocationBase extends GalaxyObject {
	
	// in WorkflowsClient.runWorkflow, WorkflowInput does not include uuid; but here Galaxy does return it; we can omit it as we don't need it for now
	private Map<String, WorkflowInput> inputs = new HashMap<String, WorkflowInput>();
	@JsonProperty("update_time")
	private Date updateTime;
	private String uuid;
	private List<String> outputIds = new ArrayList<String>(); // correspond to "output" field
	private String historyId;	// correspond to "history", which is the same as historyId
	private String state;
	// we omit the output_collection, since we don't use collection
	@JsonProperty("workflow_id")
	private String workflowId;	// an internal workflow ID, not the same as the API workflowId used for workflow query/invocation
	
	public List<String> getOutputIds() {
		return outputIds;
	}

	@JsonProperty("outputs")
	public void setOutputIds(final List<String> outputIds) {
		this.outputIds = outputIds;
	}

	public String getHistoryId() {
		return historyId;
	}

	@JsonProperty("history")
	public void setHistoryId(final String historyId) {
		this.historyId = historyId;
	}

	public Map<String, WorkflowInput> getInputs() {
		return inputs;
	}

	public void setInputs(Map<String, WorkflowInput> inputs) {
		this.inputs = inputs;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
	}	
	
}
