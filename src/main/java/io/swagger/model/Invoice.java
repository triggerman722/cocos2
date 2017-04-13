package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Account;
import io.swagger.model.InvoiceLine;
import io.swagger.model.Journal;
import io.swagger.model.Partner;
import java.math.BigDecimal;
import javax.validation.constraints.*;
/**
 * Invoice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

public class Invoice   {
  @JsonProperty("invoice_id")
  private BigDecimal invoiceId = null;

  @JsonProperty("journal")
  private Journal journal = null;

  @JsonProperty("partner")
  private Partner partner = null;

  @JsonProperty("account")
  private Account account = null;

  @JsonProperty("invoice_number")
  private BigDecimal invoiceNumber = null;

  @JsonProperty("invoice_total_amount")
  private Float invoiceTotalAmount = null;

  @JsonProperty("invoice_lines")
  private InvoiceLine invoiceLines = null;

  public Invoice invoiceId(BigDecimal invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The id of the invoice.
   * @return invoiceId
  **/
  @ApiModelProperty(value = "The id of the invoice.")
  public BigDecimal getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(BigDecimal invoiceId) {
    this.invoiceId = invoiceId;
  }

  public Invoice journal(Journal journal) {
    this.journal = journal;
    return this;
  }

   /**
   * Get journal
   * @return journal
  **/
  @ApiModelProperty(value = "")
  public Journal getJournal() {
    return journal;
  }

  public void setJournal(Journal journal) {
    this.journal = journal;
  }

  public Invoice partner(Partner partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @ApiModelProperty(value = "")
  public Partner getPartner() {
    return partner;
  }

  public void setPartner(Partner partner) {
    this.partner = partner;
  }

  public Invoice account(Account account) {
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

  public Invoice invoiceNumber(BigDecimal invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * The invoice number.
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "The invoice number.")
  public BigDecimal getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(BigDecimal invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Invoice invoiceTotalAmount(Float invoiceTotalAmount) {
    this.invoiceTotalAmount = invoiceTotalAmount;
    return this;
  }

   /**
   * The amount of this invoice.
   * @return invoiceTotalAmount
  **/
  @ApiModelProperty(value = "The amount of this invoice.")
  public Float getInvoiceTotalAmount() {
    return invoiceTotalAmount;
  }

  public void setInvoiceTotalAmount(Float invoiceTotalAmount) {
    this.invoiceTotalAmount = invoiceTotalAmount;
  }

  public Invoice invoiceLines(InvoiceLine invoiceLines) {
    this.invoiceLines = invoiceLines;
    return this;
  }

   /**
   * Get invoiceLines
   * @return invoiceLines
  **/
  @ApiModelProperty(value = "")
  public InvoiceLine getInvoiceLines() {
    return invoiceLines;
  }

  public void setInvoiceLines(InvoiceLine invoiceLines) {
    this.invoiceLines = invoiceLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.invoiceId, invoice.invoiceId) &&
        Objects.equals(this.journal, invoice.journal) &&
        Objects.equals(this.partner, invoice.partner) &&
        Objects.equals(this.account, invoice.account) &&
        Objects.equals(this.invoiceNumber, invoice.invoiceNumber) &&
        Objects.equals(this.invoiceTotalAmount, invoice.invoiceTotalAmount) &&
        Objects.equals(this.invoiceLines, invoice.invoiceLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, journal, partner, account, invoiceNumber, invoiceTotalAmount, invoiceLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    journal: ").append(toIndentedString(journal)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    invoiceTotalAmount: ").append(toIndentedString(invoiceTotalAmount)).append("\n");
    sb.append("    invoiceLines: ").append(toIndentedString(invoiceLines)).append("\n");
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

