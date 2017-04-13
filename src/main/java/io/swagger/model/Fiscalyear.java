package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
/**
 * Fiscalyear
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

public class Fiscalyear   {
  @JsonProperty("fiscalyear_id")
  private BigDecimal fiscalyearId = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("date_from")
  private LocalDate dateFrom = null;

  @JsonProperty("date_to")
  private LocalDate dateTo = null;

  public Fiscalyear fiscalyearId(BigDecimal fiscalyearId) {
    this.fiscalyearId = fiscalyearId;
    return this;
  }

   /**
   * The id of this object.
   * @return fiscalyearId
  **/
  @ApiModelProperty(value = "The id of this object.")
  public BigDecimal getFiscalyearId() {
    return fiscalyearId;
  }

  public void setFiscalyearId(BigDecimal fiscalyearId) {
    this.fiscalyearId = fiscalyearId;
  }

  public Fiscalyear displayName(String displayName) {
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

  public Fiscalyear dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * The From date.
   * @return dateFrom
  **/
  @ApiModelProperty(value = "The From date.")
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public Fiscalyear dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * The To date.
   * @return dateTo
  **/
  @ApiModelProperty(value = "The To date.")
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fiscalyear fiscalyear = (Fiscalyear) o;
    return Objects.equals(this.fiscalyearId, fiscalyear.fiscalyearId) &&
        Objects.equals(this.displayName, fiscalyear.displayName) &&
        Objects.equals(this.dateFrom, fiscalyear.dateFrom) &&
        Objects.equals(this.dateTo, fiscalyear.dateTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalyearId, displayName, dateFrom, dateTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fiscalyear {\n");
    
    sb.append("    fiscalyearId: ").append(toIndentedString(fiscalyearId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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

