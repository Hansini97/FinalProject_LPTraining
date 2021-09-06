package com.careerexp.careercloud.careersuggestionservice.Repository;


import com.careerexp.careercloud.commons.model.careersuggestion.CareerSuggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CareersuggestionRepository extends JpaRepository<CareerSuggestion,Integer> {

    Optional<CareerSuggestion> findByExperienceyears(int experienceyears);
}
