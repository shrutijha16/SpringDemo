package com.AutowirebyName;

public class Car {

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
    private Specification specification;


   /* public Car(Specification specification) {
        this.specification = specification;
    }*/

    public void  getCarDetails() {
        System.out.println("Car Details:"+ specification.toString());
    }
}
