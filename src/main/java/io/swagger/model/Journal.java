package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
/**
 * Journal
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

public class Journal   {
  @JsonProperty("journal_id")
  private BigDecimal journalId = null;

  @JsonProperty("display_name")
  private String displayName = null;

  /**
   * enum of sale, purchase, bank, cash, general.
   */
  public enum JournalTypeEnum {
    SALE("sale"),
    
    PURCHASE("purchase"),
    
    BANK("bank"),
    
    CASH("cash"),
    
    GENERAL("general");

    private String value;

    JournalTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static JournalTypeEnum fromValue(String text) {
      for (JournalTypeEnum b : JournalTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("journal_type")
  private JournalTypeEnum journalType = null;

  @JsonProperty("default_credit_account_id")
  private BigDecimal defaultCreditAccountId = null;

  @JsonProperty("default_debit_account_id")
  private BigDecimal defaultDebitAccountId = null;

  public Journal journalId(BigDecimal journalId) {
    this.journalId = journalId;
    return this;
  }

   /**
   * The id of this object.
   * @return journalId
  **/
  @ApiModelProperty(value = "The id of this object.")
  public BigDecimal getJournalId() {
    return journalId;
  }

  public void setJournalId(BigDecimal journalId) {
    this.journalId = journalId;
  }

  public Journal displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of fiscalyear.
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of fiscalyear.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Journal journalType(JournalTypeEnum journalType) {
    this.journalType = journalType;
    return this;
  }

   /**
   * enum of sale, purchase, bank, cash, general.
   * @return journalType
  **/
  @ApiModelProperty(value = "enum of sale, purchase, bank, cash, general.")
  public JournalTypeEnum getJournalType() {
    return journalType;
  }

  public void setJournalType(JournalTypeEnum journalType) {
    this.journalType = journalType;
  }

  public Journal defaultCreditAccountId(BigDecimal defaultCreditAccountId) {
    this.defaultCreditAccountId = defaultCreditAccountId;
    return this;
  }

   /**
   * The id of the credit account.
   * @return defaultCreditAccountId
  **/
  @ApiModelProperty(value = "The id of the credit account.")
  public BigDecimal getDefaultCreditAccountId() {
    return defaultCreditAccountId;
  }

  public void setDefaultCreditAccountId(BigDecimal defaultCreditAccountId) {
    this.defaultCreditAccountId = defaultCreditAccountId;
  }

  public Journal defaultDebitAccountId(BigDecimal defaultDebitAccountId) {
    this.defaultDebitAccountId = defaultDebitAccountId;
    return this;
  }

   /**
   * The id of the debit account.
   * @return defaultDebitAccountId
  **/
  @ApiModelProperty(value = "The id of the debit account.")
  public BigDecimal getDefaultDebitAccountId() {
    return defaultDebitAccountId;
  }

  public void setDefaultDebitAccountId(BigDecimal defaultDebitAccountId) {
    this.defaultDebitAccountId = defaultDebitAccountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Journal journal = (Journal) o;
    return Objects.equals(this.journalId, journal.journalId) &&
        Objects.equals(this.displayName, journal.displayName) &&
        Objects.equals(this.journalType, journal.journalType) &&
        Objects.equals(this.defaultCreditAccountId, journal.defaultCreditAccountId) &&
        Objects.equals(this.defaultDebitAccountId, journal.defaultDebitAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(journalId, displayName, journalType, defaultCreditAccountId, defaultDebitAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Journal {\n");
    
    sb.append("    journalId: ").append(toIndentedString(journalId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    journalType: ").append(toIndentedString(journalType)).append("\n");
    sb.append("    defaultCreditAccountId: ").append(toIndentedString(defaultCreditAccountId)).append("\n");
    sb.append("    defaultDebitAccountId: ").append(toIndentedString(defaultDebitAccountId)).append("\n");
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

