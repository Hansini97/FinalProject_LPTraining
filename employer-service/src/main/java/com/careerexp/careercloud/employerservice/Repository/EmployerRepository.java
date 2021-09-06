package com.careerexp.careercloud.employerservice.Repository;



import com.careerexp.careercloud.commons.model.employer.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer,Integer> {
}


