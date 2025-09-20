package com.AutowirebyName;

public class Specification {
private String Make;
private String Model;

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "Make='" + Make + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}
