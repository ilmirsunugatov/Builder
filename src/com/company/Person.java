package com.company;

public class Person {
   private final String name;
   private final String sureName;
   private int age;
   private String address;

    public Person(String name, String sureName, int age, String address) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }
    boolean hasAge() {
        if(this.age == 0 ){
            return false;
        }
        return true;
    }
    boolean hasAddress() {
        if(this.address == null) {
            return false;
        }
        return true;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSureName(this.sureName)
                .setAddress(this.address)
                .setAge(this.age);
    }
    public void happyBirthday() {
        this.age++;
    }

    @Override
    public String toString() {
        return name +" " + sureName + " " +  age + " " + address;
    }
}
