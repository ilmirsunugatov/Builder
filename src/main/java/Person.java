public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (this.age != 0) {
            return true;
        }
        return false;
    }

    public boolean hasAddress() {
        if (this.address != null) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String city) {
        this.address = city;
    }

    public void happyBirthday() {
        if(this.age == 0) {
            return;
        } else {
            this.age++;
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAge(this.age)
                .setAddress(this.address);
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + address;
    }
}