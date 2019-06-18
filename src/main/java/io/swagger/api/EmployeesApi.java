/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Employee;
import io.swagger.model.Employees;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T07:08:55.796Z[GMT]")
@Api(value = "employees", description = "the employees API")
public interface EmployeesApi {

    @ApiOperation(value = "", nickname = "employeesGet", notes = "obtain information about employees from HR database", response = Employees.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successfull pull of employees info", response = Employees.class) })
    @RequestMapping(value = "/employees",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Employees> employeesGet(@Min(10) @Max(20) @ApiParam(value = "the amount of employees returned", allowableValues = "") @Valid @RequestParam(value = "bodyLimit", required = false) Integer bodyLimit,@Min(1) @Max(5) @ApiParam(value = "the pages to return employee info", allowableValues = "") @Valid @RequestParam(value = "pageLimit", required = false) Integer pageLimit);


    @ApiOperation(value = "", nickname = "employeesIdGet", notes = "finding employee using id in  HR database", response = Employee.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = Employee.class) })
    @RequestMapping(value = "/employees/{id}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Employee> employeesIdGet(@ApiParam(value = "id of employee",required=true) @PathVariable("id") Integer id);


    @ApiOperation(value = "", nickname = "employeesPost", notes = "create a new employee in  HR database", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successfull created new employee") })
    @RequestMapping(value = "/employees",
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> employeesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Employee body);

}