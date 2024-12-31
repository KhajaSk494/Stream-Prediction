package com.example.application.controllers;

import com.example.application.services.PredictionService;
import com.example.application.data.entity.SchoolSubjects;
import com.example.application.data.entity.IntermediateSubjects;
import com.example.application.data.entity.DegreeSubjects;
import com.example.application.client.PredictionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PredictionController {

    @Autowired
    private PredictionService predictionService;

    @PostMapping("/predict-school")
    public PredictionResponse predictSchool(@RequestBody SchoolSubjects schoolSubjects) {
        return predictionService.predictSchool(schoolSubjects);
    }

    @PostMapping("/predict-intermediate")
    public PredictionResponse predictIntermediate(@RequestBody IntermediateSubjects intermediateSubjects) {
        return predictionService.predictIntermediate(intermediateSubjects);
    }

    @PostMapping("/predict-career")
    public PredictionResponse predictCareer(@RequestBody DegreeSubjects degreeSubjects) {
        return predictionService.predictCareer(degreeSubjects);
    }
}
