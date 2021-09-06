package com.careerexp.careercloud.careerseekerservice.Service;

import com.careerexp.careercloud.careerseekerservice.Repository.CareerseekerRepository;
import com.careerexp.careercloud.commons.model.careerseeker.Careerseeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CareerseekerServiceImpl implements CareerseekerService{

    @Autowired
    CareerseekerRepository careerseekerRepository;

    @Override
    public Careerseeker save(Careerseeker careerseeker){
        return careerseekerRepository.save(careerseeker);
    }

    @Override
    public List<Careerseeker> findAll(){
        return careerseekerRepository.findAll();
    }

    @Override
    public String updateCareerseekerById(int id, Careerseeker careerseeker) {
        Careerseeker cs1 = findById(id);
        cs1.setFirstName(careerseeker.getFirstName());
        cs1.setLastName(careerseeker.getLastName());
        cs1.setAddress(careerseeker.getAddress());
        cs1.setPhoneNumber(careerseeker.getPhoneNumber());
        cs1.setCurrentposition(careerseeker.getCurrentposition());
        cs1.setExpectedposition(careerseeker.getExpectedposition());
        cs1.setIndustry(careerseeker.getIndustry());
        cs1.setExperience(careerseeker.getExperience());
        cs1.setQualifications(careerseeker.getQualifications());
        cs1.setSkills(careerseeker.getSkills());

        save(cs1);

        return "Details Updated successfully!";
    }

    @Override
    public String deleteCareerseeker(Integer id) {
        careerseekerRepository.delete(findById(id));
        return "Record deleted successfully!";
    }

    @Override
    public Careerseeker findById(int id) {
        Optional<Careerseeker> careerseeker = careerseekerRepository.findById(id);

        if (careerseeker.isPresent())
            return careerseeker.get();
        else
            return new Careerseeker();
    }


}










