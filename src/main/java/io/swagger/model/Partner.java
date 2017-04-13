package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
/**
 * Partner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

public class Partner   {
  @JsonProperty("partner_id")
  private BigDecimal partnerId = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("email")
  private String email = null;

  public Partner partnerId(BigDecimal partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * The id of this object.
   * @return partnerId
  **/
  @ApiModelProperty(value = "The id of this object.")
  public BigDecimal getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(BigDecimal partnerId) {
    this.partnerId = partnerId;
  }

  public Partner displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of this partner.
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of this partner.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Partner email(String email) {
    this.email = email;
    return this;
  }

   /**
   * A text value for email.
   * @return email
  **/
  @ApiModelProperty(value = "A text value for email.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Partner partner = (Partner) o;
    return Objects.equals(this.partnerId, partner.partnerId) &&
        Objects.equals(this.displayName, partner.displayName) &&
        Objects.equals(this.email, partner.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, displayName, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Partner {\n");
    
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

