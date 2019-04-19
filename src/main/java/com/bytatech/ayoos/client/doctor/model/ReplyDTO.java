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
 * ReplyDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-19T13:49:55.061+05:30[Asia/Kolkata]")

public class ReplyDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("replay")
  private String replay = null;

  @JsonProperty("reviewId")
  private Long reviewId = null;

  public ReplyDTO id(Long id) {
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

  public ReplyDTO replay(String replay) {
    this.replay = replay;
    return this;
  }

  /**
   * Get replay
   * @return replay
  **/
  @ApiModelProperty(value = "")


  public String getReplay() {
    return replay;
  }

  public void setReplay(String replay) {
    this.replay = replay;
  }

  public ReplyDTO reviewId(Long reviewId) {
    this.reviewId = reviewId;
    return this;
  }

  /**
   * Get reviewId
   * @return reviewId
  **/
  @ApiModelProperty(value = "")


  public Long getReviewId() {
    return reviewId;
  }

  public void setReviewId(Long reviewId) {
    this.reviewId = reviewId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplyDTO replyDTO = (ReplyDTO) o;
    return Objects.equals(this.id, replyDTO.id) &&
        Objects.equals(this.replay, replyDTO.replay) &&
        Objects.equals(this.reviewId, replyDTO.reviewId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, replay, reviewId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplyDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    replay: ").append(toIndentedString(replay)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
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

