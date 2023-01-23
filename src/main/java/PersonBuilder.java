public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age <= 0 ) {
            throw new IllegalArgumentException("Введено некорректное значение возраста");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.address = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Не заполнены обязательные параметры: Имя или Фамилия");
        }
        return new Person(name, surname, age, address);
    }
}