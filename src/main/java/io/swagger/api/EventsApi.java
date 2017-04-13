package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Error;
import io.swagger.model.Event;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

@Api(value = "events", description = "the events API")
public interface EventsApi {

    @ApiOperation(value = "Events", notes = "The Events endpoint returns information about the events in the  system. ", response = Event.class, responseContainer = "List", tags={ "Events", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of events", response = Event.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Event.class) })
    @RequestMapping(value = "/events",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Event>> eventsGet( @NotNull @ApiParam(value = "The ID of the event.", required = true) @RequestParam(value = "eventid", required = true) BigDecimal eventid);

}
