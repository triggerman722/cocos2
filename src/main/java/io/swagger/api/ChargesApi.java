package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Charge;
import io.swagger.model.Error;

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

@Api(value = "charges", description = "the charges API")
public interface ChargesApi {

    @ApiOperation(value = "Charges", notes = "The Charges endpoint returns information about the charges in the  system. ", response = Charge.class, responseContainer = "List", tags={ "Charges", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of charges", response = Charge.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Charge.class) })
    @RequestMapping(value = "/charges",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Charge>> chargesGet( @NotNull @ApiParam(value = "The ID of the charge.", required = true) @RequestParam(value = "chargeid", required = true) BigDecimal chargeid);

}
