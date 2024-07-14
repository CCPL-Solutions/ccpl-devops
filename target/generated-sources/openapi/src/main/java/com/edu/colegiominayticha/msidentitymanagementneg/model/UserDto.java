package com.edu.colegiominayticha.msidentitymanagementneg.model;

import java.util.Objects;
import com.edu.colegiominayticha.msidentitymanagementneg.model.RoleDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-14T16:01:16.952589Z[Etc/UTC]")@lombok.Builder
                                    @lombok.Getter
                                    @lombok.Setter
                                    @lombok.ToString
                                    @lombok.NoArgsConstructor
                                    @lombok.AllArgsConstructor

public class UserDto   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("name")
  private String name;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("roles")
  @Valid
  private List<RoleDto> roles = new ArrayList<>();

  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("createdAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private java.time.LocalDateTime createdAt;

  @JsonProperty("createdUser")
  private String createdUser;

  @JsonProperty("updatedUser")
  private String updatedUser;

  @JsonProperty("updatedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private java.time.LocalDateTime updatedAt;

  public UserDto id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * User identification.
   * @return id
  */
  @ApiModelProperty(readOnly = true, value = "User identification.")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UserDto username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username.
   * @return username
  */
  @ApiModelProperty(required = true, value = "Username.")
  @NotNull

@Size(max=50) 
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password.
   * @return password
  */
  @ApiModelProperty(required = true, value = "Password.")
  @NotNull

@Size(max=500) 
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Full user name.
   * @return name
  */
  @ApiModelProperty(required = true, value = "Full user name.")
  @NotNull

@Size(max=50) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name.
   * @return lastName
  */
  @ApiModelProperty(required = true, value = "Last name.")
  @NotNull

@Size(max=50) 
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User email.
   * @return email
  */
  @ApiModelProperty(required = true, value = "User email.")
  @NotNull

@Size(max=500) 
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDto roles(List<RoleDto> roles) {
    this.roles = roles;
    return this;
  }

  public UserDto addRolesItem(RoleDto rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<RoleDto> getRoles() {
    return roles;
  }

  public void setRoles(List<RoleDto> roles) {
    this.roles = roles;
  }

  public UserDto enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Field that indicates if the user is active within the system.
   * @return enabled
  */
  @ApiModelProperty(readOnly = true, value = "Field that indicates if the user is active within the system.")


  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public UserDto createdAt(java.time.LocalDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * User creation date and time.
   * @return createdAt
  */
  @ApiModelProperty(readOnly = true, value = "User creation date and time.")

  @Valid

  public java.time.LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.time.LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserDto createdUser(String createdUser) {
    this.createdUser = createdUser;
    return this;
  }

  /**
   * Username of the user who created the user.
   * @return createdUser
  */
  @ApiModelProperty(readOnly = true, value = "Username of the user who created the user.")


  public String getCreatedUser() {
    return createdUser;
  }

  public void setCreatedUser(String createdUser) {
    this.createdUser = createdUser;
  }

  public UserDto updatedUser(String updatedUser) {
    this.updatedUser = updatedUser;
    return this;
  }

  /**
   * Username of the user who update the user.
   * @return updatedUser
  */
  @ApiModelProperty(readOnly = true, value = "Username of the user who update the user.")


  public String getUpdatedUser() {
    return updatedUser;
  }

  public void setUpdatedUser(String updatedUser) {
    this.updatedUser = updatedUser;
  }

  public UserDto updatedAt(java.time.LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * User modification date and time.
   * @return updatedAt
  */
  @ApiModelProperty(readOnly = true, value = "User modification date and time.")

  @Valid

  public java.time.LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(java.time.LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDto userDto = (UserDto) o;
    return Objects.equals(this.id, userDto.id) &&
        Objects.equals(this.username, userDto.username) &&
        Objects.equals(this.password, userDto.password) &&
        Objects.equals(this.name, userDto.name) &&
        Objects.equals(this.lastName, userDto.lastName) &&
        Objects.equals(this.email, userDto.email) &&
        Objects.equals(this.roles, userDto.roles) &&
        Objects.equals(this.enabled, userDto.enabled) &&
        Objects.equals(this.createdAt, userDto.createdAt) &&
        Objects.equals(this.createdUser, userDto.createdUser) &&
        Objects.equals(this.updatedUser, userDto.updatedUser) &&
        Objects.equals(this.updatedAt, userDto.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, password, name, lastName, email, roles, enabled, createdAt, createdUser, updatedUser, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdUser: ").append(toIndentedString(createdUser)).append("\n");
    sb.append("    updatedUser: ").append(toIndentedString(updatedUser)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

