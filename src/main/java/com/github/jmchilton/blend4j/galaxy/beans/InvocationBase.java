package com.github.jmchilton.blend4j.galaxy.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.github.jmchilton.blend4j.galaxy.beans.WorkflowInputs.WorkflowInput;

/**
 * AMPPD extension
 * Base class for workflow invocation related fields shared by workflow outputs and invocation detail query results, including inputs/outputs but not steps information.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class InvocationBase extends Invocation {

	// in WorkflowsClient.runWorkflow, WorkflowInput does not include uuid; but here Galaxy does return it; we can omit it as we don't need it for now
	private Map<String, WorkflowInput> inputs = new HashMap<String, WorkflowInput>();
	private List<String> outputIds = new ArrayList<String>(); // correspond to "output" field

	public Map<String, WorkflowInput> getInputs() {
		return inputs;
	}

	public List<String> getOutputIds() {
		return outputIds;
	}

	public void setInputs(Map<String, WorkflowInput> inputs) {
		this.inputs = inputs;
	}

	@JsonProperty("outputs")
	public void setOutputIds(final List<String> outputIds) {
		this.outputIds = outputIds;
	}
	
}
