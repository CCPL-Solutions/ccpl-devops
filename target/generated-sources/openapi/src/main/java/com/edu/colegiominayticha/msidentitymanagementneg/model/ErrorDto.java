package com.edu.colegiominayticha.msidentitymanagementneg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Este objeto contiene infromación relacionada con errores presentados en el microservicio.
 */
@ApiModel(description = "Este objeto contiene infromación relacionada con errores presentados en el microservicio.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-15T19:26:32.326386Z[Etc/UTC]")@lombok.Builder
                                    @lombok.Getter
                                    @lombok.Setter
                                    @lombok.ToString
                                    @lombok.NoArgsConstructor
                                    @lombok.AllArgsConstructor

public class ErrorDto   {
  @JsonProperty("timeStamp")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private java.time.LocalDateTime timeStamp;

  @JsonProperty("codeStatus")
  private Integer codeStatus;

  @JsonProperty("status")
  private String status;

  @JsonProperty("codeMessage")
  private String codeMessage;

  @JsonProperty("message")
  private String message;

  @JsonProperty("errors")
  @Valid
  private List<String> errors = null;

  public ErrorDto timeStamp(java.time.LocalDateTime timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * Get timeStamp
   * @return timeStamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public java.time.LocalDateTime getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(java.time.LocalDateTime timeStamp) {
    this.timeStamp = timeStamp;
  }

  public ErrorDto codeStatus(Integer codeStatus) {
    this.codeStatus = codeStatus;
    return this;
  }

  /**
   * Get codeStatus
   * @return codeStatus
  */
  @ApiModelProperty(value = "")


  public Integer getCodeStatus() {
    return codeStatus;
  }

  public void setCodeStatus(Integer codeStatus) {
    this.codeStatus = codeStatus;
  }

  public ErrorDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ErrorDto codeMessage(String codeMessage) {
    this.codeMessage = codeMessage;
    return this;
  }

  /**
   * Get codeMessage
   * @return codeMessage
  */
  @ApiModelProperty(value = "")


  public String getCodeMessage() {
    return codeMessage;
  }

  public void setCodeMessage(String codeMessage) {
    this.codeMessage = codeMessage;
  }

  public ErrorDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorDto errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorDto addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")


  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto errorDto = (ErrorDto) o;
    return Objects.equals(this.timeStamp, errorDto.timeStamp) &&
        Objects.equals(this.codeStatus, errorDto.codeStatus) &&
        Objects.equals(this.status, errorDto.status) &&
        Objects.equals(this.codeMessage, errorDto.codeMessage) &&
        Objects.equals(this.message, errorDto.message) &&
        Objects.equals(this.errors, errorDto.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeStamp, codeStatus, status, codeMessage, message, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    codeStatus: ").append(toIndentedString(codeStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    codeMessage: ").append(toIndentedString(codeMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

