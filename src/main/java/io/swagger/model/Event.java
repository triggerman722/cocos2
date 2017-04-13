package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Charge;
import io.swagger.model.Partner;
import java.math.BigDecimal;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
/**
 * Event
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

public class Event   {
  @JsonProperty("event_id")
  private BigDecimal eventId = null;

  /**
   * The event type.
   */
  public enum EventtypeEnum {
    ADDED("added"),
    
    MODIFIED("modified"),
    
    DELETED("deleted");

    private String value;

    EventtypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventtypeEnum fromValue(String text) {
      for (EventtypeEnum b : EventtypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("eventtype")
  private EventtypeEnum eventtype = null;

  @JsonProperty("reference_url")
  private String referenceUrl = null;

  @JsonProperty("timestamp")
  private LocalDate timestamp = null;

  @JsonProperty("partner")
  private Partner partner = null;

  @JsonProperty("charges")
  private Charge charges = null;

  public Event eventId(BigDecimal eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The id of this object.
   * @return eventId
  **/
  @ApiModelProperty(value = "The id of this object.")
  public BigDecimal getEventId() {
    return eventId;
  }

  public void setEventId(BigDecimal eventId) {
    this.eventId = eventId;
  }

  public Event eventtype(EventtypeEnum eventtype) {
    this.eventtype = eventtype;
    return this;
  }

   /**
   * The event type.
   * @return eventtype
  **/
  @ApiModelProperty(value = "The event type.")
  public EventtypeEnum getEventtype() {
    return eventtype;
  }

  public void setEventtype(EventtypeEnum eventtype) {
    this.eventtype = eventtype;
  }

  public Event referenceUrl(String referenceUrl) {
    this.referenceUrl = referenceUrl;
    return this;
  }

   /**
   * A url that references the original event.
   * @return referenceUrl
  **/
  @ApiModelProperty(value = "A url that references the original event.")
  public String getReferenceUrl() {
    return referenceUrl;
  }

  public void setReferenceUrl(String referenceUrl) {
    this.referenceUrl = referenceUrl;
  }

  public Event timestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The date this event occurred.
   * @return timestamp
  **/
  @ApiModelProperty(value = "The date this event occurred.")
  public LocalDate getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
  }

  public Event partner(Partner partner) {
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

  public Event charges(Charge charges) {
    this.charges = charges;
    return this;
  }

   /**
   * Get charges
   * @return charges
  **/
  @ApiModelProperty(value = "")
  public Charge getCharges() {
    return charges;
  }

  public void setCharges(Charge charges) {
    this.charges = charges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.eventId, event.eventId) &&
        Objects.equals(this.eventtype, event.eventtype) &&
        Objects.equals(this.referenceUrl, event.referenceUrl) &&
        Objects.equals(this.timestamp, event.timestamp) &&
        Objects.equals(this.partner, event.partner) &&
        Objects.equals(this.charges, event.charges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventtype, referenceUrl, timestamp, partner, charges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventtype: ").append(toIndentedString(eventtype)).append("\n");
    sb.append("    referenceUrl: ").append(toIndentedString(referenceUrl)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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

