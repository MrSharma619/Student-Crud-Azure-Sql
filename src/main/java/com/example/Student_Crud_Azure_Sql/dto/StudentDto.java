package com.example.Student_Crud_Azure_Sql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private String fullName;

    private String city;

    private long phoneNumber;

}
