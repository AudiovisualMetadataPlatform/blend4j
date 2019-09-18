package com.github.jmchilton.blend4j.galaxy.beans;

import java.util.ArrayList;
import java.util.Map;

public class WorkflowDetails extends Workflow {
  private Map<String, WorkflowInputDefinition> inputs;
  private Map<String, WorkflowStepDefinition> steps;
  private ArrayList<ToolInputs> toolinputs;
  //tags  to be added
	

  public ArrayList<ToolInputs> getToolinputs() {
	return toolinputs;
}

public void setToolinputs(ArrayList<ToolInputs> toolinputs) {
	this.toolinputs = toolinputs;
}

public Map<String, WorkflowStepDefinition> getSteps() {
    return steps;
  }

  public void setSteps(Map<String, WorkflowStepDefinition> steps) {
    this.steps = steps;
  }
  
  public void setInputs(final Map<String, WorkflowInputDefinition> inputs) {
    this.inputs = inputs;
  }

  public Map<String, WorkflowInputDefinition> getInputs() {
    return inputs;
  }

	/*
	 * public Map<ToolInputs, Tool> getToolinputs() { return toolinputs; }
	 * 
	 * public void setToolinputs(Map<ToolInputs, Tool> toolinputs) { this.toolinputs
	 * = toolinputs; }
	 */
  
}
