package io.swagger.api;

import io.swagger.model.Account;
import java.math.BigDecimal;
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

@Api(value = "accounts", description = "the accounts API")
public interface AccountsApi {

    @ApiOperation(value = "Accounts", notes = "The Accounts endpoint returns information about the accounts in the  system. ", response = Account.class, responseContainer = "List", tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of accounts", response = Account.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Account.class) })
    @RequestMapping(value = "/accounts",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Account>> accountsGet( @NotNull @ApiParam(value = "The ID of the account.", required = true) @RequestParam(value = "accountid", required = true) BigDecimal accountid);

}
