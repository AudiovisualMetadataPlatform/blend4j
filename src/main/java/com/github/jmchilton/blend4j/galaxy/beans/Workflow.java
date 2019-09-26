package com.github.jmchilton.blend4j.galaxy.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * AMPPD extension
 * Container for fields returned upon workflow index request.
 */
public class Workflow extends GalaxyObject {
	private String name;
	private List<String> tags = new ArrayList<String>();
	private boolean deleted;
	private String latestWorkflowUuid;
	// omit showInToolPanel field as its not useful outside Galaxy UI
	private String url;
	private Integer numberOfSteps;
	private boolean published;
	private String owner;
	private String model_class;  
	private String id;	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getLatestWorkflowUuid() {
		return latestWorkflowUuid;
	}

	public void setLatestWorkflowUuid(String latestWorkflowUuid) {
		this.latestWorkflowUuid = latestWorkflowUuid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getNumberOfSteps() {
		return numberOfSteps;
	}

	public void setNumberOfSteps(Integer numberOfSteps) {
		this.numberOfSteps = numberOfSteps;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getModel_class() {
		return model_class;
	}

	public void setModel_class(String model_class) {
		this.model_class = model_class;
	}  
	
}
