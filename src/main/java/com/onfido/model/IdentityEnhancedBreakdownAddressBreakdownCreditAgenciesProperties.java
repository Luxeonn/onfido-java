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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * IdentityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties
 */
@JsonPropertyOrder({
  IdentityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties.JSON_PROPERTY_NUMBER_OF_MATCHES
})
@JsonTypeName("identity_enhanced_breakdown_address_breakdown_credit_agencies_properties")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties {
  public static final String JSON_PROPERTY_NUMBER_OF_MATCHES = "number_of_matches";
  private Integer numberOfMatches;

  public IdentityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties() { 
  }

  public IdentityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties numberOfMatches(Integer numberOfMatches) {
    this.numberOfMatches = numberOfMatches;
    return this;
  }

   /**
   * Get numberOfMatches
   * @return numberOfMatches
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfMatches() {
    return numberOfMatches;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfMatches(Integer numberOfMatches) {
    this.numberOfMatches = numberOfMatches;
  }


  /**
   * Return true if this identity_enhanced_breakdown_address_breakdown_credit_agencies_properties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties identityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties = (IdentityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties) o;
    return Objects.equals(this.numberOfMatches, identityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties.numberOfMatches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfMatches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityEnhancedBreakdownAddressBreakdownCreditAgenciesProperties {\n");
    sb.append("    numberOfMatches: ").append(toIndentedString(numberOfMatches)).append("\n");
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

