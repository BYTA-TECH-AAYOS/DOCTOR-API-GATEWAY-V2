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
 * ReviewDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-19T21:12:08.931+05:30[Asia/Calcutta]")

public class ReviewDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("review")
  private String review = null;

  @JsonProperty("userRatingId")
  private Long userRatingId = null;

  public ReviewDTO id(Long id) {
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

  public ReviewDTO review(String review) {
    this.review = review;
    return this;
  }

  /**
   * Get review
   * @return review
  **/
  @ApiModelProperty(value = "")


  public String getReview() {
    return review;
  }

  public void setReview(String review) {
    this.review = review;
  }

  public ReviewDTO userRatingId(Long userRatingId) {
    this.userRatingId = userRatingId;
    return this;
  }

  /**
   * Get userRatingId
   * @return userRatingId
  **/
  @ApiModelProperty(value = "")


  public Long getUserRatingId() {
    return userRatingId;
  }

  public void setUserRatingId(Long userRatingId) {
    this.userRatingId = userRatingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewDTO reviewDTO = (ReviewDTO) o;
    return Objects.equals(this.id, reviewDTO.id) &&
        Objects.equals(this.review, reviewDTO.review) &&
        Objects.equals(this.userRatingId, reviewDTO.userRatingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, review, userRatingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    userRatingId: ").append(toIndentedString(userRatingId)).append("\n");
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

