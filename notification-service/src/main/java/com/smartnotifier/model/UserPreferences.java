package com.smartnotifier.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * User&#39;s active notification subscriptions.
 */

@Schema(name = "UserPreferences", description = "User's active notification subscriptions.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-25T19:30:04.879942-04:00[America/New_York]", comments = "Generator version: 7.15.0")
public class UserPreferences {

  private @Nullable String userId;

  @Valid
  private List<String> subscribedEvents = new ArrayList<>();

  public UserPreferences userId(@Nullable String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public @Nullable String getUserId() {
    return userId;
  }

  public void setUserId(@Nullable String userId) {
    this.userId = userId;
  }

  public UserPreferences subscribedEvents(List<String> subscribedEvents) {
    this.subscribedEvents = subscribedEvents;
    return this;
  }

  public UserPreferences addSubscribedEventsItem(String subscribedEventsItem) {
    if (this.subscribedEvents == null) {
      this.subscribedEvents = new ArrayList<>();
    }
    this.subscribedEvents.add(subscribedEventsItem);
    return this;
  }

  /**
   * Get subscribedEvents
   * @return subscribedEvents
   */
  
  @Schema(name = "subscribedEvents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscribedEvents")
  public List<String> getSubscribedEvents() {
    return subscribedEvents;
  }

  public void setSubscribedEvents(List<String> subscribedEvents) {
    this.subscribedEvents = subscribedEvents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPreferences userPreferences = (UserPreferences) o;
    return Objects.equals(this.userId, userPreferences.userId) &&
        Objects.equals(this.subscribedEvents, userPreferences.subscribedEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, subscribedEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPreferences {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    subscribedEvents: ").append(toIndentedString(subscribedEvents)).append("\n");
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

