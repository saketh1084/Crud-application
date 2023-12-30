package com.st.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.yaml.snakeyaml.events.Event.ID;

import com.st.Pojo.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
