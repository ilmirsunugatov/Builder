package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Person mom = new PersonBuilder()
                    .setSureName("Ivanov")
                    .setName("Ivan")
//                    .setAge()
//                    .setAddress("Москва")
                    .build();
            System.out.println(mom.hasAge());
            System.out.println(mom.getAge());
            mom.happyBirthday();
            mom.happyBirthday();
            System.out.println(mom.getAge());
            System.out.println(mom.hasAge());
            System.out.println(mom.hasAddress());
            Person son = mom.newChildBuilder()
                    .setName("Иван")
                    .build();
            System.out.println("У " + mom + " есть сын: " + son);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
