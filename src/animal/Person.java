package animal;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String company;
    private double salary;

    public Person() {

    }

    public Person(String name, String surname, int age, String company, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.company = company;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(salary, person.salary) == 0 && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(company, person.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, company, salary);
    }
}
