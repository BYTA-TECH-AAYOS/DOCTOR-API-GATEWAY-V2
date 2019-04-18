package com.bytatech.ayoos.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DoctorDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-18T10:03:07.389+05:30[Asia/Calcutta]")

public class DoctorDTO   {
  @JsonProperty("contactInfoId")
  private Long contactInfoId = null;

  @JsonProperty("doctorId")
  private String doctorId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("practiceSince")
  private OffsetDateTime practiceSince = null;

  @JsonProperty("rattingId")
  private Long rattingId = null;

  @JsonProperty("registerNumber")
  private String registerNumber = null;

  @JsonProperty("specialization")
  private String specialization = null;

  public DoctorDTO contactInfoId(Long contactInfoId) {
    this.contactInfoId = contactInfoId;
    return this;
  }

  /**
   * Get contactInfoId
   * @return contactInfoId
  **/
  @ApiModelProperty(value = "")


  public Long getContactInfoId() {
    return contactInfoId;
  }

  public void setContactInfoId(Long contactInfoId) {
    this.contactInfoId = contactInfoId;
  }

  public DoctorDTO doctorId(String doctorId) {
    this.doctorId = doctorId;
    return this;
  }

  /**
   * Get doctorId
   * @return doctorId
  **/
  @ApiModelProperty(value = "")


  public String getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(String doctorId) {
    this.doctorId = doctorId;
  }

  public DoctorDTO id(Long id) {
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

  public DoctorDTO practiceSince(OffsetDateTime practiceSince) {
    this.practiceSince = practiceSince;
    return this;
  }

  /**
   * Get practiceSince
   * @return practiceSince
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPracticeSince() {
    return practiceSince;
  }

  public void setPracticeSince(OffsetDateTime practiceSince) {
    this.practiceSince = practiceSince;
  }

  public DoctorDTO rattingId(Long rattingId) {
    this.rattingId = rattingId;
    return this;
  }

  /**
   * Get rattingId
   * @return rattingId
  **/
  @ApiModelProperty(value = "")


  public Long getRattingId() {
    return rattingId;
  }

  public void setRattingId(Long rattingId) {
    this.rattingId = rattingId;
  }

  public DoctorDTO registerNumber(String registerNumber) {
    this.registerNumber = registerNumber;
    return this;
  }

  /**
   * Get registerNumber
   * @return registerNumber
  **/
  @ApiModelProperty(value = "")


  public String getRegisterNumber() {
    return registerNumber;
  }

  public void setRegisterNumber(String registerNumber) {
    this.registerNumber = registerNumber;
  }

  public DoctorDTO specialization(String specialization) {
    this.specialization = specialization;
    return this;
  }

  /**
   * Get specialization
   * @return specialization
  **/
  @ApiModelProperty(value = "")


  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoctorDTO doctorDTO = (DoctorDTO) o;
    return Objects.equals(this.contactInfoId, doctorDTO.contactInfoId) &&
        Objects.equals(this.doctorId, doctorDTO.doctorId) &&
        Objects.equals(this.id, doctorDTO.id) &&
        Objects.equals(this.practiceSince, doctorDTO.practiceSince) &&
        Objects.equals(this.rattingId, doctorDTO.rattingId) &&
        Objects.equals(this.registerNumber, doctorDTO.registerNumber) &&
        Objects.equals(this.specialization, doctorDTO.specialization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactInfoId, doctorId, id, practiceSince, rattingId, registerNumber, specialization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoctorDTO {\n");
    
    sb.append("    contactInfoId: ").append(toIndentedString(contactInfoId)).append("\n");
    sb.append("    doctorId: ").append(toIndentedString(doctorId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    practiceSince: ").append(toIndentedString(practiceSince)).append("\n");
    sb.append("    rattingId: ").append(toIndentedString(rattingId)).append("\n");
    sb.append("    registerNumber: ").append(toIndentedString(registerNumber)).append("\n");
    sb.append("    specialization: ").append(toIndentedString(specialization)).append("\n");
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

