package com.github.jmchilton.blend4j.galaxy.beans;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * AMPPD extension
 * Request payload for uploading dataset(s) to a library.
 */ 
public class LibraryUpload extends GalaxyObject {
  /* AMPPD customization: added since Galaxy 25.0:
   * There are a few other params in library upload API payload, such as preserve_dirs, tag_using_filenames,
   * but the default values are sufficient for all AMP use cases, thus, there is no need to add them. 
   */
		
  private String folderId;
  private String fileType = "auto";
  private String dbkey = "?";
  private String content;

  // AMPPD customization: added since Galaxy 25.0, 
  // specifying where/how the dataset(s) should be loaded from, corresponding to the deprecated fields createType + uploadOption
  private Source source;

  // AMPPD customization: not used since Galaxy 25.0, can be ignored
  @Deprecated 
  private String name; 
  
  // AMPPD customization: not used since Galaxy 25.0, can be ignored
  @Deprecated 
  private String uploadOption;

  // AMPPD customization: not used since Galaxy 25.0, can be ignored
  @Deprecated 
  private CreateType createType = CreateType.FILE;

  // AMPPD customization: not used since Galaxy 25.0, can be ignored
  @Deprecated 
  public static enum CreateType {
    FILE("file");
    private String value;

    private CreateType(final String value) {
      this.value = value;
    }

    public String toJson() {
      return value;
    }
  }

  // AMPPD customization: added since Galaxy 25.0, specifying the value allowed for source 
  public static enum Source {
    USER_FILE("userdir_file"),
	USER_FOLDER("userdir_folder"),
    IMPORT_FILE("importdir_file"),
    IMPORT_FOLDER("importdir_folder"),
    ADMIN_PATH("admin_path");
    
	private String value;

    private Source(final String value) {
      this.value = value;
    }

    public String toJson() {
      return value;
    }
  }

  // AMPPD customization: added since Galaxy 25.0
  protected LibraryUpload(Source source) {
    this.source = source;
  }
  
  // AMPPD customization: not used since Galaxy 25.0, can be ignored
  @Deprecated 
  protected LibraryUpload(final String uploadOption) {
	this.uploadOption = uploadOption;
  }

  // AMPPD customization: added since Galaxy 25.0
  public String getSource() {
	return source.toJson();
  }

  // AMPPD customization: not used since Galaxy 25.0, can be ignored
  @Deprecated 
  @JsonProperty("upload_option")
  public String getUploadOption() {
	return uploadOption;
  }

  @JsonIgnore
  public String getContent() {
    return content;
  }

  @JsonIgnore
  public void setContent(final String content) {
    this.content = content;
  }

  // AMPPD customization: changed since Galaxy 25
  // @JsonProperty("folder_id")
  @JsonProperty("encoded_folder_id")
  public String getFolderId() {
    return folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  @JsonProperty("file_type")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public String getDbkey() {
    return dbkey;
  }

  public void setDbkey(String dbkey) {
    this.dbkey = dbkey;
  }

  // AMPPD customization: not used since Galaxy 25.0, can be ignored
  @Deprecated 
  @JsonProperty("create_type")
  public String getCreateType() {
    return createType.toJson();
  }

  // AMPPD customization: not used since Galaxy 25.0, can be ignored
  @Deprecated 
  public void setCreateType(final CreateType createType) {
    this.createType = createType;
  }

  // AMPPD customization: not used since Galaxy 25.0, can be ignored
  @Deprecated 
  @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
  @JsonProperty("NAME")
  public String getName() {
    return name;
  }

  // AMPPD customization: not used since Galaxy 25.0, can be ignored
  @Deprecated 
  public void setName(final String name) {
    this.name = name;
  }
}