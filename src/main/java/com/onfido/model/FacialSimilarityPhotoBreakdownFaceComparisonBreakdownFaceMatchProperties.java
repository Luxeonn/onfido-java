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
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * FacialSimilarityPhotoBreakdownFaceComparisonBreakdownFaceMatchProperties
 */
@JsonPropertyOrder({
  FacialSimilarityPhotoBreakdownFaceComparisonBreakdownFaceMatchProperties.JSON_PROPERTY_SCORE,
  FacialSimilarityPhotoBreakdownFaceComparisonBreakdownFaceMatchProperties.JSON_PROPERTY_DOCUMENT_ID
})
@JsonTypeName("facial_similarity_photo_breakdown_face_comparison_breakdown_face_match_properties")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FacialSimilarityPhotoBreakdownFaceComparisonBreakdownFaceMatchProperties {
  public static final String JSON_PROPERTY_SCORE = "score";
  private Float score;

  public static final String JSON_PROPERTY_DOCUMENT_ID = "document_id";
  private UUID documentId;

  public FacialSimilarityPhotoBreakdownFaceComparisonBreakdownFaceMatchProperties() { 
  }

  public FacialSimilarityPhotoBreakdownFaceComparisonBreakdownFaceMatchProperties score(Float score) {
    this.score = score;
    return this;
  }

   /**
   * A floating point number between 0 and 1 that expresses how similar the two faces are, where 1 is a perfect match.
   * @return score
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getScore() {
    return score;
  }


  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScore(Float score) {
    this.score = score;
  }


  public FacialSimilarityPhotoBreakdownFaceComparisonBreakdownFaceMatchProperties documentId(UUID documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * The UUID for the document containing the extracted face that was used for face matching.
   * @return documentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getDocumentId() {
    return documentId;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentId(UUID documentId) {
    this.documentId = documentId;
  }


  /**
   * Return true if this facial_similarity_photo_breakdown_face_comparison_breakdown_face_match_properties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacialSimilarityPhotoBreakdownFaceComparisonBreakdownFaceMatchProperties facialSimilarityPhotoBreakdownFaceComparisonBreakdownFaceMatchProperties = (FacialSimilarityPhotoBreakdownFaceComparisonBreakdownFaceMatchProperties) o;
    return Objects.equals(this.score, facialSimilarityPhotoBreakdownFaceComparisonBreakdownFaceMatchProperties.score) &&
        Objects.equals(this.documentId, facialSimilarityPhotoBreakdownFaceComparisonBreakdownFaceMatchProperties.documentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, documentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacialSimilarityPhotoBreakdownFaceComparisonBreakdownFaceMatchProperties {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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

