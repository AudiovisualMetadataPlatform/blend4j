package com.github.jmchilton.blend4j.galaxy.beans;

import java.util.Map;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class WorkflowStepDefinition {
  
  @JsonIgnoreProperties(ignoreUnknown=true)
  public static class WorkflowStepOutput {
    private String stepOutput;
    private String sourceStep;

    public String getStepOutput() {
      return stepOutput;
    }

    @JsonProperty("step_output")
    public void setStepOutput(String stepOutput) {
      this.stepOutput = stepOutput;
    }

    public String getSourceStep() {
      return sourceStep;
    }

    @JsonProperty("source_step")
    public void setSourceStep(String sourceStep) {
      this.sourceStep = sourceStep;
    }
  
  }

  private String tool_id;
  private String tool_version;
  private String id;
  private Map<String, WorkflowStepOutput> input_steps;
  private ToolInputs tool_inputs;
  private String type; // data_input or tool
  private String annotation;

  
  public String getAnnotation() {
	return annotation;
}

public void setAnnotation(String annotation) {
	this.annotation = annotation;
}

public String getTool_id() {
	return tool_id;
}

public void setTool_id(String tool_id) {
	this.tool_id = tool_id;
}

public String getTool_version() {
	return tool_version;
}

public void setTool_version(String tool_version) {
	this.tool_version = tool_version;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public ToolInputs getTool_inputs() {
	return tool_inputs;
}

public void setTool_inputs(ToolInputs tool_inputs) {
	this.tool_inputs = tool_inputs;
}
  
  @JsonProperty("input_steps")
  public void setInputSteps(final Map<String, WorkflowStepOutput> inputSteps) {
    this.input_steps = inputSteps;
  }

  public Map<String, WorkflowStepOutput> getInputSteps() {
    return this.input_steps;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
    
}
