package com.github.jmchilton.blend4j.galaxy.beans;

public class Workflow extends GalaxyObject {
  private String name;
  private boolean deleted;
  private boolean published;
  private String owner;
  private String id;
  private String annotation;    //This might have to be moved
  private String model_class;   //This might have to be moved

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public boolean isDeleted() {
	    return deleted;
  }

  public void setDeleted(boolean deleted) {
    this.deleted = deleted;
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
  
  public String getId() {
	return id;
  }

  public void setId(String id) {
		this.id = id;
  }
	
  public String getAnnotation() {
		return annotation;
  }
	
  public void setAnnotation(String annotation) {
		this.annotation = annotation;
  }
	
  public String getModel_class() {
		return model_class;
  }
	
  public void setModel_class(String model_class) {
		this.model_class = model_class;
  }
}
