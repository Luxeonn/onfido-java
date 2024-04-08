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
 * VideoReasons
 */
@JsonPropertyOrder({
  VideoReasons.JSON_PROPERTY_FAKE_WEBCAM,
  VideoReasons.JSON_PROPERTY_CHALLENGE_REUSE,
  VideoReasons.JSON_PROPERTY_EMULATOR,
  VideoReasons.JSON_PROPERTY_REASONS
})
@JsonTypeName("video_reasons")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoReasons {
  public static final String JSON_PROPERTY_FAKE_WEBCAM = "fake_webcam";
  private String fakeWebcam;

  public static final String JSON_PROPERTY_CHALLENGE_REUSE = "challenge_reuse";
  private String challengeReuse;

  public static final String JSON_PROPERTY_EMULATOR = "emulator";
  private String emulator;

  public static final String JSON_PROPERTY_REASONS = "reasons";
  private String reasons;

  public VideoReasons() { 
  }

  public VideoReasons fakeWebcam(String fakeWebcam) {
    this.fakeWebcam = fakeWebcam;
    return this;
  }

   /**
   * Flags when evidence is found that a fake webcam was used.
   * @return fakeWebcam
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAKE_WEBCAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFakeWebcam() {
    return fakeWebcam;
  }


  @JsonProperty(JSON_PROPERTY_FAKE_WEBCAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFakeWebcam(String fakeWebcam) {
    this.fakeWebcam = fakeWebcam;
  }


  public VideoReasons challengeReuse(String challengeReuse) {
    this.challengeReuse = challengeReuse;
    return this;
  }

   /**
   * Flags when evidence is found that the video was uploaded in an attempt to circumvent the randomness of the speaking and head turn challenges
   * @return challengeReuse
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHALLENGE_REUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChallengeReuse() {
    return challengeReuse;
  }


  @JsonProperty(JSON_PROPERTY_CHALLENGE_REUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChallengeReuse(String challengeReuse) {
    this.challengeReuse = challengeReuse;
  }


  public VideoReasons emulator(String emulator) {
    this.emulator = emulator;
    return this;
  }

   /**
   * Flags when evidence is found that an Android emulator was used.
   * @return emulator
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMULATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmulator() {
    return emulator;
  }


  @JsonProperty(JSON_PROPERTY_EMULATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmulator(String emulator) {
    this.emulator = emulator;
  }


  public VideoReasons reasons(String reasons) {
    this.reasons = reasons;
    return this;
  }

   /**
   * Additional comma separated details such as the name of the fake webcam.
   * @return reasons
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReasons() {
    return reasons;
  }


  @JsonProperty(JSON_PROPERTY_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasons(String reasons) {
    this.reasons = reasons;
  }


  /**
   * Return true if this video_reasons object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoReasons videoReasons = (VideoReasons) o;
    return Objects.equals(this.fakeWebcam, videoReasons.fakeWebcam) &&
        Objects.equals(this.challengeReuse, videoReasons.challengeReuse) &&
        Objects.equals(this.emulator, videoReasons.emulator) &&
        Objects.equals(this.reasons, videoReasons.reasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fakeWebcam, challengeReuse, emulator, reasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoReasons {\n");
    sb.append("    fakeWebcam: ").append(toIndentedString(fakeWebcam)).append("\n");
    sb.append("    challengeReuse: ").append(toIndentedString(challengeReuse)).append("\n");
    sb.append("    emulator: ").append(toIndentedString(emulator)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
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

