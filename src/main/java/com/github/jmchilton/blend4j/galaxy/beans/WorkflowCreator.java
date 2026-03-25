package com.github.jmchilton.blend4j.galaxy.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

// AMP Customization
public class WorkflowCreator extends GalaxyObject {
    @JsonProperty("class")
    private String creator_class;

    @JsonProperty("name")
    private String name;

    public String getName() {
       return  this.name;
    }
}
