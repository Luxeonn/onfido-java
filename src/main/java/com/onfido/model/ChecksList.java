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
import com.onfido.model.Check;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * ChecksList
 */
@JsonPropertyOrder({
  ChecksList.JSON_PROPERTY_CHECKS
})
@JsonTypeName("Checks_list")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChecksList {
  public static final String JSON_PROPERTY_CHECKS = "checks";
  private List<Check> checks = new ArrayList<>();

  public ChecksList() { 
  }

  public ChecksList checks(List<Check> checks) {
    this.checks = checks;
    return this;
  }

  public ChecksList addChecksItem(Check checksItem) {
    if (this.checks == null) {
      this.checks = new ArrayList<>();
    }
    this.checks.add(checksItem);
    return this;
  }

   /**
   * Get checks
   * @return checks
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHECKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Check> getChecks() {
    return checks;
  }


  @JsonProperty(JSON_PROPERTY_CHECKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChecks(List<Check> checks) {
    this.checks = checks;
  }


  /**
   * Return true if this Checks_list object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChecksList checksList = (ChecksList) o;
    return Objects.equals(this.checks, checksList.checks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChecksList {\n");
    sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
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

