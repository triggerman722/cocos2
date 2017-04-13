package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Error;
import io.swagger.model.Transaction;

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

@Api(value = "transactions", description = "the transactions API")
public interface TransactionsApi {

    @ApiOperation(value = "Transactions", notes = "The Transactions endpoint returns information about the transactions in the  system. ", response = Transaction.class, responseContainer = "List", tags={ "Transactions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of transactions.", response = Transaction.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Transaction.class) })
    @RequestMapping(value = "/transactions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Transaction>> transactionsGet( @NotNull @ApiParam(value = "The ID of the transaction.", required = true) @RequestParam(value = "transactionid", required = true) BigDecimal transactionid);

}
