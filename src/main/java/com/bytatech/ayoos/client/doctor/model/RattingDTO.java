package com.bytatech.ayoos.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RattingDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-19T13:49:55.061+05:30[Asia/Kolkata]")

public class RattingDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("ratting")
  private Double ratting = null;

  @JsonProperty("userName")
  private String userName = null;

  public RattingDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RattingDTO ratting(Double ratting) {
    this.ratting = ratting;
    return this;
  }

  /**
   * Get ratting
   * @return ratting
  **/
  @ApiModelProperty(value = "")


  public Double getRatting() {
    return ratting;
  }

  public void setRatting(Double ratting) {
    this.ratting = ratting;
  }

  public RattingDTO userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RattingDTO rattingDTO = (RattingDTO) o;
    return Objects.equals(this.id, rattingDTO.id) &&
        Objects.equals(this.ratting, rattingDTO.ratting) &&
        Objects.equals(this.userName, rattingDTO.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ratting, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RattingDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ratting: ").append(toIndentedString(ratting)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

