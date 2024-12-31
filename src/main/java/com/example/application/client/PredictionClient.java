package com.example.application.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.application.data.entity.SchoolSubjects;
import com.example.application.data.entity.IntermediateSubjects;
import com.example.application.data.entity.DegreeSubjects;

@FeignClient(name = "prediction-client", url = "localhost:8080")
public interface PredictionClient {
    @PostMapping("/predict-school")
    PredictionResponse predictSchool(@RequestBody SchoolSubjects features);

    @PostMapping("/predict-intermediate")
    PredictionResponse predictIntermediate(@RequestBody IntermediateSubjects features);

    @PostMapping("/predict-career")
    PredictionResponse predictCareer(@RequestBody DegreeSubjects features);
}
