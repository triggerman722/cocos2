package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Currency;
import java.math.BigDecimal;
import javax.validation.constraints.*;
/**
 * Account
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

public class Account   {
  @JsonProperty("account_id")
  private BigDecimal accountId = null;

  @JsonProperty("account_code")
  private BigDecimal accountCode = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("currency")
  private Currency currency = null;

  /**
   * Enum... other, receivable, payable, liquidity.
   */
  public enum AccountTypeEnum {
    RECEIVABLE("receivable"),
    
    PAYABLE("payable"),
    
    LIQUIDITY("liquidity"),
    
    OTHER("other");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("account_type")
  private AccountTypeEnum accountType = null;

  @JsonProperty("credit")
  private Float credit = null;

  @JsonProperty("debit")
  private Float debit = null;

  @JsonProperty("balance")
  private Float balance = null;

  public Account accountId(BigDecimal accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Unique identifier representing a specific account.
   * @return accountId
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific account.")
  public BigDecimal getAccountId() {
    return accountId;
  }

  public void setAccountId(BigDecimal accountId) {
    this.accountId = accountId;
  }

  public Account accountCode(BigDecimal accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * account code (int).
   * @return accountCode
  **/
  @ApiModelProperty(value = "account code (int).")
  public BigDecimal getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(BigDecimal accountCode) {
    this.accountCode = accountCode;
  }

  public Account displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of account.
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of account.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Account currency(Currency currency) {
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

  public Account accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Enum... other, receivable, payable, liquidity.
   * @return accountType
  **/
  @ApiModelProperty(value = "Enum... other, receivable, payable, liquidity.")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public Account credit(Float credit) {
    this.credit = credit;
    return this;
  }

   /**
   * Floating point value for credit.
   * @return credit
  **/
  @ApiModelProperty(value = "Floating point value for credit.")
  public Float getCredit() {
    return credit;
  }

  public void setCredit(Float credit) {
    this.credit = credit;
  }

  public Account debit(Float debit) {
    this.debit = debit;
    return this;
  }

   /**
   * Floating point value for debit.
   * @return debit
  **/
  @ApiModelProperty(value = "Floating point value for debit.")
  public Float getDebit() {
    return debit;
  }

  public void setDebit(Float debit) {
    this.debit = debit;
  }

  public Account balance(Float balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Floating point value for balance.
   * @return balance
  **/
  @ApiModelProperty(value = "Floating point value for balance.")
  public Float getBalance() {
    return balance;
  }

  public void setBalance(Float balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountId, account.accountId) &&
        Objects.equals(this.accountCode, account.accountCode) &&
        Objects.equals(this.displayName, account.displayName) &&
        Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.credit, account.credit) &&
        Objects.equals(this.debit, account.debit) &&
        Objects.equals(this.balance, account.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountCode, displayName, currency, accountType, credit, debit, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

