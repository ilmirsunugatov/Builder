package com.company;

public class PersonBuilder {
    private String name;
    private String sureName;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSureName(String sureName) {
        this.sureName = sureName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age == 0 || age < 0 || age > 150) {
            throw new IllegalStateException("Некорректный возраст");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }


    public Person build() {
        if(name == null || sureName == null) {
            throw new IllegalStateException("Не заданы фамилия либо имя");
        }
            return new Person(name, sureName, age, address);
    }
}
