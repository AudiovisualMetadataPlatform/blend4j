package com.github.jmchilton.blend4j.galaxy.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * AMPPD extension
 * Bean for fields returned by Galaxy upon workflow invocation, which, since Galaxy 25, just contains basic information about the invocation. 
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class WorkflowOutputs extends Invocation {
	
}
