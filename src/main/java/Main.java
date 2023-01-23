public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Иван")
                .setSurname("Гордеев")
                .setAge(1)
                .setAddress("Казань")
                .build();
        System.out.println(mom.hasAge());
        System.out.println(mom.hasAddress());
        mom.happyBirthday();
        System.out.println(mom.hasAge());
        Person son = mom.newChildBuilder()
                .setName("Василий")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
