package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Person mom = new PersonBuilder()
                    .setName("Катя")
                    .setSureName("Иванова")
                    .setAge(50)
                    .setAddress("Москва")
                    .build();
            System.out.println(mom.hasAge());
            System.out.println(mom.hasAddress());
            Person son = mom.newChildBuilder()
                    .setName("Иван")
                    .build();
            System.out.println("У " + mom + " есть сын: " + son);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
