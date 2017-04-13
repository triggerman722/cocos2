package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Currency;
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

@Api(value = "currencies", description = "the currencies API")
public interface CurrenciesApi {

    @ApiOperation(value = "Currencies", notes = "The Currencies endpoint returns information about the currencies in the  system. ", response = Currency.class, responseContainer = "List", tags={ "Currencies", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of currencies", response = Currency.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Currency.class) })
    @RequestMapping(value = "/currencies",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Currency>> currenciesGet( @NotNull @ApiParam(value = "The ID of the currency.", required = true) @RequestParam(value = "currencyid", required = true) BigDecimal currencyid);

}
