package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
/**
 * Currency
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

public class Currency   {
  @JsonProperty("currency_id")
  private BigDecimal currencyId = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("currency_code")
  private String currencyCode = null;

  public Currency currencyId(BigDecimal currencyId) {
    this.currencyId = currencyId;
    return this;
  }

   /**
   * The id of this object.
   * @return currencyId
  **/
  @ApiModelProperty(value = "The id of this object.")
  public BigDecimal getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(BigDecimal currencyId) {
    this.currencyId = currencyId;
  }

  public Currency displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of this currency.
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of this currency.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Currency currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Currency code string.
   * @return currencyCode
  **/
  @ApiModelProperty(value = "Currency code string.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currency currency = (Currency) o;
    return Objects.equals(this.currencyId, currency.currencyId) &&
        Objects.equals(this.displayName, currency.displayName) &&
        Objects.equals(this.currencyCode, currency.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyId, displayName, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

