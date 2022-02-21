package com.company;

public class Cat {

    String name;
    int age;
    String color;
    boolean vaccinated;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, boolean vaccinated) {
        this.name = name;
        this.vaccinated = vaccinated;
    }

    public Cat(String name, int age, String color, boolean vaccinated) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.vaccinated = vaccinated;
    }

//    @Override
//    public String toString(){
//        return "This cat's name is " + name + " and it's " + age + " years old";
//    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", vaccinated=" + vaccinated +
                '}';
    }
}
