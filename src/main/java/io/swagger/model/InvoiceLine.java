package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Account;
import io.swagger.model.Charge;
import io.swagger.model.Period;
import java.math.BigDecimal;
import javax.validation.constraints.*;
/**
 * InvoiceLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

public class InvoiceLine   {
  @JsonProperty("invoiceline_id")
  private BigDecimal invoicelineId = null;

  @JsonProperty("charge")
  private Charge charge = null;

  @JsonProperty("account")
  private Account account = null;

  @JsonProperty("period")
  private Period period = null;

  @JsonProperty("invoice_amount")
  private Float invoiceAmount = null;

  public InvoiceLine invoicelineId(BigDecimal invoicelineId) {
    this.invoicelineId = invoicelineId;
    return this;
  }

   /**
   * The id of this object.
   * @return invoicelineId
  **/
  @ApiModelProperty(value = "The id of this object.")
  public BigDecimal getInvoicelineId() {
    return invoicelineId;
  }

  public void setInvoicelineId(BigDecimal invoicelineId) {
    this.invoicelineId = invoicelineId;
  }

  public InvoiceLine charge(Charge charge) {
    this.charge = charge;
    return this;
  }

   /**
   * Get charge
   * @return charge
  **/
  @ApiModelProperty(value = "")
  public Charge getCharge() {
    return charge;
  }

  public void setCharge(Charge charge) {
    this.charge = charge;
  }

  public InvoiceLine account(Account account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public InvoiceLine period(Period period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(value = "")
  public Period getPeriod() {
    return period;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public InvoiceLine invoiceAmount(Float invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * The amount of this line on the invoice.
   * @return invoiceAmount
  **/
  @ApiModelProperty(value = "The amount of this line on the invoice.")
  public Float getInvoiceAmount() {
    return invoiceAmount;
  }

  public void setInvoiceAmount(Float invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceLine invoiceLine = (InvoiceLine) o;
    return Objects.equals(this.invoicelineId, invoiceLine.invoicelineId) &&
        Objects.equals(this.charge, invoiceLine.charge) &&
        Objects.equals(this.account, invoiceLine.account) &&
        Objects.equals(this.period, invoiceLine.period) &&
        Objects.equals(this.invoiceAmount, invoiceLine.invoiceAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoicelineId, charge, account, period, invoiceAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceLine {\n");
    
    sb.append("    invoicelineId: ").append(toIndentedString(invoicelineId)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
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

