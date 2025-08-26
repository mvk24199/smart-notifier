package com.smartnotifier.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Template content to render a notification
 */

@Schema(name = "TemplateRequest", description = "Template content to render a notification")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-25T19:30:04.879942-04:00[America/New_York]", comments = "Generator version: 7.15.0")
public class TemplateRequest {

  private String templateId;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    EMAIL("EMAIL"),
    
    SMS("SMS"),
    
    PUSH("PUSH");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String subject;

  private String body;

  public TemplateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TemplateRequest(String templateId, TypeEnum type, String subject, String body) {
    this.templateId = templateId;
    this.type = type;
    this.subject = subject;
    this.body = body;
  }

  public TemplateRequest templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * Get templateId
   * @return templateId
   */
  @NotNull 
  @Schema(name = "templateId", example = "order-confirmation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("templateId")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public TemplateRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TemplateRequest subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
   */
  @NotNull 
  @Schema(name = "subject", example = "Your order is confirmed!", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public TemplateRequest body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   * @return body
   */
  @NotNull 
  @Schema(name = "body", example = "Hello {{userName}}, your order {{orderId}} is confirmed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateRequest templateRequest = (TemplateRequest) o;
    return Objects.equals(this.templateId, templateRequest.templateId) &&
        Objects.equals(this.type, templateRequest.type) &&
        Objects.equals(this.subject, templateRequest.subject) &&
        Objects.equals(this.body, templateRequest.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, type, subject, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateRequest {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

