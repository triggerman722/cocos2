package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Error;
import io.swagger.model.Fiscalyear;

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

@Api(value = "fiscalyears", description = "the fiscalyears API")
public interface FiscalyearsApi {

    @ApiOperation(value = "Fiscalyears", notes = "The Fiscalyears endpoint returns information about the fiscalyears in the  system. ", response = Fiscalyear.class, responseContainer = "List", tags={ "Fiscalyears", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of fiscalyears", response = Fiscalyear.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Fiscalyear.class) })
    @RequestMapping(value = "/fiscalyears",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Fiscalyear>> fiscalyearsGet( @NotNull @ApiParam(value = "The ID of the fiscalyear.", required = true) @RequestParam(value = "fiscalyearid", required = true) BigDecimal fiscalyearid);

}
