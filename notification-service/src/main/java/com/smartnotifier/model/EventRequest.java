package com.smartnotifier.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Represents an event triggered by an external service
 */

@Schema(name = "EventRequest", description = "Represents an event triggered by an external service")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-25T19:30:04.879942-04:00[America/New_York]", comments = "Generator version: 7.15.0")
public class EventRequest {

  private String eventType;

  private String userId;

  private Object payload;

  public EventRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EventRequest(String eventType, String userId, Object payload) {
    this.eventType = eventType;
    this.userId = userId;
    this.payload = payload;
  }

  public EventRequest eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
   */
  @NotNull 
  @Schema(name = "eventType", example = "ORDER_PLACED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public EventRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @NotNull 
  @Schema(name = "userId", example = "user_123", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public EventRequest payload(Object payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Event-specific data
   * @return payload
   */
  @NotNull 
  @Schema(name = "payload", example = "{\"orderId\":\"abc-456\",\"amount\":49.99}", description = "Event-specific data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("payload")
  public Object getPayload() {
    return payload;
  }

  public void setPayload(Object payload) {
    this.payload = payload;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventRequest eventRequest = (EventRequest) o;
    return Objects.equals(this.eventType, eventRequest.eventType) &&
        Objects.equals(this.userId, eventRequest.userId) &&
        Objects.equals(this.payload, eventRequest.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, userId, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventRequest {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

