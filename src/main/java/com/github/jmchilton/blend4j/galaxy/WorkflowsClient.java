package com.github.jmchilton.blend4j.galaxy;

import java.util.List;

import com.github.jmchilton.blend4j.galaxy.beans.Invocation;
import com.github.jmchilton.blend4j.galaxy.beans.InvocationBase;
import com.github.jmchilton.blend4j.galaxy.beans.InvocationDetails;
import com.github.jmchilton.blend4j.galaxy.beans.InvocationStepDetails;
import com.github.jmchilton.blend4j.galaxy.beans.Workflow;
import com.github.jmchilton.blend4j.galaxy.beans.WorkflowDetails;
import com.github.jmchilton.blend4j.galaxy.beans.WorkflowInputs;
import com.github.jmchilton.blend4j.galaxy.beans.WorkflowMetadata;
import com.github.jmchilton.blend4j.galaxy.beans.WorkflowOutputs;
import com.sun.jersey.api.client.ClientResponse;

/**
 * AMPPD extension
 * APIs for workflows and invocations.
 */
public interface WorkflowsClient {
  /**
   * List all workflows with no parameters, i.e., including all published/unpublished and excluding all hidden/deleted workflows.
   * @return
   */
  public List<Workflow> getWorkflows();

  /**
   * List workflows satisfying the given criteria.
   * @param showPublished: if None/True/False, include both, only published, or only unpublished workflows
   * @param showHidden: if true, include only hidden workflows; otherwise include only unhidden workflows
   * @param showDeleted: if true, include only deleted workflows; otherwise include only undeleted workflows
   * @param missingTools: if true, include only workflows with missing tools; otherwise include only workflows without missing tools
   * @return
   */
  public List<Workflow> getWorkflows(Boolean showPublished, Boolean showHidden, Boolean showDeleted, Boolean missingTools);

  /**
   * Show details of the specified workflow.
   * @param id the ID of the specified StoredWorkflow 
   * @return the queried workflow details
   */
  WorkflowDetails showWorkflow(String id);

  /**
   * Show details of the specified workflow instance. 
   * Note: The difference between this method and showWorkflow is that, 
   * this method takes a possibly non-StoredWorkflow ID instead of a encoded StoredWorkflow ID. 
   * @param workflowId the workflow ID of the specified workflow instance which may not have been stored
   * @return the queried workflow details
   */
  WorkflowDetails showWorkflowInstance(String workflowId);

  String exportWorkflow(String id);

  Workflow importWorkflow(String json);

  ClientResponse importWorkflowResponse(String json);

  ClientResponse runWorkflowResponse(WorkflowInputs workflowInputs);

  WorkflowOutputs runWorkflow(WorkflowInputs workflowInputs);
  
//  /**
//   * Updates the workflow with the given id to the new value.
//   * @param id ID of the workflow to update
//   * @param workflowDetails the new workflow to update to
//   * @return the updated workflow
//   */
//  public WorkflowDetails updateWorkflow(String id, WorkflowDetails workflowDetails);
//
//  /**
//   * Updates the workflow with the given id to the new value.
//   * @param id ID of the workflow to update
//   * @param workflowDetails the new workflow to update to
//   * @return A {@link ClientResponse} for this request. The status code provided
//   *         by {@link ClientResponse#getClientResponseStatus()} should be
//   *         verified for success.
//   */
//  public ClientResponse updateWorkflowRequest(String id, WorkflowDetails workflowDetails);

  /**
   * Updates the metadata of the given workflow to the given value.
   * @param id ID of the workflow to update
   * @param workflowMeta the metadata to update to
   * @return the updated workflow
   */
  public WorkflowDetails updateWorkflow(String id, WorkflowMetadata workflowMeta);

  /**
   * Updates the metadata of the given workflow to the given value.
   * @param id ID of the workflow to update
   * @param workflowMeta the metadata to update to
   * @return A {@link ClientResponse} for this request. The status code provided
   *         by {@link ClientResponse#getClientResponseStatus()} should be
   *         verified for success.
   */
  public ClientResponse updateWorkflowRequest(String id, WorkflowMetadata workflowMeta);

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
  public ClientResponse deleteWorkflowRequest(String id);
  
  /**
   * Lists all invocations with step details for the specified user.
   * @param userId ID of the specified user
   * @return a list of requested InvocationDetails (i.e. invocations with job/output details for each step) 
   */
  public List<InvocationDetails> indexInvocationsDetails(String userId);

  /**
   * Lists all invocations with step details for the specified user, workflow and history.
   * @param userId ID of the specified user
   * @param workflowId ID of the specified workflow
   * @param historyId ID of the specified history
   * @return a list of requested InvocationDetails (i.e. invocations with job/output details for each step) 
   */
  public List<InvocationDetails> indexInvocationsDetails(String userId, String workflowId, String historyId);

  /**
   * Lists all invocations of the specified workflow within the specified history.
   * @param workflowId ID of the specified workflow
   * @param historyId ID of the specified history
   * @return a list of requested Invocations (i.e. invocations without job/output details for each step) 
   */
  public List<Invocation> indexInvocations(String workflowId, String historyId);
  
  /**
   * Show the information for the specified workflow invocation.
   * @param workflowId ID of the specified workflow
   * @param invocationId ID of the specified invocation
   * @param detailed whether to show the step details within the invocation
   * @return an instance containing the requested information of the invocation 
   */
  public InvocationBase showInvocation(String workflowId, String invocationId, Boolean detailed);
  
  /**
   * Show the detailed information for the specified workflow invocation step.
   * @param workflowId ID of the specified workflow
   * @param invocationId ID of the specified workflow invocation
   * @param invocationId ID of the specified workflow invocation step
   * @return an instance containing the detailed information of the workflow invocation step 
   */  
  public InvocationStepDetails showInvocationStep(String workflowId, String invocationId, String stepId);
  

}
