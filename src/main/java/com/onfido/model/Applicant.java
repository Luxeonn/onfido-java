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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.onfido.model.Address;
import com.onfido.model.IdNumber;
import com.onfido.model.Location;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.onfido.JSON;


/**
 * Applicant
 */
@JsonPropertyOrder({
  Applicant.JSON_PROPERTY_EMAIL,
  Applicant.JSON_PROPERTY_DOB,
  Applicant.JSON_PROPERTY_ID_NUMBERS,
  Applicant.JSON_PROPERTY_PHONE_NUMBER,
  Applicant.JSON_PROPERTY_FIRST_NAME,
  Applicant.JSON_PROPERTY_LAST_NAME,
  Applicant.JSON_PROPERTY_ID,
  Applicant.JSON_PROPERTY_CREATED_AT,
  Applicant.JSON_PROPERTY_DELETE_AT,
  Applicant.JSON_PROPERTY_HREF,
  Applicant.JSON_PROPERTY_SANDBOX,
  Applicant.JSON_PROPERTY_ADDRESS,
  Applicant.JSON_PROPERTY_LOCATION
})
@JsonTypeName("applicant")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Applicant {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_DOB = "dob";
  private LocalDate dob;

  public static final String JSON_PROPERTY_ID_NUMBERS = "id_numbers";
  private List<IdNumber> idNumbers;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private String lastName;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DELETE_AT = "delete_at";
  private OffsetDateTime deleteAt;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_SANDBOX = "sandbox";
  private Boolean sandbox;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private Location location;

  public Applicant() { 
  }

  public Applicant email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The applicant&#39;s email address. Required if doing a US check, or a UK check for which &#x60;applicant_provides_data&#x60; is &#x60;true&#x60;.
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public Applicant dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

   /**
   * The applicant&#39;s date of birth
   * @return dob
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDob() {
    return dob;
  }


  @JsonProperty(JSON_PROPERTY_DOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDob(LocalDate dob) {
    this.dob = dob;
  }


  public Applicant idNumbers(List<IdNumber> idNumbers) {
    this.idNumbers = idNumbers;
    return this;
  }

  public Applicant addIdNumbersItem(IdNumber idNumbersItem) {
    if (this.idNumbers == null) {
      this.idNumbers = new ArrayList<>();
    }
    this.idNumbers.add(idNumbersItem);
    return this;
  }

   /**
   * Get idNumbers
   * @return idNumbers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<IdNumber> getIdNumbers() {
    return idNumbers;
  }


  @JsonProperty(JSON_PROPERTY_ID_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdNumbers(List<IdNumber> idNumbers) {
    this.idNumbers = idNumbers;
  }


  public Applicant phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The applicant&#39;s phone number
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public Applicant firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The applicant&#39;s first name
   * @return firstName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Applicant lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The applicant&#39;s surname
   * @return lastName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Applicant id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the applicant.
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }


  public Applicant createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when this applicant was created.
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


  public Applicant deleteAt(OffsetDateTime deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

   /**
   * The date and time when this applicant is scheduled to be deleted.
   * @return deleteAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDeleteAt() {
    return deleteAt;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteAt(OffsetDateTime deleteAt) {
    this.deleteAt = deleteAt;
  }


  public Applicant href(String href) {
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


  public Applicant sandbox(Boolean sandbox) {
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Get sandbox
   * @return sandbox
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SANDBOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSandbox() {
    return sandbox;
  }


  @JsonProperty(JSON_PROPERTY_SANDBOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSandbox(Boolean sandbox) {
    this.sandbox = sandbox;
  }


  public Applicant address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(Address address) {
    this.address = address;
  }


  public Applicant location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Location getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public Applicant putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this applicant object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Applicant applicant = (Applicant) o;
    return Objects.equals(this.email, applicant.email) &&
        Objects.equals(this.dob, applicant.dob) &&
        Objects.equals(this.idNumbers, applicant.idNumbers) &&
        Objects.equals(this.phoneNumber, applicant.phoneNumber) &&
        Objects.equals(this.firstName, applicant.firstName) &&
        Objects.equals(this.lastName, applicant.lastName) &&
        Objects.equals(this.id, applicant.id) &&
        Objects.equals(this.createdAt, applicant.createdAt) &&
        Objects.equals(this.deleteAt, applicant.deleteAt) &&
        Objects.equals(this.href, applicant.href) &&
        Objects.equals(this.sandbox, applicant.sandbox) &&
        Objects.equals(this.address, applicant.address) &&
        Objects.equals(this.location, applicant.location)&&
        Objects.equals(this.additionalProperties, applicant.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, dob, idNumbers, phoneNumber, firstName, lastName, id, createdAt, deleteAt, href, sandbox, address, location, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Applicant {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    idNumbers: ").append(toIndentedString(idNumbers)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

