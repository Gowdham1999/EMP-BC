package com.rest.webservices.EmployeeManagementBC.EMP_webservices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpMgmtJpaService extends JpaRepository<Employee, Long> {


}
