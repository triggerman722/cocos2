package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Error;
import io.swagger.model.Transaction;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-12T23:56:44.668Z")

@Controller
public class TransactionsApiController implements TransactionsApi {



    public ResponseEntity<List<Transaction>> transactionsGet( @NotNull @ApiParam(value = "The ID of the transaction.", required = true) @RequestParam(value = "transactionid", required = true) BigDecimal transactionid) {
        // do some magic!
        return new ResponseEntity<List<Transaction>>(HttpStatus.OK);
    }

}
