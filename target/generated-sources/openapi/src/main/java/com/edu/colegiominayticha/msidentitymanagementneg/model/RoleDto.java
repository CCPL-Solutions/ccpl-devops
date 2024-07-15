package com.edu.colegiominayticha.msidentitymanagementneg.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoleDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-15T19:26:32.326386Z[Etc/UTC]")@lombok.Builder
                                    @lombok.Getter
                                    @lombok.Setter
                                    @lombok.ToString
                                    @lombok.NoArgsConstructor
                                    @lombok.AllArgsConstructor

public class RoleDto   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;

  public RoleDto id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Role identification.
   * @return id
  */
  @ApiModelProperty(required = true, value = "Role identification.")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public RoleDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Role name.
   * @return name
  */
  @ApiModelProperty(readOnly = true, value = "Role name.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleDto roleDto = (RoleDto) o;
    return Objects.equals(this.id, roleDto.id) &&
        Objects.equals(this.name, roleDto.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

