package com.example.EmployeeSystem.Repository;
// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeSystem.Entity.Employee;

@Repository
public interface Employeerepo extends CrudRepository<Employee, Long > {
    
}
