package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Error;
import io.swagger.model.Invoice;

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

@Api(value = "invoices", description = "the invoices API")
public interface InvoicesApi {

    @ApiOperation(value = "Invoices", notes = "The Invoices endpoint returns information about the invoices in the  system. ", response = Invoice.class, responseContainer = "List", tags={ "Invoices", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of invoices", response = Invoice.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Invoice.class) })
    @RequestMapping(value = "/invoices",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Invoice>> invoicesGet( @NotNull @ApiParam(value = "The ID of the invoice.", required = true) @RequestParam(value = "invoiceid", required = true) BigDecimal invoiceid);

}
