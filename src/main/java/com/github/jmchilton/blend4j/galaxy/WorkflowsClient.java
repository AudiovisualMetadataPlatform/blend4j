package com.github.jmchilton.blend4j.galaxy;

import java.util.List;

import com.github.jmchilton.blend4j.galaxy.beans.Invocation;
import com.github.jmchilton.blend4j.galaxy.beans.InvocationStepDetails;
import com.github.jmchilton.blend4j.galaxy.beans.Workflow;
import com.github.jmchilton.blend4j.galaxy.beans.WorkflowDetails;
import com.github.jmchilton.blend4j.galaxy.beans.WorkflowInputs;
import com.github.jmchilton.blend4j.galaxy.beans.WorkflowOutputs;
import com.sun.jersey.api.client.ClientResponse;

/**
 * AMPPD extension
 * APIs for workflows and invocations.
 */
public interface WorkflowsClient {
  List<Workflow> getWorkflows();

  WorkflowDetails showWorkflow(String workflowId);

  String exportWorkflow(String id);

  Workflow importWorkflow(String json);

  ClientResponse importWorkflowResponse(String json);

  ClientResponse runWorkflowResponse(WorkflowInputs workflowInputs);

  WorkflowOutputs runWorkflow(WorkflowInputs workflowInputs);
  
  /**
   * Deletes the workflow with the given id (this is irreversible). This will
   * return a {@link ClientResponse} object providing access to the status code
   * and the non-serialized body of the response.
   * 
   * @param id
   *          The id of the workflow to delete.
   * @return A {@link ClientResponse} for this request. The status code provided
   *         by {@link ClientResponse#getClientResponseStatus()} should be
   *         verified for success.
   */
  ClientResponse deleteWorkflowRequest(String id);
  
  /**
   * Lists all invocations of the specified workflow within the specified history.
   * @param workflowId ID of the specified workflow
   * @param historyId ID of the specified history
   * @return a list of requested WorkflowOutputs (i.e. invocations without job/output details for each step) 
   */
  public List<Invocation> indexInvocations(String workflowId, String historyId);
  
  /**
   * Show the information for the specified workflow invocation.
   * @param workflowId ID of the specified workflow
   * @param invocationId ID of the specified invocation
   * @param detailed whether to show the step details within the invocation
   * @return an instance containing the requested information of the invocation 
   */
  public Invocation showInvocation(String workflowId, String invocationId, Boolean detailed);
  
  /**
   * Show the detailed information for the specified workflow invocation step.
   * @param workflowId ID of the specified workflow
   * @param invocationId ID of the specified workflow invocation
   * @param invocationId ID of the specified workflow invocation step
   * @return an instance containing the detailed information of the workflow invocation step 
   */  
  public InvocationStepDetails showInvocationStep(String workflowId, String invocationId, String stepId);
  

}
