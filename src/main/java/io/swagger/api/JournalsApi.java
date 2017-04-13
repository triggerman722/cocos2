package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Error;
import io.swagger.model.Journal;

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

@Api(value = "journals", description = "the journals API")
public interface JournalsApi {

    @ApiOperation(value = "Journals", notes = "The Journals endpoint returns information about the journals in the  system. ", response = Journal.class, responseContainer = "List", tags={ "Journals", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of journals", response = Journal.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Journal.class) })
    @RequestMapping(value = "/journals",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Journal>> journalsGet( @NotNull @ApiParam(value = "The ID of the journal.", required = true) @RequestParam(value = "journalid", required = true) BigDecimal journalid);

}
