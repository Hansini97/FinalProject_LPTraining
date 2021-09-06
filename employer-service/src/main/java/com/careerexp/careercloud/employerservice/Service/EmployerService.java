package com.careerexp.careercloud.employerservice.Service;


import com.careerexp.careercloud.commons.model.employer.Employer;

import java.util.List;

public interface EmployerService {

    Employer save(Employer employer);

    List<Employer> findAll();

    String deleteEmployer(Integer id);
    Employer findById(int id);


    String updateEmployerById(int id, Employer employer);
}



