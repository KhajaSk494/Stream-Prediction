package com.example.application.data.entity;

public class IntermediateSubjects {
    private Integer maths;
    private Integer physics;
    private Integer chemistry;

    public Integer getMaths() {
        return maths;
    }

    public void setMaths(Integer maths) {
        this.maths = maths;
    }

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

    @Override
    public String toString() {
        return "IntermediateSubjects [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + "]";
    }
}
