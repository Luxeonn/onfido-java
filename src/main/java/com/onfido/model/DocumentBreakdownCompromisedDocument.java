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
import com.onfido.model.DocumentBreakdownCompromisedDocumentBreakdown;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * Asserts whether the image of the document has been found in our internal database or if it was used in a suspicious way.
 */
@JsonPropertyOrder({
  DocumentBreakdownCompromisedDocument.JSON_PROPERTY_RESULT,
  DocumentBreakdownCompromisedDocument.JSON_PROPERTY_BREAKDOWN
})
@JsonTypeName("document_breakdown_compromised_document")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentBreakdownCompromisedDocument {
  public static final String JSON_PROPERTY_RESULT = "result";
  private String result;

  public static final String JSON_PROPERTY_BREAKDOWN = "breakdown";
  private DocumentBreakdownCompromisedDocumentBreakdown breakdown;

  public DocumentBreakdownCompromisedDocument() { 
  }

  public DocumentBreakdownCompromisedDocument result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(String result) {
    this.result = result;
  }


  public DocumentBreakdownCompromisedDocument breakdown(DocumentBreakdownCompromisedDocumentBreakdown breakdown) {
    this.breakdown = breakdown;
    return this;
  }

   /**
   * Get breakdown
   * @return breakdown
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentBreakdownCompromisedDocumentBreakdown getBreakdown() {
    return breakdown;
  }


  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreakdown(DocumentBreakdownCompromisedDocumentBreakdown breakdown) {
    this.breakdown = breakdown;
  }


  /**
   * Return true if this document_breakdown_compromised_document object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBreakdownCompromisedDocument documentBreakdownCompromisedDocument = (DocumentBreakdownCompromisedDocument) o;
    return Objects.equals(this.result, documentBreakdownCompromisedDocument.result) &&
        Objects.equals(this.breakdown, documentBreakdownCompromisedDocument.breakdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, breakdown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBreakdownCompromisedDocument {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
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

