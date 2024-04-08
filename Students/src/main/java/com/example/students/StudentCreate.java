package com.example.students;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class StudentCreate{
    Student student;
    private String name;
    private int student_year;

}
