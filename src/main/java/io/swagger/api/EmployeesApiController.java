package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.model.Employee;
import io.swagger.model.Employees;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T07:08:55.796Z[GMT]")
@Controller
public class EmployeesApiController implements EmployeesApi {

    private static final Logger log = LoggerFactory.getLogger(EmployeesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EmployeesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Employees> employeesGet(@Min(10) @Max(20) @ApiParam(value = "the amount of employees returned", allowableValues = "") @Valid @RequestParam(value = "bodyLimit", required = false) Integer bodyLimit,@Min(1) @Max(5) @ApiParam(value = "the pages to return employee info", allowableValues = "") @Valid @RequestParam(value = "pageLimit", required = false) Integer pageLimit) {
        String accept = request.getHeader("Accept");
        Employees employees = new Employees();
        employees.add(new Employee(1,"Rahul", "TL"));
        employees.add(new Employee(2,"Rahul", "TL"));
        employees.add(new Employee(3,"Rahul", "TL"));
        employees.add(new Employee(4,"Rahul", "TL"));
        return new ResponseEntity<Employees>(employees, HttpStatus.OK);
    }

    public ResponseEntity<Employee> employeesIdGet(@ApiParam(value = "id of employee",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Employee>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> employeesPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Employee body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
