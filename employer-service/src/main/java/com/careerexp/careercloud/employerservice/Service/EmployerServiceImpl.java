package com.careerexp.careercloud.employerservice.Service;


import com.careerexp.careercloud.commons.model.employer.Employer;
import com.careerexp.careercloud.employerservice.Repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployerServiceImpl implements EmployerService{

    @Autowired
    EmployerRepository employerRepository;

    @Override
    public Employer save(Employer employer){

        return employerRepository.save(employer);
    }

    @Override
    public List<Employer> findAll()
    {
        return employerRepository.findAll();
    }

    @Override
    public String updateEmployerById(int id, Employer employer) {
        Employer e1 = findById(id);
        e1.setName(employer.getName());
        e1.setIndustry(employer.getIndustry());
        e1.setType(employer.getType());
        e1.setAddress(employer.getAddress());
        e1.setTelephoneNumber(employer.getTelephoneNumber());
        e1.setZipcode(employer.getZipcode());
        save(e1);

        return "Details Updated successfully!";

    }

    @Override
    public String deleteEmployer(Integer id) {
        employerRepository.delete(findById(id));
        return "Record deleted successfully!";
    }

    @Override
    public Employer findById(int id) {
        Optional<Employer> employer = employerRepository.findById(id);
        return employer.get();
    }
}

