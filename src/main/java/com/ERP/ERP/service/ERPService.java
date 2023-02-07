package com.ERP.ERP.service;

import com.ERP.ERP.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ERPService {
    private static final List<Student> students = new ArrayList<>();
    private static int rollNumber = 0;
    static {
        Student s1 = new Student(++rollNumber,"abc","male",List.of(80.0,90.0,87.0,60.0),"Delhi");
        Student s2 = new Student(++rollNumber,"xyz","male",List.of(68.0,60.0,97.0,80.0),"Haryana");
        Student s3 = new Student(++rollNumber,"Sarah","female",List.of(70.0,87.0,77.9,67.0),"Mumbai");
        Student s4 = new Student(++rollNumber,"Anshika","female",List.of(86.4,92.0,67.6,69.0),"Chennai");
        Student s5 = new Student(++rollNumber,"San","male",List.of(83.6,96.0,97.6,77.0),"Kolkata");
    }
}
