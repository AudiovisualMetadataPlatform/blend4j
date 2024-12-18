package com.github.jmchilton.blend4j.galaxy.beans;


/**
 * AMPPD extension
 * Bean for workflow metedata fields that can be updated.
 */
public class WorkflowMeta {
	
	private boolean published;
	private boolean hidden;
	
	public boolean isPublished() {
		return published;
	}
	
	public void setPublished(boolean published) {
		this.published = published;
	}
	
	public boolean isHidden() {
		return hidden;
	}
	
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	
}
