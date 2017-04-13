package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Partner;
import io.swagger.model.TransactionLine;
import java.math.BigDecimal;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
/**
 * Transaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

public class Transaction   {
  @JsonProperty("transaction_id")
  private BigDecimal transactionId = null;

  @JsonProperty("partner")
  private Partner partner = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("reference")
  private String reference = null;

  /**
   * enum of draft, posted.
   */
  public enum StatusEnum {
    DRAFT("draft"),
    
    POSTED("posted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("date_posted")
  private LocalDate datePosted = null;

  @JsonProperty("transaction_lines")
  private TransactionLine transactionLines = null;

  public Transaction transactionId(BigDecimal transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The id of this object.
   * @return transactionId
  **/
  @ApiModelProperty(value = "The id of this object.")
  public BigDecimal getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(BigDecimal transactionId) {
    this.transactionId = transactionId;
  }

  public Transaction partner(Partner partner) {
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

  public Transaction displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of this transaction.
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of this transaction.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Transaction reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * A text value for reference.
   * @return reference
  **/
  @ApiModelProperty(value = "A text value for reference.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Transaction status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * enum of draft, posted.
   * @return status
  **/
  @ApiModelProperty(value = "enum of draft, posted.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Transaction datePosted(LocalDate datePosted) {
    this.datePosted = datePosted;
    return this;
  }

   /**
   * The date this was posted.
   * @return datePosted
  **/
  @ApiModelProperty(value = "The date this was posted.")
  public LocalDate getDatePosted() {
    return datePosted;
  }

  public void setDatePosted(LocalDate datePosted) {
    this.datePosted = datePosted;
  }

  public Transaction transactionLines(TransactionLine transactionLines) {
    this.transactionLines = transactionLines;
    return this;
  }

   /**
   * Get transactionLines
   * @return transactionLines
  **/
  @ApiModelProperty(value = "")
  public TransactionLine getTransactionLines() {
    return transactionLines;
  }

  public void setTransactionLines(TransactionLine transactionLines) {
    this.transactionLines = transactionLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.transactionId, transaction.transactionId) &&
        Objects.equals(this.partner, transaction.partner) &&
        Objects.equals(this.displayName, transaction.displayName) &&
        Objects.equals(this.reference, transaction.reference) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.datePosted, transaction.datePosted) &&
        Objects.equals(this.transactionLines, transaction.transactionLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, partner, displayName, reference, status, datePosted, transactionLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    datePosted: ").append(toIndentedString(datePosted)).append("\n");
    sb.append("    transactionLines: ").append(toIndentedString(transactionLines)).append("\n");
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

