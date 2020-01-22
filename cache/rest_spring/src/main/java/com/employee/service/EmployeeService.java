package com.employee.service;


import com.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

             List<Employee> employee= Arrays.asList(
            new Employee("chennai",10000.00),
            new Employee("kolkota",20000.00),
            new Employee("MadhyaPradesh",30000.00),
            new Employee("Assam",12000.00)
    );

             public List<Employee> emp(){
                 return employee;
             }


}
