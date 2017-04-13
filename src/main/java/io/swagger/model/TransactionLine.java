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
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
/**
 * TransactionLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

public class TransactionLine   {
  @JsonProperty("transactionline_id")
  private BigDecimal transactionlineId = null;

  @JsonProperty("account")
  private Account account = null;

  @JsonProperty("period")
  private Period period = null;

  @JsonProperty("charge")
  private Charge charge = null;

  @JsonProperty("credit")
  private Float credit = null;

  @JsonProperty("debit")
  private Float debit = null;

  @JsonProperty("balance")
  private Float balance = null;

  @JsonProperty("date_posted")
  private LocalDate datePosted = null;

  @JsonProperty("reconciled")
  private Boolean reconciled = null;

  public TransactionLine transactionlineId(BigDecimal transactionlineId) {
    this.transactionlineId = transactionlineId;
    return this;
  }

   /**
   * The id of the transactionline.
   * @return transactionlineId
  **/
  @ApiModelProperty(value = "The id of the transactionline.")
  public BigDecimal getTransactionlineId() {
    return transactionlineId;
  }

  public void setTransactionlineId(BigDecimal transactionlineId) {
    this.transactionlineId = transactionlineId;
  }

  public TransactionLine account(Account account) {
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

  public TransactionLine period(Period period) {
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

  public TransactionLine charge(Charge charge) {
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

  public TransactionLine credit(Float credit) {
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

  public TransactionLine debit(Float debit) {
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

  public TransactionLine balance(Float balance) {
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

  public TransactionLine datePosted(LocalDate datePosted) {
    this.datePosted = datePosted;
    return this;
  }

   /**
   * The date it happened.
   * @return datePosted
  **/
  @ApiModelProperty(value = "The date it happened.")
  public LocalDate getDatePosted() {
    return datePosted;
  }

  public void setDatePosted(LocalDate datePosted) {
    this.datePosted = datePosted;
  }

  public TransactionLine reconciled(Boolean reconciled) {
    this.reconciled = reconciled;
    return this;
  }

   /**
   * Indicator of reconcilliation..
   * @return reconciled
  **/
  @ApiModelProperty(value = "Indicator of reconcilliation..")
  public Boolean getReconciled() {
    return reconciled;
  }

  public void setReconciled(Boolean reconciled) {
    this.reconciled = reconciled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionLine transactionLine = (TransactionLine) o;
    return Objects.equals(this.transactionlineId, transactionLine.transactionlineId) &&
        Objects.equals(this.account, transactionLine.account) &&
        Objects.equals(this.period, transactionLine.period) &&
        Objects.equals(this.charge, transactionLine.charge) &&
        Objects.equals(this.credit, transactionLine.credit) &&
        Objects.equals(this.debit, transactionLine.debit) &&
        Objects.equals(this.balance, transactionLine.balance) &&
        Objects.equals(this.datePosted, transactionLine.datePosted) &&
        Objects.equals(this.reconciled, transactionLine.reconciled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionlineId, account, period, charge, credit, debit, balance, datePosted, reconciled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionLine {\n");
    
    sb.append("    transactionlineId: ").append(toIndentedString(transactionlineId)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    datePosted: ").append(toIndentedString(datePosted)).append("\n");
    sb.append("    reconciled: ").append(toIndentedString(reconciled)).append("\n");
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

