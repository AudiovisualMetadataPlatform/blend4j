package com.github.jmchilton.blend4j.galaxy.beans;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * AMPPD extension
 * Request payload for uploading a file (identified by its path) to a library.
 */ 
public class FilesystemPathsLibraryUpload extends LibraryUpload {
  private boolean linkData;

  // AMPPD customization: changed since Galaxy 25.0
  // @JsonIgnore
  @JsonProperty("link_data")
  public boolean getLinkData() {
    return linkData;
  }

  public void setLinkData(final boolean linkData) {
    this.linkData = linkData;
  }

  // AMPPD customization: changed since Galaxy 25.0: by default, use file path for admin
  public FilesystemPathsLibraryUpload() {
	this(Source.ADMIN_PATH);  
	// this(false);
  }

  // AMPPD customization: added since Galaxy 25.0
  public FilesystemPathsLibraryUpload(Source source) {
	super(source);
  }

  // AMPPD customization: not used since Galaxy 25.0, can be ignored
  @Deprecated 
  public FilesystemPathsLibraryUpload(final boolean multifile) {
    super(String.format("upload_paths%s", multifile ? "_multifile" : ""));
  }

  // AMPPD customization: changed since Galaxy 25.0: 
  // @JsonProperty("filesystem_paths")
  @JsonProperty("path")
  public String getFilesystemPaths() {
    return getContent();
  }

  // AMPPD customization: not used since Galaxy 25.0, can be ignored
  @Deprecated 
  @JsonProperty("link_data_only")
  public String getLinkDataOnly() {
    return linkData ? "link_to_files" : "copy_files";
  }
}