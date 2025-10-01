package com.github.jmchilton.blend4j.galaxy.beans;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * AMPPD extension
 * Base class for workflow invocation related fields shared by workflow outputs and invocation briefs/details query results, including inputs/outputs but not steps information.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class InvocationBase extends Invocation {

	private Map<String, WorkflowInput> inputs = new HashMap<String, WorkflowInput>();
	private Map<String, WorkflowOutput> outputs = new HashMap<String, WorkflowOutput>();

	// below fields are omitted since there is no use case in AMP for them:
	// input_step_parameters, output_collections, output_values, messages

	public Map<String, WorkflowInput> getInputs() {
		return inputs;
	}

	public void setInputs(Map<String, WorkflowInput> inputs) {
		this.inputs = inputs;
	}
	
	public Map<String, WorkflowOutput> getOutputs() {
		return outputs;
	}

	public void setOutputs(Map<String, WorkflowOutput> outputs) {
		this.outputs = outputs;
	}

	// we could have inherited from WorkflowInputs.WorkflowInput, except that "src" is of Enum InputSourceType, which uses upper case names, 
	// and that differs from the actual string values returned by Galaxy, so it can't be understood by json parser 
	@JsonIgnoreProperties(ignoreUnknown=true)
	public static class WorkflowInput extends WorkflowOutput {
	    private String label;	    

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}	
	}	
	
	// we could have inherited from JobInputOutput, except that "src" is of Enum InputSourceType, which uses upper case names, 
	// and that differs from the actual string values returned by Galaxy, so it can't be understood by json parser 
	@JsonIgnoreProperties(ignoreUnknown=true)
	public static class WorkflowOutput {
	    private String id;
	    private String src;		
	    private String workflowStepId;	    
		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getSrc() {
			return src;
		}

		public void setSrc(String src) {
			this.src = src;
		}

		@JsonProperty("workflow_step_id")
		public String getWorkflowStepId() {
			return workflowStepId;
		}

		public void setWorkflowStepId(String workflowStepId) {
			this.workflowStepId = workflowStepId;
		}	
	}	
	
}
