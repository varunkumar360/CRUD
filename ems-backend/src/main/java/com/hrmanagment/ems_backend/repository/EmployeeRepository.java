package com.hrmanagment.ems_backend.repository;

import com.hrmanagment.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
