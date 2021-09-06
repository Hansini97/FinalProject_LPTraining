package com.careerexp.careercloud.commons.model.careersuggestion;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "careers")
public class CareerSuggestion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int experienceyears;
    int category;
    String suggestion;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExperienceyears() {
        return experienceyears;
    }

    public void setExperienceyears(int experienceyears) {
        this.experienceyears = experienceyears;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }


    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getSuggestion() {
        if (category == 1) {
            if (experienceyears < 2 && experienceyears >= 0) {
                suggestion = "Developing professional and technical expertise. Career Suggestions:  Intern, Associate Software Engineer (This may change according to the company and the performance of an individual)";
            } else if (experienceyears < 5 && experienceyears >= 2) {
                suggestion = "Well developed professional and technical expertise. Career Suggestions:  Software Engineer (This may change according to the company and the performance of an individual)";
            } else if (experienceyears < 7 && experienceyears >= 5) {
                suggestion = "Seasoned Professional. Career Suggestions:  Senior Software Engineer (This may change according to the company and the performance of an individual)";
            } else if (experienceyears < 12 && experienceyears >= 7) {
                suggestion = "Wide range of experience and a technical guru. Career Suggestions:  Tech Lead (This may change according to the company and the performance of an individual";
            } else if (experienceyears >= 12) {
                suggestion = "Critically important to growth and product development. Career Suggestions:  Software Architect (This may change according to the company and the performance of an individual";
            }
        } else if (category == 2) {
            if (experienceyears < 2 && experienceyears >= 0) {
                suggestion = "Career Suggestions:  QA Analyst (This may change according to the company and the performance of an individual)";
            } else if (experienceyears < 3 && experienceyears >= 2) {
                suggestion = "Career Suggestions:  Senior QA Analyst (This may change according to the company and the performance of an individual)";
            } else if (experienceyears < 8 && experienceyears >= 5) {
                suggestion = "Career Suggestions:  QA Team Coordinator (This may change according to the company and the performance of an individual)";
            } else if (experienceyears < 14 && experienceyears >= 8) {
                suggestion = "Career Suggestions:  Test Manager (This may change according to the company and the performance of an individual)";
            } else if (experienceyears >= 14) {
                suggestion = "Career Suggestions:  Senior Test Manager  (This may change according to the company and the performance of an individual)";
            }
        }

        return suggestion;
    }
}

