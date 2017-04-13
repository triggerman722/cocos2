package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Currency;
import java.math.BigDecimal;
import javax.validation.constraints.*;
/**
 * Charge
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

public class Charge   {
  @JsonProperty("charge_id")
  private BigDecimal chargeId = null;

  @JsonProperty("currency")
  private Currency currency = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("sku")
  private String sku = null;

  @JsonProperty("amount")
  private Float amount = null;

  @JsonProperty("description")
  private String description = null;

  public Charge chargeId(BigDecimal chargeId) {
    this.chargeId = chargeId;
    return this;
  }

   /**
   * The id of this object.
   * @return chargeId
  **/
  @ApiModelProperty(value = "The id of this object.")
  public BigDecimal getChargeId() {
    return chargeId;
  }

  public void setChargeId(BigDecimal chargeId) {
    this.chargeId = chargeId;
  }

  public Charge currency(Currency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public Charge displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of this charge.
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of this charge.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Charge sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * A text value for sku.
   * @return sku
  **/
  @ApiModelProperty(value = "A text value for sku.")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Charge amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * A float value for amount.
   * @return amount
  **/
  @ApiModelProperty(value = "A float value for amount.")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public Charge description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A text value for description.
   * @return description
  **/
  @ApiModelProperty(value = "A text value for description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charge charge = (Charge) o;
    return Objects.equals(this.chargeId, charge.chargeId) &&
        Objects.equals(this.currency, charge.currency) &&
        Objects.equals(this.displayName, charge.displayName) &&
        Objects.equals(this.sku, charge.sku) &&
        Objects.equals(this.amount, charge.amount) &&
        Objects.equals(this.description, charge.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeId, currency, displayName, sku, amount, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    
    sb.append("    chargeId: ").append(toIndentedString(chargeId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

