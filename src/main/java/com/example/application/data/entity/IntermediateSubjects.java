package com.example.application.data.entity;

public class IntermediateSubjects {
    private Integer physics;
    private Integer chemistry;
    private Integer mathematics;

    // Getters and Setters
    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getChemistry() {
        return chemistry;
    }

    public void setChemistry(Integer chemistry) {
        this.chemistry = chemistry;
    }

    public Integer getMathematics() {
        return mathematics;
    }

    public void setMathematics(Integer mathematics) {
        this.mathematics = mathematics;
    }

    @Override
    public String toString() {
        return "IntermediateSubjects [physics=" + physics + ", chemistry=" + chemistry + ", mathematics=" + mathematics + "]";
    }
}
