package com.github.jmchilton.blend4j.galaxy.beans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


public class ToolInputs {
  private String toolId;
  private String historyId;
  private Map<String, String> inputs;

  public ToolInputs(String toolId, String inputs) {
    this.toolId = toolId;
    
	try {
		initialize_inputs(inputs);
		System.out.println("\n the inputs object is:"+this.inputs);
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    //this.inputs = new HashMap();
    //this.inputs = inputs;
    
    
  }

  public void initialize_inputs(String inputs) throws JSONException
  {
	  this.inputs = new HashMap<String, String>();
	  JSONObject jobject = new JSONObject(inputs);
	  Iterator<?> keys = jobject.keys();

      while( keys.hasNext() ){
          String key = (String)keys.next();
          String value = jobject.getString(key); 
          this.inputs.put(key, value);
      } 
  }
  public void setHistoryId(String historyId) {
    this.historyId = historyId;
  }

  @JsonProperty("tool_id")
  public String getToolId() {
    return toolId;
  }

  @JsonProperty("inputs")
  public Map<String, String> getInputs() {
    return inputs;
  }

  @JsonProperty("history_id")
  public String getHistoryId() {
    return historyId;
  }
}
