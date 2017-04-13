package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Fiscalyear;
import java.math.BigDecimal;
import javax.validation.constraints.*;
/**
 * Period
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

public class Period   {
  @JsonProperty("period_id")
  private BigDecimal periodId = null;

  @JsonProperty("fiscalyear")
  private Fiscalyear fiscalyear = null;

  public Period periodId(BigDecimal periodId) {
    this.periodId = periodId;
    return this;
  }

   /**
   * The id of this object.
   * @return periodId
  **/
  @ApiModelProperty(value = "The id of this object.")
  public BigDecimal getPeriodId() {
    return periodId;
  }

  public void setPeriodId(BigDecimal periodId) {
    this.periodId = periodId;
  }

  public Period fiscalyear(Fiscalyear fiscalyear) {
    this.fiscalyear = fiscalyear;
    return this;
  }

   /**
   * Get fiscalyear
   * @return fiscalyear
  **/
  @ApiModelProperty(value = "")
  public Fiscalyear getFiscalyear() {
    return fiscalyear;
  }

  public void setFiscalyear(Fiscalyear fiscalyear) {
    this.fiscalyear = fiscalyear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Period period = (Period) o;
    return Objects.equals(this.periodId, period.periodId) &&
        Objects.equals(this.fiscalyear, period.fiscalyear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodId, fiscalyear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Period {\n");
    
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    fiscalyear: ").append(toIndentedString(fiscalyear)).append("\n");
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

