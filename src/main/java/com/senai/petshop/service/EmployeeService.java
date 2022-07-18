package com.senai.petshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.petshop.model.Employee;
import com.senai.petshop.repository.EmployeeRepository;
import java.util.List;

@Service
public class EmployeeService {

        @Autowired
            EmployeeRepository empRepository;        


//CREATE 
public Employee createEmployee(Employee emp) {
 return empRepository.save(emp);
}

//READ
public List<Employee> getEmployees() {
 return empRepository.findAll();
}

//DELETE
public void deleteEmployee(Long empId) {
 empRepository.deleteById(empId);
}

//UPDATE
public Employee updateEmployee(Long empId, Employee employeeDetails) {
     Employee emp = empRepository.findById(empId).get();
     emp.setNome(employeeDetails.getNome());
     emp.setTelefone(employeeDetails.getTelefone());
     emp.setEmail(employeeDetails.getEmail());
     emp.setIdade(employeeDetails.getIdade());
     emp.setAnimais(employeeDetails.getAnimais());
     
     return empRepository.save(emp);                                
}

}