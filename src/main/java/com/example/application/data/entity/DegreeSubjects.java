package com.example.application.data.entity;

public class DegreeSubjects {
    private Integer degreeScore;
    private String interest;

    public Integer getDegreeScore() {
        return degreeScore;
    }

    public void setDegreeScore(Integer degreeScore) {
        this.degreeScore = degreeScore;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "DegreeSubjects [degreeScore=" + degreeScore + ", interest=" + interest + "]";
    }
}
