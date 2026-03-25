package com.github.jmchilton.blend4j.galaxy.beans;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AMPPD extension
 * Bean for fields returned by Galaxy upon workflow invocation, which contains inputs/outputs and basic information of each invocation step without details about jobs/outputs. 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class WorkflowOutputs extends InvocationBriefs {
	
	private List<String> outputIds = new ArrayList<String>(); // correspond to "output" field

	public List<String> getOutputIds() {
		return outputIds;
	}

	@JsonProperty("outputs")
	public void setOutputIds(final List<String> outputIds) {
		this.outputIds = outputIds;
	}	
	
}
