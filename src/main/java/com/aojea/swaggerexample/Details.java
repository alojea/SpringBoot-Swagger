package com.aojea.swaggerexample;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Getter
@Setter
@ApiModel(description = "Student Details")
public class Details {

    @ApiModelProperty(notes = "student id")
    int id;

    @ApiModelProperty(notes = "student name")
    String name;

    @ApiModelProperty(notes = "student age")
    int age;
}
