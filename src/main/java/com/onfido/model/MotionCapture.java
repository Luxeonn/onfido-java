/*
 * Onfido API v3.6
 * The Onfido API
 *
 * The version of the OpenAPI document: 3.6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onfido.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * MotionCapture
 */
@JsonPropertyOrder({
  MotionCapture.JSON_PROPERTY_ID,
  MotionCapture.JSON_PROPERTY_CREATED_AT,
  MotionCapture.JSON_PROPERTY_HREF,
  MotionCapture.JSON_PROPERTY_DOWNLOAD_HREF,
  MotionCapture.JSON_PROPERTY_FILE_NAME,
  MotionCapture.JSON_PROPERTY_FILE_SIZE,
  MotionCapture.JSON_PROPERTY_FILE_TYPE
})
@JsonTypeName("motion_capture")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MotionCapture {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_DOWNLOAD_HREF = "download_href";
  private String downloadHref;

  public static final String JSON_PROPERTY_FILE_NAME = "file_name";
  private String fileName;

  public static final String JSON_PROPERTY_FILE_SIZE = "file_size";
  private Integer fileSize;

  public static final String JSON_PROPERTY_FILE_TYPE = "file_type";
  private String fileType;

  public MotionCapture() { 
  }

  public MotionCapture id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the motion capture.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public MotionCapture createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time at which the motion capture was uploaded.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public MotionCapture href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The uri of this resource.
   * @return href
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHref(String href) {
    this.href = href;
  }


  public MotionCapture downloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
    return this;
  }

   /**
   * The uri that can be used to download the motion capture.
   * @return downloadHref
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDownloadHref() {
    return downloadHref;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
  }


  public MotionCapture fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The name of the uploaded file.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public MotionCapture fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * The size of the file in bytes.
   * @return fileSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }


  public MotionCapture fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * The file type of the uploaded file.
   * @return fileType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileType() {
    return fileType;
  }


  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }


  /**
   * Return true if this motion_capture object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MotionCapture motionCapture = (MotionCapture) o;
    return Objects.equals(this.id, motionCapture.id) &&
        Objects.equals(this.createdAt, motionCapture.createdAt) &&
        Objects.equals(this.href, motionCapture.href) &&
        Objects.equals(this.downloadHref, motionCapture.downloadHref) &&
        Objects.equals(this.fileName, motionCapture.fileName) &&
        Objects.equals(this.fileSize, motionCapture.fileSize) &&
        Objects.equals(this.fileType, motionCapture.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, href, downloadHref, fileName, fileSize, fileType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MotionCapture {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    downloadHref: ").append(toIndentedString(downloadHref)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

