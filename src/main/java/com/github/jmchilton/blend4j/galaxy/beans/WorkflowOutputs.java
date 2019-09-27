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
 * Bean for fields returned by Galaxy upon workflow invocation, which contains the detailed information of each invocation step. 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class WorkflowOutputs {
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
	private List<InvocationStep> steps = new ArrayList<InvocationStep>();

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
	
}
