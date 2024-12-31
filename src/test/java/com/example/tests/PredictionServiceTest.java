package com.example.application.services;

import com.example.application.client.PredictionResponse;
import com.example.application.data.entity.SchoolSubjects;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PredictionServiceTest {

    private final PredictionService predictionService = new PredictionService();

    @Test
    public void testPredictSchool() {
        SchoolSubjects schoolSubjects = new SchoolSubjects();
        schoolSubjects.setMaths(90);
        schoolSubjects.setScience(85);
        schoolSubjects.setSocial(88);

        PredictionResponse response = predictionService.predictSchool(schoolSubjects);
        assertEquals("Science", response.getPrediction());
    }
}
