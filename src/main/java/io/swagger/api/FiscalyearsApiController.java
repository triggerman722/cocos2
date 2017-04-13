package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Error;
import io.swagger.model.Fiscalyear;

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
public class FiscalyearsApiController implements FiscalyearsApi {



    public ResponseEntity<List<Fiscalyear>> fiscalyearsGet( @NotNull @ApiParam(value = "The ID of the fiscalyear.", required = true) @RequestParam(value = "fiscalyearid", required = true) BigDecimal fiscalyearid) {
        // do some magic!
        return new ResponseEntity<List<Fiscalyear>>(HttpStatus.OK);
    }

}
