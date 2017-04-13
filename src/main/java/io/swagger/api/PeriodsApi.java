package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Error;
import io.swagger.model.Period;

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

@Api(value = "periods", description = "the periods API")
public interface PeriodsApi {

    @ApiOperation(value = "Periods", notes = "The Periods endpoint returns information about the periods in the  system. ", response = Period.class, responseContainer = "List", tags={ "Periods", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of periods", response = Period.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Period.class) })
    @RequestMapping(value = "/periods",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Period>> periodsGet( @NotNull @ApiParam(value = "The ID of the period.", required = true) @RequestParam(value = "periodid", required = true) BigDecimal periodid);

}
