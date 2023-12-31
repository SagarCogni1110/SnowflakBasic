package com.github.yshameer.springjpa.snowflake.service.api;

import com.github.yshameer.springjpa.snowflake.service.entity.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Api(value = "student", description = "the Student API")
public interface StudentApi {

    @ApiOperation(value = "", response = Student.class, tags = {"Student",})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "A successful student record", response = Student.class)})
    @RequestMapping(value = "/student", produces = {"application/json"},method = RequestMethod.GET)
    ResponseEntity<Student> getStudentById(
            @RequestParam("studentId")
                    Long studentId);


    @ApiOperation(value = "", response = Student.class, tags = {"Student",})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "A successful student record", response = Student.class)})
    @RequestMapping(value = "/AllStudents", produces = {"application/json"},method = RequestMethod.GET)
    ResponseEntity<List<Student>> getAllStudent();

}
