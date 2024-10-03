package com.hrmanagment.ems_backend.service.impl;

import com.hrmanagment.ems_backend.dto.EmployeeDto;
import com.hrmanagment.ems_backend.entity.Employee;
import com.hrmanagment.ems_backend.mapper.EmployeeMapper;
import com.hrmanagment.ems_backend.repository.EmployeeRepository;
import com.hrmanagment.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor

public class EmployeeServiceimpl implements EmployeeService {

    private EmployeeRepository EmployeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee =  EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = EmployeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);

        //return null;
    }
}
