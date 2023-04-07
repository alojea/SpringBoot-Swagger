package com.aojea.swaggerexample;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApiOperation("Student Controller")
@RestController
public class StudentController {

    Map<Integer, Details> detailsMap = new HashMap<>();

    @GetMapping("/details/{id}")
    @ApiOperation(value = "Return Student details",
    notes = "This endpoint return Student detail",
    response =  Details.class)
    public Details getDetails(@ApiParam(value = "Student Id", required = true)
                                  @PathVariable Integer id) {
        return detailsMap.get(id);

    }

    @ApiOperation(value = "Return list of Student details",
            notes = "This endpoint return a list of Student detail",
            response =  Details.class)
    @GetMapping("/details")
    public List<Details> getAllDetails() {
        return new ArrayList<Details>(detailsMap.values());
    }

    @ApiOperation(value = "Add Student details",
            notes = "This endpoint Add Student detail",
            response =  Details.class)
    @PostMapping("/details")
    public Details addDetails(@RequestBody Details details) {
        detailsMap.put(details.getId(), details);
        return details;
    }
}
